package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class r0 {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    t0 wrapper;

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    public static r0 newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw h4.truncatedMessage();
            }
            i11 |= (read & 127) << i12;
            if ((read & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw h4.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw h4.malformedVarint();
    }

    public abstract void checkLastTagWas(int i10) throws h4;

    public void checkRecursionLimit() throws h4 {
        if (this.recursionDepth < this.recursionLimit) {
        } else {
            throw h4.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z10);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i10);

    public abstract int pushLimit(int i10) throws h4;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract h0 readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends o5> T readGroup(int i10, m6 m6Var, a2 a2Var) throws IOException;

    public abstract void readGroup(int i10, n5 n5Var, a2 a2Var) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends o5> T readMessage(m6 m6Var, a2 a2Var) throws IOException;

    public abstract void readMessage(n5 n5Var, a2 a2Var) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i10) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i10, n5 n5Var) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.recursionLimit;
            this.recursionLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException(eb.j.i("Recursion limit cannot be negative: ", i10));
    }

    public final int setSizeLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.sizeLimit;
            this.sizeLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException(eb.j.i("Size limit cannot be negative: ", i10));
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i10) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i10, d1 d1Var) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(d1 d1Var) throws IOException;

    public abstract void skipRawBytes(int i10) throws IOException;

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private r0() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static r0 newInstance(InputStream inputStream, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(f4.EMPTY_BYTE_ARRAY);
        }
        return new p0(inputStream, i10);
    }

    public static r0 newInstance(Iterable<ByteBuffer> iterable) {
        if (!q0.isSupported()) {
            return newInstance(new i4(iterable));
        }
        return newInstance(iterable, false);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw h4.truncatedMessage();
    }

    public static r0 newInstance(Iterable<ByteBuffer> iterable, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i10 |= 1;
            } else {
                i10 = byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
            }
        }
        if (i10 == 2) {
            return new n0(iterable, i11, z10);
        }
        return newInstance(new i4(iterable));
    }

    public static r0 newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static r0 newInstance(byte[] bArr, int i10, int i11) {
        return newInstance(bArr, i10, i11, false);
    }

    public static r0 newInstance(byte[] bArr, int i10, int i11, boolean z10) {
        m0 m0Var = new m0(bArr, i10, i11, z10);
        try {
            m0Var.pushLimit(i11);
            return m0Var;
        } catch (h4 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static r0 newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static r0 newInstance(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && q0.isSupported()) {
            return new q0(byteBuffer, z10);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }
}
