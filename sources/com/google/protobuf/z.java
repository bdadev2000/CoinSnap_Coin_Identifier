package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes4.dex */
public final class z extends e0 {
    private static final long serialVersionUID = 1;
    private final int bytesLength;
    private final int bytesOffset;

    public z(byte[] bArr, int i10, int i11) {
        super(bArr);
        h0.checkRange(i10, i10 + i11, bArr.length);
        this.bytesOffset = i10;
        this.bytesLength = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.e0, com.google.protobuf.h0
    public byte byteAt(int i10) {
        h0.checkIndex(i10, size());
        return this.bytes[this.bytesOffset + i10];
    }

    @Override // com.google.protobuf.e0, com.google.protobuf.h0
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.e0
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // com.google.protobuf.e0, com.google.protobuf.h0
    public byte internalByteAt(int i10) {
        return this.bytes[this.bytesOffset + i10];
    }

    @Override // com.google.protobuf.e0, com.google.protobuf.h0
    public int size() {
        return this.bytesLength;
    }

    public Object writeReplace() {
        return h0.wrap(toByteArray());
    }
}
