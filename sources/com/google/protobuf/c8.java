package com.google.protobuf;

/* loaded from: classes4.dex */
public final class c8 implements d8 {
    final /* synthetic */ byte[] val$input;

    public c8(byte[] bArr) {
        this.val$input = bArr;
    }

    @Override // com.google.protobuf.d8
    public byte byteAt(int i10) {
        return this.val$input[i10];
    }

    @Override // com.google.protobuf.d8
    public int size() {
        return this.val$input.length;
    }
}
