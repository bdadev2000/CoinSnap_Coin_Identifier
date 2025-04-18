package com.google.protobuf;

/* loaded from: classes4.dex */
public final class p8 extends h3 implements q8 {
    public /* synthetic */ p8(o8 o8Var) {
        this();
    }

    public p8 clearValue() {
        copyOnWrite();
        UInt64Value.access$200((UInt64Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.q8
    public long getValue() {
        return ((UInt64Value) this.instance).getValue();
    }

    public p8 setValue(long j3) {
        copyOnWrite();
        UInt64Value.access$100((UInt64Value) this.instance, j3);
        return this;
    }

    private p8() {
        super(UInt64Value.access$000());
    }
}
