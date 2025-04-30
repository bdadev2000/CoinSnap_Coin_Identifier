package com.google.protobuf;

/* loaded from: classes3.dex */
public final class Q2 extends D2 implements R2 {
    public /* synthetic */ Q2(P2 p2) {
        this();
    }

    public Q2 clearValue() {
        copyOnWrite();
        Int64Value.access$200((Int64Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.R2
    public long getValue() {
        return ((Int64Value) this.instance).getValue();
    }

    public Q2 setValue(long j7) {
        copyOnWrite();
        Int64Value.access$100((Int64Value) this.instance, j7);
        return this;
    }

    private Q2() {
        super(Int64Value.access$000());
    }
}
