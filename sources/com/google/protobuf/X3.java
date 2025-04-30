package com.google.protobuf;

/* loaded from: classes3.dex */
public final class X3 extends D2 implements Y3 {
    public /* synthetic */ X3(W3 w32) {
        this();
    }

    public X3 clearName() {
        copyOnWrite();
        Mixin.access$200((Mixin) this.instance);
        return this;
    }

    public X3 clearRoot() {
        copyOnWrite();
        Mixin.access$500((Mixin) this.instance);
        return this;
    }

    @Override // com.google.protobuf.Y3
    public String getName() {
        return ((Mixin) this.instance).getName();
    }

    @Override // com.google.protobuf.Y3
    public H getNameBytes() {
        return ((Mixin) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.Y3
    public String getRoot() {
        return ((Mixin) this.instance).getRoot();
    }

    @Override // com.google.protobuf.Y3
    public H getRootBytes() {
        return ((Mixin) this.instance).getRootBytes();
    }

    public X3 setName(String str) {
        copyOnWrite();
        Mixin.access$100((Mixin) this.instance, str);
        return this;
    }

    public X3 setNameBytes(H h6) {
        copyOnWrite();
        Mixin.access$300((Mixin) this.instance, h6);
        return this;
    }

    public X3 setRoot(String str) {
        copyOnWrite();
        Mixin.access$400((Mixin) this.instance, str);
        return this;
    }

    public X3 setRootBytes(H h6) {
        copyOnWrite();
        Mixin.access$600((Mixin) this.instance, h6);
        return this;
    }

    private X3() {
        super(Mixin.access$000());
    }
}
