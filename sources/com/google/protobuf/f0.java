package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f0 extends OutputStream {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private byte[] buffer;
    private int bufferPos;
    private final ArrayList<h0> flushedBuffers;
    private int flushedBuffersTotalBytes;
    private final int initialCapacity;

    public f0(int i10) {
        if (i10 >= 0) {
            this.initialCapacity = i10;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i10];
            return;
        }
        throw new IllegalArgumentException("Buffer size < 0");
    }

    private byte[] copyArray(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
        return bArr2;
    }

    private void flushFullBuffer(int i10) {
        this.flushedBuffers.add(new e0(this.buffer));
        int length = this.flushedBuffersTotalBytes + this.buffer.length;
        this.flushedBuffersTotalBytes = length;
        this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i10, length >>> 1))];
        this.bufferPos = 0;
    }

    private void flushLastBuffer() {
        int i10 = this.bufferPos;
        byte[] bArr = this.buffer;
        if (i10 < bArr.length) {
            if (i10 > 0) {
                this.flushedBuffers.add(new e0(copyArray(bArr, i10)));
            }
        } else {
            this.flushedBuffers.add(new e0(this.buffer));
            this.buffer = EMPTY_BYTE_ARRAY;
        }
        this.flushedBuffersTotalBytes += this.bufferPos;
        this.bufferPos = 0;
    }

    public synchronized void reset() {
        this.flushedBuffers.clear();
        this.flushedBuffersTotalBytes = 0;
        this.bufferPos = 0;
    }

    public synchronized int size() {
        return this.flushedBuffersTotalBytes + this.bufferPos;
    }

    public synchronized h0 toByteString() {
        flushLastBuffer();
        return h0.copyFrom(this.flushedBuffers);
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) {
        if (this.bufferPos == this.buffer.length) {
            flushFullBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i11 = this.bufferPos;
        this.bufferPos = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        h0[] h0VarArr;
        byte[] bArr;
        int i10;
        synchronized (this) {
            ArrayList<h0> arrayList = this.flushedBuffers;
            h0VarArr = (h0[]) arrayList.toArray(new h0[arrayList.size()]);
            bArr = this.buffer;
            i10 = this.bufferPos;
        }
        for (h0 h0Var : h0VarArr) {
            h0Var.writeTo(outputStream);
        }
        outputStream.write(copyArray(bArr, i10));
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.buffer;
        int length = bArr2.length;
        int i12 = this.bufferPos;
        if (i11 <= length - i12) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.bufferPos += i11;
        } else {
            int length2 = bArr2.length - i12;
            System.arraycopy(bArr, i10, bArr2, i12, length2);
            int i13 = i11 - length2;
            flushFullBuffer(i13);
            System.arraycopy(bArr, i10 + length2, this.buffer, 0, i13);
            this.bufferPos = i13;
        }
    }
}
