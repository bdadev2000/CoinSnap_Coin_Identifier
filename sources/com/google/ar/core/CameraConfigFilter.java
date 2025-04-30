package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.CameraConfig;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class CameraConfigFilter {
    private static final String TAG = "CameraConfigFilter";
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public CameraConfigFilter() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeCreateCameraConfigFilter(long j7);

    private static native void nativeDestroyCameraConfigFilter(long j7, long j9);

    private native int nativeGetDepthSensorUsage(long j7, long j9);

    private native int nativeGetFacingDirection(long j7, long j9);

    private native int nativeGetStereoCameraUsage(long j7, long j9);

    private native int nativeGetTargetFps(long j7, long j9);

    private native void nativeSetDepthSensorUsage(long j7, long j9, int i9);

    private native void nativeSetFacingDirection(long j7, long j9, int i9);

    private native void nativeSetStereoCameraUsage(long j7, long j9, int i9);

    private native void nativeSetTargetFps(long j7, long j9, int i9);

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyCameraConfigFilter(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @NonNull
    public EnumSet<CameraConfig.DepthSensorUsage> getDepthSensorUsage() {
        return CameraConfig.DepthSensorUsage.forBitFlags(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public CameraConfig.FacingDirection getFacingDirection() {
        return CameraConfig.FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public EnumSet<CameraConfig.StereoCameraUsage> getStereoCameraUsage() {
        return CameraConfig.StereoCameraUsage.forBitFlags(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public EnumSet<CameraConfig.TargetFps> getTargetFps() {
        return CameraConfig.TargetFps.forBitFlags(nativeGetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public CameraConfigFilter setDepthSensorUsage(EnumSet<CameraConfig.DepthSensorUsage> enumSet) {
        Iterator<E> it = enumSet.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((CameraConfig.DepthSensorUsage) it.next()).nativeCode;
        }
        nativeSetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle, i9);
        return this;
    }

    @NonNull
    public CameraConfigFilter setFacingDirection(CameraConfig.FacingDirection facingDirection) {
        nativeSetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle, facingDirection.nativeCode);
        return this;
    }

    @NonNull
    public CameraConfigFilter setStereoCameraUsage(EnumSet<CameraConfig.StereoCameraUsage> enumSet) {
        Iterator<E> it = enumSet.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((CameraConfig.StereoCameraUsage) it.next()).nativeCode;
        }
        nativeSetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle, i9);
        return this;
    }

    @NonNull
    public CameraConfigFilter setTargetFps(EnumSet<CameraConfig.TargetFps> enumSet) {
        Iterator<E> it = enumSet.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((CameraConfig.TargetFps) it.next()).nativeCode;
        }
        nativeSetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle, i9);
        return this;
    }

    public CameraConfigFilter(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreateCameraConfigFilter(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
