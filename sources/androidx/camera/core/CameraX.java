package androidx.camera.core;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.HandlerCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CameraX {
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    final CameraRepository mCameraRepository;
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final ListenableFuture<Void> mInitInternalFuture;
    private InternalInitState mInitState;
    private final Object mInitializeLock;
    private final Integer mMinLogLevel;
    private final RetryPolicy mRetryPolicy;
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;
    private ListenableFuture<Void> mShutdownInternalFuture;
    private CameraDeviceSurfaceManager mSurfaceManager;
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(Context context, CameraXConfig.Provider provider) {
        this(context, provider, new QuirkSettingsLoader());
    }

    CameraX(Context context, CameraXConfig.Provider provider, Function<Context, QuirkSettings> function) {
        this.mCameraRepository = new CameraRepository();
        this.mInitializeLock = new Object();
        this.mInitState = InternalInitState.UNINITIALIZED;
        this.mShutdownInternalFuture = Futures.immediateFuture(null);
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.mCameraXConfig = configProvider.getCameraXConfig();
        }
        updateQuirkSettings(context, this.mCameraXConfig.getQuirkSettings(), function);
        Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor(null);
        Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler(null);
        this.mCameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        Integer num = (Integer) this.mCameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mRetryPolicy = new RetryPolicy.Builder(this.mCameraXConfig.getCameraProviderInitRetryPolicy()).build();
        this.mInitInternalFuture = initInternal(context);
    }

    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) {
        ComponentCallbacks2 applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            ServiceInfo serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, (Class<?>) MetadataHolderService.class), 640);
            String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string == null) {
                Logger.e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void updateQuirkSettings(Context context, QuirkSettings quirkSettings, Function<Context, QuirkSettings> function) {
        if (quirkSettings != null) {
            Logger.d(TAG, "QuirkSettings from CameraXConfig: " + quirkSettings);
        } else {
            quirkSettings = function.apply(context);
            Logger.d(TAG, "QuirkSettings from app metadata: " + quirkSettings);
        }
        if (quirkSettings == null) {
            quirkSettings = QuirkSettingsHolder.DEFAULT;
            Logger.d(TAG, "QuirkSettings by default: " + quirkSettings);
        }
        QuirkSettingsHolder.instance().set(quirkSettings);
    }

    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public ListenableFuture<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public ListenableFuture<Void> shutdown() {
        return shutdownInternal();
    }

    private ListenableFuture<Void> initInternal(final Context context) {
        ListenableFuture<Void> future;
        synchronized (this.mInitializeLock) {
            Preconditions.checkState(this.mInitState == InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return CameraX.this.m131lambda$initInternal$0$androidxcameracoreCameraX(context, completer);
                }
            });
        }
        return future;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initInternal$0$androidx-camera-core-CameraX, reason: not valid java name */
    public /* synthetic */ Object m131lambda$initInternal$0$androidxcameracoreCameraX(Context context, CallbackToFutureAdapter.Completer completer) throws Exception {
        initAndRetryRecursively(this.mCameraExecutor, SystemClock.elapsedRealtime(), 1, context, completer);
        return "CameraX initInternal";
    }

    private void initAndRetryRecursively(final Executor executor, final long j, final int i, final Context context, final CallbackToFutureAdapter.Completer<Void> completer) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.this.m130lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(context, executor, i, completer, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: lambda$initAndRetryRecursively$2$androidx-camera-core-CameraX, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void m130lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(android.content.Context r19, final java.util.concurrent.Executor r20, final int r21, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer r22, final long r23) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.m130lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(android.content.Context, java.util.concurrent.Executor, int, androidx.concurrent.futures.CallbackToFutureAdapter$Completer, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initAndRetryRecursively$1$androidx-camera-core-CameraX, reason: not valid java name */
    public /* synthetic */ void m129lambda$initAndRetryRecursively$1$androidxcameracoreCameraX(Executor executor, long j, int i, Context context, CallbackToFutureAdapter.Completer completer) {
        initAndRetryRecursively(executor, j, i + 1, context, completer);
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private ListenableFuture<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
            int ordinal = this.mInitState.ordinal();
            if (ordinal == 0) {
                this.mInitState = InternalInitState.SHUTDOWN;
                return Futures.immediateFuture(null);
            }
            if (ordinal == 1) {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
            if (ordinal == 2 || ordinal == 3) {
                this.mInitState = InternalInitState.SHUTDOWN;
                decreaseMinLogLevelReference(this.mMinLogLevel);
                this.mShutdownInternalFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda4
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return CameraX.this.m133lambda$shutdownInternal$4$androidxcameracoreCameraX(completer);
                    }
                });
            }
            return this.mShutdownInternalFuture;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$shutdownInternal$4$androidx-camera-core-CameraX, reason: not valid java name */
    public /* synthetic */ Object m133lambda$shutdownInternal$4$androidxcameracoreCameraX(final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mCameraRepository.deinit().addListener(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.this.m132lambda$shutdownInternal$3$androidxcameracoreCameraX(completer);
            }
        }, this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$shutdownInternal$3$androidx-camera-core-CameraX, reason: not valid java name */
    public /* synthetic */ void m132lambda$shutdownInternal$3$androidxcameracoreCameraX(CallbackToFutureAdapter.Completer completer) {
        if (this.mSchedulerThread != null) {
            Executor executor = this.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
        }
        completer.set(null);
    }

    boolean isInitialized() {
        boolean z;
        synchronized (this.mInitializeLock) {
            z = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z;
    }

    private static void increaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            updateOrResetMinLogLevel();
        }
    }

    private static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            int intValue = sparseArray.get(num.intValue()).intValue() - 1;
            if (intValue == 0) {
                sparseArray.remove(num.intValue());
            } else {
                sparseArray.put(num.intValue(), Integer.valueOf(intValue));
            }
            updateOrResetMinLogLevel();
        }
    }

    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
            return;
        }
        if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }

    private void traceExecutionState(RetryPolicy.ExecutionState executionState) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:CameraProvider-RetryStatus", executionState != null ? executionState.getStatus() : -1);
        }
    }
}
