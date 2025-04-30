package com.google.protobuf;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1978q extends D2 implements r {
    public /* synthetic */ C1978q(AbstractC1971p abstractC1971p) {
        this();
    }

    public C1978q clearValue() {
        copyOnWrite();
        BoolValue.access$200((BoolValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.r
    public boolean getValue() {
        return ((BoolValue) this.instance).getValue();
    }

    public C1978q setValue(boolean z8) {
        copyOnWrite();
        BoolValue.access$100((BoolValue) this.instance, z8);
        return this;
    }

    private C1978q() {
        super(BoolValue.access$000());
    }
}
