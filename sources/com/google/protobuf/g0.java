package com.google.protobuf;

/* loaded from: classes4.dex */
public final class g0 implements a0 {
    private g0() {
    }

    public /* synthetic */ g0(v vVar) {
        this();
    }

    @Override // com.google.protobuf.a0
    public byte[] copyFrom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }
}
