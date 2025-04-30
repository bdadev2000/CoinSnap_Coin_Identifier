package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.List;

/* renamed from: com.google.protobuf.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1958n0 extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    DescriptorProtos$EnumDescriptorProto getEnumType(int i9);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i9);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    DescriptorProtos$DescriptorProto.ExtensionRange getExtensionRange(int i9);

    int getExtensionRangeCount();

    List<DescriptorProtos$DescriptorProto.ExtensionRange> getExtensionRangeList();

    DescriptorProtos$FieldDescriptorProto getField(int i9);

    int getFieldCount();

    List<DescriptorProtos$FieldDescriptorProto> getFieldList();

    String getName();

    H getNameBytes();

    DescriptorProtos$DescriptorProto getNestedType(int i9);

    int getNestedTypeCount();

    List<DescriptorProtos$DescriptorProto> getNestedTypeList();

    DescriptorProtos$OneofDescriptorProto getOneofDecl(int i9);

    int getOneofDeclCount();

    List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList();

    DescriptorProtos$MessageOptions getOptions();

    String getReservedName(int i9);

    H getReservedNameBytes(int i9);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$DescriptorProto.ReservedRange getReservedRange(int i9);

    int getReservedRangeCount();

    List<DescriptorProtos$DescriptorProto.ReservedRange> getReservedRangeList();

    boolean hasName();

    boolean hasOptions();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
