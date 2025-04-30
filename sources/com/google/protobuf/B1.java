package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import java.util.List;

/* loaded from: classes3.dex */
public interface B1 extends O3 {
    String getAggregateValue();

    H getAggregateValueBytes();

    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    double getDoubleValue();

    String getIdentifierValue();

    H getIdentifierValueBytes();

    DescriptorProtos$UninterpretedOption.NamePart getName(int i9);

    int getNameCount();

    List<DescriptorProtos$UninterpretedOption.NamePart> getNameList();

    long getNegativeIntValue();

    long getPositiveIntValue();

    H getStringValue();

    boolean hasAggregateValue();

    boolean hasDoubleValue();

    boolean hasIdentifierValue();

    boolean hasNegativeIntValue();

    boolean hasPositiveIntValue();

    boolean hasStringValue();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
