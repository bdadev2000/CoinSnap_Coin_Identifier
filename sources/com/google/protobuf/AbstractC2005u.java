package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2005u {
    public abstract void write(byte b) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i9, int i10) throws IOException;
}
