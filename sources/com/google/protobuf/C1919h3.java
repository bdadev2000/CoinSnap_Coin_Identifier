package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.protobuf.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1919h3 extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    public C1919h3(Iterable<ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (!getNextByteBuffer()) {
            this.currentByteBuffer = C1898e3.EMPTY_BYTE_BUFFER;
            this.currentIndex = 0;
            this.currentByteBufferPos = 0;
            this.currentAddress = 0L;
        }
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (!this.iterator.hasNext()) {
            return false;
        }
        ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.currentByteBufferPos = next.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = C5.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int i9) {
        int i10 = this.currentByteBufferPos + i9;
        this.currentByteBufferPos = i10;
        if (i10 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i9 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & 255;
            updateCurrentByteBufferPos(1);
            return i9;
        }
        int i10 = C5.getByte(this.currentByteBufferPos + this.currentAddress) & 255;
        updateCurrentByteBufferPos(1);
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int limit = this.currentByteBuffer.limit();
        int i11 = this.currentByteBufferPos;
        int i12 = limit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i11 + this.currentArrayOffset, bArr, i9, i10);
            updateCurrentByteBufferPos(i10);
        } else {
            int position = this.currentByteBuffer.position();
            this.currentByteBuffer.get(bArr, i9, i10);
            updateCurrentByteBufferPos(i10);
        }
        return i10;
    }
}
