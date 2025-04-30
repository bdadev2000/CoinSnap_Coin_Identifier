package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2040z extends E {
    private static final long serialVersionUID = 1;
    private final int bytesLength;
    private final int bytesOffset;

    public C2040z(byte[] bArr, int i9, int i10) {
        super(bArr);
        H.checkRange(i9, i9 + i10, bArr.length);
        this.bytesOffset = i9;
        this.bytesLength = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.E, com.google.protobuf.H
    public byte byteAt(int i9) {
        H.checkIndex(i9, size());
        return this.bytes[this.bytesOffset + i9];
    }

    @Override // com.google.protobuf.E, com.google.protobuf.H
    public void copyToInternal(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i9, bArr, i10, i11);
    }

    @Override // com.google.protobuf.E
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // com.google.protobuf.E, com.google.protobuf.H
    public byte internalByteAt(int i9) {
        return this.bytes[this.bytesOffset + i9];
    }

    @Override // com.google.protobuf.E, com.google.protobuf.H
    public int size() {
        return this.bytesLength;
    }

    public Object writeReplace() {
        return H.wrap(toByteArray());
    }
}
