package com.google.protobuf;

/* renamed from: com.google.protobuf.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1903f1 extends D2 implements InterfaceC1910g1 {
    public /* synthetic */ C1903f1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1903f1 clearClientStreaming() {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).clearClientStreaming();
        return this;
    }

    public C1903f1 clearInputType() {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).clearInputType();
        return this;
    }

    public C1903f1 clearName() {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).clearName();
        return this;
    }

    public C1903f1 clearOptions() {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).clearOptions();
        return this;
    }

    public C1903f1 clearOutputType() {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).clearOutputType();
        return this;
    }

    public C1903f1 clearServerStreaming() {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).clearServerStreaming();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean getClientStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getClientStreaming();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public String getInputType() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getInputType();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public H getInputTypeBytes() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getInputTypeBytes();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public String getName() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public H getNameBytes() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public DescriptorProtos$MethodOptions getOptions() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getOptions();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public String getOutputType() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getOutputType();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public H getOutputTypeBytes() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getOutputTypeBytes();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean getServerStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).getServerStreaming();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasClientStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasClientStreaming();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasInputType() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasInputType();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasName() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasName();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasOptions() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasOptions();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasOutputType() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasOutputType();
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasServerStreaming() {
        return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasServerStreaming();
    }

    public C1903f1 mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).mergeOptions(descriptorProtos$MethodOptions);
        return this;
    }

    public C1903f1 setClientStreaming(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setClientStreaming(z8);
        return this;
    }

    public C1903f1 setInputType(String str) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setInputType(str);
        return this;
    }

    public C1903f1 setInputTypeBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setInputTypeBytes(h6);
        return this;
    }

    public C1903f1 setName(String str) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setName(str);
        return this;
    }

    public C1903f1 setNameBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setNameBytes(h6);
        return this;
    }

    public C1903f1 setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setOptions(descriptorProtos$MethodOptions);
        return this;
    }

    public C1903f1 setOutputType(String str) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setOutputType(str);
        return this;
    }

    public C1903f1 setOutputTypeBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setOutputTypeBytes(h6);
        return this;
    }

    public C1903f1 setServerStreaming(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setServerStreaming(z8);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1903f1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$MethodDescriptorProto r0 = com.google.protobuf.DescriptorProtos$MethodDescriptorProto.access$23300()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1903f1.<init>():void");
    }

    public C1903f1 setOptions(C1917h1 c1917h1) {
        copyOnWrite();
        ((DescriptorProtos$MethodDescriptorProto) this.instance).setOptions((DescriptorProtos$MethodOptions) c1917h1.build());
        return this;
    }
}
