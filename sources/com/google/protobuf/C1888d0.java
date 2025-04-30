package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1888d0 extends AbstractC1895e0 {
    private final long address;
    private final ByteBuffer buffer;
    private final long initialPosition;
    private final long limit;
    private final long oneVarintLimit;
    private final ByteBuffer originalBuffer;
    private long position;

    public C1888d0(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long addressOffset = C5.addressOffset(byteBuffer);
        this.address = addressOffset;
        long position = byteBuffer.position() + addressOffset;
        this.initialPosition = position;
        long limit = addressOffset + byteBuffer.limit();
        this.limit = limit;
        this.oneVarintLimit = limit - 10;
        this.position = position;
    }

    private int bufferPos(long j7) {
        return (int) (j7 - this.address);
    }

    public static boolean isSupported() {
        return C5.hasUnsafeByteBufferOperations();
    }

    private void repositionBuffer(long j7) {
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void flush() {
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public int getTotalBytesWritten() {
        return (int) (this.position - this.initialPosition);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public int spaceLeft() {
        return (int) (this.limit - this.position);
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void write(byte b) throws IOException {
        long j7 = this.position;
        if (j7 < this.limit) {
            this.position = 1 + j7;
            C5.putByte(j7, b);
            return;
        }
        throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeBool(int i9, boolean z8) throws IOException {
        writeTag(i9, 0);
        write(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeByteArray(int i9, byte[] bArr) throws IOException {
        writeByteArray(i9, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException {
        writeUInt32NoTag(i10);
        write(bArr, i9, i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException {
        writeTag(i9, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeBytes(int i9, H h6) throws IOException {
        writeTag(i9, 2);
        writeBytesNoTag(h6);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeBytesNoTag(H h6) throws IOException {
        writeUInt32NoTag(h6.size());
        h6.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed32(int i9, int i10) throws IOException {
        writeTag(i9, 5);
        writeFixed32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed32NoTag(int i9) throws IOException {
        this.buffer.putInt(bufferPos(this.position), i9);
        this.position += 4;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed64(int i9, long j7) throws IOException {
        writeTag(i9, 1);
        writeFixed64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed64NoTag(long j7) throws IOException {
        this.buffer.putLong(bufferPos(this.position), j7);
        this.position += 8;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeInt32(int i9, int i10) throws IOException {
        writeTag(i9, 0);
        writeInt32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeInt32NoTag(int i9) throws IOException {
        if (i9 >= 0) {
            writeUInt32NoTag(i9);
        } else {
            writeUInt64NoTag(i9);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void writeLazy(byte[] bArr, int i9, int i10) throws IOException {
        write(bArr, i9, i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeMessage(int i9, N3 n32) throws IOException {
        writeTag(i9, 2);
        writeMessageNoTag(n32);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeMessageNoTag(N3 n32) throws IOException {
        writeUInt32NoTag(n32.getSerializedSize());
        n32.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeMessageSetExtension(int i9, N3 n32) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i9);
        writeMessage(3, n32);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        write(duplicate);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeRawMessageSetExtension(int i9, H h6) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i9);
        writeBytes(3, h6);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeString(int i9, String str) throws IOException {
        writeTag(i9, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeStringNoTag(String str) throws IOException {
        long j7 = this.position;
        try {
            int computeUInt32SizeNoTag = AbstractC1895e0.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = AbstractC1895e0.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int bufferPos = bufferPos(this.position) + computeUInt32SizeNoTag2;
                I5.encodeUtf8(str, this.buffer);
                int position = this.buffer.position() - bufferPos;
                writeUInt32NoTag(position);
                this.position += position;
            } else {
                int encodedLength = I5.encodedLength(str);
                writeUInt32NoTag(encodedLength);
                repositionBuffer(this.position);
                I5.encodeUtf8(str, this.buffer);
                this.position += encodedLength;
            }
        } catch (G5 e4) {
            this.position = j7;
            repositionBuffer(j7);
            inefficientWriteStringNoTag(str, e4);
        } catch (IllegalArgumentException e9) {
            throw new C1867a0(e9);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1867a0(e10);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeTag(int i9, int i10) throws IOException {
        writeUInt32NoTag(Y5.makeTag(i9, i10));
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt32(int i9, int i10) throws IOException {
        writeTag(i9, 0);
        writeUInt32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt32NoTag(int i9) throws IOException {
        if (this.position <= this.oneVarintLimit) {
            while ((i9 & (-128)) != 0) {
                long j7 = this.position;
                this.position = j7 + 1;
                C5.putByte(j7, (byte) ((i9 & 127) | 128));
                i9 >>>= 7;
            }
            long j9 = this.position;
            this.position = 1 + j9;
            C5.putByte(j9, (byte) i9);
            return;
        }
        while (true) {
            long j10 = this.position;
            if (j10 < this.limit) {
                if ((i9 & (-128)) == 0) {
                    this.position = 1 + j10;
                    C5.putByte(j10, (byte) i9);
                    return;
                } else {
                    this.position = j10 + 1;
                    C5.putByte(j10, (byte) ((i9 & 127) | 128));
                    i9 >>>= 7;
                }
            } else {
                throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt64(int i9, long j7) throws IOException {
        writeTag(i9, 0);
        writeUInt64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt64NoTag(long j7) throws IOException {
        if (this.position <= this.oneVarintLimit) {
            while ((j7 & (-128)) != 0) {
                long j9 = this.position;
                this.position = j9 + 1;
                C5.putByte(j9, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            long j10 = this.position;
            this.position = 1 + j10;
            C5.putByte(j10, (byte) j7);
            return;
        }
        while (true) {
            long j11 = this.position;
            if (j11 < this.limit) {
                if ((j7 & (-128)) == 0) {
                    this.position = 1 + j11;
                    C5.putByte(j11, (byte) j7);
                    return;
                } else {
                    this.position = j11 + 1;
                    C5.putByte(j11, (byte) ((((int) j7) & 127) | 128));
                    j7 >>>= 7;
                }
            } else {
                throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException {
        writeTag(i9, 2);
        writeByteArrayNoTag(bArr, i10, i11);
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeMessage(int i9, N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        writeTag(i9, 2);
        writeMessageNoTag(n32, interfaceC2038y4);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeMessageNoTag(N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        writeUInt32NoTag(((AbstractC1880c) n32).getSerializedSize(interfaceC2038y4));
        interfaceC2038y4.writeTo(n32, this.wrapper);
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        if (bArr != null && i9 >= 0 && i10 >= 0 && bArr.length - i10 >= i9) {
            long j7 = i10;
            long j9 = this.limit - j7;
            long j10 = this.position;
            if (j9 >= j10) {
                C5.copyMemory(bArr, i9, j10, j7);
                this.position += j7;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i10)));
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            int remaining = byteBuffer.remaining();
            repositionBuffer(this.position);
            this.buffer.put(byteBuffer);
            this.position += remaining;
        } catch (BufferOverflowException e4) {
            throw new C1867a0(e4);
        }
    }
}
