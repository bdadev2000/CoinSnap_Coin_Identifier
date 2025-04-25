package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Camera2CameraImpl implements CameraInternal {
    private static final int ERROR_NONE = 0;
    private static final String TAG = "Camera2CameraImpl";
    final CameraAvailability mCameraAvailability;
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private CameraConfig mCameraConfig;
    final CameraConfigureAvailable mCameraConfigureAvailable;
    private final Camera2CameraControlImpl mCameraControlInternal;
    final CameraCoordinator mCameraCoordinator;
    CameraDevice mCameraDevice;
    int mCameraDeviceError;
    final Camera2CameraInfoImpl mCameraInfoInternal;
    private final CameraManagerCompat mCameraManager;
    private final CameraStateMachine mCameraStateMachine;
    final CameraStateRegistry mCameraStateRegistry;
    CaptureSessionInterface mCaptureSession;
    private final SynchronizedCaptureSession.OpenerBuilder mCaptureSessionOpenerBuilder;
    private final CaptureSessionRepository mCaptureSessionRepository;
    private final boolean mCloseCameraBeforeCreateNewSessionQuirk;
    private final boolean mConfigAndCloseQuirk;
    private final DisplayInfoManager mDisplayInfoManager;
    private final DynamicRangesCompat mDynamicRangesCompat;
    private final ErrorTimeoutReopenScheduler mErrorTimeoutReopenScheduler;
    private final Executor mExecutor;
    boolean mIsActiveResumingMode;
    private boolean mIsConfigAndCloseRequired;
    private boolean mIsConfiguringForClose;
    private boolean mIsPrimary;
    final Object mLock;
    private MeteringRepeatingSession mMeteringRepeatingSession;
    private final Set<String> mNotifyStateAttachedSet;
    private final LiveDataObservable<CameraInternal.State> mObservableState;
    final AtomicInteger mReleaseRequestCount;
    final Map<CaptureSessionInterface, ListenableFuture<Void>> mReleasedCaptureSessions;
    private final ScheduledExecutorService mScheduledExecutorService;
    private SessionProcessor mSessionProcessor;
    volatile InternalState mState = InternalState.INITIALIZED;
    private final StateCallback mStateCallback;
    private final SupportedSurfaceCombination mSupportedSurfaceCombination;
    private int mTraceStateErrorCount;
    private final UseCaseAttachState mUseCaseAttachState;
    ListenableFuture<Void> mUserReleaseFuture;
    CallbackToFutureAdapter.Completer<Void> mUserReleaseNotifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum InternalState {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2CameraImpl(Context context, CameraManagerCompat cameraManagerCompat, String str, Camera2CameraInfoImpl camera2CameraInfoImpl, CameraCoordinator cameraCoordinator, CameraStateRegistry cameraStateRegistry, Executor executor, Handler handler, DisplayInfoManager displayInfoManager, long j) throws CameraUnavailableException {
        LiveDataObservable<CameraInternal.State> liveDataObservable = new LiveDataObservable<>();
        this.mObservableState = liveDataObservable;
        this.mCameraDeviceError = 0;
        this.mReleaseRequestCount = new AtomicInteger(0);
        this.mReleasedCaptureSessions = new LinkedHashMap();
        this.mTraceStateErrorCount = 0;
        this.mIsConfigAndCloseRequired = false;
        this.mIsConfiguringForClose = false;
        this.mIsPrimary = true;
        this.mNotifyStateAttachedSet = new HashSet();
        this.mCameraConfig = CameraConfigs.defaultConfig();
        this.mLock = new Object();
        this.mIsActiveResumingMode = false;
        this.mErrorTimeoutReopenScheduler = new ErrorTimeoutReopenScheduler();
        this.mCameraManager = cameraManagerCompat;
        this.mCameraCoordinator = cameraCoordinator;
        this.mCameraStateRegistry = cameraStateRegistry;
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mScheduledExecutorService = newHandlerExecutor;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = newSequentialExecutor;
        this.mStateCallback = new StateCallback(newSequentialExecutor, newHandlerExecutor, j);
        this.mUseCaseAttachState = new UseCaseAttachState(str);
        liveDataObservable.postValue(CameraInternal.State.CLOSED);
        CameraStateMachine cameraStateMachine = new CameraStateMachine(cameraStateRegistry);
        this.mCameraStateMachine = cameraStateMachine;
        CaptureSessionRepository captureSessionRepository = new CaptureSessionRepository(newSequentialExecutor);
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mDisplayInfoManager = displayInfoManager;
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraCharacteristicsCompat, newHandlerExecutor, newSequentialExecutor, new ControlUpdateListenerInternal(), camera2CameraInfoImpl.getCameraQuirks());
            this.mCameraControlInternal = camera2CameraControlImpl;
            this.mCameraInfoInternal = camera2CameraInfoImpl;
            camera2CameraInfoImpl.linkWithCameraControl(camera2CameraControlImpl);
            camera2CameraInfoImpl.setCameraStateSource(cameraStateMachine.getStateLiveData());
            this.mDynamicRangesCompat = DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
            this.mCaptureSession = newCaptureSession();
            this.mCaptureSessionOpenerBuilder = new SynchronizedCaptureSession.OpenerBuilder(newSequentialExecutor, newHandlerExecutor, handler, captureSessionRepository, camera2CameraInfoImpl.getCameraQuirks(), DeviceQuirks.getAll());
            this.mCloseCameraBeforeCreateNewSessionQuirk = camera2CameraInfoImpl.getCameraQuirks().contains(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.mConfigAndCloseQuirk = camera2CameraInfoImpl.getCameraQuirks().contains(LegacyCameraSurfaceCleanupQuirk.class);
            CameraAvailability cameraAvailability = new CameraAvailability(str);
            this.mCameraAvailability = cameraAvailability;
            CameraConfigureAvailable cameraConfigureAvailable = new CameraConfigureAvailable();
            this.mCameraConfigureAvailable = cameraConfigureAvailable;
            cameraStateRegistry.registerCamera(this, newSequentialExecutor, cameraConfigureAvailable, cameraAvailability);
            cameraManagerCompat.registerAvailabilityCallback(newSequentialExecutor, cameraAvailability);
            this.mSupportedSurfaceCombination = new SupportedSurfaceCombination(context, str, cameraManagerCompat, new CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.1
                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public boolean hasProfile(int i, int i2) {
                    return CamcorderProfile.hasProfile(i, i2);
                }

                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public CamcorderProfile get(int i, int i2) {
                    return CamcorderProfile.get(i, i2);
                }
            });
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    private CaptureSessionInterface newCaptureSession() {
        synchronized (this.mLock) {
            if (this.mSessionProcessor == null) {
                return new CaptureSession(this.mDynamicRangesCompat, this.mCameraInfoInternal.getCameraQuirks());
            }
            return new ProcessingCaptureSession(this.mSessionProcessor, this.mCameraInfoInternal, this.mDynamicRangesCompat, this.mExecutor, this.mScheduledExecutorService);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.openInternal();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInternal() {
        int ordinal = this.mState.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            tryForceOpenCameraDevice(false);
            return;
        }
        if (ordinal == 4) {
            setState(InternalState.REOPENING);
            if (isSessionCloseComplete() || this.mIsConfiguringForClose || this.mCameraDeviceError != 0) {
                return;
            }
            Preconditions.checkState(this.mCameraDevice != null, "Camera Device should be open if session close is not complete");
            setState(InternalState.OPENED);
            openCaptureSession();
            return;
        }
        debugLog("open() ignored due to being in state: " + this.mState);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.closeInternal();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInternal() {
        debugLog("Closing camera.");
        switch (this.mState.ordinal()) {
            case 3:
                Preconditions.checkState(this.mCameraDevice == null);
                setState(InternalState.INITIALIZED);
                return;
            case 4:
            default:
                debugLog("close() ignored due to being in state: " + this.mState);
                return;
            case 5:
            case 6:
            case 7:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    r1 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(InternalState.CLOSING);
                if (r1) {
                    Preconditions.checkState(isSessionCloseComplete());
                    configAndCloseIfNeeded();
                    return;
                }
                return;
            case 8:
            case 9:
                setState(InternalState.CLOSING);
                closeCamera(false);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configAndCloseIfNeeded() {
        Preconditions.checkState(this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING);
        Preconditions.checkState(this.mReleasedCaptureSessions.isEmpty());
        if (!this.mIsConfigAndCloseRequired) {
            finishClose();
            return;
        }
        if (this.mIsConfiguringForClose) {
            debugLog("Ignored since configAndClose is processing");
            return;
        }
        if (!this.mCameraAvailability.isCameraAvailable()) {
            this.mIsConfigAndCloseRequired = false;
            finishClose();
            debugLog("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            debugLog("Open camera to configAndClose");
            ListenableFuture<Void> openCameraConfigAndClose = openCameraConfigAndClose();
            this.mIsConfiguringForClose = true;
            openCameraConfigAndClose.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.this.m18x65edacec();
                }
            }, this.mExecutor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$configAndCloseIfNeeded$0$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m18x65edacec() {
        this.mIsConfiguringForClose = false;
        this.mIsConfigAndCloseRequired = false;
        debugLog("OpenCameraConfigAndClose is done, state: " + this.mState);
        int ordinal = this.mState.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            Preconditions.checkState(isSessionCloseComplete());
            finishClose();
        } else {
            if (ordinal == 6) {
                if (this.mCameraDeviceError != 0) {
                    debugLog("OpenCameraConfigAndClose in error: " + getErrorMessage(this.mCameraDeviceError));
                    this.mStateCallback.scheduleCameraReopen();
                    return;
                } else {
                    tryOpenCameraDevice(false);
                    return;
                }
            }
            debugLog("OpenCameraConfigAndClose finished while in state: " + this.mState);
        }
    }

    private ListenableFuture<Void> openCameraConfigAndClose() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda14
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraImpl.this.m28xfb055f0e(completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$openCameraConfigAndClose$1$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ Object m28xfb055f0e(CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            ArrayList arrayList = new ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
            arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
            arrayList.add(new AnonymousClass2(completer));
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, CameraDeviceStateCallbacks.createComboCallback(arrayList));
            return "configAndCloseTask";
        } catch (CameraAccessExceptionCompat | SecurityException e) {
            debugLog("Unable to open camera for configAndClose: " + e.getMessage(), e);
            completer.setException(e);
            return "configAndCloseTask";
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$2, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 extends CameraDevice.StateCallback {
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;

        AnonymousClass2(CallbackToFutureAdapter.Completer completer) {
            this.val$completer = completer;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera opened");
            ListenableFuture configAndClose = Camera2CameraImpl.this.configAndClose(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            configAndClose.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, Camera2CameraImpl.this.mExecutor);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera disconnected");
            this.val$completer.set(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera error " + i);
            this.val$completer.set(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera closed");
            this.val$completer.set(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListenableFuture<Void> configAndClose(CameraDevice cameraDevice) {
        final CaptureSession captureSession = new CaptureSession(this.mDynamicRangesCompat);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        immediateSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.lambda$configAndClose$2(surface, surfaceTexture);
            }
        }, CameraXExecutors.directExecutor());
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.addNonRepeatingSurface(immediateSurface);
        builder.setTemplateType(1);
        debugLog("Start configAndClose.");
        return FutureChain.from(Futures.transformAsyncOnCompletion(captureSession.open(builder.build(), cameraDevice, this.mCaptureSessionOpenerBuilder.build()))).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda12
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return Camera2CameraImpl.lambda$configAndClose$3(CaptureSession.this, immediateSurface, (Void) obj);
            }
        }, this.mExecutor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$configAndClose$2(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ListenableFuture lambda$configAndClose$3(CaptureSession captureSession, DeferrableSurface deferrableSurface, Void r2) throws Exception {
        captureSession.close();
        deferrableSurface.close();
        return captureSession.release(false);
    }

    boolean isSessionCloseComplete() {
        return this.mReleasedCaptureSessions.isEmpty();
    }

    void finishClose() {
        Preconditions.checkState(this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING);
        Preconditions.checkState(this.mReleasedCaptureSessions.isEmpty());
        this.mCameraDevice = null;
        if (this.mState == InternalState.CLOSING) {
            setState(InternalState.INITIALIZED);
            return;
        }
        this.mCameraManager.unregisterAvailabilityCallback(this.mCameraAvailability);
        setState(InternalState.RELEASED);
        CallbackToFutureAdapter.Completer<Void> completer = this.mUserReleaseNotifier;
        if (completer != null) {
            completer.set(null);
            this.mUserReleaseNotifier = null;
        }
    }

    void closeCamera(boolean z) {
        Preconditions.checkState(this.mState == InternalState.CLOSING || this.mState == InternalState.RELEASING || (this.mState == InternalState.REOPENING && this.mCameraDeviceError != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.mState + " (error: " + getErrorMessage(this.mCameraDeviceError) + ")");
        resetCaptureSession(z);
        this.mCaptureSession.cancelIssuedCaptureRequests();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public ListenableFuture<Void> release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraImpl.this.m30x22c7252f(completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$release$5$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ Object m30x22c7252f(final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m29xf4ee8ad0(completer);
            }
        });
        return "Release[request=" + this.mReleaseRequestCount.getAndIncrement() + "]";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$release$4$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m29xf4ee8ad0(CallbackToFutureAdapter.Completer completer) {
        Futures.propagate(releaseInternal(), completer);
    }

    private ListenableFuture<Void> releaseInternal() {
        ListenableFuture<Void> orCreateUserReleaseFuture = getOrCreateUserReleaseFuture();
        switch (this.mState.ordinal()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    r2 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(InternalState.RELEASING);
                if (r2) {
                    Preconditions.checkState(isSessionCloseComplete());
                    configAndCloseIfNeeded();
                }
                return orCreateUserReleaseFuture;
            case 2:
            case 3:
                Preconditions.checkState(this.mCameraDevice == null);
                setState(InternalState.RELEASING);
                Preconditions.checkState(isSessionCloseComplete());
                configAndCloseIfNeeded();
                return orCreateUserReleaseFuture;
            case 8:
            case 9:
                setState(InternalState.RELEASING);
                closeCamera(false);
                return orCreateUserReleaseFuture;
            default:
                debugLog("release() ignored due to being in state: " + this.mState);
                return orCreateUserReleaseFuture;
        }
    }

    private ListenableFuture<Void> getOrCreateUserReleaseFuture() {
        if (this.mUserReleaseFuture == null) {
            if (this.mState != InternalState.RELEASED) {
                this.mUserReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda5
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CameraImpl.this.m20x9e399b31(completer);
                    }
                });
            } else {
                this.mUserReleaseFuture = Futures.immediateFuture(null);
            }
        }
        return this.mUserReleaseFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getOrCreateUserReleaseFuture$6$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ Object m20x9e399b31(CallbackToFutureAdapter.Completer completer) throws Exception {
        Preconditions.checkState(this.mUserReleaseNotifier == null, "Camera can only be released once, so release completer should be null on creation.");
        this.mUserReleaseNotifier = completer;
        return "Release[camera=" + this + "]";
    }

    ListenableFuture<Void> releaseSession(final CaptureSessionInterface captureSessionInterface, boolean z) {
        captureSessionInterface.close();
        ListenableFuture<Void> release = captureSessionInterface.release(z);
        debugLog("Releasing session in state " + this.mState.name());
        this.mReleasedCaptureSessions.put(captureSessionInterface, release);
        Futures.addCallback(release, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r2) {
                Camera2CameraImpl.this.mReleasedCaptureSessions.remove(captureSessionInterface);
                int ordinal = Camera2CameraImpl.this.mState.ordinal();
                if (ordinal != 1 && ordinal != 4) {
                    if (ordinal != 5 && (ordinal != 6 || Camera2CameraImpl.this.mCameraDeviceError == 0)) {
                        return;
                    } else {
                        Camera2CameraImpl.this.debugLog("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (!Camera2CameraImpl.this.isSessionCloseComplete() || Camera2CameraImpl.this.mCameraDevice == null) {
                    return;
                }
                Camera2CameraImpl.this.debugLog("closing camera");
                ApiCompat.Api21Impl.close(Camera2CameraImpl.this.mCameraDevice);
                Camera2CameraImpl.this.mCameraDevice = null;
            }
        }, CameraXExecutors.directExecutor());
        return release;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public Observable<CameraInternal.State> getCameraState() {
        return this.mObservableState;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        final SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m25x4ba3b9b6(useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onUseCaseActive$7$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m25x4ba3b9b6(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        debugLog("Use case " + str + " ACTIVE");
        this.mUseCaseAttachState.setUseCaseActive(str, sessionConfig, useCaseConfig, streamSpec, list);
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        updateCaptureSessionConfig();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m26xe952d690(useCaseId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onUseCaseInactive$8$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m26xe952d690(String str) {
        debugLog("Use case " + str + " INACTIVE");
        this.mUseCaseAttachState.setUseCaseInactive(str);
        updateCaptureSessionConfig();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        final SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m27x44486635(useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onUseCaseUpdated$9$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m27x44486635(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        debugLog("Use case " + str + " UPDATED");
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        updateCaptureSessionConfig();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        resetUseCase(getUseCaseId(useCase), sessionConfig, useCase.getCurrentConfig(), useCase.getAttachedStreamSpec(), getCaptureTypes(useCase));
    }

    private void resetUseCase(final String str, final SessionConfig sessionConfig, final UseCaseConfig<?> useCaseConfig, final StreamSpec streamSpec, final List<UseCaseConfigFactory.CaptureType> list) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m31xb3c15a2c(str, sessionConfig, useCaseConfig, streamSpec, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$resetUseCase$10$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m31xb3c15a2c(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        debugLog("Use case " + str + " RESET");
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        addOrRemoveMeteringRepeatingUseCase();
        resetCaptureSession(false);
        updateCaptureSessionConfig();
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean isUseCaseAttached(UseCase useCase) {
        try {
            final String useCaseId = getUseCaseId(useCase);
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda4
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraImpl.this.m24xf78c78d9(useCaseId, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unable to check if use case is attached.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$isUseCaseAttached$12$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ Object m24xf78c78d9(final String str, final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.this.m23xc9b3de7a(completer, str);
                }
            });
            return "isUseCaseAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$isUseCaseAttached$11$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m23xc9b3de7a(CallbackToFutureAdapter.Completer completer, String str) {
        completer.set(Boolean.valueOf(this.mUseCaseAttachState.isUseCaseAttached(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean isMeteringRepeatingAttached() {
        try {
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda18
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraImpl.this.m22x3a89a76e(completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$isMeteringRepeatingAttached$14$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ Object m22x3a89a76e(final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.this.m21xcb10d0f(completer);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$isMeteringRepeatingAttached$13$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m21xcb10d0f(CallbackToFutureAdapter.Completer completer) {
        MeteringRepeatingSession meteringRepeatingSession = this.mMeteringRepeatingSession;
        if (meteringRepeatingSession == null) {
            completer.set(false);
        } else {
            completer.set(Boolean.valueOf(this.mUseCaseAttachState.isUseCaseAttached(getMeteringRepeatingId(meteringRepeatingSession))));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.mCameraControlInternal.incrementUseCount();
        notifyStateAttachedAndCameraControlReady(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.this.m17x1cf87860(arrayList2);
                }
            });
        } catch (RejectedExecutionException e) {
            debugLog("Unable to attach use cases.", e);
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$attachUseCases$15$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m17x1cf87860(List list) {
        try {
            tryAttachUseCases(list);
        } finally {
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    private void tryAttachUseCases(Collection<UseCaseInfo> collection) {
        Size surfaceResolution;
        boolean isEmpty = this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (UseCaseInfo useCaseInfo : collection) {
            if (!this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.setUseCaseAttached(useCaseInfo.getUseCaseId(), useCaseInfo.getSessionConfig(), useCaseInfo.getUseCaseConfig(), useCaseInfo.getStreamSpec(), useCaseInfo.getCaptureTypes());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class && (surfaceResolution = useCaseInfo.getSurfaceResolution()) != null) {
                    rational = new Rational(surfaceResolution.getWidth(), surfaceResolution.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.mCameraControlInternal.setActive(true);
            this.mCameraControlInternal.incrementUseCount();
        }
        addOrRemoveMeteringRepeatingUseCase();
        updateZslDisabledByUseCaseConfigStatus();
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        } else {
            openInternal();
        }
        if (rational != null) {
            this.mCameraControlInternal.setPreviewAspectRatio(rational);
        }
    }

    private Collection<UseCaseInfo> toUseCaseInfos(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(UseCaseInfo.from(it.next(), this.mIsPrimary));
        }
        return arrayList;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setExtendedConfig(CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = CameraConfigs.defaultConfig();
        }
        SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.mCameraConfig = cameraConfig;
        synchronized (this.mLock) {
            this.mSessionProcessor = sessionProcessor;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.mCameraConfig;
    }

    private void notifyStateAttachedAndCameraControlReady(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (!this.mNotifyStateAttachedSet.contains(useCaseId)) {
                this.mNotifyStateAttachedSet.add(useCaseId);
                useCase.onStateAttached();
                useCase.onCameraControlReady();
            }
        }
    }

    private void notifyStateDetachedToUseCases(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (this.mNotifyStateAttachedSet.contains(useCaseId)) {
                useCase.onStateDetached();
                this.mNotifyStateAttachedSet.remove(useCaseId);
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        notifyStateDetachedToUseCases(new ArrayList(arrayList));
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m19x3fc4c78d(arrayList2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryDetachUseCases, reason: merged with bridge method [inline-methods] */
    public void m19x3fc4c78d(Collection<UseCaseInfo> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (UseCaseInfo useCaseInfo : collection) {
            if (this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.removeUseCase(useCaseInfo.getUseCaseId());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z) {
            this.mCameraControlInternal.setPreviewAspectRatio(null);
        }
        addOrRemoveMeteringRepeatingUseCase();
        if (this.mUseCaseAttachState.getAttachedUseCaseConfigs().isEmpty()) {
            this.mCameraControlInternal.setZslDisabledByUserCaseConfig(false);
        } else {
            updateZslDisabledByUseCaseConfigStatus();
        }
        if (this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty()) {
            this.mCameraControlInternal.decrementUseCount();
            resetCaptureSession(false);
            this.mCameraControlInternal.setActive(false);
            this.mCaptureSession = newCaptureSession();
            closeInternal();
            return;
        }
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        }
    }

    private void updateZslDisabledByUseCaseConfigStatus() {
        Iterator<UseCaseConfig<?>> it = this.mUseCaseAttachState.getAttachedUseCaseConfigs().iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= it.next().isZslDisabled(false);
        }
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z);
    }

    private void addOrRemoveMeteringRepeatingUseCase() {
        SessionConfig build = this.mUseCaseAttachState.getAttachedBuilder().build();
        CaptureConfig repeatingCaptureConfig = build.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = build.getSurfaces().size();
        if (build.getSurfaces().isEmpty()) {
            return;
        }
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            if (this.mMeteringRepeatingSession == null) {
                this.mMeteringRepeatingSession = new MeteringRepeatingSession(this.mCameraInfoInternal.getCameraCharacteristicsCompat(), this.mDisplayInfoManager, new MeteringRepeatingSession.SurfaceResetCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda3
                    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
                    public final void onSurfaceReset() {
                        Camera2CameraImpl.this.m16x8e086554();
                    }
                });
            }
            if (isSurfaceCombinationWithMeteringRepeatingSupported()) {
                addMeteringRepeating();
                return;
            } else {
                Logger.e(TAG, "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            removeMeteringRepeating();
            return;
        }
        if (size >= 2) {
            removeMeteringRepeating();
        } else if (this.mMeteringRepeatingSession != null && !isSurfaceCombinationWithMeteringRepeatingSupported()) {
            removeMeteringRepeating();
        } else {
            Logger.d(TAG, "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$addOrRemoveMeteringRepeatingUseCase$17$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m16x8e086554() {
        if (isMeteringRepeatingAttached()) {
            resetUseCase(getMeteringRepeatingId(this.mMeteringRepeatingSession), this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig(), null, Collections.singletonList(UseCaseConfigFactory.CaptureType.METERING_REPEATING));
        }
    }

    private boolean isSurfaceCombinationWithMeteringRepeatingSupported() {
        ArrayList arrayList = new ArrayList();
        int cameraMode = getCameraMode();
        for (UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo : this.mUseCaseAttachState.getAttachedUseCaseInfo()) {
            if (useCaseAttachInfo.getCaptureTypes() == null || useCaseAttachInfo.getCaptureTypes().get(0) != UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                if (useCaseAttachInfo.getStreamSpec() == null || useCaseAttachInfo.getCaptureTypes() == null) {
                    Logger.w(TAG, "Invalid stream spec or capture types in " + useCaseAttachInfo);
                    return false;
                }
                SessionConfig sessionConfig = useCaseAttachInfo.getSessionConfig();
                UseCaseConfig<?> useCaseConfig = useCaseAttachInfo.getUseCaseConfig();
                for (DeferrableSurface deferrableSurface : sessionConfig.getSurfaces()) {
                    arrayList.add(AttachedSurfaceInfo.create(this.mSupportedSurfaceCombination.transformSurfaceConfig(cameraMode, useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize()), useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize(), useCaseAttachInfo.getStreamSpec().getDynamicRange(), useCaseAttachInfo.getCaptureTypes(), useCaseAttachInfo.getStreamSpec().getImplementationOptions(), useCaseConfig.getTargetFrameRate(null)));
                }
            }
        }
        Preconditions.checkNotNull(this.mMeteringRepeatingSession);
        HashMap hashMap = new HashMap();
        hashMap.put(this.mMeteringRepeatingSession.getUseCaseConfig(), Collections.singletonList(this.mMeteringRepeatingSession.getMeteringRepeatingSize()));
        try {
            this.mSupportedSurfaceCombination.getSuggestedStreamSpecifications(cameraMode, arrayList, hashMap, false, false);
            debugLog("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e) {
            debugLog("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }

    private int getCameraMode() {
        synchronized (this.mLock) {
            return this.mCameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
        }
    }

    private void removeMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            this.mUseCaseAttachState.setUseCaseDetached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mUseCaseAttachState.setUseCaseInactive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mMeteringRepeatingSession.clear();
            this.mMeteringRepeatingSession = null;
        }
    }

    private void addMeteringRepeating() {
        MeteringRepeatingSession meteringRepeatingSession = this.mMeteringRepeatingSession;
        if (meteringRepeatingSession != null) {
            String meteringRepeatingId = getMeteringRepeatingId(meteringRepeatingSession);
            this.mUseCaseAttachState.setUseCaseAttached(meteringRepeatingId, this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig(), null, Collections.singletonList(UseCaseConfigFactory.CaptureType.METERING_REPEATING));
            this.mUseCaseAttachState.setUseCaseActive(meteringRepeatingId, this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig(), null, Collections.singletonList(UseCaseConfigFactory.CaptureType.METERING_REPEATING));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraInfoInternal getCameraInfoInternal() {
        return this.mCameraInfoInternal;
    }

    public CameraAvailability getCameraAvailability() {
        return this.mCameraAvailability;
    }

    void tryForceOpenCameraDevice(boolean z) {
        debugLog("Attempting to force open the camera.");
        if (!this.mCameraStateRegistry.tryOpenCamera(this)) {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        } else {
            openCameraDevice(z);
        }
    }

    void tryOpenCameraDevice(boolean z) {
        debugLog("Attempting to open the camera.");
        if (!this.mCameraAvailability.isCameraAvailable() || !this.mCameraStateRegistry.tryOpenCamera(this)) {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        } else {
            openCameraDevice(z);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setPrimary(boolean z) {
        this.mIsPrimary = z;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(final boolean z) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m32x83557197(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setActiveResumingMode$18$androidx-camera-camera2-internal-Camera2CameraImpl, reason: not valid java name */
    public /* synthetic */ void m32x83557197(boolean z) {
        this.mIsActiveResumingMode = z;
        if (z && this.mState == InternalState.PENDING_OPEN) {
            tryForceOpenCameraDevice(false);
        }
    }

    private void openCameraDevice(boolean z) {
        if (!z) {
            this.mStateCallback.resetReopenMonitor();
        }
        this.mStateCallback.cancelScheduledReopen();
        this.mErrorTimeoutReopenScheduler.cancel();
        debugLog("Opening camera.");
        setState(InternalState.OPENING);
        try {
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, createDeviceStateCallback());
        } catch (CameraAccessExceptionCompat e) {
            debugLog("Unable to open camera due to " + e.getMessage());
            if (e.getReason() == 10001) {
                setState(InternalState.INITIALIZED, CameraState.StateError.create(7, e));
            } else {
                this.mErrorTimeoutReopenScheduler.start();
            }
        } catch (SecurityException e2) {
            debugLog("Unable to open camera due to " + e2.getMessage());
            setState(InternalState.REOPENING);
            this.mStateCallback.scheduleCameraReopen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ErrorTimeoutReopenScheduler {
        private static final long ERROR_TIMEOUT_MILLIS = 2000;
        private ScheduleNode mScheduleNode;

        private ErrorTimeoutReopenScheduler() {
            this.mScheduleNode = null;
        }

        public void start() {
            if (Camera2CameraImpl.this.mState != InternalState.OPENING) {
                Camera2CameraImpl.this.debugLog("Don't need the onError timeout handler.");
                return;
            }
            Camera2CameraImpl.this.debugLog("Camera waiting for onError.");
            cancel();
            this.mScheduleNode = new ScheduleNode();
        }

        public boolean isErrorHandling() {
            ScheduleNode scheduleNode = this.mScheduleNode;
            return (scheduleNode == null || scheduleNode.isDone()) ? false : true;
        }

        public void deviceOnError() {
            Camera2CameraImpl.this.debugLog("Camera receive onErrorCallback");
            cancel();
        }

        public void cancel() {
            ScheduleNode scheduleNode = this.mScheduleNode;
            if (scheduleNode != null) {
                scheduleNode.cancel();
            }
            this.mScheduleNode = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class ScheduleNode {
            private final AtomicBoolean mIsDone = new AtomicBoolean(false);
            private final ScheduledFuture<?> mScheduledFuture;

            ScheduleNode() {
                this.mScheduledFuture = Camera2CameraImpl.this.mScheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode.this.execute();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void execute() {
                if (this.mIsDone.getAndSet(true)) {
                    return;
                }
                Camera2CameraImpl.this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode.this.executeInternal();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void executeInternal() {
                if (Camera2CameraImpl.this.mState != InternalState.OPENING) {
                    Camera2CameraImpl.this.debugLog("Camera skip reopen at state: " + Camera2CameraImpl.this.mState);
                    return;
                }
                Camera2CameraImpl.this.debugLog("Camera onError timeout, reopen it.");
                Camera2CameraImpl.this.setState(InternalState.REOPENING);
                Camera2CameraImpl.this.mStateCallback.scheduleCameraReopen();
            }

            public void cancel() {
                this.mIsDone.set(true);
                this.mScheduledFuture.cancel(true);
            }

            public boolean isDone() {
                return this.mIsDone.get();
            }
        }
    }

    void updateCaptureSessionConfig() {
        SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.mUseCaseAttachState.getActiveAndAttachedBuilder();
        if (activeAndAttachedBuilder.isValid()) {
            this.mCameraControlInternal.setTemplate(activeAndAttachedBuilder.build().getTemplateType());
            activeAndAttachedBuilder.add(this.mCameraControlInternal.getSessionConfig());
            this.mCaptureSession.setSessionConfig(activeAndAttachedBuilder.build());
            return;
        }
        this.mCameraControlInternal.resetTemplate();
        this.mCaptureSession.setSessionConfig(this.mCameraControlInternal.getSessionConfig());
    }

    void openCaptureSession() {
        Preconditions.checkState(this.mState == InternalState.OPENED);
        SessionConfig.ValidatingBuilder attachedBuilder = this.mUseCaseAttachState.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            debugLog("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.mCameraStateRegistry.tryOpenCaptureSession(this.mCameraDevice.getId(), this.mCameraCoordinator.getPairedConcurrentCameraId(this.mCameraDevice.getId()))) {
            debugLog("Unable to create capture session in camera operating mode = " + this.mCameraCoordinator.getCameraOperatingMode());
            return;
        }
        HashMap hashMap = new HashMap();
        StreamUseCaseUtil.populateSurfaceToStreamUseCaseMapping(this.mUseCaseAttachState.getAttachedSessionConfigs(), this.mUseCaseAttachState.getAttachedUseCaseConfigs(), hashMap);
        this.mCaptureSession.setStreamUseCaseMap(hashMap);
        final CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        Futures.addCallback(captureSessionInterface.open(attachedBuilder.build(), (CameraDevice) Preconditions.checkNotNull(this.mCameraDevice), this.mCaptureSessionOpenerBuilder.build()), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.4
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r2) {
                if (Camera2CameraImpl.this.mCameraCoordinator.getCameraOperatingMode() == 2 && Camera2CameraImpl.this.mState == InternalState.OPENED) {
                    Camera2CameraImpl.this.setState(InternalState.CONFIGURED);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof DeferrableSurface.SurfaceClosedException) {
                    SessionConfig findSessionConfigForSurface = Camera2CameraImpl.this.findSessionConfigForSurface(((DeferrableSurface.SurfaceClosedException) th).getDeferrableSurface());
                    if (findSessionConfigForSurface != null) {
                        Camera2CameraImpl.this.postSurfaceClosedError(findSessionConfigForSurface);
                        return;
                    }
                    return;
                }
                if (th instanceof CancellationException) {
                    Camera2CameraImpl.this.debugLog("Unable to configure camera cancelled");
                    return;
                }
                if (Camera2CameraImpl.this.mState == InternalState.OPENED) {
                    Camera2CameraImpl.this.setState(InternalState.OPENED, CameraState.StateError.create(4, th));
                }
                Logger.e(Camera2CameraImpl.TAG, "Unable to configure camera " + Camera2CameraImpl.this, th);
                if (Camera2CameraImpl.this.mCaptureSession == captureSessionInterface) {
                    Camera2CameraImpl.this.resetCaptureSession(false);
                }
            }
        }, this.mExecutor);
    }

    SessionConfig findSessionConfigForSurface(DeferrableSurface deferrableSurface) {
        for (SessionConfig sessionConfig : this.mUseCaseAttachState.getAttachedSessionConfigs()) {
            if (sessionConfig.getSurfaces().contains(deferrableSurface)) {
                return sessionConfig;
            }
        }
        return null;
    }

    void postSurfaceClosedError(final SessionConfig sessionConfig) {
        ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        final SessionConfig.ErrorListener errorListener = sessionConfig.getErrorListener();
        if (errorListener != null) {
            debugLog("Posting surface closed", new Throwable());
            mainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    SessionConfig.ErrorListener.this.onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    void resetCaptureSession(boolean z) {
        Preconditions.checkState(this.mCaptureSession != null);
        debugLog("Resetting Capture Session");
        CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        SessionConfig sessionConfig = captureSessionInterface.getSessionConfig();
        List<CaptureConfig> captureConfigs = captureSessionInterface.getCaptureConfigs();
        CaptureSessionInterface newCaptureSession = newCaptureSession();
        this.mCaptureSession = newCaptureSession;
        newCaptureSession.setSessionConfig(sessionConfig);
        this.mCaptureSession.issueCaptureRequests(captureConfigs);
        if (this.mState.ordinal() == 8) {
            if (this.mCloseCameraBeforeCreateNewSessionQuirk && captureSessionInterface.isInOpenState()) {
                debugLog("Close camera before creating new session");
                setState(InternalState.REOPENING_QUIRK);
            }
        } else {
            debugLog("Skipping Capture Session state check due to current camera state: " + this.mState + " and previous session status: " + captureSessionInterface.isInOpenState());
        }
        if (this.mConfigAndCloseQuirk && captureSessionInterface.isInOpenState()) {
            debugLog("ConfigAndClose is required when close the camera.");
            this.mIsConfigAndCloseRequired = true;
        }
        releaseSession(captureSessionInterface, z);
    }

    private CameraDevice.StateCallback createDeviceStateCallback() {
        ArrayList arrayList = new ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
        arrayList.add(this.mStateCallback);
        return CameraDeviceStateCallbacks.createComboCallback(arrayList);
    }

    private boolean checkAndAttachRepeatingSurface(CaptureConfig.Builder builder) {
        if (!builder.getSurfaces().isEmpty()) {
            Logger.w(TAG, "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<SessionConfig> it = this.mUseCaseAttachState.getActiveAndAttachedSessionConfigs().iterator();
        while (it.hasNext()) {
            CaptureConfig repeatingCaptureConfig = it.next().getRepeatingCaptureConfig();
            List<DeferrableSurface> surfaces = repeatingCaptureConfig.getSurfaces();
            if (!surfaces.isEmpty()) {
                if (repeatingCaptureConfig.getPreviewStabilizationMode() != 0) {
                    builder.setPreviewStabilization(repeatingCaptureConfig.getPreviewStabilizationMode());
                }
                if (repeatingCaptureConfig.getVideoStabilizationMode() != 0) {
                    builder.setVideoStabilization(repeatingCaptureConfig.getVideoStabilizationMode());
                }
                Iterator<DeferrableSurface> it2 = surfaces.iterator();
                while (it2.hasNext()) {
                    builder.addSurface(it2.next());
                }
            }
        }
        if (!builder.getSurfaces().isEmpty()) {
            return true;
        }
        Logger.w(TAG, "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal getCameraControlInternal() {
        return this.mCameraControlInternal;
    }

    void submitCaptureRequests(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : list) {
            CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
            }
            if (!captureConfig.getSurfaces().isEmpty() || !captureConfig.isUseRepeatingSurface() || checkAndAttachRepeatingSurface(from)) {
                arrayList.add(from.build());
            }
        }
        debugLog("Issue capture request");
        this.mCaptureSession.issueCaptureRequests(arrayList);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.mCameraInfoInternal.getCameraId());
    }

    static String getUseCaseId(UseCase useCase) {
        return useCase.getName() + useCase.hashCode();
    }

    static List<UseCaseConfigFactory.CaptureType> getCaptureTypes(UseCase useCase) {
        if (useCase.getCamera() == null) {
            return null;
        }
        return StreamSharing.getCaptureTypes(useCase);
    }

    static String getMeteringRepeatingId(MeteringRepeatingSession meteringRepeatingSession) {
        return meteringRepeatingSession.getName() + meteringRepeatingSession.hashCode();
    }

    void debugLog(String str) {
        debugLog(str, null);
    }

    private void debugLog(String str, Throwable th) {
        Logger.d(TAG, String.format("{%s} %s", toString(), str), th);
    }

    void setState(InternalState internalState) {
        setState(internalState, null);
    }

    void setState(InternalState internalState, CameraState.StateError stateError) {
        setState(internalState, stateError, true);
    }

    void setState(InternalState internalState, CameraState.StateError stateError, boolean z) {
        CameraInternal.State state;
        debugLog("Transitioning camera internal state: " + this.mState + " --> " + internalState);
        traceInternalState(internalState, stateError);
        this.mState = internalState;
        switch (internalState) {
            case RELEASED:
                state = CameraInternal.State.RELEASED;
                break;
            case RELEASING:
                state = CameraInternal.State.RELEASING;
                break;
            case INITIALIZED:
                state = CameraInternal.State.CLOSED;
                break;
            case PENDING_OPEN:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                state = CameraInternal.State.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                state = CameraInternal.State.OPENING;
                break;
            case OPENED:
                state = CameraInternal.State.OPEN;
                break;
            case CONFIGURED:
                state = CameraInternal.State.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.mCameraStateRegistry.markCameraState(this, state, z);
        this.mObservableState.postValue(state);
        this.mCameraStateMachine.updateState(state, stateError);
    }

    void traceInternalState(InternalState internalState, CameraState.StateError stateError) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:C2State[" + this + "]", internalState.ordinal());
            if (stateError != null) {
                this.mTraceStateErrorCount++;
            }
            if (this.mTraceStateErrorCount > 0) {
                Trace.setCounter("CX:C2StateErrorCode[" + this + "]", stateError != null ? stateError.getCode() : 0);
            }
        }
    }

    static String getErrorMessage(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i == 4) {
            return "ERROR_CAMERA_DEVICE";
        }
        if (i == 5) {
            return "ERROR_CAMERA_SERVICE";
        }
        return "UNKNOWN ERROR";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class UseCaseInfo {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract List<UseCaseConfigFactory.CaptureType> getCaptureTypes();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract SessionConfig getSessionConfig();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract StreamSpec getStreamSpec();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Size getSurfaceResolution();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract UseCaseConfig<?> getUseCaseConfig();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract String getUseCaseId();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Class<?> getUseCaseType();

        static UseCaseInfo create(String str, Class<?> cls, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig, Size size, StreamSpec streamSpec, List<UseCaseConfigFactory.CaptureType> list) {
            return new AutoValue_Camera2CameraImpl_UseCaseInfo(str, cls, sessionConfig, useCaseConfig, size, streamSpec, list);
        }

        static UseCaseInfo from(UseCase useCase, boolean z) {
            SessionConfig secondarySessionConfig;
            String useCaseId = Camera2CameraImpl.getUseCaseId(useCase);
            Class<?> cls = useCase.getClass();
            if (z) {
                secondarySessionConfig = useCase.getSessionConfig();
            } else {
                secondarySessionConfig = useCase.getSecondarySessionConfig();
            }
            return create(useCaseId, cls, secondarySessionConfig, useCase.getCurrentConfig(), useCase.getAttachedSurfaceResolution(), useCase.getAttachedStreamSpec(), Camera2CameraImpl.getCaptureTypes(useCase));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class StateCallback extends CameraDevice.StateCallback {
        private final CameraReopenMonitor mCameraReopenMonitor;
        private final Executor mExecutor;
        ScheduledFuture<?> mScheduledReopenHandle;
        private ScheduledReopen mScheduledReopenRunnable;
        private final ScheduledExecutorService mScheduler;

        StateCallback(Executor executor, ScheduledExecutorService scheduledExecutorService, long j) {
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraReopenMonitor = new CameraReopenMonitor(j);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onOpened()");
            Camera2CameraImpl.this.mCameraDevice = cameraDevice;
            Camera2CameraImpl.this.mCameraDeviceError = 0;
            resetReopenMonitor();
            int ordinal = Camera2CameraImpl.this.mState.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
                Camera2CameraImpl.this.mCameraDevice.close();
                Camera2CameraImpl.this.mCameraDevice = null;
            } else {
                if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
                    Camera2CameraImpl.this.setState(InternalState.OPENED);
                    if (Camera2CameraImpl.this.mCameraStateRegistry.tryOpenCaptureSession(cameraDevice.getId(), Camera2CameraImpl.this.mCameraCoordinator.getPairedConcurrentCameraId(Camera2CameraImpl.this.mCameraDevice.getId()))) {
                        Camera2CameraImpl.this.openCaptureSession();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.mState);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onClosed()");
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDevice == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = Camera2CameraImpl.this.mState.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
                Camera2CameraImpl.this.configAndCloseIfNeeded();
            } else {
                if (ordinal == 5 || ordinal == 6) {
                    if (Camera2CameraImpl.this.mCameraDeviceError != 0) {
                        Camera2CameraImpl.this.debugLog("Camera closed due to error: " + Camera2CameraImpl.getErrorMessage(Camera2CameraImpl.this.mCameraDeviceError));
                        scheduleCameraReopen();
                        return;
                    } else {
                        Camera2CameraImpl.this.tryOpenCameraDevice(false);
                        return;
                    }
                }
                throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.mState);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2CameraImpl.this.mCameraDevice = cameraDevice;
            Camera2CameraImpl.this.mCameraDeviceError = i;
            Camera2CameraImpl.this.mErrorTimeoutReopenScheduler.deviceOnError();
            int ordinal = Camera2CameraImpl.this.mState.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        Logger.d(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i), Camera2CameraImpl.this.mState.name()));
                        handleErrorOnOpen(cameraDevice, i);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.mState);
                }
            }
            Logger.e(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i), Camera2CameraImpl.this.mState.name()));
            Camera2CameraImpl.this.closeCamera(false);
        }

        private void handleErrorOnOpen(CameraDevice cameraDevice, int i) {
            Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.OPENING || Camera2CameraImpl.this.mState == InternalState.OPENED || Camera2CameraImpl.this.mState == InternalState.CONFIGURED || Camera2CameraImpl.this.mState == InternalState.REOPENING || Camera2CameraImpl.this.mState == InternalState.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + Camera2CameraImpl.this.mState);
            if (i == 1 || i == 2 || i == 4) {
                Logger.d(Camera2CameraImpl.TAG, String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i)));
                reopenCameraAfterError(i);
            } else {
                Logger.e(Camera2CameraImpl.TAG, "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.getErrorMessage(i) + " closing camera.");
                Camera2CameraImpl.this.setState(InternalState.CLOSING, CameraState.StateError.create(i == 3 ? 5 : 6));
                Camera2CameraImpl.this.closeCamera(false);
            }
        }

        private void reopenCameraAfterError(int i) {
            int i2 = 1;
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDeviceError != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            Camera2CameraImpl.this.setState(InternalState.REOPENING, CameraState.StateError.create(i2));
            Camera2CameraImpl.this.closeCamera(false);
        }

        void scheduleCameraReopen() {
            Preconditions.checkState(this.mScheduledReopenRunnable == null);
            Preconditions.checkState(this.mScheduledReopenHandle == null);
            if (this.mCameraReopenMonitor.canScheduleCameraReopen()) {
                this.mScheduledReopenRunnable = new ScheduledReopen(this.mExecutor);
                Camera2CameraImpl.this.debugLog("Attempting camera re-open in " + this.mCameraReopenMonitor.getReopenDelayMs() + "ms: " + this.mScheduledReopenRunnable + " activeResuming = " + Camera2CameraImpl.this.mIsActiveResumingMode);
                this.mScheduledReopenHandle = this.mScheduler.schedule(this.mScheduledReopenRunnable, this.mCameraReopenMonitor.getReopenDelayMs(), TimeUnit.MILLISECONDS);
            } else {
                Logger.e(Camera2CameraImpl.TAG, "Camera reopening attempted for " + this.mCameraReopenMonitor.getReopenLimitMs() + "ms without success.");
                Camera2CameraImpl.this.setState(InternalState.PENDING_OPEN, null, false);
            }
        }

        boolean cancelScheduledReopen() {
            if (this.mScheduledReopenHandle == null) {
                return false;
            }
            Camera2CameraImpl.this.debugLog("Cancelling scheduled re-open: " + this.mScheduledReopenRunnable);
            this.mScheduledReopenRunnable.cancel();
            this.mScheduledReopenRunnable = null;
            this.mScheduledReopenHandle.cancel(false);
            this.mScheduledReopenHandle = null;
            return true;
        }

        void resetReopenMonitor() {
            this.mCameraReopenMonitor.reset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class ScheduledReopen implements Runnable {
            private boolean mCancelled = false;
            private Executor mExecutor;

            ScheduledReopen(Executor executor) {
                this.mExecutor = executor;
            }

            void cancel() {
                this.mCancelled = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$StateCallback$ScheduledReopen$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.StateCallback.ScheduledReopen.this.m34x10b58748();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: lambda$run$0$androidx-camera-camera2-internal-Camera2CameraImpl$StateCallback$ScheduledReopen, reason: not valid java name */
            public /* synthetic */ void m34x10b58748() {
                if (this.mCancelled) {
                    return;
                }
                Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.REOPENING || Camera2CameraImpl.this.mState == InternalState.REOPENING_QUIRK);
                if (StateCallback.this.shouldActiveResume()) {
                    Camera2CameraImpl.this.tryForceOpenCameraDevice(true);
                } else {
                    Camera2CameraImpl.this.tryOpenCameraDevice(true);
                }
            }
        }

        boolean shouldActiveResume() {
            return Camera2CameraImpl.this.mIsActiveResumingMode && (Camera2CameraImpl.this.mCameraDeviceError == 1 || Camera2CameraImpl.this.mCameraDeviceError == 2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class CameraReopenMonitor {
            static final int ACTIVE_REOPEN_DELAY_BASE_MS = 1000;
            static final int ACTIVE_REOPEN_LIMIT_MS = 1800000;
            static final int INVALID_TIME = -1;
            static final int REOPEN_DELAY_MS = 700;
            static final int REOPEN_LIMIT_MS = 10000;
            private final long mCameraOpenRetryMaxTimeoutInMs;
            private long mFirstReopenTime = -1;

            CameraReopenMonitor(long j) {
                this.mCameraOpenRetryMaxTimeoutInMs = j;
            }

            int getReopenDelayMs() {
                if (!StateCallback.this.shouldActiveResume()) {
                    return 700;
                }
                long elapsedTime = getElapsedTime();
                if (elapsedTime <= 120000) {
                    return 1000;
                }
                return elapsedTime <= 300000 ? 2000 : 4000;
            }

            int getReopenLimitMs() {
                if (!StateCallback.this.shouldActiveResume()) {
                    long j = this.mCameraOpenRetryMaxTimeoutInMs;
                    if (j > 0) {
                        return Math.min((int) j, 10000);
                    }
                    return 10000;
                }
                long j2 = this.mCameraOpenRetryMaxTimeoutInMs;
                if (j2 > 0) {
                    return Math.min((int) j2, 1800000);
                }
                return 1800000;
            }

            long getElapsedTime() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.mFirstReopenTime == -1) {
                    this.mFirstReopenTime = uptimeMillis;
                }
                return uptimeMillis - this.mFirstReopenTime;
            }

            boolean canScheduleCameraReopen() {
                if (getElapsedTime() < getReopenLimitMs()) {
                    return true;
                }
                reset();
                return false;
            }

            void reset() {
                this.mFirstReopenTime = -1L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class CameraAvailability extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {
        private boolean mCameraAvailable = true;
        private final String mCameraId;

        CameraAvailability(String str) {
            this.mCameraId = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = true;
                if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                    Camera2CameraImpl.this.tryOpenCameraDevice(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = false;
            }
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public void onOpenAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.tryOpenCameraDevice(false);
            }
        }

        boolean isCameraAvailable() {
            return this.mCameraAvailable;
        }
    }

    /* loaded from: classes.dex */
    final class CameraConfigureAvailable implements CameraStateRegistry.OnConfigureAvailableListener {
        CameraConfigureAvailable() {
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public void onConfigureAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.OPENED) {
                Camera2CameraImpl.this.openCaptureSession();
            }
        }
    }

    /* loaded from: classes.dex */
    final class ControlUpdateListenerInternal implements CameraControlInternal.ControlUpdateCallback {
        ControlUpdateListenerInternal() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlUpdateSessionConfig() {
            Camera2CameraImpl.this.updateCaptureSessionConfig();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlCaptureRequests(List<CaptureConfig> list) {
            Camera2CameraImpl.this.submitCaptureRequests((List) Preconditions.checkNotNull(list));
        }
    }
}
