package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class i4 extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    public i4(Iterable<ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (!getNextByteBuffer()) {
            this.currentByteBuffer = f4.EMPTY_BYTE_BUFFER;
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
            this.currentAddress = d9.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int i10) {
        int i11 = this.currentByteBufferPos + i10;
        this.currentByteBufferPos = i11;
        if (i11 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i10 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & UByte.MAX_VALUE;
            updateCurrentByteBufferPos(1);
            return i10;
        }
        int i11 = d9.getByte(this.currentByteBufferPos + this.currentAddress) & UByte.MAX_VALUE;
        updateCurrentByteBufferPos(1);
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int limit = this.currentByteBuffer.limit();
        int i12 = this.currentByteBufferPos;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i12 + this.currentArrayOffset, bArr, i10, i11);
            updateCurrentByteBufferPos(i11);
        } else {
            int position = this.currentByteBuffer.position();
            this.currentByteBuffer.get(bArr, i10, i11);
            updateCurrentByteBufferPos(i11);
        }
        return i11;
    }
}
