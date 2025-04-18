package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface k8 extends p5 {
    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    Field getFields(int i10);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    h0 getNameBytes();

    String getOneofs(int i10);

    h0 getOneofsBytes(int i10);

    int getOneofsCount();

    List<String> getOneofsList();

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
