package com.google.protobuf;

/* loaded from: classes4.dex */
public final class m8 extends h3 implements n8 {
    public /* synthetic */ m8(l8 l8Var) {
        this();
    }

    public m8 clearValue() {
        copyOnWrite();
        UInt32Value.access$200((UInt32Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.n8
    public int getValue() {
        return ((UInt32Value) this.instance).getValue();
    }

    public m8 setValue(int i10) {
        copyOnWrite();
        UInt32Value.access$100((UInt32Value) this.instance, i10);
        return this;
    }

    private m8() {
        super(UInt32Value.access$000());
    }
}
