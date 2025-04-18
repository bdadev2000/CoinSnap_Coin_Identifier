package com.google.protobuf;

/* loaded from: classes4.dex */
public abstract class v0 extends d1 {
    final byte[] buffer;
    final int limit;
    int position;
    int totalBytesWritten;

    public v0(int i10) {
        super();
        if (i10 >= 0) {
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void buffer(byte b3) {
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = b3;
        this.totalBytesWritten++;
    }

    public final void bufferFixed32NoTag(int i10) {
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
        this.totalBytesWritten += 4;
    }

    public final void bufferFixed64NoTag(long j3) {
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j3 & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j3 >> 8) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j3 >> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (255 & (j3 >> 24));
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j3 >> 32)) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (((int) (j3 >> 40)) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (((int) (j3 >> 48)) & 255);
        this.position = i17 + 1;
        bArr[i17] = (byte) (((int) (j3 >> 56)) & 255);
        this.totalBytesWritten += 8;
    }

    public final void bufferInt32NoTag(int i10) {
        if (i10 >= 0) {
            bufferUInt32NoTag(i10);
        } else {
            bufferUInt64NoTag(i10);
        }
    }

    public final void bufferTag(int i10, int i11) {
        bufferUInt32NoTag(z9.makeTag(i10, i11));
    }

    public final void bufferUInt32NoTag(int i10) {
        boolean z10;
        z10 = d1.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z10) {
            long j3 = this.position;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                d9.putByte(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            d9.putByte(bArr2, i12, (byte) i10);
            this.totalBytesWritten += (int) (this.position - j3);
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            bArr3[i13] = (byte) ((i10 & 127) | 128);
            this.totalBytesWritten++;
            i10 >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i14 = this.position;
        this.position = i14 + 1;
        bArr4[i14] = (byte) i10;
        this.totalBytesWritten++;
    }

    public final void bufferUInt64NoTag(long j3) {
        boolean z10;
        z10 = d1.HAS_UNSAFE_ARRAY_OPERATIONS;
        if (z10) {
            long j10 = this.position;
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
            this.totalBytesWritten += (int) (this.position - j10);
            return;
        }
        while ((j3 & (-128)) != 0) {
            byte[] bArr3 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr3[i12] = (byte) ((((int) j3) & 127) | 128);
            this.totalBytesWritten++;
            j3 >>>= 7;
        }
        byte[] bArr4 = this.buffer;
        int i13 = this.position;
        this.position = i13 + 1;
        bArr4[i13] = (byte) j3;
        this.totalBytesWritten++;
    }

    @Override // com.google.protobuf.d1
    public final int getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    @Override // com.google.protobuf.d1
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
