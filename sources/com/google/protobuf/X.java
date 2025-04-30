package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class X extends AbstractC1895e0 {
    private final byte[] buffer;
    private final int limit;
    private final int offset;
    private int position;

    public X(byte[] bArr, int i9, int i10) {
        super();
        if (bArr != null) {
            int i11 = i9 + i10;
            if ((i9 | i10 | (bArr.length - i11)) >= 0) {
                this.buffer = bArr;
                this.offset = i9;
                this.position = i9;
                this.limit = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void flush() {
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final int getTotalBytesWritten() {
        return this.position - this.offset;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final int spaceLeft() {
        return this.limit - this.position;
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public final void write(byte b) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i9 = this.position;
            this.position = i9 + 1;
            bArr[i9] = b;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeBool(int i9, boolean z8) throws IOException {
        writeTag(i9, 0);
        write(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeByteArray(int i9, byte[] bArr) throws IOException {
        writeByteArray(i9, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException {
        writeUInt32NoTag(i10);
        write(bArr, i9, i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException {
        writeTag(i9, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeBytes(int i9, H h6) throws IOException {
        writeTag(i9, 2);
        writeBytesNoTag(h6);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeBytesNoTag(H h6) throws IOException {
        writeUInt32NoTag(h6.size());
        h6.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeFixed32(int i9, int i10) throws IOException {
        writeTag(i9, 5);
        writeFixed32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeFixed32NoTag(int i9) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            int i11 = i10 + 1;
            this.position = i11;
            bArr[i10] = (byte) (i9 & 255);
            int i12 = i10 + 2;
            this.position = i12;
            bArr[i11] = (byte) ((i9 >> 8) & 255);
            int i13 = i10 + 3;
            this.position = i13;
            bArr[i12] = (byte) ((i9 >> 16) & 255);
            this.position = i10 + 4;
            bArr[i13] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeFixed64(int i9, long j7) throws IOException {
        writeTag(i9, 1);
        writeFixed64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeFixed64NoTag(long j7) throws IOException {
        try {
            byte[] bArr = this.buffer;
            int i9 = this.position;
            int i10 = i9 + 1;
            this.position = i10;
            bArr[i9] = (byte) (((int) j7) & 255);
            int i11 = i9 + 2;
            this.position = i11;
            bArr[i10] = (byte) (((int) (j7 >> 8)) & 255);
            int i12 = i9 + 3;
            this.position = i12;
            bArr[i11] = (byte) (((int) (j7 >> 16)) & 255);
            int i13 = i9 + 4;
            this.position = i13;
            bArr[i12] = (byte) (((int) (j7 >> 24)) & 255);
            int i14 = i9 + 5;
            this.position = i14;
            bArr[i13] = (byte) (((int) (j7 >> 32)) & 255);
            int i15 = i9 + 6;
            this.position = i15;
            bArr[i14] = (byte) (((int) (j7 >> 40)) & 255);
            int i16 = i9 + 7;
            this.position = i16;
            bArr[i15] = (byte) (((int) (j7 >> 48)) & 255);
            this.position = i9 + 8;
            bArr[i16] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeInt32(int i9, int i10) throws IOException {
        writeTag(i9, 0);
        writeInt32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeInt32NoTag(int i9) throws IOException {
        if (i9 >= 0) {
            writeUInt32NoTag(i9);
        } else {
            writeUInt64NoTag(i9);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public final void writeLazy(byte[] bArr, int i9, int i10) throws IOException {
        write(bArr, i9, i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeMessage(int i9, N3 n32) throws IOException {
        writeTag(i9, 2);
        writeMessageNoTag(n32);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeMessageNoTag(N3 n32) throws IOException {
        writeUInt32NoTag(n32.getSerializedSize());
        n32.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeMessageSetExtension(int i9, N3 n32) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i9);
        writeMessage(3, n32);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        write(duplicate);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeRawMessageSetExtension(int i9, H h6) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i9);
        writeBytes(3, h6);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeString(int i9, String str) throws IOException {
        writeTag(i9, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeStringNoTag(String str) throws IOException {
        int i9 = this.position;
        try {
            int computeUInt32SizeNoTag = AbstractC1895e0.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = AbstractC1895e0.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i10 = i9 + computeUInt32SizeNoTag2;
                this.position = i10;
                int encode = I5.encode(str, this.buffer, i10, spaceLeft());
                this.position = i9;
                writeUInt32NoTag((encode - i9) - computeUInt32SizeNoTag2);
                this.position = encode;
            } else {
                writeUInt32NoTag(I5.encodedLength(str));
                this.position = I5.encode(str, this.buffer, this.position, spaceLeft());
            }
        } catch (G5 e4) {
            this.position = i9;
            inefficientWriteStringNoTag(str, e4);
        } catch (IndexOutOfBoundsException e9) {
            throw new C1867a0(e9);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeTag(int i9, int i10) throws IOException {
        writeUInt32NoTag(Y5.makeTag(i9, i10));
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeUInt32(int i9, int i10) throws IOException {
        writeTag(i9, 0);
        writeUInt32NoTag(i10);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeUInt32NoTag(int i9) throws IOException {
        while ((i9 & (-128)) != 0) {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                bArr[i10] = (byte) ((i9 & 127) | 128);
                i9 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }
        byte[] bArr2 = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        bArr2[i11] = (byte) i9;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeUInt64(int i9, long j7) throws IOException {
        writeTag(i9, 0);
        writeUInt64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeUInt64NoTag(long j7) throws IOException {
        boolean z8;
        z8 = AbstractC1895e0.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z8 && spaceLeft() >= 10) {
            while ((j7 & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i9 = this.position;
                this.position = i9 + 1;
                C5.putByte(bArr, i9, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            C5.putByte(bArr2, i10, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr3[i11] = (byte) ((((int) j7) & 127) | 128);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }
        byte[] bArr4 = this.buffer;
        int i12 = this.position;
        this.position = i12 + 1;
        bArr4[i12] = (byte) j7;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException {
        writeTag(i9, 2);
        writeByteArrayNoTag(bArr, i10, i11);
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeMessage(int i9, N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        writeTag(i9, 2);
        writeUInt32NoTag(((AbstractC1880c) n32).getSerializedSize(interfaceC2038y4));
        interfaceC2038y4.writeTo(n32, this.wrapper);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final void writeMessageNoTag(N3 n32, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        writeUInt32NoTag(((AbstractC1880c) n32).getSerializedSize(interfaceC2038y4));
        interfaceC2038y4.writeTo(n32, this.wrapper);
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public final void write(byte[] bArr, int i9, int i10) throws IOException {
        try {
            System.arraycopy(bArr, i9, this.buffer, this.position, i10);
            this.position += i10;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i10)), e4);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public final void write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.buffer, this.position, remaining);
            this.position += remaining;
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)), e4);
        }
    }
}
