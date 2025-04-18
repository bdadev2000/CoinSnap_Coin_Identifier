package com.google.protobuf;

/* loaded from: classes4.dex */
public final class d3 extends h3 implements e3 {
    public /* synthetic */ d3(c3 c3Var) {
        this();
    }

    public d3 clearValue() {
        copyOnWrite();
        FloatValue.access$200((FloatValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.e3
    public float getValue() {
        return ((FloatValue) this.instance).getValue();
    }

    public d3 setValue(float f10) {
        copyOnWrite();
        FloatValue.access$100((FloatValue) this.instance, f10);
        return this;
    }

    private d3() {
        super(FloatValue.access$000());
    }
}
