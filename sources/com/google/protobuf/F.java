package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class F extends OutputStream {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private byte[] buffer;
    private int bufferPos;
    private final ArrayList<H> flushedBuffers;
    private int flushedBuffersTotalBytes;
    private final int initialCapacity;

    public F(int i9) {
        if (i9 >= 0) {
            this.initialCapacity = i9;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i9];
            return;
        }
        throw new IllegalArgumentException("Buffer size < 0");
    }

    private byte[] copyArray(byte[] bArr, int i9) {
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i9));
        return bArr2;
    }

    private void flushFullBuffer(int i9) {
        this.flushedBuffers.add(new E(this.buffer));
        int length = this.flushedBuffersTotalBytes + this.buffer.length;
        this.flushedBuffersTotalBytes = length;
        this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i9, length >>> 1))];
        this.bufferPos = 0;
    }

    private void flushLastBuffer() {
        int i9 = this.bufferPos;
        byte[] bArr = this.buffer;
        if (i9 < bArr.length) {
            if (i9 > 0) {
                this.flushedBuffers.add(new E(copyArray(bArr, i9)));
            }
        } else {
            this.flushedBuffers.add(new E(this.buffer));
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

    public synchronized H toByteString() {
        flushLastBuffer();
        return H.copyFrom(this.flushedBuffers);
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i9) {
        try {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i10 = this.bufferPos;
            this.bufferPos = i10 + 1;
            bArr[i10] = (byte) i9;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        H[] hArr;
        byte[] bArr;
        int i9;
        synchronized (this) {
            ArrayList<H> arrayList = this.flushedBuffers;
            hArr = (H[]) arrayList.toArray(new H[arrayList.size()]);
            bArr = this.buffer;
            i9 = this.bufferPos;
        }
        for (H h6 : hArr) {
            h6.writeTo(outputStream);
        }
        outputStream.write(copyArray(bArr, i9));
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i9, int i10) {
        try {
            byte[] bArr2 = this.buffer;
            int length = bArr2.length;
            int i11 = this.bufferPos;
            if (i10 <= length - i11) {
                System.arraycopy(bArr, i9, bArr2, i11, i10);
                this.bufferPos += i10;
            } else {
                int length2 = bArr2.length - i11;
                System.arraycopy(bArr, i9, bArr2, i11, length2);
                int i12 = i10 - length2;
                flushFullBuffer(i12);
                System.arraycopy(bArr, i9 + length2, this.buffer, 0, i12);
                this.bufferPos = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
