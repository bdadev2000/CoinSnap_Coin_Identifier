package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class x0 extends v0 {
    private final u out;

    public x0(u uVar, int i10) {
        super(i10);
        if (uVar != null) {
            this.out = uVar;
            return;
        }
        throw new NullPointerException("out");
    }

    private void doFlush() throws IOException {
        this.out.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    private void flushIfNotAvailable(int i10) throws IOException {
        if (this.limit - this.position < i10) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.d1
    public void flush() throws IOException {
        if (this.position > 0) {
            doFlush();
        }
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void write(byte b3) throws IOException {
        if (this.position == this.limit) {
            doFlush();
        }
        buffer(b3);
    }

    @Override // com.google.protobuf.d1
    public void writeBool(int i10, boolean z10) throws IOException {
        flushIfNotAvailable(11);
        bufferTag(i10, 0);
        buffer(z10 ? (byte) 1 : (byte) 0);
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
        flushIfNotAvailable(14);
        bufferTag(i10, 5);
        bufferFixed32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public void writeFixed32NoTag(int i10) throws IOException {
        flushIfNotAvailable(4);
        bufferFixed32NoTag(i10);
    }

    @Override // com.google.protobuf.d1
    public void writeFixed64(int i10, long j3) throws IOException {
        flushIfNotAvailable(18);
        bufferTag(i10, 1);
        bufferFixed64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeFixed64NoTag(long j3) throws IOException {
        flushIfNotAvailable(8);
        bufferFixed64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeInt32(int i10, int i11) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i10, 0);
        bufferInt32NoTag(i11);
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
        flush();
        this.out.writeLazy(bArr, i10, i11);
        this.totalBytesWritten += i11;
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
        int length = str.length() * 3;
        int computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(length);
        int i10 = computeUInt32SizeNoTag + length;
        int i11 = this.limit;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int encode = j9.encode(str, bArr, 0, length);
            writeUInt32NoTag(encode);
            writeLazy(bArr, 0, encode);
            return;
        }
        if (i10 > i11 - this.position) {
            doFlush();
        }
        int i12 = this.position;
        try {
            int computeUInt32SizeNoTag2 = d1.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i13 = i12 + computeUInt32SizeNoTag2;
                this.position = i13;
                int encode2 = j9.encode(str, this.buffer, i13, this.limit - i13);
                this.position = i12;
                int i14 = (encode2 - i12) - computeUInt32SizeNoTag2;
                bufferUInt32NoTag(i14);
                this.position = encode2;
                this.totalBytesWritten += i14;
            } else {
                int encodedLength = j9.encodedLength(str);
                bufferUInt32NoTag(encodedLength);
                this.position = j9.encode(str, this.buffer, this.position, encodedLength);
                this.totalBytesWritten += encodedLength;
            }
        } catch (h9 e2) {
            this.totalBytesWritten -= this.position - i12;
            this.position = i12;
            inefficientWriteStringNoTag(str, e2);
        } catch (IndexOutOfBoundsException e10) {
            throw new z0(e10);
        }
    }

    @Override // com.google.protobuf.d1
    public void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag(z9.makeTag(i10, i11));
    }

    @Override // com.google.protobuf.d1
    public void writeUInt32(int i10, int i11) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i10, 0);
        bufferUInt32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public void writeUInt32NoTag(int i10) throws IOException {
        flushIfNotAvailable(5);
        bufferUInt32NoTag(i10);
    }

    @Override // com.google.protobuf.d1
    public void writeUInt64(int i10, long j3) throws IOException {
        flushIfNotAvailable(20);
        bufferTag(i10, 0);
        bufferUInt64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeUInt64NoTag(long j3) throws IOException {
        flushIfNotAvailable(10);
        bufferUInt64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
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
        flush();
        this.out.write(bArr, i10, i11);
        this.totalBytesWritten += i11;
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        flush();
        int remaining = byteBuffer.remaining();
        this.out.writeLazy(byteBuffer);
        this.totalBytesWritten += remaining;
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void write(ByteBuffer byteBuffer) throws IOException {
        flush();
        int remaining = byteBuffer.remaining();
        this.out.write(byteBuffer);
        this.totalBytesWritten += remaining;
    }
}
