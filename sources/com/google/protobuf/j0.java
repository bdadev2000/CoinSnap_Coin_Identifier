package com.google.protobuf;

/* loaded from: classes4.dex */
public final class j0 extends h3 implements k0 {
    public /* synthetic */ j0(i0 i0Var) {
        this();
    }

    public j0 clearValue() {
        copyOnWrite();
        BytesValue.access$200((BytesValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.k0
    public h0 getValue() {
        return ((BytesValue) this.instance).getValue();
    }

    public j0 setValue(h0 h0Var) {
        copyOnWrite();
        BytesValue.access$100((BytesValue) this.instance, h0Var);
        return this;
    }

    private j0() {
        super(BytesValue.access$000());
    }
}
