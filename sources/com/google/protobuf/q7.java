package com.google.protobuf;

/* loaded from: classes4.dex */
public final class q7 extends h3 implements r7 {
    public /* synthetic */ q7(p7 p7Var) {
        this();
    }

    public q7 clearValue() {
        copyOnWrite();
        StringValue.access$200((StringValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.r7
    public String getValue() {
        return ((StringValue) this.instance).getValue();
    }

    @Override // com.google.protobuf.r7
    public h0 getValueBytes() {
        return ((StringValue) this.instance).getValueBytes();
    }

    public q7 setValue(String str) {
        copyOnWrite();
        StringValue.access$100((StringValue) this.instance, str);
        return this;
    }

    public q7 setValueBytes(h0 h0Var) {
        copyOnWrite();
        StringValue.access$300((StringValue) this.instance, h0Var);
        return this;
    }

    private q7() {
        super(StringValue.access$000());
    }
}
