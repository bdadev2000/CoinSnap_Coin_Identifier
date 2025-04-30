package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import java.util.List;

/* renamed from: com.google.protobuf.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1985r0 extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    String getName();

    H getNameBytes();

    DescriptorProtos$EnumOptions getOptions();

    String getReservedName(int i9);

    H getReservedNameBytes(int i9);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$EnumDescriptorProto.EnumReservedRange getReservedRange(int i9);

    int getReservedRangeCount();

    List<DescriptorProtos$EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

    DescriptorProtos$EnumValueDescriptorProto getValue(int i9);

    int getValueCount();

    List<DescriptorProtos$EnumValueDescriptorProto> getValueList();

    boolean hasName();

    boolean hasOptions();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
