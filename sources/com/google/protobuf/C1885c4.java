package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* renamed from: com.google.protobuf.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1885c4 extends InputStream {
    private final ByteBuffer buf;
    final /* synthetic */ C1892d4 this$0;

    public C1885c4(C1892d4 c1892d4) {
        ByteBuffer byteBuffer;
        this.this$0 = c1892d4;
        byteBuffer = c1892d4.buffer;
        this.buf = byteBuffer.slice();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.buf.remaining();
    }

    @Override // java.io.InputStream
    public void mark(int i9) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.buf.hasRemaining()) {
            return this.buf.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
        } catch (InvalidMarkException e4) {
            throw new IOException(e4);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        if (!this.buf.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i10, this.buf.remaining());
        this.buf.get(bArr, i9, min);
        return min;
    }
}
