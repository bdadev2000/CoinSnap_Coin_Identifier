package com.google.ar.core;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class TrackData {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    public TrackData(long j7, Session session) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private native ByteBuffer nativeGetData(long j7, long j9);

    private native long nativeGetFrameTimestamp(long j7, long j9);

    private static native void nativeReleaseTrackData(long j7, long j9);

    private void release() {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleaseTrackData(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
    }

    public void close() {
        release();
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public ByteBuffer getData() {
        return nativeGetData(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public long getFrameTimestamp() {
        return nativeGetFrameTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
