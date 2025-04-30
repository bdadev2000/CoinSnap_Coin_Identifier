package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class M extends S {
    private final byte[] buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private int limit;
    private int pos;
    private int startPos;

    private void recomputeBufferSizeAfterLimit() {
        int i9 = this.limit + this.bufferSizeAfterLimit;
        this.limit = i9;
        int i10 = i9 - this.startPos;
        int i11 = this.currentLimit;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.bufferSizeAfterLimit = i12;
            this.limit = i9 - i12;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private void skipRawVarint() throws IOException {
        if (this.limit - this.pos >= 10) {
            skipRawVarintFastPath();
        } else {
            skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() throws IOException {
        for (int i9 = 0; i9 < 10; i9++) {
            byte[] bArr = this.buffer;
            int i10 = this.pos;
            this.pos = i10 + 1;
            if (bArr[i10] >= 0) {
                return;
            }
        }
        throw C1912g3.malformedVarint();
    }

    private void skipRawVarintSlowPath() throws IOException {
        for (int i9 = 0; i9 < 10; i9++) {
            if (readRawByte() >= 0) {
                return;
            }
        }
        throw C1912g3.malformedVarint();
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
        return this.pos - this.startPos;
    }

    @Override // com.google.protobuf.S
    public boolean isAtEnd() throws IOException {
        if (this.pos == this.limit) {
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
            if (totalBytesRead >= 0) {
                int i10 = this.currentLimit;
                if (totalBytesRead <= i10) {
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i10;
                }
                throw C1912g3.truncatedMessage();
            }
            throw C1912g3.parseFailure();
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
        ByteBuffer wrap;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i9 = this.limit;
            int i10 = this.pos;
            if (readRawVarint32 <= i9 - i10) {
                if (!this.immutable && this.enableAliasing) {
                    wrap = ByteBuffer.wrap(this.buffer, i10, readRawVarint32).slice();
                } else {
                    wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i10, i10 + readRawVarint32));
                }
                this.pos += readRawVarint32;
                return wrap;
            }
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
        H copyFrom;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i9 = this.limit;
            int i10 = this.pos;
            if (readRawVarint32 <= i9 - i10) {
                if (this.immutable && this.enableAliasing) {
                    copyFrom = H.wrap(this.buffer, i10, readRawVarint32);
                } else {
                    copyFrom = H.copyFrom(this.buffer, i10, readRawVarint32);
                }
                this.pos += readRawVarint32;
                return copyFrom;
            }
        }
        if (readRawVarint32 == 0) {
            return H.EMPTY;
        }
        return H.wrap(readRawBytes(readRawVarint32));
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
        int i9 = this.pos;
        if (i9 != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i9 + 1;
            return bArr[i9];
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public byte[] readRawBytes(int i9) throws IOException {
        if (i9 > 0) {
            int i10 = this.limit;
            int i11 = this.pos;
            if (i9 <= i10 - i11) {
                int i12 = i9 + i11;
                this.pos = i12;
                return Arrays.copyOfRange(this.buffer, i11, i12);
            }
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
        int i9 = this.pos;
        if (this.limit - i9 >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i9 + 4;
            return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public long readRawLittleEndian64() throws IOException {
        int i9 = this.pos;
        if (this.limit - i9 >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i9 + 8;
            return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public int readRawVarint32() throws IOException {
        int i9;
        int i10 = this.pos;
        int i11 = this.limit;
        if (i11 != i10) {
            byte[] bArr = this.buffer;
            int i12 = i10 + 1;
            byte b = bArr[i10];
            if (b >= 0) {
                this.pos = i12;
                return b;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b;
                if (i14 < 0) {
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b8 = bArr[i17];
                            int i19 = (i18 ^ (b8 << Ascii.FS)) ^ 266354560;
                            if (b8 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.pos = i13;
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
        int i9 = this.pos;
        int i10 = this.limit;
        if (i10 != i9) {
            byte[] bArr = this.buffer;
            int i11 = i9 + 1;
            byte b = bArr[i9];
            if (b >= 0) {
                this.pos = i11;
                return b;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b;
                if (i13 < 0) {
                    j7 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                    if (i15 >= 0) {
                        j7 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j7 = j11;
                        } else {
                            long j12 = i17;
                            i12 = i9 + 5;
                            long j13 = j12 ^ (bArr[i16] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                int i18 = i9 + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i12 = i9 + 7;
                                    j13 = j14 ^ (bArr[i18] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i18 = i9 + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i12 = i9 + 9;
                                            long j15 = (j14 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i19;
                                                }
                                            }
                                            j7 = j15;
                                        }
                                    }
                                }
                                j7 = j14 ^ j9;
                                i12 = i18;
                            }
                            j7 = j13 ^ j10;
                        }
                    }
                }
                this.pos = i12;
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
            int i9 = this.limit;
            int i10 = this.pos;
            if (readRawVarint32 <= i9 - i10) {
                String str = new String(this.buffer, i10, readRawVarint32, C1898e3.UTF_8);
                this.pos += readRawVarint32;
                return str;
            }
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
            int i9 = this.limit;
            int i10 = this.pos;
            if (readRawVarint32 <= i9 - i10) {
                String decodeUtf8 = I5.decodeUtf8(this.buffer, i10, readRawVarint32);
                this.pos += readRawVarint32;
                return decodeUtf8;
            }
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
        this.startPos = this.pos;
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
        if (i9 >= 0) {
            int i10 = this.limit;
            int i11 = this.pos;
            if (i9 <= i10 - i11) {
                this.pos = i11 + i9;
                return;
            }
        }
        if (i9 < 0) {
            throw C1912g3.negativeSize();
        }
        throw C1912g3.truncatedMessage();
    }

    private M(byte[] bArr, int i9, int i10, boolean z8) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i10 + i9;
        this.pos = i9;
        this.startPos = i9;
        this.immutable = z8;
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
