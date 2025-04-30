package com.google.protobuf;

/* renamed from: com.google.protobuf.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1879b5 implements InterfaceC1886c5 {
    final /* synthetic */ byte[] val$input;

    public C1879b5(byte[] bArr) {
        this.val$input = bArr;
    }

    @Override // com.google.protobuf.InterfaceC1886c5
    public byte byteAt(int i9) {
        return this.val$input[i9];
    }

    @Override // com.google.protobuf.InterfaceC1886c5
    public int size() {
        return this.val$input.length;
    }
}
