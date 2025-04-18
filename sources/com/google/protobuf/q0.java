package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes4.dex */
public final class q0 extends r0 {
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

    private int bufferPos(long j3) {
        return (int) (j3 - this.address);
    }

    public static boolean isSupported() {
        return d9.hasUnsafeByteBufferOperations();
    }

    private void recomputeBufferSizeAfterLimit() {
        long j3 = this.limit + this.bufferSizeAfterLimit;
        this.limit = j3;
        int i10 = (int) (j3 - this.startPos);
        int i11 = this.currentLimit;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.bufferSizeAfterLimit = i12;
            this.limit = j3 - i12;
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
        for (int i10 = 0; i10 < 10; i10++) {
            long j3 = this.pos;
            this.pos = 1 + j3;
            if (d9.getByte(j3) >= 0) {
                return;
            }
        }
        throw h4.malformedVarint();
    }

    private void skipRawVarintSlowPath() throws IOException {
        for (int i10 = 0; i10 < 10; i10++) {
            if (readRawByte() >= 0) {
                return;
            }
        }
        throw h4.malformedVarint();
    }

    private ByteBuffer slice(long j3, long j10) throws IOException {
        int position = this.buffer.position();
        int limit = this.buffer.limit();
        ByteBuffer byteBuffer = this.buffer;
        try {
            try {
                byteBuffer.position(bufferPos(j3));
                byteBuffer.limit(bufferPos(j10));
                return this.buffer.slice();
            } catch (IllegalArgumentException e2) {
                h4 truncatedMessage = h4.truncatedMessage();
                truncatedMessage.initCause(e2);
                throw truncatedMessage;
            }
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
    }

    @Override // com.google.protobuf.r0
    public void checkLastTagWas(int i10) throws h4 {
        if (this.lastTag == i10) {
        } else {
            throw h4.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.r0
    public void enableAliasing(boolean z10) {
        this.enableAliasing = z10;
    }

    @Override // com.google.protobuf.r0
    public int getBytesUntilLimit() {
        int i10 = this.currentLimit;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.r0
    public int getLastTag() {
        return this.lastTag;
    }

    @Override // com.google.protobuf.r0
    public int getTotalBytesRead() {
        return (int) (this.pos - this.startPos);
    }

    @Override // com.google.protobuf.r0
    public boolean isAtEnd() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.protobuf.r0
    public void popLimit(int i10) {
        this.currentLimit = i10;
        recomputeBufferSizeAfterLimit();
    }

    @Override // com.google.protobuf.r0
    public int pushLimit(int i10) throws h4 {
        if (i10 >= 0) {
            int totalBytesRead = getTotalBytesRead() + i10;
            int i11 = this.currentLimit;
            if (totalBytesRead <= i11) {
                this.currentLimit = totalBytesRead;
                recomputeBufferSizeAfterLimit();
                return i11;
            }
            throw h4.truncatedMessage();
        }
        throw h4.negativeSize();
    }

    @Override // com.google.protobuf.r0
    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.r0
    public byte[] readByteArray() throws IOException {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.r0
    public ByteBuffer readByteBuffer() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            if (!this.immutable && this.enableAliasing) {
                long j3 = this.pos;
                long j10 = readRawVarint32;
                ByteBuffer slice = slice(j3, j3 + j10);
                this.pos += j10;
                return slice;
            }
            byte[] bArr = new byte[readRawVarint32];
            long j11 = readRawVarint32;
            d9.copyMemory(this.pos, bArr, 0L, j11);
            this.pos += j11;
            return ByteBuffer.wrap(bArr);
        }
        if (readRawVarint32 == 0) {
            return f4.EMPTY_BYTE_BUFFER;
        }
        if (readRawVarint32 < 0) {
            throw h4.negativeSize();
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public h0 readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            if (this.immutable && this.enableAliasing) {
                long j3 = this.pos;
                long j10 = readRawVarint32;
                ByteBuffer slice = slice(j3, j3 + j10);
                this.pos += j10;
                return h0.wrap(slice);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j11 = readRawVarint32;
            d9.copyMemory(this.pos, bArr, 0L, j11);
            this.pos += j11;
            return h0.wrap(bArr);
        }
        if (readRawVarint32 == 0) {
            return h0.EMPTY;
        }
        if (readRawVarint32 < 0) {
            throw h4.negativeSize();
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.r0
    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.r0
    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.r0
    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.r0
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.r0
    public void readGroup(int i10, n5 n5Var, a2 a2Var) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        n5Var.mergeFrom(this, a2Var);
        checkLastTagWas(z9.makeTag(i10, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.r0
    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.r0
    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.r0
    public void readMessage(n5 n5Var, a2 a2Var) throws IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        n5Var.mergeFrom(this, a2Var);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return;
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public byte readRawByte() throws IOException {
        long j3 = this.pos;
        if (j3 != this.limit) {
            this.pos = 1 + j3;
            return d9.getByte(j3);
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 >= 0 && i10 <= remaining()) {
            byte[] bArr = new byte[i10];
            long j3 = this.pos;
            long j10 = i10;
            slice(j3, j3 + j10).get(bArr);
            this.pos += j10;
            return bArr;
        }
        if (i10 <= 0) {
            if (i10 == 0) {
                return f4.EMPTY_BYTE_ARRAY;
            }
            throw h4.negativeSize();
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public int readRawLittleEndian32() throws IOException {
        long j3 = this.pos;
        if (this.limit - j3 >= 4) {
            this.pos = 4 + j3;
            return ((d9.getByte(j3 + 3) & UByte.MAX_VALUE) << 24) | (d9.getByte(j3) & UByte.MAX_VALUE) | ((d9.getByte(1 + j3) & UByte.MAX_VALUE) << 8) | ((d9.getByte(2 + j3) & UByte.MAX_VALUE) << 16);
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public long readRawLittleEndian64() throws IOException {
        long j3 = this.pos;
        if (this.limit - j3 >= 8) {
            this.pos = 8 + j3;
            return ((d9.getByte(j3 + 7) & 255) << 56) | (d9.getByte(j3) & 255) | ((d9.getByte(1 + j3) & 255) << 8) | ((d9.getByte(2 + j3) & 255) << 16) | ((d9.getByte(3 + j3) & 255) << 24) | ((d9.getByte(4 + j3) & 255) << 32) | ((d9.getByte(5 + j3) & 255) << 40) | ((d9.getByte(6 + j3) & 255) << 48);
        }
        throw h4.truncatedMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (com.google.protobuf.d9.getByte(r4) < 0) goto L34;
     */
    @Override // com.google.protobuf.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.pos
            long r2 = r10.limit
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L85
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.protobuf.d9.getByte(r0)
            if (r0 < 0) goto L17
            r10.pos = r4
            return r0
        L17:
            long r6 = r10.limit
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L21
            goto L85
        L21:
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.d9.getByte(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2f
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8b
        L2f:
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.d9.getByte(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3e
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r6 = r4
            goto L8b
        L3e:
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.d9.getByte(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4e
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L8b
        L4e:
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.d9.getByte(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.d9.getByte(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.d9.getByte(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.d9.getByte(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.d9.getByte(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.d9.getByte(r4)
            if (r1 >= 0) goto L8b
        L85:
            long r0 = r10.readRawVarint64SlowPath()
            int r0 = (int) r0
            return r0
        L8b:
            r10.pos = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q0.readRawVarint32():int");
    }

    @Override // com.google.protobuf.r0
    public long readRawVarint64() throws IOException {
        long j3;
        long j10;
        long j11;
        int i10;
        long j12 = this.pos;
        if (this.limit != j12) {
            long j13 = j12 + 1;
            byte b3 = d9.getByte(j12);
            if (b3 >= 0) {
                this.pos = j13;
                return b3;
            }
            if (this.limit - j13 >= 9) {
                long j14 = j13 + 1;
                int i11 = b3 ^ (d9.getByte(j13) << 7);
                if (i11 < 0) {
                    i10 = i11 ^ (-128);
                } else {
                    long j15 = j14 + 1;
                    int i12 = i11 ^ (d9.getByte(j14) << Ascii.SO);
                    if (i12 >= 0) {
                        j3 = i12 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int i13 = i12 ^ (d9.getByte(j15) << Ascii.NAK);
                        if (i13 < 0) {
                            i10 = i13 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long j16 = i13 ^ (d9.getByte(j14) << 28);
                            if (j16 >= 0) {
                                j11 = 266354560;
                            } else {
                                long j17 = j15 + 1;
                                long j18 = j16 ^ (d9.getByte(j15) << 35);
                                if (j18 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j17 + 1;
                                    j16 = j18 ^ (d9.getByte(j17) << 42);
                                    if (j16 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j17 = j15 + 1;
                                        j18 = j16 ^ (d9.getByte(j15) << 49);
                                        if (j18 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j17 + 1;
                                            j3 = (j18 ^ (d9.getByte(j17) << 56)) ^ 71499008037633920L;
                                            if (j3 < 0) {
                                                long j19 = 1 + j15;
                                                if (d9.getByte(j15) >= 0) {
                                                    j14 = j19;
                                                    this.pos = j14;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j18 ^ j10;
                                j14 = j17;
                                this.pos = j14;
                                return j3;
                            }
                            j3 = j16 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.pos = j14;
                    return j3;
                }
                j3 = i10;
                this.pos = j14;
                return j3;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.r0
    public long readRawVarint64SlowPath() throws IOException {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j3 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((readRawByte() & ByteCompanionObject.MIN_VALUE) == 0) {
                return j3;
            }
        }
        throw h4.malformedVarint();
    }

    @Override // com.google.protobuf.r0
    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.r0
    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.r0
    public int readSInt32() throws IOException {
        return r0.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.r0
    public long readSInt64() throws IOException {
        return r0.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.r0
    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            d9.copyMemory(this.pos, bArr, 0L, j3);
            String str = new String(bArr, f4.UTF_8);
            this.pos += j3;
            return str;
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 < 0) {
            throw h4.negativeSize();
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public String readStringRequireUtf8() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
            String decodeUtf8 = j9.decodeUtf8(this.buffer, bufferPos(this.pos), readRawVarint32);
            this.pos += readRawVarint32;
            return decodeUtf8;
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 <= 0) {
            throw h4.negativeSize();
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (z9.getTagFieldNumber(readRawVarint32) != 0) {
            return this.lastTag;
        }
        throw h4.invalidTag();
    }

    @Override // com.google.protobuf.r0
    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.r0
    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.r0
    @Deprecated
    public void readUnknownGroup(int i10, n5 n5Var) throws IOException {
        readGroup(i10, n5Var, a2.getEmptyRegistry());
    }

    @Override // com.google.protobuf.r0
    public void resetSizeCounter() {
        this.startPos = this.pos;
    }

    @Override // com.google.protobuf.r0
    public boolean skipField(int i10) throws IOException {
        int tagWireType = z9.getTagWireType(i10);
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
            checkLastTagWas(z9.makeTag(z9.getTagFieldNumber(i10), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            skipRawBytes(4);
            return true;
        }
        throw h4.invalidWireType();
    }

    @Override // com.google.protobuf.r0
    public void skipMessage() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    @Override // com.google.protobuf.r0
    public void skipRawBytes(int i10) throws IOException {
        if (i10 >= 0 && i10 <= remaining()) {
            this.pos += i10;
        } else {
            if (i10 < 0) {
                throw h4.negativeSize();
            }
            throw h4.truncatedMessage();
        }
    }

    private q0(ByteBuffer byteBuffer, boolean z10) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = byteBuffer;
        long addressOffset = d9.addressOffset(byteBuffer);
        this.address = addressOffset;
        this.limit = byteBuffer.limit() + addressOffset;
        long position = addressOffset + byteBuffer.position();
        this.pos = position;
        this.startPos = position;
        this.immutable = z10;
    }

    @Override // com.google.protobuf.r0
    public void skipMessage(d1 d1Var) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, d1Var));
    }

    @Override // com.google.protobuf.r0
    public <T extends o5> T readGroup(int i10, m6 m6Var, a2 a2Var) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        T t5 = (T) ((i3) m6Var).parsePartialFrom((r0) this, a2Var);
        checkLastTagWas(z9.makeTag(i10, 4));
        this.recursionDepth--;
        return t5;
    }

    @Override // com.google.protobuf.r0
    public boolean skipField(int i10, d1 d1Var) throws IOException {
        int tagWireType = z9.getTagWireType(i10);
        if (tagWireType == 0) {
            long readInt64 = readInt64();
            d1Var.writeUInt32NoTag(i10);
            d1Var.writeUInt64NoTag(readInt64);
            return true;
        }
        if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            d1Var.writeUInt32NoTag(i10);
            d1Var.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            h0 readBytes = readBytes();
            d1Var.writeUInt32NoTag(i10);
            d1Var.writeBytesNoTag(readBytes);
            return true;
        }
        if (tagWireType == 3) {
            d1Var.writeUInt32NoTag(i10);
            skipMessage(d1Var);
            int makeTag = z9.makeTag(z9.getTagFieldNumber(i10), 4);
            checkLastTagWas(makeTag);
            d1Var.writeUInt32NoTag(makeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int readRawLittleEndian32 = readRawLittleEndian32();
            d1Var.writeUInt32NoTag(i10);
            d1Var.writeFixed32NoTag(readRawLittleEndian32);
            return true;
        }
        throw h4.invalidWireType();
    }

    @Override // com.google.protobuf.r0
    public <T extends o5> T readMessage(m6 m6Var, a2 a2Var) throws IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        T t5 = (T) ((i3) m6Var).parsePartialFrom((r0) this, a2Var);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return t5;
        }
        throw h4.truncatedMessage();
    }
}
