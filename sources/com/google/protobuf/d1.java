package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class d1 extends u {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    f1 wrapper;
    private static final Logger logger = Logger.getLogger(d1.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = d9.hasUnsafeArrayOperations();

    public static int computeBoolSize(int i10, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i10);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i10);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i10, h0 h0Var) {
        return computeBytesSizeNoTag(h0Var) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(h0 h0Var) {
        return computeLengthDelimitedFieldSize(h0Var.size());
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j3) {
        return computeFixed64SizeNoTag(j3) + computeTagSize(i10);
    }

    public static int computeFixed64SizeNoTag(long j3) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, o5 o5Var) {
        return o5Var.getSerializedSize() + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(o5 o5Var) {
        return o5Var.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeUInt32SizeNoTag(i10);
        }
        return 10;
    }

    public static int computeInt64Size(int i10, long j3) {
        return computeInt64SizeNoTag(j3) + computeTagSize(i10);
    }

    public static int computeInt64SizeNoTag(long j3) {
        return computeUInt64SizeNoTag(j3);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, o4 o4Var) {
        return computeLazyFieldSize(3, o4Var) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i10, o4 o4Var) {
        return computeLazyFieldSizeNoTag(o4Var) + computeTagSize(i10);
    }

    public static int computeLazyFieldSizeNoTag(o4 o4Var) {
        return computeLengthDelimitedFieldSize(o4Var.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i10) {
        return computeUInt32SizeNoTag(i10) + i10;
    }

    public static int computeMessageSetExtensionSize(int i10, o5 o5Var) {
        return computeMessageSize(3, o5Var) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i10, o5 o5Var) {
        return computeMessageSizeNoTag(o5Var) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(o5 o5Var) {
        return computeLengthDelimitedFieldSize(o5Var.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int computeRawMessageSetExtensionSize(int i10, h0 h0Var) {
        return computeBytesSize(3, h0Var) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j3) {
        return computeUInt64SizeNoTag(j3);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeSFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j3) {
        return computeSFixed64SizeNoTag(j3) + computeTagSize(i10);
    }

    public static int computeSFixed64SizeNoTag(long j3) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeSInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j3) {
        return computeSInt64SizeNoTag(j3) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j3) {
        return computeUInt64SizeNoTag(encodeZigZag64(j3));
    }

    public static int computeStringSize(int i10, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i10);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = j9.encodedLength(str);
        } catch (h9 unused) {
            length = str.getBytes(f4.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(z9.makeTag(i10, 0));
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeUInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i10, long j3) {
        return computeUInt64SizeNoTag(j3) + computeTagSize(i10);
    }

    public static int computeUInt64SizeNoTag(long j3) {
        int i10;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i10 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    public static d1 newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static d1 newSafeInstance(ByteBuffer byteBuffer) {
        return new b1(byteBuffer);
    }

    public static d1 newUnsafeInstance(ByteBuffer byteBuffer) {
        return new c1(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, h9 h9Var) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) h9Var);
        byte[] bytes = str.getBytes(f4.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(e2);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.u
    public abstract void write(byte b3) throws IOException;

    @Override // com.google.protobuf.u
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.u
    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeBool(int i10, boolean z10) throws IOException;

    public final void writeBoolNoTag(boolean z10) throws IOException {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i10, h0 h0Var) throws IOException;

    public abstract void writeBytesNoTag(h0 h0Var) throws IOException;

    public final void writeDouble(int i10, double d10) throws IOException {
        writeFixed64(i10, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i10, int i11) throws IOException {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) throws IOException {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11) throws IOException;

    public abstract void writeFixed32NoTag(int i10) throws IOException;

    public abstract void writeFixed64(int i10, long j3) throws IOException;

    public abstract void writeFixed64NoTag(long j3) throws IOException;

    public final void writeFloat(int i10, float f10) throws IOException {
        writeFixed32(i10, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i10, o5 o5Var) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(o5Var);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(o5 o5Var) throws IOException {
        o5Var.writeTo(this);
    }

    public abstract void writeInt32(int i10, int i11) throws IOException;

    public abstract void writeInt32NoTag(int i10) throws IOException;

    public final void writeInt64(int i10, long j3) throws IOException {
        writeUInt64(i10, j3);
    }

    public final void writeInt64NoTag(long j3) throws IOException {
        writeUInt64NoTag(j3);
    }

    @Override // com.google.protobuf.u
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.u
    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeMessage(int i10, o5 o5Var) throws IOException;

    public abstract void writeMessage(int i10, o5 o5Var, z6 z6Var) throws IOException;

    public abstract void writeMessageNoTag(o5 o5Var) throws IOException;

    public abstract void writeMessageNoTag(o5 o5Var, z6 z6Var) throws IOException;

    public abstract void writeMessageSetExtension(int i10, o5 o5Var) throws IOException;

    public final void writeRawByte(byte b3) throws IOException {
        write(b3);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j3) throws IOException {
        writeFixed64NoTag(j3);
    }

    public abstract void writeRawMessageSetExtension(int i10, h0 h0Var) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i10) throws IOException {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j3) throws IOException {
        writeUInt64NoTag(j3);
    }

    public final void writeSFixed32(int i10, int i11) throws IOException {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j3) throws IOException {
        writeFixed64(i10, j3);
    }

    public final void writeSFixed64NoTag(long j3) throws IOException {
        writeFixed64NoTag(j3);
    }

    public final void writeSInt32(int i10, int i11) throws IOException {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j3) throws IOException {
        writeUInt64(i10, encodeZigZag64(j3));
    }

    public final void writeSInt64NoTag(long j3) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j3));
    }

    public abstract void writeString(int i10, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i10, int i11) throws IOException;

    public abstract void writeUInt32(int i10, int i11) throws IOException;

    public abstract void writeUInt32NoTag(int i10) throws IOException;

    public abstract void writeUInt64(int i10, long j3) throws IOException;

    public abstract void writeUInt64NoTag(long j3) throws IOException;

    private d1() {
    }

    @Deprecated
    public static int computeGroupSize(int i10, o5 o5Var, z6 z6Var) {
        return computeGroupSizeNoTag(o5Var, z6Var) + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(o5 o5Var, z6 z6Var) {
        return ((c) o5Var).getSerializedSize(z6Var);
    }

    public static int computeMessageSize(int i10, o5 o5Var, z6 z6Var) {
        return computeMessageSizeNoTag(o5Var, z6Var) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(o5 o5Var, z6 z6Var) {
        return computeLengthDelimitedFieldSize(((c) o5Var).getSerializedSize(z6Var));
    }

    public static d1 newInstance(OutputStream outputStream, int i10) {
        return new a1(outputStream, i10);
    }

    @Deprecated
    public final void writeGroupNoTag(o5 o5Var, z6 z6Var) throws IOException {
        z6Var.writeTo(o5Var, this.wrapper);
    }

    public final void writeRawByte(int i10) throws IOException {
        write((byte) i10);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    public static d1 newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(h0 h0Var) throws IOException {
        h0Var.writeTo(this);
    }

    public static d1 newInstance(byte[] bArr, int i10, int i11) {
        return new w0(bArr, i10, i11);
    }

    @Deprecated
    public final void writeGroup(int i10, o5 o5Var, z6 z6Var) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(o5Var, z6Var);
        writeTag(i10, 4);
    }

    public static d1 newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new y0(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (c1.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static d1 newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }

    public static d1 newInstance(u uVar, int i10) {
        if (i10 >= 0) {
            return new x0(uVar, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
