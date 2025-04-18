package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class w0 extends d1 {
    private final byte[] buffer;
    private final int limit;
    private final int offset;
    private int position;

    public w0(byte[] bArr, int i10, int i11) {
        super();
        if (bArr != null) {
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                this.buffer = bArr;
                this.offset = i10;
                this.position = i10;
                this.limit = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.protobuf.d1
    public void flush() {
    }

    @Override // com.google.protobuf.d1
    public final int getTotalBytesWritten() {
        return this.position - this.offset;
    }

    @Override // com.google.protobuf.d1
    public final int spaceLeft() {
        return this.limit - this.position;
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public final void write(byte b3) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr[i10] = b3;
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
        }
    }

    @Override // com.google.protobuf.d1
    public final void writeBool(int i10, boolean z10) throws IOException {
        writeTag(i10, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.d1
    public final void writeByteArray(int i10, byte[] bArr) throws IOException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.d1
    public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.d1
    public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.d1
    public final void writeBytes(int i10, h0 h0Var) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(h0Var);
    }

    @Override // com.google.protobuf.d1
    public final void writeBytesNoTag(h0 h0Var) throws IOException {
        writeUInt32NoTag(h0Var.size());
        h0Var.writeTo(this);
    }

    @Override // com.google.protobuf.d1
    public final void writeFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public final void writeFixed32NoTag(int i10) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.position = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
        }
    }

    @Override // com.google.protobuf.d1
    public final void writeFixed64(int i10, long j3) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public final void writeFixed64NoTag(long j3) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j3) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j3 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j3 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j3 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j3 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j3 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j3 >> 48)) & 255);
            this.position = i17 + 1;
            bArr[i17] = (byte) (((int) (j3 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
        }
    }

    @Override // com.google.protobuf.d1
    public final void writeInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public final void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // com.google.protobuf.d1
    public final void writeMessage(int i10, o5 o5Var) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(o5Var);
    }

    @Override // com.google.protobuf.d1
    public final void writeMessageNoTag(o5 o5Var) throws IOException {
        writeUInt32NoTag(o5Var.getSerializedSize());
        o5Var.writeTo(this);
    }

    @Override // com.google.protobuf.d1
    public final void writeMessageSetExtension(int i10, o5 o5Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, o5Var);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.d1
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        write(duplicate);
    }

    @Override // com.google.protobuf.d1
    public final void writeRawMessageSetExtension(int i10, h0 h0Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeBytes(3, h0Var);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.d1
    public final void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.d1
    public final void writeStringNoTag(String str) throws IOException {
        int i10 = this.position;
        try {
            int computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = d1.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i11 = i10 + computeUInt32SizeNoTag2;
                this.position = i11;
                int encode = j9.encode(str, this.buffer, i11, spaceLeft());
                this.position = i10;
                writeUInt32NoTag((encode - i10) - computeUInt32SizeNoTag2);
                this.position = encode;
            } else {
                writeUInt32NoTag(j9.encodedLength(str));
                this.position = j9.encode(str, this.buffer, this.position, spaceLeft());
            }
        } catch (h9 e2) {
            this.position = i10;
            inefficientWriteStringNoTag(str, e2);
        } catch (IndexOutOfBoundsException e10) {
            throw new z0(e10);
        }
    }

    @Override // com.google.protobuf.d1
    public final void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag(z9.makeTag(i10, i11));
    }

    @Override // com.google.protobuf.d1
    public final void writeUInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    @Override // com.google.protobuf.d1
    public final void writeUInt32NoTag(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new z0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }
        byte[] bArr2 = this.buffer;
        int i12 = this.position;
        this.position = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.protobuf.d1
    public final void writeUInt64(int i10, long j3) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j3);
    }

    @Override // com.google.protobuf.d1
    public final void writeUInt64NoTag(long j3) throws IOException {
        boolean z10;
        z10 = d1.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z10 && spaceLeft() >= 10) {
            while ((j3 & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                d9.putByte(bArr, i10, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            d9.putByte(bArr2, i11, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                bArr3[i12] = (byte) ((((int) j3) & 127) | 128);
                j3 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new z0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }
        byte[] bArr4 = this.buffer;
        int i13 = this.position;
        this.position = i13 + 1;
        bArr4[i13] = (byte) j3;
    }

    @Override // com.google.protobuf.d1
    public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.d1
    public final void writeMessage(int i10, o5 o5Var, z6 z6Var) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((c) o5Var).getSerializedSize(z6Var));
        z6Var.writeTo(o5Var, this.wrapper);
    }

    @Override // com.google.protobuf.d1
    public final void writeMessageNoTag(o5 o5Var, z6 z6Var) throws IOException {
        writeUInt32NoTag(((c) o5Var).getSerializedSize(z6Var));
        z6Var.writeTo(o5Var, this.wrapper);
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.buffer, this.position, i11);
            this.position += i11;
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i11)), e2);
        }
    }

    @Override // com.google.protobuf.d1, com.google.protobuf.u
    public final void write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.buffer, this.position, remaining);
            this.position += remaining;
        } catch (IndexOutOfBoundsException e2) {
            throw new z0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)), e2);
        }
    }
}
