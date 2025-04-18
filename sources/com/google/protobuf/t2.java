package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface t2 extends p5 {
    j2 getCardinality();

    int getCardinalityValue();

    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    String getDefaultValue();

    h0 getDefaultValueBytes();

    String getJsonName();

    h0 getJsonNameBytes();

    m2 getKind();

    int getKindValue();

    String getName();

    h0 getNameBytes();

    int getNumber();

    int getOneofIndex();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    h0 getTypeUrlBytes();

    @Override // com.google.protobuf.p5
    /* synthetic */ boolean isInitialized();
}
