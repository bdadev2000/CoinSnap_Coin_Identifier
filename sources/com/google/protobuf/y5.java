package com.google.protobuf;

/* loaded from: classes4.dex */
public final class y5 extends h3 implements z5 {
    public /* synthetic */ y5(x5 x5Var) {
        this();
    }

    public y5 clearName() {
        copyOnWrite();
        Mixin.access$200((Mixin) this.instance);
        return this;
    }

    public y5 clearRoot() {
        copyOnWrite();
        Mixin.access$500((Mixin) this.instance);
        return this;
    }

    @Override // com.google.protobuf.z5
    public String getName() {
        return ((Mixin) this.instance).getName();
    }

    @Override // com.google.protobuf.z5
    public h0 getNameBytes() {
        return ((Mixin) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.z5
    public String getRoot() {
        return ((Mixin) this.instance).getRoot();
    }

    @Override // com.google.protobuf.z5
    public h0 getRootBytes() {
        return ((Mixin) this.instance).getRootBytes();
    }

    public y5 setName(String str) {
        copyOnWrite();
        Mixin.access$100((Mixin) this.instance, str);
        return this;
    }

    public y5 setNameBytes(h0 h0Var) {
        copyOnWrite();
        Mixin.access$300((Mixin) this.instance, h0Var);
        return this;
    }

    public y5 setRoot(String str) {
        copyOnWrite();
        Mixin.access$400((Mixin) this.instance, str);
        return this;
    }

    public y5 setRootBytes(h0 h0Var) {
        copyOnWrite();
        Mixin.access$600((Mixin) this.instance, h0Var);
        return this;
    }

    private y5() {
        super(Mixin.access$000());
    }
}
