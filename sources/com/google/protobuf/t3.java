package com.google.protobuf;

/* loaded from: classes4.dex */
public final class t3 extends h3 implements u3 {
    public /* synthetic */ t3(s3 s3Var) {
        this();
    }

    public t3 clearValue() {
        copyOnWrite();
        Int64Value.access$200((Int64Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.u3
    public long getValue() {
        return ((Int64Value) this.instance).getValue();
    }

    public t3 setValue(long j3) {
        copyOnWrite();
        Int64Value.access$100((Int64Value) this.instance, j3);
        return this;
    }

    private t3() {
        super(Int64Value.access$000());
    }
}
