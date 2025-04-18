package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface s1 extends p5 {
    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    EnumValue getEnumvalue(int i10);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    h0 getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    a8 getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();

    @Override // com.google.protobuf.p5
    /* synthetic */ boolean isInitialized();
}
