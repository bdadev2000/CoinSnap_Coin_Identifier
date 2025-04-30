package com.google.protobuf;

/* renamed from: com.google.protobuf.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2006u0 extends D2 implements InterfaceC2013v0 {
    public /* synthetic */ C2006u0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C2006u0 clearName() {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).clearName();
        return this;
    }

    public C2006u0 clearNumber() {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).clearNumber();
        return this;
    }

    public C2006u0 clearOptions() {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).clearOptions();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public String getName() {
        return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public H getNameBytes() {
        return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public int getNumber() {
        return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getNumber();
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public DescriptorProtos$EnumValueOptions getOptions() {
        return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).getOptions();
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public boolean hasName() {
        return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).hasName();
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public boolean hasNumber() {
        return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).hasNumber();
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public boolean hasOptions() {
        return ((DescriptorProtos$EnumValueDescriptorProto) this.instance).hasOptions();
    }

    public C2006u0 mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).mergeOptions(descriptorProtos$EnumValueOptions);
        return this;
    }

    public C2006u0 setName(String str) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setName(str);
        return this;
    }

    public C2006u0 setNameBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setNameBytes(h6);
        return this;
    }

    public C2006u0 setNumber(int i9) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setNumber(i9);
        return this;
    }

    public C2006u0 setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setOptions(descriptorProtos$EnumValueOptions);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2006u0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto r0 = com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto.access$20900()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2006u0.<init>():void");
    }

    public C2006u0 setOptions(C2020w0 c2020w0) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueDescriptorProto) this.instance).setOptions((DescriptorProtos$EnumValueOptions) c2020w0.build());
        return this;
    }
}
