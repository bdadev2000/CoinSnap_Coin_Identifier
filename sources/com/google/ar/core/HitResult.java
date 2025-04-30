package com.google.ar.core;

/* loaded from: classes2.dex */
public class HitResult {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public HitResult() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private native long nativeCreateAnchor(long j7, long j9);

    private static native void nativeDestroyHitResult(long j7, long j9);

    private native float nativeGetDistance(long j7, long j9);

    private native Pose nativeGetPose(long j7, long j9);

    public Anchor createAnchor() {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HitResult) || ((HitResult) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyHitResult(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    public float getDistance() {
        return nativeGetDistance(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getHitPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Trackable getTrackable() {
        return this.session.createTrackable(nativeAcquireTrackable(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public native long nativeAcquireTrackable(long j7, long j9);

    public HitResult(long j7, Session session) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
