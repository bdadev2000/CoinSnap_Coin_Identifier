package com.google.protobuf;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1881c0 extends AbstractC1895e0 {
    private final ByteBuffer buffer;
    private final int initialPosition;
    private final ByteBuffer originalBuffer;

    public C1881c0(ByteBuffer byteBuffer) {
        super();
        this.originalBuffer = byteBuffer;
        this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.initialPosition = byteBuffer.position();
    }

    private void encode(String str) throws IOException {
        try {
            I5.encodeUtf8(str, this.buffer);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(e4);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void flush() {
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public int getTotalBytesWritten() {
        return this.buffer.position() - this.initialPosition;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public int spaceLeft() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void write(byte b) throws IOException {
        try {
            this.buffer.put(b);
        } catch (BufferOverflowException e4) {
            throw new C1867a0(e4);
        }
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
        try {
            this.buffer.putInt(i9);
        } catch (BufferOverflowException e4) {
            throw new C1867a0(e4);
        }
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed64(int i9, long j7) throws IOException {
        writeTag(i9, 1);
        writeFixed64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeFixed64NoTag(long j7) throws IOException {
        try {
            this.buffer.putLong(j7);
        } catch (BufferOverflowException e4) {
            throw new C1867a0(e4);
        }
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
        int position = this.buffer.position();
        try {
            int computeUInt32SizeNoTag = AbstractC1895e0.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = AbstractC1895e0.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int position2 = this.buffer.position() + computeUInt32SizeNoTag2;
                encode(str);
                int position3 = this.buffer.position();
                writeUInt32NoTag(position3 - position2);
            } else {
                writeUInt32NoTag(I5.encodedLength(str));
                encode(str);
            }
        } catch (G5 e4) {
            inefficientWriteStringNoTag(str, e4);
        } catch (IllegalArgumentException e9) {
            throw new C1867a0(e9);
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
        while ((i9 & (-128)) != 0) {
            try {
                this.buffer.put((byte) ((i9 & 127) | 128));
                i9 >>>= 7;
            } catch (BufferOverflowException e4) {
                throw new C1867a0(e4);
            }
        }
        this.buffer.put((byte) i9);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt64(int i9, long j7) throws IOException {
        writeTag(i9, 0);
        writeUInt64NoTag(j7);
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public void writeUInt64NoTag(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            try {
                this.buffer.put((byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            } catch (BufferOverflowException e4) {
                throw new C1867a0(e4);
            }
        }
        this.buffer.put((byte) j7);
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

    @Override // com.google.protobuf.AbstractC1895e0, com.google.protobuf.AbstractC2005u
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        try {
            this.buffer.put(bArr, i9, i10);
        } catch (IndexOutOfBoundsException e4) {
            throw new C1867a0(e4);
        } catch (BufferOverflowException e9) {
            throw new C1867a0(e9);
        }
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
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            this.buffer.put(byteBuffer);
        } catch (BufferOverflowException e4) {
            throw new C1867a0(e4);
        }
    }
}
