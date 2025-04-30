package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.annotations.UsedByNative;

@UsedByNative("session_jni_wrapper.cc")
/* loaded from: classes2.dex */
public class GeospatialPose {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    public GeospatialPose(long j7, Session session) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native void nativeDestroy(long j7, long j9);

    private native float[] nativeEastUpSouthQuaternion(long j7, long j9);

    private native double nativeGetAltitude(long j7, long j9);

    private native double nativeGetHeading(long j7, long j9);

    private native double nativeGetHeadingAccuracy(long j7, long j9);

    private native double nativeGetHorizontalAccuracy(long j7, long j9);

    private native double nativeGetLatitude(long j7, long j9);

    private native double nativeGetLongitude(long j7, long j9);

    private native double nativeGetOrientationYawAccuracy(long j7, long j9);

    private native double nativeGetVerticalAccuracy(long j7, long j9);

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    public double getAltitude() {
        return nativeGetAltitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public float[] getEastUpSouthQuaternion() {
        return nativeEastUpSouthQuaternion(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public double getHeading() {
        return nativeGetHeading(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public double getHeadingAccuracy() {
        return nativeGetHeadingAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHorizontalAccuracy() {
        return nativeGetHorizontalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLatitude() {
        return nativeGetLatitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLongitude() {
        return nativeGetLongitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getOrientationYawAccuracy() {
        return nativeGetOrientationYawAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getVerticalAccuracy() {
        return nativeGetVerticalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
