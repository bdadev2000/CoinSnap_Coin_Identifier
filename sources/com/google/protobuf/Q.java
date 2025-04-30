package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Q extends S {
    private final long address;
    private final ByteBuffer buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private long limit;
    private long pos;
    private long startPos;

    private int bufferPos(long j7) {
        return (int) (j7 - this.address);
    }

    public static boolean isSupported() {
        return C5.hasUnsafeByteBufferOperations();
    }

    private void recomputeBufferSizeAfterLimit() {
        long j7 = this.limit + this.bufferSizeAfterLimit;
        this.limit = j7;
        int i9 = (int) (j7 - this.startPos);
        int i10 = this.currentLimit;
        if (i9 > i10) {
            int i11 = i9 - i10;
            this.bufferSizeAfterLimit = i11;
            this.limit = j7 - i11;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private int remaining() {
        return (int) (this.limit - this.pos);
    }

    private void skipRawVarint() throws IOException {
        if (remaining() >= 10) {
            skipRawVarintFastPath();
        } else {
            skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() throws IOException {
        for (int i9 = 0; i9 < 10; i9++) {
            long j7 = this.pos;
            this.pos = 1 + j7;
            if (C5.getByte(j7) >= 0) {
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

    private ByteBuffer slice(long j7, long j9) throws IOException {
        int position = this.buffer.position();
        int limit = this.buffer.limit();
        ByteBuffer byteBuffer = this.buffer;
        try {
            try {
                byteBuffer.position(bufferPos(j7));
                byteBuffer.limit(bufferPos(j9));
                return this.buffer.slice();
            } catch (IllegalArgumentException e4) {
                C1912g3 truncatedMessage = C1912g3.truncatedMessage();
                truncatedMessage.initCause(e4);
                throw truncatedMessage;
            }
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
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
        return (int) (this.pos - this.startPos);
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
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            if (!this.immutable && this.enableAliasing) {
                long j7 = this.pos;
                long j9 = readRawVarint32;
                ByteBuffer slice = slice(j7, j7 + j9);
                this.pos += j9;
                return slice;
            }
            byte[] bArr = new byte[readRawVarint32];
            long j10 = readRawVarint32;
            C5.copyMemory(this.pos, bArr, 0L, j10);
            this.pos += j10;
            return ByteBuffer.wrap(bArr);
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
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            if (this.immutable && this.enableAliasing) {
                long j7 = this.pos;
                long j9 = readRawVarint32;
                ByteBuffer slice = slice(j7, j7 + j9);
                this.pos += j9;
                return H.wrap(slice);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j10 = readRawVarint32;
            C5.copyMemory(this.pos, bArr, 0L, j10);
            this.pos += j10;
            return H.wrap(bArr);
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
        long j7 = this.pos;
        if (j7 != this.limit) {
            this.pos = 1 + j7;
            return C5.getByte(j7);
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public byte[] readRawBytes(int i9) throws IOException {
        if (i9 >= 0 && i9 <= remaining()) {
            byte[] bArr = new byte[i9];
            long j7 = this.pos;
            long j9 = i9;
            slice(j7, j7 + j9).get(bArr);
            this.pos += j9;
            return bArr;
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
        long j7 = this.pos;
        if (this.limit - j7 >= 4) {
            this.pos = 4 + j7;
            return ((C5.getByte(j7 + 3) & 255) << 24) | (C5.getByte(j7) & 255) | ((C5.getByte(1 + j7) & 255) << 8) | ((C5.getByte(2 + j7) & 255) << 16);
        }
        throw C1912g3.truncatedMessage();
    }

    @Override // com.google.protobuf.S
    public long readRawLittleEndian64() throws IOException {
        long j7 = this.pos;
        if (this.limit - j7 >= 8) {
            this.pos = 8 + j7;
            return ((C5.getByte(j7 + 7) & 255) << 56) | (C5.getByte(j7) & 255) | ((C5.getByte(1 + j7) & 255) << 8) | ((C5.getByte(2 + j7) & 255) << 16) | ((C5.getByte(3 + j7) & 255) << 24) | ((C5.getByte(4 + j7) & 255) << 32) | ((C5.getByte(5 + j7) & 255) << 40) | ((C5.getByte(6 + j7) & 255) << 48);
        }
        throw C1912g3.truncatedMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (com.google.protobuf.C5.getByte(r3) < 0) goto L34;
     */
    @Override // com.google.protobuf.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.pos
            long r2 = r9.limit
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8e
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.protobuf.C5.getByte(r0)
            if (r4 < 0) goto L16
            r9.pos = r2
            return r4
        L16:
            long r5 = r9.limit
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L21
            goto L8e
        L21:
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.protobuf.C5.getByte(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L31
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L98
        L31:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.protobuf.C5.getByte(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L41
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3f:
            r5 = r3
            goto L98
        L41:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.protobuf.C5.getByte(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L52
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L98
        L52:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.protobuf.C5.getByte(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L96
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.protobuf.C5.getByte(r3)
            if (r3 >= 0) goto L94
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.protobuf.C5.getByte(r5)
            if (r5 >= 0) goto L96
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.protobuf.C5.getByte(r3)
            if (r3 >= 0) goto L94
            long r3 = r0 + r7
            byte r5 = com.google.protobuf.C5.getByte(r5)
            if (r5 >= 0) goto L96
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.protobuf.C5.getByte(r3)
            if (r0 >= 0) goto L94
        L8e:
            long r0 = r9.readRawVarint64SlowPath()
            int r0 = (int) r0
            return r0
        L94:
            r0 = r2
            goto L98
        L96:
            r0 = r2
            goto L3f
        L98:
            r9.pos = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Q.readRawVarint32():int");
    }

    @Override // com.google.protobuf.S
    public long readRawVarint64() throws IOException {
        long j7;
        long j9;
        long j10;
        int i9;
        long j11 = this.pos;
        if (this.limit != j11) {
            long j12 = 1 + j11;
            byte b = C5.getByte(j11);
            if (b >= 0) {
                this.pos = j12;
                return b;
            }
            if (this.limit - j12 >= 9) {
                long j13 = 2 + j11;
                int i10 = (C5.getByte(j12) << 7) ^ b;
                if (i10 < 0) {
                    i9 = i10 ^ (-128);
                } else {
                    long j14 = 3 + j11;
                    int i11 = i10 ^ (C5.getByte(j13) << Ascii.SO);
                    if (i11 >= 0) {
                        j7 = i11 ^ 16256;
                        j13 = j14;
                    } else {
                        j13 = 4 + j11;
                        int i12 = i11 ^ (C5.getByte(j14) << Ascii.NAK);
                        if (i12 < 0) {
                            i9 = (-2080896) ^ i12;
                        } else {
                            long j15 = 5 + j11;
                            long j16 = i12 ^ (C5.getByte(j13) << 28);
                            if (j16 >= 0) {
                                j10 = 266354560;
                            } else {
                                long j17 = 6 + j11;
                                long j18 = j16 ^ (C5.getByte(j15) << 35);
                                if (j18 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    j15 = 7 + j11;
                                    j16 = j18 ^ (C5.getByte(j17) << 42);
                                    if (j16 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        j17 = 8 + j11;
                                        j18 = j16 ^ (C5.getByte(j15) << 49);
                                        if (j18 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            long j19 = j11 + 9;
                                            long j20 = (j18 ^ (C5.getByte(j17) << 56)) ^ 71499008037633920L;
                                            if (j20 < 0) {
                                                long j21 = j11 + 10;
                                                if (C5.getByte(j19) >= 0) {
                                                    j13 = j21;
                                                    j7 = j20;
                                                }
                                            } else {
                                                j7 = j20;
                                                j13 = j19;
                                            }
                                        }
                                    }
                                }
                                j7 = j9 ^ j18;
                                j13 = j17;
                            }
                            j7 = j10 ^ j16;
                            j13 = j15;
                        }
                    }
                    this.pos = j13;
                    return j7;
                }
                j7 = i9;
                this.pos = j13;
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
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            byte[] bArr = new byte[readRawVarint32];
            long j7 = readRawVarint32;
            C5.copyMemory(this.pos, bArr, 0L, j7);
            String str = new String(bArr, C1898e3.UTF_8);
            this.pos += j7;
            return str;
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
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            String decodeUtf8 = I5.decodeUtf8(this.buffer, bufferPos(this.pos), readRawVarint32);
            this.pos += readRawVarint32;
            return decodeUtf8;
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
        if (i9 >= 0 && i9 <= remaining()) {
            this.pos += i9;
        } else {
            if (i9 < 0) {
                throw C1912g3.negativeSize();
            }
            throw C1912g3.truncatedMessage();
        }
    }

    private Q(ByteBuffer byteBuffer, boolean z8) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = byteBuffer;
        long addressOffset = C5.addressOffset(byteBuffer);
        this.address = addressOffset;
        this.limit = byteBuffer.limit() + addressOffset;
        long position = addressOffset + byteBuffer.position();
        this.pos = position;
        this.startPos = position;
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
