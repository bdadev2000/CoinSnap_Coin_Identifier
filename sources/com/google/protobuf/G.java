package com.google.protobuf;

/* loaded from: classes3.dex */
public final class G implements A {
    private G() {
    }

    @Override // com.google.protobuf.A
    public byte[] copyFrom(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        return bArr2;
    }

    public /* synthetic */ G(C2012v c2012v) {
        this();
    }
}
