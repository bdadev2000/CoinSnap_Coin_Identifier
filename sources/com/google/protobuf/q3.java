package com.google.protobuf;

/* loaded from: classes4.dex */
public final class q3 extends h3 implements r3 {
    public /* synthetic */ q3(p3 p3Var) {
        this();
    }

    public q3 clearValue() {
        copyOnWrite();
        Int32Value.access$200((Int32Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.r3
    public int getValue() {
        return ((Int32Value) this.instance).getValue();
    }

    public q3 setValue(int i10) {
        copyOnWrite();
        Int32Value.access$100((Int32Value) this.instance, i10);
        return this;
    }

    private q3() {
        super(Int32Value.access$000());
    }
}
