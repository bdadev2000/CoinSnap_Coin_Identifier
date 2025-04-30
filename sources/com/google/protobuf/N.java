package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class N extends S {
    private int bufferSizeAfterCurrentLimit;
    private long currentAddress;
    private ByteBuffer currentByteBuffer;
    private long currentByteBufferLimit;
    private long currentByteBufferPos;
    private long currentByteBufferStartPos;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private final Iterable<ByteBuffer> input;
    private final Iterator<ByteBuffer> iterator;
    private int lastTag;
    private int startOffset;
    private int totalBufferSize;
    private int totalBytesRead;

    private long currentRemaining() {
        return this.currentByteBufferLimit - this.currentByteBufferPos;
    }

    private void getNextByteBuffer() throws C1912g3 {
        if (this.iterator.hasNext()) {
            tryGetNextByteBuffer();
            return;
        }
        throw C1912g3.truncatedMessage();
    }

    private void readRawBytesTo(byte[] bArr, int i9, int i10) throws IOException {
        if (i10 >= 0 && i10 <= remaining()) {
            int i11 = i10;
            while (i11 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int min = Math.min(i11, (int) currentRemaining());
                long j7 = min;
                C5.copyMemory(this.currentByteBufferPos, bArr, (i10 - i11) + i9, j7);
                i11 -= min;
                this.currentByteBufferPos += j7;
            }
            return;
        }
        if (i10 <= 0) {
            if (i10 == 0) {
                return;
            } else {
                throw C1912g3.negativeSize();
            }
        }
        throw C1912g3.truncatedMessage();
    }

    private void recomputeBufferSizeAfterLimit() {
        int i9 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
        this.totalBufferSize = i9;
        int i10 = i9 - this.startOffset;
        int i11 = this.currentLimit;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.bufferSizeAfterCurrentLimit = i12;
            this.totalBufferSize = i9 - i12;
            return;
        }
        this.bufferSizeAfterCurrentLimit = 0;
    }

    private int remaining() {
        return (int) (((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
    }

    private void skipRawVarint() throws IOException {
        for (int i9 = 0; i9 < 10; i9++) {
            if (readRawByte() >= 0) {
                return;
            }
        }
        throw C1912g3.malformedVarint();
    }

    private ByteBuffer slice(int i9, int i10) throws IOException {
        int position = this.currentByteBuffer.position();
        int limit = this.currentByteBuffer.limit();
        ByteBuffer byteBuffer = this.currentByteBuffer;
        try {
            try {
                byteBuffer.position(i9);
                byteBuffer.limit(i10);
                return this.currentByteBuffer.slice();
            } catch (IllegalArgumentException unused) {
                throw C1912g3.truncatedMessage();
            }
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
    }

    private void tryGetNextByteBuffer() {
        ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
        long position = next.position();
        this.currentByteBufferPos = position;
        this.currentByteBufferStartPos = position;
        this.currentByteBufferLimit = this.currentByteBuffer.limit();
        long addressOffset = C5.addressOffset(this.currentByteBuffer);
        this.currentAddress = addressOffset;
        this.currentByteBufferPos += addressOffset;
        this.currentByteBufferStartPos += addressOffset;
        this.currentByteBufferLimit += addressOffset;
    }

    @Override // com.google.protobuf.S
    public void checkLastTagWas(int i9) throws C1912g3 {
        if (this.lastTag == i9) {
        } else {
            throw C1912g3.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.S
    public void enableAliasing(boolean z8) {
        this.enableAliasing = z8;
    }

    @Override // com.google.protobuf.S
    public int getBytesUntilLimit() {
        int i9 = this.currentLimit;
        if (i9 == Integer.MAX_VALUE) {
            return -1;
        }
        return i9 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.S
    public int getLastTag() {
        return this.lastTag;
    }

    @Override // com.google.protobuf.S
    public int getTotalBytesRead() {
        return (int) (((this.totalBytesRead - this.startOffset) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
    }

    @Override // com.google.protobuf.S
    public boolean isAtEnd() throws IOException {
        if ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos == this.totalBufferSize) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.S
    public void popLimit(int i9) {
        this.currentLimit = i9;
        recomputeBufferSizeAfterLimit();
    }

    @Override // com.google.protobuf.S
    public int pushLimit(int i9) throws C1912g3 {
        if (i9 >= 0) {
            int totalBytesRead = getTotalBytesRead() + i9;
            int i10 = this.currentLimit;
            if (totalBytesRead <= i10) {
                this.currentLimit = totalBytesRead;
                recomputeBufferSizeAfterLimit();
                return i10;
            }
            throw C1912g3.truncatedMessage();
        }
        throw C1912g3.negativeSize();
    }

    @Override // com.google.protobuf.S
    public boolean readBool() throws IOException {
        if (readRawVarint64() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.S
    public byte[] readByteArray() throws IOException {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.S
    public ByteBuffer readByteBuffer() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            long j7 = readRawVarint32;
            if (j7 <= currentRemaining()) {
                if (!this.immutable && this.enableAliasing) {
                    long j9 = this.currentByteBufferPos + j7;
                    this.currentByteBufferPos = j9;
                    long j10 = this.currentAddress;
                    return slice((int) ((j9 - j10) - j7), (int) (j9 - j10));
                }
                byte[] bArr = new byte[readRawVarint32];
                C5.copyMemory(this.currentByteBufferPos, bArr, 0L, j7);
                this.currentByteBufferPos += j7;
                return ByteBuffer.wrap(bArr);
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            byte[] bArr2 = new byte[readRawVarint32];
            readRawBytesTo(bArr2, 0, readRawVarint32);
            return ByteBuffer.wrap(bArr2);
        }
        if (readRawVarint32 == 0) {
            return C1898e3.EMPTY_BYTE_BUFFER;
        }
        if (readRawVarint32 < 0) {
            throw C1912g3.negativeSize();
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public H readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            long j7 = readRawVarint32;
            long j9 = this.currentByteBufferLimit;
            long j10 = this.currentByteBufferPos;
            if (j7 <= j9 - j10) {
                if (this.immutable && this.enableAliasing) {
                    int i9 = (int) (j10 - this.currentAddress);
                    H wrap = H.wrap(slice(i9, readRawVarint32 + i9));
                    this.currentByteBufferPos += j7;
                    return wrap;
                }
                byte[] bArr = new byte[readRawVarint32];
                C5.copyMemory(j10, bArr, 0L, j7);
                this.currentByteBufferPos += j7;
                return H.wrap(bArr);
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            if (this.immutable && this.enableAliasing) {
                ArrayList arrayList = new ArrayList();
                while (readRawVarint32 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int min = Math.min(readRawVarint32, (int) currentRemaining());
                    int i10 = (int) (this.currentByteBufferPos - this.currentAddress);
                    arrayList.add(H.wrap(slice(i10, i10 + min)));
                    readRawVarint32 -= min;
                    this.currentByteBufferPos += min;
                }
                return H.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[readRawVarint32];
            readRawBytesTo(bArr2, 0, readRawVarint32);
            return H.wrap(bArr2);
        }
        if (readRawVarint32 == 0) {
            return H.EMPTY;
        }
        if (readRawVarint32 < 0) {
            throw C1912g3.negativeSize();
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.S
    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.S
    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.S
    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.S
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.S
    public void readGroup(int i9, M3 m32, W1 w1) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        m32.mergeFrom(this, w1);
        checkLastTagWas(Y5.makeTag(i9, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.S
    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.S
    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.S
    public void readMessage(M3 m32, W1 w1) throws IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        m32.mergeFrom(this, w1);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return;
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public byte readRawByte() throws IOException {
        if (currentRemaining() == 0) {
            getNextByteBuffer();
        }
        long j7 = this.currentByteBufferPos;
        this.currentByteBufferPos = 1 + j7;
        return C5.getByte(j7);
    }

    @Override // com.google.protobuf.S
    public byte[] readRawBytes(int i9) throws IOException {
        if (i9 >= 0) {
            long j7 = i9;
            if (j7 <= currentRemaining()) {
                byte[] bArr = new byte[i9];
                C5.copyMemory(this.currentByteBufferPos, bArr, 0L, j7);
                this.currentByteBufferPos += j7;
                return bArr;
            }
        }
        if (i9 >= 0 && i9 <= remaining()) {
            byte[] bArr2 = new byte[i9];
            readRawBytesTo(bArr2, 0, i9);
            return bArr2;
        }
        if (i9 <= 0) {
            if (i9 == 0) {
                return C1898e3.EMPTY_BYTE_ARRAY;
            }
            throw C1912g3.negativeSize();
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public int readRawLittleEndian32() throws IOException {
        if (currentRemaining() >= 4) {
            long j7 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j7;
            return ((C5.getByte(j7 + 3) & 255) << 24) | (C5.getByte(j7) & 255) | ((C5.getByte(1 + j7) & 255) << 8) | ((C5.getByte(2 + j7) & 255) << 16);
        }
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    @Override // com.google.protobuf.S
    public long readRawLittleEndian64() throws IOException {
        long readRawByte;
        byte readRawByte2;
        if (currentRemaining() >= 8) {
            long j7 = this.currentByteBufferPos;
            this.currentByteBufferPos = 8 + j7;
            readRawByte = (C5.getByte(j7) & 255) | ((C5.getByte(1 + j7) & 255) << 8) | ((C5.getByte(2 + j7) & 255) << 16) | ((C5.getByte(3 + j7) & 255) << 24) | ((C5.getByte(4 + j7) & 255) << 32) | ((C5.getByte(5 + j7) & 255) << 40) | ((C5.getByte(6 + j7) & 255) << 48);
            readRawByte2 = C5.getByte(j7 + 7);
        } else {
            readRawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
            readRawByte2 = readRawByte();
        }
        return ((readRawByte2 & 255) << 56) | readRawByte;
    }

    @Override // com.google.protobuf.S
    public int readRawVarint32() throws IOException {
        int i9;
        long j7 = this.currentByteBufferPos;
        if (this.currentByteBufferLimit != j7) {
            long j9 = j7 + 1;
            byte b = C5.getByte(j7);
            if (b >= 0) {
                this.currentByteBufferPos++;
                return b;
            }
            if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                long j10 = 2 + j7;
                int i10 = (C5.getByte(j9) << 7) ^ b;
                if (i10 < 0) {
                    i9 = i10 ^ (-128);
                } else {
                    long j11 = 3 + j7;
                    int i11 = (C5.getByte(j10) << Ascii.SO) ^ i10;
                    if (i11 >= 0) {
                        i9 = i11 ^ 16256;
                    } else {
                        long j12 = 4 + j7;
                        int i12 = i11 ^ (C5.getByte(j11) << Ascii.NAK);
                        if (i12 < 0) {
                            i9 = (-2080896) ^ i12;
                        } else {
                            j11 = 5 + j7;
                            byte b8 = C5.getByte(j12);
                            int i13 = (i12 ^ (b8 << Ascii.FS)) ^ 266354560;
                            if (b8 < 0) {
                                j12 = 6 + j7;
                                if (C5.getByte(j11) < 0) {
                                    j11 = 7 + j7;
                                    if (C5.getByte(j12) < 0) {
                                        j12 = 8 + j7;
                                        if (C5.getByte(j11) < 0) {
                                            j11 = 9 + j7;
                                            if (C5.getByte(j12) < 0) {
                                                long j13 = j7 + 10;
                                                if (C5.getByte(j11) >= 0) {
                                                    i9 = i13;
                                                    j10 = j13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i13;
                            }
                            i9 = i13;
                        }
                        j10 = j12;
                    }
                    j10 = j11;
                }
                this.currentByteBufferPos = j10;
                return i9;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.S
    public long readRawVarint64() throws IOException {
        long j7;
        long j9;
        long j10;
        long j11 = this.currentByteBufferPos;
        if (this.currentByteBufferLimit != j11) {
            long j12 = j11 + 1;
            byte b = C5.getByte(j11);
            if (b >= 0) {
                this.currentByteBufferPos++;
                return b;
            }
            if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                long j13 = 2 + j11;
                int i9 = (C5.getByte(j12) << 7) ^ b;
                if (i9 < 0) {
                    j7 = i9 ^ (-128);
                } else {
                    long j14 = 3 + j11;
                    int i10 = (C5.getByte(j13) << Ascii.SO) ^ i9;
                    if (i10 >= 0) {
                        j7 = i10 ^ 16256;
                        j13 = j14;
                    } else {
                        long j15 = 4 + j11;
                        int i11 = i10 ^ (C5.getByte(j14) << Ascii.NAK);
                        if (i11 < 0) {
                            j7 = (-2080896) ^ i11;
                            j13 = j15;
                        } else {
                            long j16 = 5 + j11;
                            long j17 = (C5.getByte(j15) << 28) ^ i11;
                            if (j17 >= 0) {
                                j10 = 266354560;
                            } else {
                                long j18 = 6 + j11;
                                long j19 = j17 ^ (C5.getByte(j16) << 35);
                                if (j19 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    j16 = 7 + j11;
                                    j17 = j19 ^ (C5.getByte(j18) << 42);
                                    if (j17 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        j18 = 8 + j11;
                                        j19 = j17 ^ (C5.getByte(j16) << 49);
                                        if (j19 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            j16 = 9 + j11;
                                            long j20 = (j19 ^ (C5.getByte(j18) << 56)) ^ 71499008037633920L;
                                            if (j20 < 0) {
                                                long j21 = j11 + 10;
                                                if (C5.getByte(j16) >= 0) {
                                                    j7 = j20;
                                                    j13 = j21;
                                                }
                                            } else {
                                                j7 = j20;
                                                j13 = j16;
                                            }
                                        }
                                    }
                                }
                                j7 = j9 ^ j19;
                                j13 = j18;
                            }
                            j7 = j10 ^ j17;
                            j13 = j16;
                        }
                    }
                }
                this.currentByteBufferPos = j13;
                return j7;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.S
    public long readRawVarint64SlowPath() throws IOException {
        long j7 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            j7 |= (r3 & Ascii.DEL) << i9;
            if ((readRawByte() & 128) == 0) {
                return j7;
            }
        }
        throw C1912g3.malformedVarint();
    }

    @Override // com.google.protobuf.S
    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.S
    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.S
    public int readSInt32() throws IOException {
        return S.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.S
    public long readSInt64() throws IOException {
        return S.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.S
    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            long j7 = readRawVarint32;
            long j9 = this.currentByteBufferLimit;
            long j10 = this.currentByteBufferPos;
            if (j7 <= j9 - j10) {
                byte[] bArr = new byte[readRawVarint32];
                C5.copyMemory(j10, bArr, 0L, j7);
                String str = new String(bArr, C1898e3.UTF_8);
                this.currentByteBufferPos += j7;
                return str;
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            byte[] bArr2 = new byte[readRawVarint32];
            readRawBytesTo(bArr2, 0, readRawVarint32);
            return new String(bArr2, C1898e3.UTF_8);
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 < 0) {
            throw C1912g3.negativeSize();
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public String readStringRequireUtf8() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            long j7 = readRawVarint32;
            long j9 = this.currentByteBufferLimit;
            long j10 = this.currentByteBufferPos;
            if (j7 <= j9 - j10) {
                String decodeUtf8 = I5.decodeUtf8(this.currentByteBuffer, (int) (j10 - this.currentByteBufferStartPos), readRawVarint32);
                this.currentByteBufferPos += j7;
                return decodeUtf8;
            }
        }
        if (readRawVarint32 >= 0 && readRawVarint32 <= remaining()) {
            byte[] bArr = new byte[readRawVarint32];
            readRawBytesTo(bArr, 0, readRawVarint32);
            return I5.decodeUtf8(bArr, 0, readRawVarint32);
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 <= 0) {
            throw C1912g3.negativeSize();
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (Y5.getTagFieldNumber(readRawVarint32) != 0) {
            return this.lastTag;
        }
        throw C1912g3.invalidTag();
    }

    @Override // com.google.protobuf.S
    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.S
    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.S
    @Deprecated
    public void readUnknownGroup(int i9, M3 m32) throws IOException {
        readGroup(i9, m32, W1.getEmptyRegistry());
    }

    @Override // com.google.protobuf.S
    public void resetSizeCounter() {
        this.startOffset = (int) ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos);
    }

    @Override // com.google.protobuf.S
    public boolean skipField(int i9) throws IOException {
        int tagWireType = Y5.getTagWireType(i9);
        if (tagWireType == 0) {
            skipRawVarint();
            return true;
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(Y5.makeTag(Y5.getTagFieldNumber(i9), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            skipRawBytes(4);
            return true;
        }
        throw C1912g3.invalidWireType();
    }

    @Override // com.google.protobuf.S
    public void skipMessage() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    @Override // com.google.protobuf.S
    public void skipRawBytes(int i9) throws IOException {
        if (i9 >= 0 && i9 <= ((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
            while (i9 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int min = Math.min(i9, (int) currentRemaining());
                i9 -= min;
                this.currentByteBufferPos += min;
            }
            return;
        }
        if (i9 < 0) {
            throw C1912g3.negativeSize();
        }
        throw C1912g3.truncatedMessage();
    }

    private N(Iterable<ByteBuffer> iterable, int i9, boolean z8) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.totalBufferSize = i9;
        this.input = iterable;
        this.iterator = iterable.iterator();
        this.immutable = z8;
        this.totalBytesRead = 0;
        this.startOffset = 0;
        if (i9 == 0) {
            this.currentByteBuffer = C1898e3.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
            return;
        }
        tryGetNextByteBuffer();
    }

    @Override // com.google.protobuf.S
    public void skipMessage(AbstractC1895e0 abstractC1895e0) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, abstractC1895e0));
    }

    @Override // com.google.protobuf.S
    public <T extends N3> T readGroup(int i9, InterfaceC1948l4 interfaceC1948l4, W1 w1) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        T t9 = (T) ((E2) interfaceC1948l4).parsePartialFrom((S) this, w1);
        checkLastTagWas(Y5.makeTag(i9, 4));
        this.recursionDepth--;
        return t9;
    }

    @Override // com.google.protobuf.S
    public boolean skipField(int i9, AbstractC1895e0 abstractC1895e0) throws IOException {
        int tagWireType = Y5.getTagWireType(i9);
        if (tagWireType == 0) {
            long readInt64 = readInt64();
            abstractC1895e0.writeUInt32NoTag(i9);
            abstractC1895e0.writeUInt64NoTag(readInt64);
            return true;
        }
        if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            abstractC1895e0.writeUInt32NoTag(i9);
            abstractC1895e0.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            H readBytes = readBytes();
            abstractC1895e0.writeUInt32NoTag(i9);
            abstractC1895e0.writeBytesNoTag(readBytes);
            return true;
        }
        if (tagWireType == 3) {
            abstractC1895e0.writeUInt32NoTag(i9);
            skipMessage(abstractC1895e0);
            int makeTag = Y5.makeTag(Y5.getTagFieldNumber(i9), 4);
            checkLastTagWas(makeTag);
            abstractC1895e0.writeUInt32NoTag(makeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int readRawLittleEndian32 = readRawLittleEndian32();
            abstractC1895e0.writeUInt32NoTag(i9);
            abstractC1895e0.writeFixed32NoTag(readRawLittleEndian32);
            return true;
        }
        throw C1912g3.invalidWireType();
    }

    @Override // com.google.protobuf.S
    public <T extends N3> T readMessage(InterfaceC1948l4 interfaceC1948l4, W1 w1) throws IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        T t9 = (T) ((E2) interfaceC1948l4).parsePartialFrom((S) this, w1);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return t9;
        }
        throw C1912g3.truncatedMessage();
    }
}
