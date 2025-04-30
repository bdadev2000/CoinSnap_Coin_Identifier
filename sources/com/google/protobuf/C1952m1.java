package com.google.protobuf;

/* renamed from: com.google.protobuf.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1952m1 extends D2 implements InterfaceC1959n1 {
    public /* synthetic */ C1952m1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1952m1 clearName() {
        copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17200((DescriptorProtos$OneofDescriptorProto) this.instance);
        return this;
    }

    public C1952m1 clearOptions() {
        copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17600((DescriptorProtos$OneofDescriptorProto) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public String getName() {
        return ((DescriptorProtos$OneofDescriptorProto) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public H getNameBytes() {
        return ((DescriptorProtos$OneofDescriptorProto) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public DescriptorProtos$OneofOptions getOptions() {
        return ((DescriptorProtos$OneofDescriptorProto) this.instance).getOptions();
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public boolean hasName() {
        return ((DescriptorProtos$OneofDescriptorProto) this.instance).hasName();
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public boolean hasOptions() {
        return ((DescriptorProtos$OneofDescriptorProto) this.instance).hasOptions();
    }

    public C1952m1 mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17500((DescriptorProtos$OneofDescriptorProto) this.instance, descriptorProtos$OneofOptions);
        return this;
    }

    public C1952m1 setName(String str) {
        copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17100((DescriptorProtos$OneofDescriptorProto) this.instance, str);
        return this;
    }

    public C1952m1 setNameBytes(H h6) {
        copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17300((DescriptorProtos$OneofDescriptorProto) this.instance, h6);
        return this;
    }

    public C1952m1 setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17400((DescriptorProtos$OneofDescriptorProto) this.instance, descriptorProtos$OneofOptions);
        return this;
    }

    private C1952m1() {
        super(DescriptorProtos$OneofDescriptorProto.access$17000());
    }

    public C1952m1 setOptions(C1966o1 c1966o1) {
        copyOnWrite();
        DescriptorProtos$OneofDescriptorProto.access$17400((DescriptorProtos$OneofDescriptorProto) this.instance, (DescriptorProtos$OneofOptions) c1966o1.build());
        return this;
    }
}
