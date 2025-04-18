package com.google.protobuf;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class b1 extends d1 {
    private final ByteBuffer buffer;
    private final int initialPosition;
    private final ByteBuffer originalBuffer;

    public b1(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.initialPosition = byteBuffer.position();
    }

    private void encode(String str) throws IOException {
        try {
            j9.encodeUtf8(str, this.buffer);
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(e2);
        }
    }

    @Override // com.google.protobuf.d1
    public void flush() {
    }

    @Override // com.google.protobuf.d1
    public int getTotalBytesWritten() {
        return this.buffer.position() - this.initialPosition;
    }

    @Override // com.google.protobuf.d1
    public int spaceLeft() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void write(byte b3) throws IOException {
        try {
            this.buffer.put(b3);
        } catch (BufferOverflowException e2) {
            throw new z0(e2);
        }
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
        try {
            this.buffer.putInt(i10);
        } catch (BufferOverflowException e2) {
            throw new z0(e2);
        }
    }

    @Override // com.google.protobuf.d1
    public void writeFixed64(int i10, long j3) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeFixed64NoTag(long j3) throws IOException {
        try {
            this.buffer.putLong(j3);
        } catch (BufferOverflowException e2) {
            throw new z0(e2);
        }
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
        int position = this.buffer.position();
        try {
            int computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = d1.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int position2 = this.buffer.position() + computeUInt32SizeNoTag2;
                encode(str);
                int position3 = this.buffer.position();
                writeUInt32NoTag(position3 - position2);
            } else {
                writeUInt32NoTag(j9.encodedLength(str));
                encode(str);
            }
        } catch (h9 e2) {
            inefficientWriteStringNoTag(str, e2);
        } catch (IllegalArgumentException e10) {
            throw new z0(e10);
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
        while ((i10 & (-128)) != 0) {
            try {
                this.buffer.put((byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            } catch (BufferOverflowException e2) {
                throw new z0(e2);
            }
        }
        this.buffer.put((byte) i10);
    }

    @Override // com.google.protobuf.d1
    public void writeUInt64(int i10, long j3) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public void writeUInt64NoTag(long j3) throws IOException {
        while (((-128) & j3) != 0) {
            try {
                this.buffer.put((byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            } catch (BufferOverflowException e2) {
                throw new z0(e2);
            }
        }
        this.buffer.put((byte) j3);
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

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.buffer.put(bArr, i10, i11);
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(e2);
        } catch (BufferOverflowException e10) {
            throw new z0(e10);
        }
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
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            this.buffer.put(byteBuffer);
        } catch (BufferOverflowException e2) {
            throw new z0(e2);
        }
    }
}
