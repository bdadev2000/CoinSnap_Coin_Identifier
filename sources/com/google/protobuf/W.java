package com.google.protobuf;

/* loaded from: classes3.dex */
public abstract class W extends AbstractC1895e0 {
    final byte[] buffer;
    final int limit;
    int position;
    int totalBytesWritten;

    public W(int i9) {
        super();
        if (i9 >= 0) {
            byte[] bArr = new byte[Math.max(i9, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void buffer(byte b) {
        byte[] bArr = this.buffer;
        int i9 = this.position;
        this.position = i9 + 1;
        bArr[i9] = b;
        this.totalBytesWritten++;
    }

    public final void bufferFixed32NoTag(int i9) {
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
        this.totalBytesWritten += 4;
    }

    public final void bufferFixed64NoTag(long j7) {
        byte[] bArr = this.buffer;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        bArr[i9] = (byte) (j7 & 255);
        int i11 = i9 + 2;
        this.position = i11;
        bArr[i10] = (byte) ((j7 >> 8) & 255);
        int i12 = i9 + 3;
        this.position = i12;
        bArr[i11] = (byte) ((j7 >> 16) & 255);
        int i13 = i9 + 4;
        this.position = i13;
        bArr[i12] = (byte) (255 & (j7 >> 24));
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
        this.totalBytesWritten += 8;
    }

    public final void bufferInt32NoTag(int i9) {
        if (i9 >= 0) {
            bufferUInt32NoTag(i9);
        } else {
            bufferUInt64NoTag(i9);
        }
    }

    public final void bufferTag(int i9, int i10) {
        bufferUInt32NoTag(Y5.makeTag(i9, i10));
    }

    public final void bufferUInt32NoTag(int i9) {
        boolean z8;
        z8 = AbstractC1895e0.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z8) {
            long j7 = this.position;
            while ((i9 & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                C5.putByte(bArr, i10, (byte) ((i9 & 127) | 128));
                i9 >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            C5.putByte(bArr2, i11, (byte) i9);
            this.totalBytesWritten += (int) (this.position - j7);
            return;
        }
        while ((i9 & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr3[i12] = (byte) ((i9 & 127) | 128);
            this.totalBytesWritten++;
            i9 >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i13 = this.position;
        this.position = i13 + 1;
        bArr4[i13] = (byte) i9;
        this.totalBytesWritten++;
    }

    public final void bufferUInt64NoTag(long j7) {
        boolean z8;
        z8 = AbstractC1895e0.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z8) {
            long j9 = this.position;
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
            this.totalBytesWritten += (int) (this.position - j9);
            return;
        }
        while ((j7 & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr3[i11] = (byte) ((((int) j7) & 127) | 128);
            this.totalBytesWritten++;
            j7 >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i12 = this.position;
        this.position = i12 + 1;
        bArr4[i12] = (byte) j7;
        this.totalBytesWritten++;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final int getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    @Override // com.google.protobuf.AbstractC1895e0
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
