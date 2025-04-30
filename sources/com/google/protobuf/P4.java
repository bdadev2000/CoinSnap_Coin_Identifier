package com.google.protobuf;

/* loaded from: classes3.dex */
public final class P4 extends D2 implements Q4 {
    public /* synthetic */ P4(O4 o42) {
        this();
    }

    public P4 clearValue() {
        copyOnWrite();
        StringValue.access$200((StringValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.Q4
    public String getValue() {
        return ((StringValue) this.instance).getValue();
    }

    @Override // com.google.protobuf.Q4
    public H getValueBytes() {
        return ((StringValue) this.instance).getValueBytes();
    }

    public P4 setValue(String str) {
        copyOnWrite();
        StringValue.access$100((StringValue) this.instance, str);
        return this;
    }

    public P4 setValueBytes(H h6) {
        copyOnWrite();
        StringValue.access$300((StringValue) this.instance, h6);
        return this;
    }

    private P4() {
        super(StringValue.access$000());
    }
}
