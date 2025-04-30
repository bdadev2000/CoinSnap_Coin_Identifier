package com.google.ar.core;

/* loaded from: classes2.dex */
public class CameraIntrinsics {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public CameraIntrinsics() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    private native void nativeDestroyCameraIntrinsics(long j7, long j9);

    private native void nativeGetFocalLength(long j7, long j9, float[] fArr, int i9);

    private native void nativeGetImageDimensions(long j7, long j9, int[] iArr, int i9);

    private native void nativeGetPrincipalPoint(long j7, long j9, float[] fArr, int i9);

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyCameraIntrinsics(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    public float[] getFocalLength() {
        float[] fArr = new float[2];
        getFocalLength(fArr, 0);
        return fArr;
    }

    public int[] getImageDimensions() {
        int[] iArr = new int[2];
        getImageDimensions(iArr, 0);
        return iArr;
    }

    public float[] getPrincipalPoint() {
        float[] fArr = new float[2];
        getPrincipalPoint(fArr, 0);
        return fArr;
    }

    public CameraIntrinsics(long j7, Session session) {
        this.nativeHandle = j7;
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public void getFocalLength(float[] fArr, int i9) {
        nativeGetFocalLength(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i9);
    }

    public void getImageDimensions(int[] iArr, int i9) {
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr, i9);
    }

    public void getPrincipalPoint(float[] fArr, int i9) {
        nativeGetPrincipalPoint(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i9);
    }
}
