package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
@UsedByNative("trackable_base_jni.cc")
/* loaded from: classes2.dex */
public class TrackableBase implements Trackable {
    long nativeHandle;
    protected final long nativeSymbolTableHandle;
    protected final Session session;

    public TrackableBase(long j7, Session session) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session == null ? 0L : session.nativeSymbolTableHandle;
    }

    public static int internalGetType(long j7, long j9) {
        return nativeGetType(j7, j9);
    }

    public static void internalReleaseNativeHandle(long j7, long j9) {
        nativeReleaseTrackable(j7, j9);
    }

    private native long nativeCreateAnchor(long j7, long j9, Pose pose);

    private native long[] nativeGetAnchors(long j7, long j9);

    private native int nativeGetTrackingState(long j7, long j9);

    private static native int nativeGetType(long j7, long j9);

    private static native void nativeReleaseTrackable(long j7, long j9);

    @Override // com.google.ar.core.Trackable
    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TrackableBase) || ((TrackableBase) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleaseTrackable(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.Trackable
    public Collection getAnchors() {
        return this.session.convertNativeAnchorsToCollection(nativeGetAnchors(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.Trackable
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
