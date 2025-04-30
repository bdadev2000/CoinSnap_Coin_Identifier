package com.google.protobuf;

/* loaded from: classes3.dex */
public final class N2 extends D2 implements O2 {
    public /* synthetic */ N2(M2 m2) {
        this();
    }

    public N2 clearValue() {
        copyOnWrite();
        Int32Value.access$200((Int32Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.O2
    public int getValue() {
        return ((Int32Value) this.instance).getValue();
    }

    public N2 setValue(int i9) {
        copyOnWrite();
        Int32Value.access$100((Int32Value) this.instance, i9);
        return this;
    }

    private N2() {
        super(Int32Value.access$000());
    }
}
