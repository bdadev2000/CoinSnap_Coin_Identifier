package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface R0 extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    String getDependency(int i9);

    H getDependencyBytes(int i9);

    int getDependencyCount();

    List<String> getDependencyList();

    DescriptorProtos$EnumDescriptorProto getEnumType(int i9);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i9);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    DescriptorProtos$DescriptorProto getMessageType(int i9);

    int getMessageTypeCount();

    List<DescriptorProtos$DescriptorProto> getMessageTypeList();

    String getName();

    H getNameBytes();

    DescriptorProtos$FileOptions getOptions();

    String getPackage();

    H getPackageBytes();

    int getPublicDependency(int i9);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    DescriptorProtos$ServiceDescriptorProto getService(int i9);

    int getServiceCount();

    List<DescriptorProtos$ServiceDescriptorProto> getServiceList();

    DescriptorProtos$SourceCodeInfo getSourceCodeInfo();

    String getSyntax();

    H getSyntaxBytes();

    int getWeakDependency(int i9);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasName();

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
