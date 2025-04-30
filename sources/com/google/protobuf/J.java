package com.google.protobuf;

/* loaded from: classes3.dex */
public final class J extends D2 implements K {
    public /* synthetic */ J(I i9) {
        this();
    }

    public J clearValue() {
        copyOnWrite();
        BytesValue.access$200((BytesValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.K
    public H getValue() {
        return ((BytesValue) this.instance).getValue();
    }

    public J setValue(H h6) {
        copyOnWrite();
        BytesValue.access$100((BytesValue) this.instance, h6);
        return this;
    }

    private J() {
        super(BytesValue.access$000());
    }
}
