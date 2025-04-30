package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class S {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    U wrapper;

    public static int decodeZigZag32(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    public static long decodeZigZag64(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static S newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i9, InputStream inputStream) throws IOException {
        if ((i9 & 128) == 0) {
            return i9;
        }
        int i10 = i9 & 127;
        int i11 = 7;
        while (i11 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw C1912g3.truncatedMessage();
            }
            i10 |= (read & 127) << i11;
            if ((read & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C1912g3.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw C1912g3.malformedVarint();
    }

    public abstract void checkLastTagWas(int i9) throws C1912g3;

    public void checkRecursionLimit() throws C1912g3 {
        if (this.recursionDepth < this.recursionLimit) {
        } else {
            throw C1912g3.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z8);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i9);

    public abstract int pushLimit(int i9) throws C1912g3;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract H readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends N3> T readGroup(int i9, InterfaceC1948l4 interfaceC1948l4, W1 w1) throws IOException;

    public abstract void readGroup(int i9, M3 m32, W1 w1) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends N3> T readMessage(InterfaceC1948l4 interfaceC1948l4, W1 w1) throws IOException;

    public abstract void readMessage(M3 m32, W1 w1) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i9) throws IOException;

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
    public abstract void readUnknownGroup(int i9, M3 m32) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i9) {
        if (i9 >= 0) {
            int i10 = this.recursionLimit;
            this.recursionLimit = i9;
            return i10;
        }
        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Recursion limit cannot be negative: "));
    }

    public final int setSizeLimit(int i9) {
        if (i9 >= 0) {
            int i10 = this.sizeLimit;
            this.sizeLimit = i9;
            return i10;
        }
        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Size limit cannot be negative: "));
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i9) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i9, AbstractC1895e0 abstractC1895e0) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(AbstractC1895e0 abstractC1895e0) throws IOException;

    public abstract void skipRawBytes(int i9) throws IOException;

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private S() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static S newInstance(InputStream inputStream, int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(C1898e3.EMPTY_BYTE_ARRAY);
        }
        return new P(inputStream, i9);
    }

    public static S newInstance(Iterable<ByteBuffer> iterable) {
        if (!Q.isSupported()) {
            return newInstance(new C1919h3(iterable));
        }
        return newInstance(iterable, false);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw C1912g3.truncatedMessage();
    }

    public static S newInstance(Iterable<ByteBuffer> iterable, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i10 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i9 |= 1;
            } else {
                i9 = byteBuffer.isDirect() ? i9 | 2 : i9 | 4;
            }
        }
        if (i9 == 2) {
            return new N(iterable, i10, z8);
        }
        return newInstance(new C1919h3(iterable));
    }

    public static S newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static S newInstance(byte[] bArr, int i9, int i10) {
        return newInstance(bArr, i9, i10, false);
    }

    public static S newInstance(byte[] bArr, int i9, int i10, boolean z8) {
        M m = new M(bArr, i9, i10, z8);
        try {
            m.pushLimit(i10);
            return m;
        } catch (C1912g3 e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static S newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static S newInstance(ByteBuffer byteBuffer, boolean z8) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z8);
        }
        if (byteBuffer.isDirect() && Q.isSupported()) {
            return new Q(byteBuffer, z8);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }
}
