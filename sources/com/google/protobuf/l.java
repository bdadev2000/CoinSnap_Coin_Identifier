package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface l extends p5 {
    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    Method getMethods(int i10);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int i10);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    h0 getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    a8 getSyntax();

    int getSyntaxValue();

    String getVersion();

    h0 getVersionBytes();

    boolean hasSourceContext();

    @Override // com.google.protobuf.p5
    /* synthetic */ boolean isInitialized();
}
