package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class c1 extends d1 {
    private final long address;
    private final ByteBuffer buffer;
    private final long initialPosition;
    private final long limit;
    private final long oneVarintLimit;
    private final ByteBuffer originalBuffer;
    private long position;

    public c1(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long addressOffset = d9.addressOffset(byteBuffer);
        this.address = addressOffset;
        long position = byteBuffer.position() + addressOffset;
        this.initialPosition = position;
        long limit = addressOffset + byteBuffer.limit();
        this.limit = limit;
        this.oneVarintLimit = limit - 10;
        this.position = position;
    }

    private int bufferPos(long j3) {
        return (int) (j3 - this.address);
    }

    public static boolean isSupported() {
        return d9.hasUnsafeByteBufferOperations();
    }

    private void repositionBuffer(long j3) {
    }

    @Override // com.google.protobuf.d1
    public void flush() {
    }

    @Override // com.google.protobuf.d1
    public int getTotalBytesWritten() {
        return (int) (this.position - this.initialPosition);
    }

    @Override // com.google.protobuf.d1
    public int spaceLeft() {
        return (int) (this.limit - this.position);
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void write(byte b3) throws IOException {
        long j3 = this.position;
        if (j3 < this.limit) {
            this.position = 1 + j3;
            d9.putByte(j3, b3);
            return;
        }
        throw new z0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
    }

    @Override // com.google.protobuf.d1
    public void writeBool(int i10, boolean z10) throws IOException {
        writeTag(i10, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.d1
    public void writeByteArray(int i10, byte[] bArr) throws IOException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.d1
    public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.d1
    public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.d1
    public void writeBytes(int i10, h0 h0Var) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(h0Var);
    }

    @Override // com.google.protobuf.d1
    public void writeBytesNoTag(h0 h0Var) throws IOException {
        writeUInt32NoTag(h0Var.size());
        h0Var.writeTo(this);
    }

    @Override // com.google.protobuf.d1
    public void writeFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public void writeFixed32NoTag(int i10) throws IOException {
        this.buffer.putInt(bufferPos(this.position), i10);
        this.position += 4;
    }

    @Override // com.google.protobuf.d1
    public void writeFixed64(int i10, long j3) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeFixed64NoTag(long j3) throws IOException {
        this.buffer.putLong(bufferPos(this.position), j3);
        this.position += 8;
    }

    @Override // com.google.protobuf.d1
    public void writeInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.d1
    public void writeMessage(int i10, o5 o5Var) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(o5Var);
    }

    @Override // com.google.protobuf.d1
    public void writeMessageNoTag(o5 o5Var) throws IOException {
        writeUInt32NoTag(o5Var.getSerializedSize());
        o5Var.writeTo(this);
    }

    @Override // com.google.protobuf.d1
    public void writeMessageSetExtension(int i10, o5 o5Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, o5Var);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.d1
    public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        write(duplicate);
    }

    @Override // com.google.protobuf.d1
    public void writeRawMessageSetExtension(int i10, h0 h0Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeBytes(3, h0Var);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.d1
    public void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.d1
    public void writeStringNoTag(String str) throws IOException {
        long j3 = this.position;
        try {
            int computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = d1.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int bufferPos = bufferPos(this.position) + computeUInt32SizeNoTag2;
                j9.encodeUtf8(str, this.buffer);
                int position = this.buffer.position() - bufferPos;
                writeUInt32NoTag(position);
                this.position += position;
            } else {
                int encodedLength = j9.encodedLength(str);
                writeUInt32NoTag(encodedLength);
                repositionBuffer(this.position);
                j9.encodeUtf8(str, this.buffer);
                this.position += encodedLength;
            }
        } catch (h9 e2) {
            this.position = j3;
            repositionBuffer(j3);
            inefficientWriteStringNoTag(str, e2);
        } catch (IllegalArgumentException e10) {
            throw new z0(e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new z0(e11);
        }
    }

    @Override // com.google.protobuf.d1
    public void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag(z9.makeTag(i10, i11));
    }

    @Override // com.google.protobuf.d1
    public void writeUInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public void writeUInt32NoTag(int i10) throws IOException {
        if (this.position <= this.oneVarintLimit) {
            while ((i10 & (-128)) != 0) {
                long j3 = this.position;
                this.position = j3 + 1;
                d9.putByte(j3, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            long j10 = this.position;
            this.position = 1 + j10;
            d9.putByte(j10, (byte) i10);
            return;
        }
        while (true) {
            long j11 = this.position;
            if (j11 < this.limit) {
                if ((i10 & (-128)) == 0) {
                    this.position = 1 + j11;
                    d9.putByte(j11, (byte) i10);
                    return;
                } else {
                    this.position = j11 + 1;
                    d9.putByte(j11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            } else {
                throw new z0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
        }
    }

    @Override // com.google.protobuf.d1
    public void writeUInt64(int i10, long j3) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeUInt64NoTag(long j3) throws IOException {
        if (this.position <= this.oneVarintLimit) {
            while ((j3 & (-128)) != 0) {
                long j10 = this.position;
                this.position = j10 + 1;
                d9.putByte(j10, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            long j11 = this.position;
            this.position = 1 + j11;
            d9.putByte(j11, (byte) j3);
            return;
        }
        while (true) {
            long j12 = this.position;
            if (j12 < this.limit) {
                if ((j3 & (-128)) == 0) {
                    this.position = 1 + j12;
                    d9.putByte(j12, (byte) j3);
                    return;
                } else {
                    this.position = j12 + 1;
                    d9.putByte(j12, (byte) ((((int) j3) & 127) | 128));
                    j3 >>>= 7;
                }
            } else {
                throw new z0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
        }
    }

    @Override // com.google.protobuf.d1
    public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.d1
    public void writeMessage(int i10, o5 o5Var, z6 z6Var) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(o5Var, z6Var);
    }

    @Override // com.google.protobuf.d1
    public void writeMessageNoTag(o5 o5Var, z6 z6Var) throws IOException {
        writeUInt32NoTag(((c) o5Var).getSerializedSize(z6Var));
        z6Var.writeTo(o5Var, this.wrapper);
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
            long j3 = i11;
            long j10 = this.limit - j3;
            long j11 = this.position;
            if (j10 >= j11) {
                d9.copyMemory(bArr, i10, j11, j3);
                this.position += j3;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        throw new z0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i11)));
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            int remaining = byteBuffer.remaining();
            repositionBuffer(this.position);
            this.buffer.put(byteBuffer);
            this.position += remaining;
        } catch (BufferOverflowException e2) {
            throw new z0(e2);
        }
    }
}
