package com.google.ar.core;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* loaded from: classes2.dex */
public class Mesh {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    public Mesh(long j7, Session session) {
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        this.nativeHandle = j7;
    }

    private native ByteBuffer nativeGetIndexList(long j7, long j9);

    private native int nativeGetIndexListSize(long j7, long j9);

    private native ByteBuffer nativeGetVertexList(long j7, long j9);

    private native int nativeGetVertexListSize(long j7, long j9);

    public IntBuffer getIndexList() {
        return Session.directByteBufferOrDefault(nativeGetIndexList(this.session.nativeWrapperHandle, this.nativeHandle)).asIntBuffer();
    }

    public int getIndexListSize() {
        return nativeGetIndexListSize(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public FloatBuffer getVertexList() {
        return Session.directByteBufferOrDefault(nativeGetVertexList(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
    }

    public int getVertexListSize() {
        return nativeGetVertexListSize(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
