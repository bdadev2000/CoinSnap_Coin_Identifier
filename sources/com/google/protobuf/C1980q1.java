package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1980q1 extends D2 implements InterfaceC1986r1 {
    public /* synthetic */ C1980q1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1980q1 addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).addAllMethod(iterable);
        return this;
    }

    public C1980q1 addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(descriptorProtos$MethodDescriptorProto);
        return this;
    }

    public C1980q1 clearMethod() {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearMethod();
        return this;
    }

    public C1980q1 clearName() {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearName();
        return this;
    }

    public C1980q1 clearOptions() {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearOptions();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public DescriptorProtos$MethodDescriptorProto getMethod(int i9) {
        return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethod(i9);
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public int getMethodCount() {
        return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethodCount();
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return Collections.unmodifiableList(((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethodList());
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public String getName() {
        return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public H getNameBytes() {
        return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public DescriptorProtos$ServiceOptions getOptions() {
        return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getOptions();
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public boolean hasName() {
        return ((DescriptorProtos$ServiceDescriptorProto) this.instance).hasName();
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public boolean hasOptions() {
        return ((DescriptorProtos$ServiceDescriptorProto) this.instance).hasOptions();
    }

    public C1980q1 mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).mergeOptions(descriptorProtos$ServiceOptions);
        return this;
    }

    public C1980q1 removeMethod(int i9) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).removeMethod(i9);
        return this;
    }

    public C1980q1 setMethod(int i9, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).setMethod(i9, descriptorProtos$MethodDescriptorProto);
        return this;
    }

    public C1980q1 setName(String str) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).setName(str);
        return this;
    }

    public C1980q1 setNameBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).setNameBytes(h6);
        return this;
    }

    public C1980q1 setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).setOptions(descriptorProtos$ServiceOptions);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1980q1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$ServiceDescriptorProto r0 = com.google.protobuf.DescriptorProtos$ServiceDescriptorProto.access$21900()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1980q1.<init>():void");
    }

    public C1980q1 addMethod(int i9, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(i9, descriptorProtos$MethodDescriptorProto);
        return this;
    }

    public C1980q1 setMethod(int i9, C1903f1 c1903f1) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).setMethod(i9, (DescriptorProtos$MethodDescriptorProto) c1903f1.build());
        return this;
    }

    public C1980q1 setOptions(C1993s1 c1993s1) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).setOptions((DescriptorProtos$ServiceOptions) c1993s1.build());
        return this;
    }

    public C1980q1 addMethod(C1903f1 c1903f1) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod((DescriptorProtos$MethodDescriptorProto) c1903f1.build());
        return this;
    }

    public C1980q1 addMethod(int i9, C1903f1 c1903f1) {
        copyOnWrite();
        ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(i9, (DescriptorProtos$MethodDescriptorProto) c1903f1.build());
        return this;
    }
}
