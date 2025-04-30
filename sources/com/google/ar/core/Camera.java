package com.google.ar.core;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class Camera {
    private static final String TAG = "ARCore-Camera";
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public Camera() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeAcquireCamera(long j7, long j9);

    private native long nativeCreateCameraIntrinsics(long j7);

    private native Pose nativeDisplayOrientedPose(long j7, long j9);

    private native void nativeGetImageIntrinsics(long j7, long j9, long j10);

    private native Pose nativeGetPose(long j7, long j9);

    private native void nativeGetProjectionMatrix(long j7, long j9, float[] fArr, int i9, float f9, float f10);

    private native void nativeGetTextureIntrinsics(long j7, long j9, long j10);

    private native int nativeGetTrackingFailureReason(long j7, long j9);

    private native int nativeGetTrackingState(long j7, long j9);

    private native void nativeGetViewMatrix(long j7, long j9, float[] fArr, int i9);

    private static native void nativeReleaseCamera(long j7, long j9);

    public boolean equals(Object obj) {
        if (!(obj instanceof Camera) || ((Camera) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleaseCamera(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    public Pose getDisplayOrientedPose() {
        return nativeDisplayOrientedPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public CameraIntrinsics getImageIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetImageIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void getProjectionMatrix(float[] fArr, int i9, float f9, float f10) {
        nativeGetProjectionMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i9, f9, f10);
    }

    public CameraIntrinsics getTextureIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetTextureIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    @NonNull
    public TrackingFailureReason getTrackingFailureReason() {
        return TrackingFailureReason.forNumber(nativeGetTrackingFailureReason(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public void getViewMatrix(float[] fArr, int i9) {
        nativeGetViewMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i9);
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public Camera(Session session, Frame frame) {
        this.session = session;
        this.nativeHandle = nativeAcquireCamera(session.nativeWrapperHandle, frame.nativeHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
