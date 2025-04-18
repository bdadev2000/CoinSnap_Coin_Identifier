package com.google.protobuf;

/* loaded from: classes4.dex */
public final class i1 extends h3 implements j1 {
    public /* synthetic */ i1(h1 h1Var) {
        this();
    }

    public i1 clearValue() {
        copyOnWrite();
        DoubleValue.access$200((DoubleValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.j1
    public double getValue() {
        return ((DoubleValue) this.instance).getValue();
    }

    public i1 setValue(double d10) {
        copyOnWrite();
        DoubleValue.access$100((DoubleValue) this.instance, d10);
        return this;
    }

    private i1() {
        super(DoubleValue.access$000());
    }
}
