package com.google.ar.core;

import android.media.Image;
import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public class LightEstimate {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* loaded from: classes2.dex */
    public enum State {
        NOT_VALID(0),
        VALID(1);

        final int nativeCode;

        State(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static State forNumber(int i9) {
            for (State state : values()) {
                if (state.nativeCode == i9) {
                    return state;
                }
            }
            throw new FatalException(A.a("Unexpected value for native LightEstimate.State, value=", (byte) 55, i9));
        }
    }

    public LightEstimate() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j7, long j9);

    private static native long nativeCreateLightEstimate(long j7);

    private static native void nativeDestroyLightEstimate(long j7, long j9);

    private native void nativeGetColorCorrection(long j7, long j9, float[] fArr, int i9);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j7, long j9, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j7, long j9, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j7, long j9, float[] fArr);

    private native float nativeGetPixelIntensity(long j7, long j9);

    private native int nativeGetState(long j7, long j9);

    private native long nativeGetTimestamp(long j7, long j9);

    public Image[] acquireEnvironmentalHdrCubeMap() {
        long[] nativeAcquireEnvironmentalHdrCubeMap = nativeAcquireEnvironmentalHdrCubeMap(this.session.nativeWrapperHandle, this.nativeHandle);
        ArImage[] arImageArr = new ArImage[nativeAcquireEnvironmentalHdrCubeMap.length];
        for (int i9 = 0; i9 < nativeAcquireEnvironmentalHdrCubeMap.length; i9++) {
            arImageArr[i9] = new ArImage(this.session, nativeAcquireEnvironmentalHdrCubeMap[i9]);
        }
        return arImageArr;
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyLightEstimate(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    public void getColorCorrection(float[] fArr, int i9) {
        nativeGetColorCorrection(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i9);
    }

    public float[] getEnvironmentalHdrAmbientSphericalHarmonics() {
        float[] fArr = new float[27];
        nativeGetEnvironmentalHdrAmbientSphericalHarmonics(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightDirection() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightDirection(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightIntensity() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightIntensity(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float getPixelIntensity() {
        return nativeGetPixelIntensity(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public State getState() {
        return State.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public LightEstimate(Session session) {
        this.nativeHandle = 0L;
        this.session = session;
        this.nativeHandle = nativeCreateLightEstimate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
