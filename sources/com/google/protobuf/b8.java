package com.google.protobuf;

/* loaded from: classes4.dex */
public final class b8 implements d8 {
    final /* synthetic */ h0 val$input;

    public b8(h0 h0Var) {
        this.val$input = h0Var;
    }

    @Override // com.google.protobuf.d8
    public byte byteAt(int i10) {
        return this.val$input.byteAt(i10);
    }

    @Override // com.google.protobuf.d8
    public int size() {
        return this.val$input.size();
    }
}
