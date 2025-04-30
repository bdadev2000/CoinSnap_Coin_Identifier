package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1874b0 extends W {
    private final OutputStream out;

    public C1874b0(OutputStream outputStream, int i9) {
        super(i9);
        if (outputStream != null) {
            this.out = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    private void doFlush() throws IOException {
        this.out.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    private void flushIfNotAvailable(int i9) throws IOException {
        if (this.limit - this.position < i9) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void flush() throws IOException {
        if (this.position > 0) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void write(byte b) throws IOException {
        if (this.position == this.limit) {
            doFlush();
        }
        buffer(b);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeBool(int i9, boolean z8) throws IOException {
        flushIfNotAvailable(11);
        bufferTag(i9, 0);
        buffer(z8 ? (byte) 1 : (byte) 0);
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
        flushIfNotAvailable(14);
        bufferTag(i9, 5);
        bufferFixed32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed32NoTag(int i9) throws IOException {
        flushIfNotAvailable(4);
        bufferFixed32NoTag(i9);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed64(int i9, long j7) throws IOException {
        flushIfNotAvailable(18);
        bufferTag(i9, 1);
        bufferFixed64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed64NoTag(long j7) throws IOException {
        flushIfNotAvailable(8);
        bufferFixed64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeInt32(int i9, int i10) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i9, 0);
        bufferInt32NoTag(i10);
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
        int encodedLength;
        try {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = AbstractC1895e0.computeUInt32SizeNoTag(length);
            int i9 = computeUInt32SizeNoTag + length;
            int i10 = this.limit;
            if (i9 > i10) {
                byte[] bArr = new byte[length];
                int encode = I5.encode(str, bArr, 0, length);
                writeUInt32NoTag(encode);
                writeLazy(bArr, 0, encode);
                return;
            }
            if (i9 > i10 - this.position) {
                doFlush();
            }
            int computeUInt32SizeNoTag2 = AbstractC1895e0.computeUInt32SizeNoTag(str.length());
            int i11 = this.position;
            try {
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i12 = i11 + computeUInt32SizeNoTag2;
                    this.position = i12;
                    int encode2 = I5.encode(str, this.buffer, i12, this.limit - i12);
                    this.position = i11;
                    encodedLength = (encode2 - i11) - computeUInt32SizeNoTag2;
                    bufferUInt32NoTag(encodedLength);
                    this.position = encode2;
                } else {
                    encodedLength = I5.encodedLength(str);
                    bufferUInt32NoTag(encodedLength);
                    this.position = I5.encode(str, this.buffer, this.position, encodedLength);
                }
                this.totalBytesWritten += encodedLength;
            } catch (G5 e4) {
                this.totalBytesWritten -= this.position - i11;
                this.position = i11;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new C1867a0(e9);
            }
        } catch (G5 e10) {
            inefficientWriteStringNoTag(str, e10);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeTag(int i9, int i10) throws IOException {
        writeUInt32NoTag(Y5.makeTag(i9, i10));
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt32(int i9, int i10) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i9, 0);
        bufferUInt32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt32NoTag(int i9) throws IOException {
        flushIfNotAvailable(5);
        bufferUInt32NoTag(i9);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt64(int i9, long j7) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i9, 0);
        bufferUInt64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt64NoTag(long j7) throws IOException {
        flushIfNotAvailable(10);
        bufferUInt64NoTag(j7);
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
        int i11 = this.limit;
        int i12 = this.position;
        if (i11 - i12 >= i10) {
            System.arraycopy(bArr, i9, this.buffer, i12, i10);
            this.position += i10;
            this.totalBytesWritten += i10;
            return;
        }
        int i13 = i11 - i12;
        System.arraycopy(bArr, i9, this.buffer, i12, i13);
        int i14 = i9 + i13;
        int i15 = i10 - i13;
        this.position = this.limit;
        this.totalBytesWritten += i13;
        doFlush();
        if (i15 <= this.limit) {
            System.arraycopy(bArr, i14, this.buffer, 0, i15);
            this.position = i15;
        } else {
            this.out.write(bArr, i14, i15);
        }
        this.totalBytesWritten += i15;
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int i9 = this.limit;
        int i10 = this.position;
        if (i9 - i10 >= remaining) {
            byteBuffer.get(this.buffer, i10, remaining);
            this.position += remaining;
            this.totalBytesWritten += remaining;
            return;
        }
        int i11 = i9 - i10;
        byteBuffer.get(this.buffer, i10, i11);
        int i12 = remaining - i11;
        this.position = this.limit;
        this.totalBytesWritten += i11;
        doFlush();
        while (true) {
            int i13 = this.limit;
            if (i12 > i13) {
                byteBuffer.get(this.buffer, 0, i13);
                this.out.write(this.buffer, 0, this.limit);
                int i14 = this.limit;
                i12 -= i14;
                this.totalBytesWritten += i14;
            } else {
                byteBuffer.get(this.buffer, 0, i12);
                this.position = i12;
                this.totalBytesWritten += i12;
                return;
            }
        }
    }
}
