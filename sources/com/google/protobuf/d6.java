package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class d6 extends InputStream {
    private final ByteBuffer buf;
    final /* synthetic */ e6 this$0;

    public d6(e6 e6Var) {
        ByteBuffer byteBuffer;
        this.this$0 = e6Var;
        byteBuffer = e6Var.buffer;
        this.buf = byteBuffer.slice();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.buf.remaining();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.buf.hasRemaining()) {
            return this.buf.get() & UByte.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
        } catch (InvalidMarkException e2) {
            throw new IOException(e2);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.buf.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i11, this.buf.remaining());
        this.buf.get(bArr, i10, min);
        return min;
    }
}
