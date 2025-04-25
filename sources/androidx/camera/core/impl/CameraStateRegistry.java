package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE = 2;
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE = 1;
    private static final String TAG = "CameraStateRegistry";
    private int mAvailableCameras;
    private final CameraCoordinator mCameraCoordinator;
    private final Map<Camera, CameraRegistration> mCameraStates;
    private final StringBuilder mDebugString = new StringBuilder();
    private final Object mLock;
    private int mMaxAllowedOpenedCameras;

    /* loaded from: classes.dex */
    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    /* loaded from: classes.dex */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(CameraCoordinator cameraCoordinator, int i) {
        Object obj = new Object();
        this.mLock = obj;
        this.mCameraStates = new HashMap();
        this.mMaxAllowedOpenedCameras = i;
        synchronized (obj) {
            this.mCameraCoordinator = cameraCoordinator;
            this.mAvailableCameras = this.mMaxAllowedOpenedCameras;
        }
    }

    public void registerCamera(Camera camera, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.mLock) {
            Preconditions.checkState(!this.mCameraStates.containsKey(camera), "Camera is already registered: " + camera);
            this.mCameraStates.put(camera, new CameraRegistration(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: all -> 0x00a1, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0053, B:9:0x0057, B:13:0x006f, B:15:0x0077, B:18:0x0086, B:21:0x009c, B:22:0x009f, B:26:0x0064), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c A[Catch: all -> 0x00a1, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0053, B:9:0x0057, B:13:0x006f, B:15:0x0077, B:18:0x0086, B:21:0x009c, B:22:0x009f, B:26:0x0064), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean tryOpenCamera(androidx.camera.core.Camera r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r10.mCameraStates     // Catch: java.lang.Throwable -> La1
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> La1
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> La1
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r2)     // Catch: java.lang.Throwable -> La1
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L53
            java.lang.StringBuilder r2 = r10.mDebugString     // Catch: java.lang.Throwable -> La1
            r2.setLength(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r2 = r10.mDebugString     // Catch: java.lang.Throwable -> La1
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> La1
            r7[r4] = r11     // Catch: java.lang.Throwable -> La1
            int r8 = r10.mAvailableCameras     // Catch: java.lang.Throwable -> La1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> La1
            r7[r3] = r8     // Catch: java.lang.Throwable -> La1
            androidx.camera.core.impl.CameraInternal$State r8 = r1.getState()     // Catch: java.lang.Throwable -> La1
            boolean r8 = isOpen(r8)     // Catch: java.lang.Throwable -> La1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> La1
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Throwable -> La1
            androidx.camera.core.impl.CameraInternal$State r8 = r1.getState()     // Catch: java.lang.Throwable -> La1
            r9 = 3
            r7[r9] = r8     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> La1
            r2.append(r5)     // Catch: java.lang.Throwable -> La1
        L53:
            int r2 = r10.mAvailableCameras     // Catch: java.lang.Throwable -> La1
            if (r2 > 0) goto L64
            androidx.camera.core.impl.CameraInternal$State r2 = r1.getState()     // Catch: java.lang.Throwable -> La1
            boolean r2 = isOpen(r2)     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L62
            goto L64
        L62:
            r11 = r4
            goto L6f
        L64:
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch: java.lang.Throwable -> La1
            r1.setState(r2)     // Catch: java.lang.Throwable -> La1
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch: java.lang.Throwable -> La1
            traceState(r11, r1)     // Catch: java.lang.Throwable -> La1
            r11 = r3
        L6f:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.Logger.isDebugEnabled(r1)     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L9a
            java.lang.StringBuilder r1 = r10.mDebugString     // Catch: java.lang.Throwable -> La1
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La1
            if (r11 == 0) goto L84
            java.lang.String r6 = "SUCCESS"
            goto L86
        L84:
            java.lang.String r6 = "FAIL"
        L86:
            r3[r4] = r6     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> La1
            r1.append(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r10.mDebugString     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La1
            androidx.camera.core.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> La1
        L9a:
            if (r11 == 0) goto L9f
            r10.recalculateAvailableCameras()     // Catch: java.lang.Throwable -> La1
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            return r11
        La1:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCamera(androidx.camera.core.Camera):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean tryOpenCaptureSession(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r4.mCameraCoordinator     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.getCameraOperatingMode()     // Catch: java.lang.Throwable -> L5b
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return r3
        Lf:
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r5 = r4.getCameraRegistration(r5)     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            if (r5 == 0) goto L1b
            androidx.camera.core.impl.CameraInternal$State r5 = r5.getState()     // Catch: java.lang.Throwable -> L5b
            goto L1c
        L1b:
            r5 = r1
        L1c:
            if (r6 == 0) goto L23
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r6 = r4.getCameraRegistration(r6)     // Catch: java.lang.Throwable -> L5b
            goto L24
        L23:
            r6 = r1
        L24:
            if (r6 == 0) goto L2a
            androidx.camera.core.impl.CameraInternal$State r1 = r6.getState()     // Catch: java.lang.Throwable -> L5b
        L2a:
            androidx.camera.core.impl.CameraInternal$State r6 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch: java.lang.Throwable -> L5b
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            if (r6 != 0) goto L3e
            androidx.camera.core.impl.CameraInternal$State r6 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L3c
            goto L3e
        L3c:
            r5 = r2
            goto L3f
        L3e:
            r5 = r3
        L3f:
            androidx.camera.core.impl.CameraInternal$State r6 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch: java.lang.Throwable -> L5b
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L52
            androidx.camera.core.impl.CameraInternal$State r6 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> L5b
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L50
            goto L52
        L50:
            r6 = r2
            goto L53
        L52:
            r6 = r3
        L53:
            if (r5 == 0) goto L58
            if (r6 == 0) goto L58
            goto L59
        L58:
            r3 = r2
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return r3
        L5b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCaptureSession(java.lang.String, java.lang.String):boolean");
    }

    public void markCameraState(Camera camera, CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void markCameraState(androidx.camera.core.Camera r7, androidx.camera.core.impl.CameraInternal.State r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto Le
            androidx.camera.core.impl.CameraInternal$State r2 = r6.unregisterCamera(r7)     // Catch: java.lang.Throwable -> Lbc
            goto L12
        Le:
            androidx.camera.core.impl.CameraInternal$State r2 = r6.updateAndVerifyState(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L12:
            if (r2 != r8) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        L16:
            androidx.camera.core.concurrent.CameraCoordinator r2 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lbc
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3b
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto L3b
            androidx.camera.core.CameraInfo r2 = r7.getCameraInfo()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.getCameraId()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.concurrent.CameraCoordinator r3 = r6.mCameraCoordinator     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r3.getPairedConcurrentCameraId(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L3b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r2 = r6.getCameraRegistration(r2)     // Catch: java.lang.Throwable -> Lbc
            goto L3c
        L3b:
            r2 = r4
        L3c:
            r3 = 1
            if (r1 >= r3) goto L7c
            int r1 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= 0) goto L7c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Lbc
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lbc
        L52:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L94
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r3 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r3     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r3 = r3.getState()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r3 != r5) goto L52
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.Camera r3 = (androidx.camera.core.Camera) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> Lbc
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Lbc
            goto L52
        L7c:
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L94
            int r8 = r6.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            if (r8 <= 0) goto L94
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r8 = r6.mCameraStates     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8     // Catch: java.lang.Throwable -> Lbc
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L94:
            if (r4 == 0) goto L9b
            if (r9 != 0) goto L9b
            r4.remove(r7)     // Catch: java.lang.Throwable -> Lbc
        L9b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb6
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r8 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r8
            r8.notifyOnOpenAvailableListener()
            goto La6
        Lb6:
            if (r2 == 0) goto Lbb
            r2.notifyOnConfigureAvailableListener()
        Lbb:
            return
        Lbc:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.markCameraState(androidx.camera.core.Camera, androidx.camera.core.impl.CameraInternal$State, boolean):void");
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int i, int i2) {
        synchronized (this.mLock) {
            boolean z = true;
            this.mMaxAllowedOpenedCameras = i2 == 2 ? 2 : 1;
            boolean z2 = i != 2 && i2 == 2;
            if (i != 2 || i2 == 2) {
                z = false;
            }
            if (z2 || z) {
                recalculateAvailableCameras();
            }
        }
    }

    private CameraInternal.State unregisterCamera(Camera camera) {
        CameraRegistration remove = this.mCameraStates.remove(camera);
        if (remove == null) {
            return null;
        }
        recalculateAvailableCameras();
        return remove.getState();
    }

    private CameraInternal.State updateAndVerifyState(Camera camera, CameraInternal.State state) {
        CameraInternal.State state2 = ((CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).setState(state);
        if (state == CameraInternal.State.OPENING) {
            Preconditions.checkState(isOpen(state) || state2 == CameraInternal.State.OPENING, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (state2 != state) {
            traceState(camera, state);
            recalculateAvailableCameras();
        }
        return state2;
    }

    private static boolean isOpen(CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    private void recalculateAvailableCameras() {
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i++;
            }
        }
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            this.mDebugString.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.mMaxAllowedOpenedCameras)));
            Logger.d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = Math.max(this.mMaxAllowedOpenedCameras - i, 0);
    }

    public boolean isCameraClosing() {
        synchronized (this.mLock) {
            Iterator<Map.Entry<Camera, CameraRegistration>> it = this.mCameraStates.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().getState() == CameraInternal.State.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    private CameraRegistration getCameraRegistration(String str) {
        for (Camera camera : this.mCameraStates.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return this.mCameraStates.get(camera);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CameraRegistration {
        private final Executor mNotifyExecutor;
        private final OnConfigureAvailableListener mOnConfigureAvailableListener;
        private final OnOpenAvailableListener mOnOpenAvailableListener;
        private CameraInternal.State mState;

        CameraRegistration(CameraInternal.State state, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
            this.mState = state;
            this.mNotifyExecutor = executor;
            this.mOnConfigureAvailableListener = onConfigureAvailableListener;
            this.mOnOpenAvailableListener = onOpenAvailableListener;
        }

        CameraInternal.State setState(CameraInternal.State state) {
            CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }

        CameraInternal.State getState() {
            return this.mState;
        }

        void notifyOnConfigureAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnConfigureAvailableListener onConfigureAvailableListener = this.mOnConfigureAvailableListener;
                Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraStateRegistry.OnConfigureAvailableListener.this.onConfigureAvailable();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to configure.", e);
            }
        }

        void notifyOnOpenAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnOpenAvailableListener onOpenAvailableListener = this.mOnOpenAvailableListener;
                Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraStateRegistry.OnOpenAvailableListener.this.onOpenAvailable();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to open.", e);
            }
        }
    }

    private static void traceState(Camera camera, CameraInternal.State state) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:State[" + camera + "]", state.ordinal());
        }
    }
}
