package com.google.ar.core;

import com.google.ar.core.exceptions.DeadlineExceededException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* loaded from: classes2.dex */
public class PointCloud implements Closeable {
    private long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public PointCloud() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    private native ByteBuffer nativeGetData(long j7, long j9);

    private native ByteBuffer nativeGetIds(long j7, long j9);

    private native long nativeGetTimestamp(long j7, long j9);

    private native void nativeReleasePointCloud(long j7, long j9);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleasePointCloud(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    public IntBuffer getIds() {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            return Session.directByteBufferOrDefault(nativeGetIds(this.session.nativeWrapperHandle, j7)).asIntBuffer();
        }
        throw new DeadlineExceededException();
    }

    public FloatBuffer getPoints() {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            return Session.directByteBufferOrDefault(nativeGetData(this.session.nativeWrapperHandle, j7)).asFloatBuffer();
        }
        throw new DeadlineExceededException();
    }

    public long getTimestamp() {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            return nativeGetTimestamp(this.session.nativeWrapperHandle, j7);
        }
        throw new DeadlineExceededException();
    }

    public void release() {
        nativeReleasePointCloud(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0L;
    }

    public PointCloud(Session session, long j7) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
