package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class u {
    public abstract void write(byte b3) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;
}
