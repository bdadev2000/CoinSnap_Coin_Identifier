package com.google.protobuf;

/* renamed from: com.google.protobuf.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1872a5 implements InterfaceC1886c5 {
    final /* synthetic */ H val$input;

    public C1872a5(H h6) {
        this.val$input = h6;
    }

    @Override // com.google.protobuf.InterfaceC1886c5
    public byte byteAt(int i9) {
        return this.val$input.byteAt(i9);
    }

    @Override // com.google.protobuf.InterfaceC1886c5
    public int size() {
        return this.val$input.size();
    }
}
