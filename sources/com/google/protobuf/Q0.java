package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Q0 extends D2 implements R0 {
    public /* synthetic */ Q0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public Q0 addAllDependency(Iterable<String> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addAllDependency(iterable);
        return this;
    }

    public Q0 addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addAllEnumType(iterable);
        return this;
    }

    public Q0 addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addAllExtension(iterable);
        return this;
    }

    public Q0 addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addAllMessageType(iterable);
        return this;
    }

    public Q0 addAllPublicDependency(Iterable<? extends Integer> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addAllPublicDependency(iterable);
        return this;
    }

    public Q0 addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addAllService(iterable);
        return this;
    }

    public Q0 addAllWeakDependency(Iterable<? extends Integer> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addAllWeakDependency(iterable);
        return this;
    }

    public Q0 addDependency(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addDependency(str);
        return this;
    }

    public Q0 addDependencyBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addDependencyBytes(h6);
        return this;
    }

    public Q0 addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public Q0 addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public Q0 addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(descriptorProtos$DescriptorProto);
        return this;
    }

    public Q0 addPublicDependency(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addPublicDependency(i9);
        return this;
    }

    public Q0 addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addService(descriptorProtos$ServiceDescriptorProto);
        return this;
    }

    public Q0 addWeakDependency(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addWeakDependency(i9);
        return this;
    }

    public Q0 clearDependency() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearDependency();
        return this;
    }

    public Q0 clearEnumType() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearEnumType();
        return this;
    }

    public Q0 clearExtension() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearExtension();
        return this;
    }

    public Q0 clearMessageType() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearMessageType();
        return this;
    }

    public Q0 clearName() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearName();
        return this;
    }

    public Q0 clearOptions() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearOptions();
        return this;
    }

    public Q0 clearPackage() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearPackage();
        return this;
    }

    public Q0 clearPublicDependency() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearPublicDependency();
        return this;
    }

    public Q0 clearService() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearService();
        return this;
    }

    public Q0 clearSourceCodeInfo() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearSourceCodeInfo();
        return this;
    }

    public Q0 clearSyntax() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearSyntax();
        return this;
    }

    public Q0 clearWeakDependency() {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).clearWeakDependency();
        return this;
    }

    @Override // com.google.protobuf.R0
    public String getDependency(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependency(i9);
    }

    @Override // com.google.protobuf.R0
    public H getDependencyBytes(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyBytes(i9);
    }

    @Override // com.google.protobuf.R0
    public int getDependencyCount() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyCount();
    }

    @Override // com.google.protobuf.R0
    public List<String> getDependencyList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyList());
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getEnumType(i9);
    }

    @Override // com.google.protobuf.R0
    public int getEnumTypeCount() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getEnumTypeCount();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getEnumTypeList());
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$FieldDescriptorProto getExtension(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getExtension(i9);
    }

    @Override // com.google.protobuf.R0
    public int getExtensionCount() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getExtensionCount();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getExtensionList());
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$DescriptorProto getMessageType(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getMessageType(i9);
    }

    @Override // com.google.protobuf.R0
    public int getMessageTypeCount() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getMessageTypeCount();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getMessageTypeList());
    }

    @Override // com.google.protobuf.R0
    public String getName() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getName();
    }

    @Override // com.google.protobuf.R0
    public H getNameBytes() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$FileOptions getOptions() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getOptions();
    }

    @Override // com.google.protobuf.R0
    public String getPackage() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getPackage();
    }

    @Override // com.google.protobuf.R0
    public H getPackageBytes() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getPackageBytes();
    }

    @Override // com.google.protobuf.R0
    public int getPublicDependency(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependency(i9);
    }

    @Override // com.google.protobuf.R0
    public int getPublicDependencyCount() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependencyCount();
    }

    @Override // com.google.protobuf.R0
    public List<Integer> getPublicDependencyList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependencyList());
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$ServiceDescriptorProto getService(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getService(i9);
    }

    @Override // com.google.protobuf.R0
    public int getServiceCount() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getServiceCount();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getServiceList());
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getSourceCodeInfo();
    }

    @Override // com.google.protobuf.R0
    public String getSyntax() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.R0
    public H getSyntaxBytes() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getSyntaxBytes();
    }

    @Override // com.google.protobuf.R0
    public int getWeakDependency(int i9) {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependency(i9);
    }

    @Override // com.google.protobuf.R0
    public int getWeakDependencyCount() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependencyCount();
    }

    @Override // com.google.protobuf.R0
    public List<Integer> getWeakDependencyList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependencyList());
    }

    @Override // com.google.protobuf.R0
    public boolean hasName() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).hasName();
    }

    @Override // com.google.protobuf.R0
    public boolean hasOptions() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).hasOptions();
    }

    @Override // com.google.protobuf.R0
    public boolean hasPackage() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).hasPackage();
    }

    @Override // com.google.protobuf.R0
    public boolean hasSourceCodeInfo() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).hasSourceCodeInfo();
    }

    @Override // com.google.protobuf.R0
    public boolean hasSyntax() {
        return ((DescriptorProtos$FileDescriptorProto) this.instance).hasSyntax();
    }

    public Q0 mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).mergeOptions(descriptorProtos$FileOptions);
        return this;
    }

    public Q0 mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).mergeSourceCodeInfo(descriptorProtos$SourceCodeInfo);
        return this;
    }

    public Q0 removeEnumType(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).removeEnumType(i9);
        return this;
    }

    public Q0 removeExtension(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).removeExtension(i9);
        return this;
    }

    public Q0 removeMessageType(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).removeMessageType(i9);
        return this;
    }

    public Q0 removeService(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).removeService(i9);
        return this;
    }

    public Q0 setDependency(int i9, String str) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setDependency(i9, str);
        return this;
    }

    public Q0 setEnumType(int i9, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setEnumType(i9, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public Q0 setExtension(int i9, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setExtension(i9, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public Q0 setMessageType(int i9, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setMessageType(i9, descriptorProtos$DescriptorProto);
        return this;
    }

    public Q0 setName(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setName(str);
        return this;
    }

    public Q0 setNameBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setNameBytes(h6);
        return this;
    }

    public Q0 setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setOptions(descriptorProtos$FileOptions);
        return this;
    }

    public Q0 setPackage(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setPackage(str);
        return this;
    }

    public Q0 setPackageBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setPackageBytes(h6);
        return this;
    }

    public Q0 setPublicDependency(int i9, int i10) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setPublicDependency(i9, i10);
        return this;
    }

    public Q0 setService(int i9, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setService(i9, descriptorProtos$ServiceDescriptorProto);
        return this;
    }

    public Q0 setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setSourceCodeInfo(descriptorProtos$SourceCodeInfo);
        return this;
    }

    public Q0 setSyntax(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setSyntax(str);
        return this;
    }

    public Q0 setSyntaxBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setSyntaxBytes(h6);
        return this;
    }

    public Q0 setWeakDependency(int i9, int i10) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setWeakDependency(i9, i10);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Q0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$FileDescriptorProto r0 = com.google.protobuf.DescriptorProtos$FileDescriptorProto.access$800()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Q0.<init>():void");
    }

    public Q0 addEnumType(int i9, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(i9, descriptorProtos$EnumDescriptorProto);
        return this;
    }

    public Q0 addExtension(int i9, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(i9, descriptorProtos$FieldDescriptorProto);
        return this;
    }

    public Q0 addMessageType(int i9, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(i9, descriptorProtos$DescriptorProto);
        return this;
    }

    public Q0 addService(int i9, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addService(i9, descriptorProtos$ServiceDescriptorProto);
        return this;
    }

    public Q0 setEnumType(int i9, C1965o0 c1965o0) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setEnumType(i9, (DescriptorProtos$EnumDescriptorProto) c1965o0.build());
        return this;
    }

    public Q0 setExtension(int i9, A0 a02) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setExtension(i9, (DescriptorProtos$FieldDescriptorProto) a02.build());
        return this;
    }

    public Q0 setMessageType(int i9, C1923i0 c1923i0) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setMessageType(i9, (DescriptorProtos$DescriptorProto) c1923i0.build());
        return this;
    }

    public Q0 setOptions(U0 u02) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setOptions((DescriptorProtos$FileOptions) u02.build());
        return this;
    }

    public Q0 setService(int i9, C1980q1 c1980q1) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setService(i9, (DescriptorProtos$ServiceDescriptorProto) c1980q1.build());
        return this;
    }

    public Q0 setSourceCodeInfo(C2007u1 c2007u1) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).setSourceCodeInfo((DescriptorProtos$SourceCodeInfo) c2007u1.build());
        return this;
    }

    public Q0 addEnumType(C1965o0 c1965o0) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType((DescriptorProtos$EnumDescriptorProto) c1965o0.build());
        return this;
    }

    public Q0 addExtension(A0 a02) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension((DescriptorProtos$FieldDescriptorProto) a02.build());
        return this;
    }

    public Q0 addMessageType(C1923i0 c1923i0) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType((DescriptorProtos$DescriptorProto) c1923i0.build());
        return this;
    }

    public Q0 addService(C1980q1 c1980q1) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addService((DescriptorProtos$ServiceDescriptorProto) c1980q1.build());
        return this;
    }

    public Q0 addEnumType(int i9, C1965o0 c1965o0) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(i9, (DescriptorProtos$EnumDescriptorProto) c1965o0.build());
        return this;
    }

    public Q0 addExtension(int i9, A0 a02) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(i9, (DescriptorProtos$FieldDescriptorProto) a02.build());
        return this;
    }

    public Q0 addMessageType(int i9, C1923i0 c1923i0) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(i9, (DescriptorProtos$DescriptorProto) c1923i0.build());
        return this;
    }

    public Q0 addService(int i9, C1980q1 c1980q1) {
        copyOnWrite();
        ((DescriptorProtos$FileDescriptorProto) this.instance).addService(i9, (DescriptorProtos$ServiceDescriptorProto) c1980q1.build());
        return this;
    }
}
