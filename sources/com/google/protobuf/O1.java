package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface O1 extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    EnumValue getEnumvalue(int i9);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    H getNameBytes();

    Option getOptions(int i9);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Z4 getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
