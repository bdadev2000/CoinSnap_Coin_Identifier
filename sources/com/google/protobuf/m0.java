package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes4.dex */
public final class m0 extends r0 {
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
        int i10 = this.limit + this.bufferSizeAfterLimit;
        this.limit = i10;
        int i11 = i10 - this.startPos;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.bufferSizeAfterLimit = i13;
            this.limit = i10 - i13;
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
        for (int i10 = 0; i10 < 10; i10++) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 + 1;
            if (bArr[i11] >= 0) {
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
        return this.pos - this.startPos;
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
            if (totalBytesRead >= 0) {
                int i11 = this.currentLimit;
                if (totalBytesRead <= i11) {
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i11;
                }
                throw h4.truncatedMessage();
            }
            throw h4.parseFailure();
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
        ByteBuffer wrap;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i10 = this.limit;
            int i11 = this.pos;
            if (readRawVarint32 <= i10 - i11) {
                if (!this.immutable && this.enableAliasing) {
                    wrap = ByteBuffer.wrap(this.buffer, i11, readRawVarint32).slice();
                } else {
                    wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i11, i11 + readRawVarint32));
                }
                this.pos += readRawVarint32;
                return wrap;
            }
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
        h0 copyFrom;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i10 = this.limit;
            int i11 = this.pos;
            if (readRawVarint32 <= i10 - i11) {
                if (this.immutable && this.enableAliasing) {
                    copyFrom = h0.wrap(this.buffer, i11, readRawVarint32);
                } else {
                    copyFrom = h0.copyFrom(this.buffer, i11, readRawVarint32);
                }
                this.pos += readRawVarint32;
                return copyFrom;
            }
        }
        if (readRawVarint32 == 0) {
            return h0.EMPTY;
        }
        return h0.wrap(readRawBytes(readRawVarint32));
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
        int i10 = this.pos;
        if (i10 != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i10 + 1;
            return bArr[i10];
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 > 0) {
            int i11 = this.limit;
            int i12 = this.pos;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.pos = i13;
                return Arrays.copyOfRange(this.buffer, i12, i13);
            }
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
        int i10 = this.pos;
        if (this.limit - i10 >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i10 + 4;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }
        throw h4.truncatedMessage();
    }

    @Override // com.google.protobuf.r0
    public long readRawLittleEndian64() throws IOException {
        int i10 = this.pos;
        if (this.limit - i10 >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw h4.truncatedMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r2[r3] < 0) goto L34;
     */
    @Override // com.google.protobuf.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 != r0) goto L7
            goto L6a
        L7:
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.pos = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r3
            goto L70
        L31:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.readRawVarint64SlowPath()
            int r0 = (int) r0
            return r0
        L70:
            r5.pos = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m0.readRawVarint32():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r0] < 0) goto L40;
     */
    @Override // com.google.protobuf.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m0.readRawVarint64():long");
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
        if (readRawVarint32 > 0) {
            int i10 = this.limit;
            int i11 = this.pos;
            if (readRawVarint32 <= i10 - i11) {
                String str = new String(this.buffer, i11, readRawVarint32, f4.UTF_8);
                this.pos += readRawVarint32;
                return str;
            }
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
        if (readRawVarint32 > 0) {
            int i10 = this.limit;
            int i11 = this.pos;
            if (readRawVarint32 <= i10 - i11) {
                String decodeUtf8 = j9.decodeUtf8(this.buffer, i11, readRawVarint32);
                this.pos += readRawVarint32;
                return decodeUtf8;
            }
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
        if (i10 >= 0) {
            int i11 = this.limit;
            int i12 = this.pos;
            if (i10 <= i11 - i12) {
                this.pos = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw h4.negativeSize();
        }
        throw h4.truncatedMessage();
    }

    private m0(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.currentLimit = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i11 + i10;
        this.pos = i10;
        this.startPos = i10;
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
