package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.internal.compat.workaround.TorchStateReset;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CaptureSession implements CaptureSessionInterface {
    private static final String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private final boolean mCanUseMultiResolutionImageReader;
    private final List<CaptureConfig> mCaptureConfigs;
    private final StateCallback mCaptureSessionStateCallback;
    List<DeferrableSurface> mConfiguredDeferrableSurfaces;
    private final Map<DeferrableSurface, Surface> mConfiguredSurfaceMap;
    private final DynamicRangesCompat mDynamicRangesCompat;
    CallbackToFutureAdapter.Completer<Void> mReleaseCompleter;
    ListenableFuture<Void> mReleaseFuture;
    private final RequestMonitor mRequestMonitor;
    SessionConfig mSessionConfig;
    final Object mSessionLock;
    SynchronizedCaptureSession.Opener mSessionOpener;
    State mState;
    private final StillCaptureFlow mStillCaptureFlow;
    private Map<DeferrableSurface, Long> mStreamUseCaseMap;
    SynchronizedCaptureSession mSynchronizedCaptureSession;
    private final TemplateParamsOverride mTemplateParamsOverride;
    private final TorchStateReset mTorchStateReset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CaptureSession(DynamicRangesCompat dynamicRangesCompat) {
        this(dynamicRangesCompat, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, boolean z) {
        this(dynamicRangesCompat, new Quirks(Collections.emptyList()), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks) {
        this(dynamicRangesCompat, quirks, false);
    }

    CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks, boolean z) {
        this.mSessionLock = new Object();
        this.mCaptureConfigs = new ArrayList();
        this.mConfiguredSurfaceMap = new HashMap();
        this.mConfiguredDeferrableSurfaces = Collections.emptyList();
        this.mState = State.UNINITIALIZED;
        this.mStreamUseCaseMap = new HashMap();
        this.mStillCaptureFlow = new StillCaptureFlow();
        this.mTorchStateReset = new TorchStateReset();
        this.mState = State.INITIALIZED;
        this.mDynamicRangesCompat = dynamicRangesCompat;
        this.mCaptureSessionStateCallback = new StateCallback();
        this.mRequestMonitor = new RequestMonitor(quirks.contains(CaptureNoResponseQuirk.class));
        this.mTemplateParamsOverride = new TemplateParamsOverride(quirks);
        this.mCanUseMultiResolutionImageReader = z;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(Map<DeferrableSurface, Long> map) {
        synchronized (this.mSessionLock) {
            this.mStreamUseCaseMap = map;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            switch (this.mState) {
                case UNINITIALIZED:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.mState);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.mSessionConfig = sessionConfig;
                    break;
                case OPENED:
                    this.mSessionConfig = sessionConfig;
                    if (sessionConfig != null) {
                        if (!this.mConfiguredSurfaceMap.keySet().containsAll(sessionConfig.getSurfaces())) {
                            Logger.e(TAG, "Does not have the proper configured lists");
                            return;
                        } else {
                            Logger.d(TAG, "Attempting to submit CaptureRequest after setting");
                            issueRepeatingCaptureRequests(this.mSessionConfig);
                            break;
                        }
                    } else {
                        return;
                    }
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public ListenableFuture<Void> open(final SessionConfig sessionConfig, final CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        synchronized (this.mSessionLock) {
            if (this.mState.ordinal() == 1) {
                this.mState = State.GET_SURFACE;
                ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
                this.mConfiguredDeferrableSurfaces = arrayList;
                this.mSessionOpener = opener;
                FutureChain transformAsync = FutureChain.from(opener.startWithDeferrableSurface(arrayList, 5000L)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda2
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return CaptureSession.this.m55lambda$open$0$androidxcameracamera2internalCaptureSession(sessionConfig, cameraDevice, (List) obj);
                    }
                }, this.mSessionOpener.getExecutor());
                Futures.addCallback(transformAsync, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r1) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th) {
                        synchronized (CaptureSession.this.mSessionLock) {
                            CaptureSession.this.mSessionOpener.stop();
                            int ordinal = CaptureSession.this.mState.ordinal();
                            if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th instanceof CancellationException)) {
                                Logger.w(CaptureSession.TAG, "Opening session with fail " + CaptureSession.this.mState, th);
                                CaptureSession.this.finishClose();
                            }
                        }
                    }
                }, this.mSessionOpener.getExecutor());
                return Futures.nonCancellationPropagating(transformAsync);
            }
            Logger.e(TAG, "Open not allowed in state: " + this.mState);
            return Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openCaptureSession, reason: merged with bridge method [inline-methods] */
    public ListenableFuture<Void> m55lambda$open$0$androidxcameracamera2internalCaptureSession(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            int ordinal = this.mState.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2) {
                    this.mConfiguredSurfaceMap.clear();
                    for (int i = 0; i < list.size(); i++) {
                        this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i), list.get(i));
                    }
                    this.mState = State.OPENING;
                    Logger.d(TAG, "Opening capture session.");
                    SynchronizedCaptureSession.StateCallback createComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                    Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                    Map hashMap = new HashMap();
                    if (this.mCanUseMultiResolutionImageReader && Build.VERSION.SDK_INT >= 35) {
                        hashMap = createMultiResolutionOutputConfigurationCompats(groupMrirOutputConfigs(sessionConfig.getOutputConfigs()), this.mConfiguredSurfaceMap);
                    }
                    ArrayList arrayList = new ArrayList();
                    String physicalCameraId = camera2ImplConfig.getPhysicalCameraId(null);
                    for (SessionConfig.OutputConfig outputConfig : sessionConfig.getOutputConfigs()) {
                        OutputConfigurationCompat outputConfigurationCompat = (!this.mCanUseMultiResolutionImageReader || Build.VERSION.SDK_INT < 35) ? null : (OutputConfigurationCompat) hashMap.get(outputConfig);
                        if (outputConfigurationCompat == null) {
                            outputConfigurationCompat = getOutputConfigurationCompat(outputConfig, this.mConfiguredSurfaceMap, physicalCameraId);
                            if (this.mStreamUseCaseMap.containsKey(outputConfig.getSurface())) {
                                outputConfigurationCompat.setStreamUseCase(this.mStreamUseCaseMap.get(outputConfig.getSurface()).longValue());
                            }
                        }
                        arrayList.add(outputConfigurationCompat);
                    }
                    SessionConfigurationCompat createSessionConfigurationCompat = this.mSessionOpener.createSessionConfigurationCompat(sessionConfig.getSessionType(), getUniqueOutputConfigurations(arrayList), createComboCallback);
                    if (sessionConfig.getTemplateType() == 5 && sessionConfig.getInputConfiguration() != null) {
                        createSessionConfigurationCompat.setInputConfiguration(InputConfigurationCompat.wrap(sessionConfig.getInputConfiguration()));
                    }
                    try {
                        CaptureRequest buildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(from.build(), cameraDevice, this.mTemplateParamsOverride);
                        if (buildWithoutTarget != null) {
                            createSessionConfigurationCompat.setSessionParameters(buildWithoutTarget);
                        }
                        return this.mSessionOpener.openCaptureSession(cameraDevice, createSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                    } catch (CameraAccessException e) {
                        return Futures.immediateFailedFuture(e);
                    }
                }
                if (ordinal != 4) {
                    return Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                }
            }
            return Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
        }
    }

    private List<OutputConfigurationCompat> getUniqueOutputConfigurations(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OutputConfigurationCompat outputConfigurationCompat : list) {
            if (!arrayList.contains(outputConfigurationCompat.getSurface())) {
                arrayList.add(outputConfigurationCompat.getSurface());
                arrayList2.add(outputConfigurationCompat);
            }
        }
        return arrayList2;
    }

    private OutputConfigurationCompat getOutputConfigurationCompat(SessionConfig.OutputConfig outputConfig, Map<DeferrableSurface, Surface> map, String str) {
        long j;
        DynamicRangeProfiles dynamicRangeProfiles;
        Surface surface = map.get(outputConfig.getSurface());
        Preconditions.checkNotNull(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat(outputConfig.getSurfaceGroupId(), surface);
        if (str != null) {
            outputConfigurationCompat.setPhysicalCameraId(str);
        } else {
            outputConfigurationCompat.setPhysicalCameraId(outputConfig.getPhysicalCameraId());
        }
        if (outputConfig.getMirrorMode() == 0) {
            outputConfigurationCompat.setMirrorMode(1);
        } else if (outputConfig.getMirrorMode() == 1) {
            outputConfigurationCompat.setMirrorMode(2);
        }
        if (!outputConfig.getSharedSurfaces().isEmpty()) {
            outputConfigurationCompat.enableSurfaceSharing();
            Iterator<DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                Preconditions.checkNotNull(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                outputConfigurationCompat.addSurface(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfiles = this.mDynamicRangesCompat.toDynamicRangeProfiles()) != null) {
            DynamicRange dynamicRange = outputConfig.getDynamicRange();
            Long dynamicRangeToFirstSupportedProfile = DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (dynamicRangeToFirstSupportedProfile == null) {
                Logger.e(TAG, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRange);
            } else {
                j = dynamicRangeToFirstSupportedProfile.longValue();
                outputConfigurationCompat.setDynamicRangeProfile(j);
                return outputConfigurationCompat;
            }
        }
        j = 1;
        outputConfigurationCompat.setDynamicRangeProfile(j);
        return outputConfigurationCompat;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        synchronized (this.mSessionLock) {
            int ordinal = this.mState.ordinal();
            if (ordinal == 0) {
                throw new IllegalStateException("close() should not be possible in state: " + this.mState);
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                } else if (ordinal == 3 || ordinal == 4) {
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                    this.mState = State.CLOSED;
                    this.mRequestMonitor.stop();
                    this.mSessionConfig = null;
                }
            }
            this.mState = State.RELEASED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x000a, B:5:0x0010, B:7:0x009b, B:11:0x0015, B:16:0x001b, B:14:0x0027, B:19:0x0020, B:20:0x002c, B:22:0x0051, B:23:0x0055, B:25:0x0059, B:26:0x0064, B:27:0x0066, B:29:0x0068, B:30:0x0081, B:31:0x0086, B:32:0x009a), top: B:3:0x000a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x000a, B:5:0x0010, B:7:0x009b, B:11:0x0015, B:16:0x001b, B:14:0x0027, B:19:0x0020, B:20:0x002c, B:22:0x0051, B:23:0x0055, B:25:0x0059, B:26:0x0064, B:27:0x0066, B:29:0x0068, B:30:0x0081, B:31:0x0086, B:32:0x009a), top: B:3:0x000a, inners: #1 }] */
    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release(boolean r6) {
        /*
            r5 = this;
            java.lang.String r0 = "The Opener shouldn't null in state:"
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "release() should not be possible in state: "
            java.lang.Object r3 = r5.mSessionLock
            monitor-enter(r3)
            androidx.camera.camera2.internal.CaptureSession$State r4 = r5.mState     // Catch: java.lang.Throwable -> La2
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> La2
            switch(r4) {
                case 0: goto L86;
                case 1: goto L81;
                case 2: goto L68;
                case 3: goto L2c;
                case 4: goto L15;
                case 5: goto L15;
                case 6: goto L55;
                default: goto L13;
            }     // Catch: java.lang.Throwable -> La2
        L13:
            goto L9b
        L15:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = r5.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L2c
            if (r6 == 0) goto L27
            r1.abortCaptures()     // Catch: android.hardware.camera2.CameraAccessException -> L1f java.lang.Throwable -> La2
            goto L27
        L1f:
            r6 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.Logger.e(r1, r2, r6)     // Catch: java.lang.Throwable -> La2
        L27:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r6 = r5.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> La2
            r6.close()     // Catch: java.lang.Throwable -> La2
        L2c:
            androidx.camera.camera2.internal.CaptureSession$State r6 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch: java.lang.Throwable -> La2
            r5.mState = r6     // Catch: java.lang.Throwable -> La2
            androidx.camera.camera2.internal.compat.workaround.RequestMonitor r6 = r5.mRequestMonitor     // Catch: java.lang.Throwable -> La2
            r6.stop()     // Catch: java.lang.Throwable -> La2
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r6 = r5.mSessionOpener     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La2
            androidx.camera.camera2.internal.CaptureSession$State r0 = r5.mState     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La2
            androidx.core.util.Preconditions.checkNotNull(r6, r0)     // Catch: java.lang.Throwable -> La2
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r6 = r5.mSessionOpener     // Catch: java.lang.Throwable -> La2
            boolean r6 = r6.stop()     // Catch: java.lang.Throwable -> La2
            if (r6 == 0) goto L55
            r5.finishClose()     // Catch: java.lang.Throwable -> La2
            goto L9b
        L55:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r6 = r5.mReleaseFuture     // Catch: java.lang.Throwable -> La2
            if (r6 != 0) goto L64
            androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda1 r6 = new androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> La2
            r6.<init>()     // Catch: java.lang.Throwable -> La2
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r6)     // Catch: java.lang.Throwable -> La2
            r5.mReleaseFuture = r6     // Catch: java.lang.Throwable -> La2
        L64:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r6 = r5.mReleaseFuture     // Catch: java.lang.Throwable -> La2
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
            return r6
        L68:
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r6 = r5.mSessionOpener     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La2
            androidx.camera.camera2.internal.CaptureSession$State r1 = r5.mState     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La2
            androidx.core.util.Preconditions.checkNotNull(r6, r0)     // Catch: java.lang.Throwable -> La2
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r6 = r5.mSessionOpener     // Catch: java.lang.Throwable -> La2
            r6.stop()     // Catch: java.lang.Throwable -> La2
        L81:
            androidx.camera.camera2.internal.CaptureSession$State r6 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch: java.lang.Throwable -> La2
            r5.mState = r6     // Catch: java.lang.Throwable -> La2
            goto L9b
        L86:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La2
            androidx.camera.camera2.internal.CaptureSession$State r1 = r5.mState     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La2
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La2
            throw r6     // Catch: java.lang.Throwable -> La2
        L9b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
            r6 = 0
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r6)
            return r6
        La2:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.release(boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$release$1$androidx-camera-camera2-internal-CaptureSession, reason: not valid java name */
    public /* synthetic */ Object m56lambda$release$1$androidxcameracamera2internalCaptureSession(CallbackToFutureAdapter.Completer completer) throws Exception {
        String str;
        synchronized (this.mSessionLock) {
            Preconditions.checkState(this.mReleaseCompleter == null, "Release completer expected to be null");
            this.mReleaseCompleter = completer;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            switch (this.mState) {
                case UNINITIALIZED:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.mCaptureConfigs.addAll(list);
                    break;
                case OPENED:
                    this.mCaptureConfigs.addAll(list);
                    issuePendingCaptureRequest();
                    break;
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.mSessionLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    State getState() {
        State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        boolean z;
        synchronized (this.mSessionLock) {
            z = this.mState == State.OPENED || this.mState == State.OPENING;
        }
        return z;
    }

    void finishClose() {
        if (this.mState == State.RELEASED) {
            Logger.d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = State.RELEASED;
        this.mSynchronizedCaptureSession = null;
        CallbackToFutureAdapter.Completer<Void> completer = this.mReleaseCompleter;
        if (completer != null) {
            completer.set(null);
            this.mReleaseCompleter = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int issueRepeatingCaptureRequests(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            if (sessionConfig == null) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.mState != State.OPENED) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e) {
                    Logger.e(TAG, "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                Logger.d(TAG, "Issuing request for session.");
                CaptureRequest build = Camera2CaptureRequestBuilder.build(repeatingCaptureConfig, this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, true, this.mTemplateParamsOverride);
                if (build == null) {
                    Logger.d(TAG, "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.mSynchronizedCaptureSession.setSingleRepeatingRequest(build, this.mRequestMonitor.createMonitorListener(createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e2) {
                Logger.e(TAG, "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    void issuePendingCaptureRequest() {
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CaptureSession.this.m54x337815aa();
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$issuePendingCaptureRequest$2$androidx-camera-camera2-internal-CaptureSession, reason: not valid java name */
    public /* synthetic */ void m54x337815aa() {
        synchronized (this.mSessionLock) {
            if (this.mCaptureConfigs.isEmpty()) {
                return;
            }
            try {
                issueBurstCaptureRequest(this.mCaptureConfigs);
            } finally {
                this.mCaptureConfigs.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int issueBurstCaptureRequest(List<CaptureConfig> list) {
        CameraBurstCaptureCallback cameraBurstCaptureCallback;
        ArrayList arrayList;
        boolean z;
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.d(TAG, "Skipping issueBurstCaptureRequest due to session closed");
                return -1;
            }
            if (list.isEmpty()) {
                return -1;
            }
            try {
                cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                arrayList = new ArrayList();
                Logger.d(TAG, "Issuing capture request.");
                z = false;
                for (CaptureConfig captureConfig : list) {
                    if (captureConfig.getSurfaces().isEmpty()) {
                        Logger.d(TAG, "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it = captureConfig.getSurfaces().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                DeferrableSurface next = it.next();
                                if (!this.mConfiguredSurfaceMap.containsKey(next)) {
                                    Logger.d(TAG, "Skipping capture request with invalid surface: " + next);
                                    break;
                                }
                            } else {
                                if (captureConfig.getTemplateType() == 2) {
                                    z = true;
                                }
                                CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                                if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                    from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                                }
                                SessionConfig sessionConfig = this.mSessionConfig;
                                if (sessionConfig != null) {
                                    from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                                }
                                from.addImplementationOptions(captureConfig.getImplementationOptions());
                                CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, false, this.mTemplateParamsOverride);
                                if (build == null) {
                                    Logger.d(TAG, "Skipping issuing request without surface.");
                                    return -1;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<CameraCaptureCallback> it2 = captureConfig.getCameraCaptureCallbacks().iterator();
                                while (it2.hasNext()) {
                                    CaptureCallbackConverter.toCaptureCallback(it2.next(), arrayList2);
                                }
                                cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                                arrayList.add(build);
                            }
                        }
                    }
                }
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList.isEmpty()) {
                if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z)) {
                    this.mSynchronizedCaptureSession.stopRepeating();
                    cameraBurstCaptureCallback.setCaptureSequenceCallback(new CameraBurstCaptureCallback.CaptureSequenceCallback() { // from class: androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda0
                        @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
                        public final void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i, boolean z2) {
                            CaptureSession.this.m53xac56a034(cameraCaptureSession, i, z2);
                        }
                    });
                }
                if (this.mTorchStateReset.isTorchResetRequired(arrayList, z)) {
                    cameraBurstCaptureCallback.addCamera2Callbacks((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                            synchronized (CaptureSession.this.mSessionLock) {
                                if (CaptureSession.this.mSessionConfig == null) {
                                    return;
                                }
                                CaptureConfig repeatingCaptureConfig = CaptureSession.this.mSessionConfig.getRepeatingCaptureConfig();
                                Logger.d(CaptureSession.TAG, "Submit FLASH_MODE_OFF request");
                                CaptureSession captureSession = CaptureSession.this;
                                captureSession.issueCaptureRequests(Collections.singletonList(captureSession.mTorchStateReset.createTorchResetRequest(repeatingCaptureConfig)));
                            }
                        }
                    }));
                }
                return this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
            }
            Logger.d(TAG, "Skipping issuing burst request due to no valid request elements");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$issueBurstCaptureRequest$3$androidx-camera-camera2-internal-CaptureSession, reason: not valid java name */
    public /* synthetic */ void m53xac56a034(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                issueRepeatingCaptureRequests(this.mSessionConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.abortCaptures();
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to abort captures.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to stop repeating.", e);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.mSessionLock) {
            if (this.mCaptureConfigs.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.mCaptureConfigs);
                this.mCaptureConfigs.clear();
            }
        }
        if (arrayList != null) {
            for (CaptureConfig captureConfig : arrayList) {
                Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
        }
    }

    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<CameraCaptureCallback> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    private static Map<Integer, List<SessionConfig.OutputConfig>> groupMrirOutputConfigs(Collection<SessionConfig.OutputConfig> collection) {
        HashMap hashMap = new HashMap();
        for (SessionConfig.OutputConfig outputConfig : collection) {
            if (outputConfig.getSurfaceGroupId() > 0 && outputConfig.getSharedSurfaces().isEmpty()) {
                List list = (List) hashMap.get(Integer.valueOf(outputConfig.getSurfaceGroupId()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(outputConfig.getSurfaceGroupId()), list);
                }
                list.add(outputConfig);
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (((List) hashMap.get(Integer.valueOf(intValue))).size() >= 2) {
                hashMap2.put(Integer.valueOf(intValue), (List) hashMap.get(Integer.valueOf(intValue)));
            }
        }
        return hashMap2;
    }

    private static Map<SessionConfig.OutputConfig, OutputConfigurationCompat> createMultiResolutionOutputConfigurationCompats(Map<Integer, List<SessionConfig.OutputConfig>> map, Map<DeferrableSurface, Surface> map2) {
        HashMap hashMap = new HashMap();
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (SessionConfig.OutputConfig outputConfig : map.get(Integer.valueOf(intValue))) {
                SurfaceUtil.SurfaceInfo surfaceInfo = SurfaceUtil.getSurfaceInfo(map2.get(outputConfig.getSurface()));
                if (i == 0) {
                    i = surfaceInfo.format;
                }
                arrayList.add(new MultiResolutionStreamInfo(surfaceInfo.width, surfaceInfo.height, (String) Objects.requireNonNull(outputConfig.getPhysicalCameraId())));
            }
            if (i == 0 || arrayList.isEmpty()) {
                Logger.e(TAG, "Skips to create instances for multi-resolution output. imageFormat: " + i + ", streamInfos size: " + arrayList.size());
            } else {
                List<OutputConfiguration> createInstancesForMultiResolutionOutput = createInstancesForMultiResolutionOutput(arrayList, i);
                if (createInstancesForMultiResolutionOutput != null) {
                    for (SessionConfig.OutputConfig outputConfig2 : map.get(Integer.valueOf(intValue))) {
                        OutputConfiguration remove = createInstancesForMultiResolutionOutput.remove(0);
                        remove.addSurface(map2.get(outputConfig2.getSurface()));
                        hashMap.put(outputConfig2, new OutputConfigurationCompat(remove));
                    }
                }
            }
        }
        return hashMap;
    }

    private static List<OutputConfiguration> createInstancesForMultiResolutionOutput(List<MultiResolutionStreamInfo> list, int i) {
        try {
            return (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, list, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Logger.e(TAG, "Failed to create instances for multi-resolution output, " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        StateCallback() {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (CaptureSession.this.mState) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                    case RELEASED:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                    case OPENING:
                        CaptureSession.this.mState = State.OPENED;
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        Logger.d(CaptureSession.TAG, "Attempting to send capture request onConfigured");
                        CaptureSession captureSession = CaptureSession.this;
                        captureSession.issueRepeatingCaptureRequests(captureSession.mSessionConfig);
                        CaptureSession.this.issuePendingCaptureRequest();
                        break;
                    case CLOSED:
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        break;
                    case RELEASING:
                        synchronizedCaptureSession.close();
                        break;
                }
                Logger.d(CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (CaptureSession.this.mState.ordinal() == 0) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                }
                Logger.d(CaptureSession.TAG, "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (CaptureSession.this.mState == State.UNINITIALIZED) {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                }
                Logger.d(CaptureSession.TAG, "onSessionFinished()");
                CaptureSession.this.finishClose();
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (CaptureSession.this.mState) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                    case OPENING:
                    case CLOSED:
                    case RELEASING:
                        CaptureSession.this.finishClose();
                        break;
                    case RELEASED:
                        Logger.d(CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                Logger.e(CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
            }
        }
    }
}
