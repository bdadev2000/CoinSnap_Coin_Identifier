package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1895e0 extends AbstractC2005u {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    C1909g0 wrapper;
    private static final Logger logger = Logger.getLogger(AbstractC1895e0.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = C5.hasUnsafeArrayOperations();

    public static int computeBoolSize(int i9, boolean z8) {
        return computeBoolSizeNoTag(z8) + computeTagSize(i9);
    }

    public static int computeBoolSizeNoTag(boolean z8) {
        return 1;
    }

    public static int computeByteArraySize(int i9, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i9);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i9, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i9);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i9, H h6) {
        return computeBytesSizeNoTag(h6) + computeTagSize(i9);
    }

    public static int computeBytesSizeNoTag(H h6) {
        return computeLengthDelimitedFieldSize(h6.size());
    }

    public static int computeDoubleSize(int i9, double d2) {
        return computeDoubleSizeNoTag(d2) + computeTagSize(i9);
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeEnumSize(int i9, int i10) {
        return computeEnumSizeNoTag(i10) + computeTagSize(i9);
    }

    public static int computeEnumSizeNoTag(int i9) {
        return computeInt32SizeNoTag(i9);
    }

    public static int computeFixed32Size(int i9, int i10) {
        return computeFixed32SizeNoTag(i10) + computeTagSize(i9);
    }

    public static int computeFixed32SizeNoTag(int i9) {
        return 4;
    }

    public static int computeFixed64Size(int i9, long j7) {
        return computeFixed64SizeNoTag(j7) + computeTagSize(i9);
    }

    public static int computeFixed64SizeNoTag(long j7) {
        return 8;
    }

    public static int computeFloatSize(int i9, float f9) {
        return computeFloatSizeNoTag(f9) + computeTagSize(i9);
    }

    public static int computeFloatSizeNoTag(float f9) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i9, N3 n32) {
        return n32.getSerializedSize() + (computeTagSize(i9) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(N3 n32) {
        return n32.getSerializedSize();
    }

    public static int computeInt32Size(int i9, int i10) {
        return computeInt32SizeNoTag(i10) + computeTagSize(i9);
    }

    public static int computeInt32SizeNoTag(int i9) {
        if (i9 >= 0) {
            return computeUInt32SizeNoTag(i9);
        }
        return 10;
    }

    public static int computeInt64Size(int i9, long j7) {
        return computeInt64SizeNoTag(j7) + computeTagSize(i9);
    }

    public static int computeInt64SizeNoTag(long j7) {
        return computeUInt64SizeNoTag(j7);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i9, C1961n3 c1961n3) {
        return computeLazyFieldSize(3, c1961n3) + computeUInt32Size(2, i9) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i9, C1961n3 c1961n3) {
        return computeLazyFieldSizeNoTag(c1961n3) + computeTagSize(i9);
    }

    public static int computeLazyFieldSizeNoTag(C1961n3 c1961n3) {
        return computeLengthDelimitedFieldSize(c1961n3.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i9) {
        return computeUInt32SizeNoTag(i9) + i9;
    }

    public static int computeMessageSetExtensionSize(int i9, N3 n32) {
        return computeMessageSize(3, n32) + computeUInt32Size(2, i9) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i9, N3 n32) {
        return computeMessageSizeNoTag(n32) + computeTagSize(i9);
    }

    public static int computeMessageSizeNoTag(N3 n32) {
        return computeLengthDelimitedFieldSize(n32.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i9) {
        if (i9 > 4096) {
            return 4096;
        }
        return i9;
    }

    public static int computeRawMessageSetExtensionSize(int i9, H h6) {
        return computeBytesSize(3, h6) + computeUInt32Size(2, i9) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i9) {
        return computeUInt32SizeNoTag(i9);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j7) {
        return computeUInt64SizeNoTag(j7);
    }

    public static int computeSFixed32Size(int i9, int i10) {
        return computeSFixed32SizeNoTag(i10) + computeTagSize(i9);
    }

    public static int computeSFixed32SizeNoTag(int i9) {
        return 4;
    }

    public static int computeSFixed64Size(int i9, long j7) {
        return computeSFixed64SizeNoTag(j7) + computeTagSize(i9);
    }

    public static int computeSFixed64SizeNoTag(long j7) {
        return 8;
    }

    public static int computeSInt32Size(int i9, int i10) {
        return computeSInt32SizeNoTag(i10) + computeTagSize(i9);
    }

    public static int computeSInt32SizeNoTag(int i9) {
        return computeUInt32SizeNoTag(encodeZigZag32(i9));
    }

    public static int computeSInt64Size(int i9, long j7) {
        return computeSInt64SizeNoTag(j7) + computeTagSize(i9);
    }

    public static int computeSInt64SizeNoTag(long j7) {
        return computeUInt64SizeNoTag(encodeZigZag64(j7));
    }

    public static int computeStringSize(int i9, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i9);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = I5.encodedLength(str);
        } catch (G5 unused) {
            length = str.getBytes(C1898e3.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i9) {
        return computeUInt32SizeNoTag(Y5.makeTag(i9, 0));
    }

    public static int computeUInt32Size(int i9, int i10) {
        return computeUInt32SizeNoTag(i10) + computeTagSize(i9);
    }

    public static int computeUInt32SizeNoTag(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        return (i9 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i9, long j7) {
        return computeUInt64SizeNoTag(j7) + computeTagSize(i9);
    }

    public static int computeUInt64SizeNoTag(long j7) {
        int i9;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i9 = 6;
        } else {
            i9 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i9 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i9 + 1 : i9;
    }

    public static int encodeZigZag32(int i9) {
        return (i9 >> 31) ^ (i9 << 1);
    }

    public static long encodeZigZag64(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static AbstractC1895e0 newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static AbstractC1895e0 newSafeInstance(ByteBuffer byteBuffer) {
        return new C1881c0(byteBuffer);
    }

    public static AbstractC1895e0 newUnsafeInstance(ByteBuffer byteBuffer) {
        return new C1888d0(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, G5 g52) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) g52);
        byte[] bytes = str.getBytes(C1898e3.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(e4);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.AbstractC2005u
    public abstract void write(byte b) throws IOException;

    @Override // com.google.protobuf.AbstractC2005u
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.AbstractC2005u
    public abstract void write(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void writeBool(int i9, boolean z8) throws IOException;

    public final void writeBoolNoTag(boolean z8) throws IOException {
        write(z8 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i9, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i9, H h6) throws IOException;

    public abstract void writeBytesNoTag(H h6) throws IOException;

    public final void writeDouble(int i9, double d2) throws IOException {
        writeFixed64(i9, Double.doubleToRawLongBits(d2));
    }

    public final void writeDoubleNoTag(double d2) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d2));
    }

    public final void writeEnum(int i9, int i10) throws IOException {
        writeInt32(i9, i10);
    }

    public final void writeEnumNoTag(int i9) throws IOException {
        writeInt32NoTag(i9);
    }

    public abstract void writeFixed32(int i9, int i10) throws IOException;

    public abstract void writeFixed32NoTag(int i9) throws IOException;

    public abstract void writeFixed64(int i9, long j7) throws IOException;

    public abstract void writeFixed64NoTag(long j7) throws IOException;

    public final void writeFloat(int i9, float f9) throws IOException {
        writeFixed32(i9, Float.floatToRawIntBits(f9));
    }

    public final void writeFloatNoTag(float f9) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f9));
    }

    @Deprecated
    public final void writeGroup(int i9, N3 n32) throws IOException {
        writeTag(i9, 3);
        writeGroupNoTag(n32);
        writeTag(i9, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(N3 n32) throws IOException {
        n32.writeTo(this);
    }

    public abstract void writeInt32(int i9, int i10) throws IOException;

    public abstract void writeInt32NoTag(int i9) throws IOException;

    public final void writeInt64(int i9, long j7) throws IOException {
        writeUInt64(i9, j7);
    }

    public final void writeInt64NoTag(long j7) throws IOException {
        writeUInt64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC2005u
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.AbstractC2005u
    public abstract void writeLazy(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void writeMessage(int i9, N3 n32) throws IOException;

    public abstract void writeMessage(int i9, N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException;

    public abstract void writeMessageNoTag(N3 n32) throws IOException;

    public abstract void writeMessageNoTag(N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException;

    public abstract void writeMessageSetExtension(int i9, N3 n32) throws IOException;

    public final void writeRawByte(byte b) throws IOException {
        write(b);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i9) throws IOException {
        writeFixed32NoTag(i9);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j7) throws IOException {
        writeFixed64NoTag(j7);
    }

    public abstract void writeRawMessageSetExtension(int i9, H h6) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i9) throws IOException {
        writeUInt32NoTag(i9);
    }

    @Deprecated
    public final void writeRawVarint64(long j7) throws IOException {
        writeUInt64NoTag(j7);
    }

    public final void writeSFixed32(int i9, int i10) throws IOException {
        writeFixed32(i9, i10);
    }

    public final void writeSFixed32NoTag(int i9) throws IOException {
        writeFixed32NoTag(i9);
    }

    public final void writeSFixed64(int i9, long j7) throws IOException {
        writeFixed64(i9, j7);
    }

    public final void writeSFixed64NoTag(long j7) throws IOException {
        writeFixed64NoTag(j7);
    }

    public final void writeSInt32(int i9, int i10) throws IOException {
        writeUInt32(i9, encodeZigZag32(i10));
    }

    public final void writeSInt32NoTag(int i9) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i9));
    }

    public final void writeSInt64(int i9, long j7) throws IOException {
        writeUInt64(i9, encodeZigZag64(j7));
    }

    public final void writeSInt64NoTag(long j7) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j7));
    }

    public abstract void writeString(int i9, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i9, int i10) throws IOException;

    public abstract void writeUInt32(int i9, int i10) throws IOException;

    public abstract void writeUInt32NoTag(int i9) throws IOException;

    public abstract void writeUInt64(int i9, long j7) throws IOException;

    public abstract void writeUInt64NoTag(long j7) throws IOException;

    private AbstractC1895e0() {
    }

    @Deprecated
    public static int computeGroupSize(int i9, N3 n32, InterfaceC2038y4 interfaceC2038y4) {
        return computeGroupSizeNoTag(n32, interfaceC2038y4) + (computeTagSize(i9) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(N3 n32, InterfaceC2038y4 interfaceC2038y4) {
        return ((AbstractC1880c) n32).getSerializedSize(interfaceC2038y4);
    }

    public static int computeMessageSize(int i9, N3 n32, InterfaceC2038y4 interfaceC2038y4) {
        return computeMessageSizeNoTag(n32, interfaceC2038y4) + computeTagSize(i9);
    }

    public static int computeMessageSizeNoTag(N3 n32, InterfaceC2038y4 interfaceC2038y4) {
        return computeLengthDelimitedFieldSize(((AbstractC1880c) n32).getSerializedSize(interfaceC2038y4));
    }

    public static AbstractC1895e0 newInstance(OutputStream outputStream, int i9) {
        return new C1874b0(outputStream, i9);
    }

    @Deprecated
    public final void writeGroupNoTag(N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        interfaceC2038y4.writeTo(n32, this.wrapper);
    }

    public final void writeRawByte(int i9) throws IOException {
        write((byte) i9);
    }

    public final void writeRawBytes(byte[] bArr, int i9, int i10) throws IOException {
        write(bArr, i9, i10);
    }

    public static AbstractC1895e0 newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(H h6) throws IOException {
        h6.writeTo(this);
    }

    public static AbstractC1895e0 newInstance(byte[] bArr, int i9, int i10) {
        return new X(bArr, i9, i10);
    }

    @Deprecated
    public final void writeGroup(int i9, N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        writeTag(i9, 3);
        writeGroupNoTag(n32, interfaceC2038y4);
        writeTag(i9, 4);
    }

    public static AbstractC1895e0 newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new Z(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (C1888d0.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static AbstractC1895e0 newInstance(ByteBuffer byteBuffer, int i9) {
        return newInstance(byteBuffer);
    }

    public static AbstractC1895e0 newInstance(AbstractC2005u abstractC2005u, int i9) {
        if (i9 >= 0) {
            return new Y(abstractC2005u, i9);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
