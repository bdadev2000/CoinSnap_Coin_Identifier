package com.google.protobuf;

/* loaded from: classes4.dex */
public final class q extends h3 implements r {
    public /* synthetic */ q(p pVar) {
        this();
    }

    public q clearValue() {
        copyOnWrite();
        BoolValue.access$200((BoolValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.r
    public boolean getValue() {
        return ((BoolValue) this.instance).getValue();
    }

    public q setValue(boolean z10) {
        copyOnWrite();
        BoolValue.access$100((BoolValue) this.instance, z10);
        return this;
    }

    private q() {
        super(BoolValue.access$000());
    }
}
