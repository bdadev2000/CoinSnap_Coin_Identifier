package com.google.protobuf;

/* loaded from: classes3.dex */
public final class E1 extends D2 implements F1 {
    public /* synthetic */ E1(D1 d12) {
        this();
    }

    public E1 clearValue() {
        copyOnWrite();
        DoubleValue.access$200((DoubleValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.F1
    public double getValue() {
        return ((DoubleValue) this.instance).getValue();
    }

    public E1 setValue(double d2) {
        copyOnWrite();
        DoubleValue.access$100((DoubleValue) this.instance, d2);
        return this;
    }

    private E1() {
        super(DoubleValue.access$000());
    }
}
