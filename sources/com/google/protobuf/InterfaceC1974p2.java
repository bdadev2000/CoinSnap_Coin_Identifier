package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1974p2 extends O3 {
    EnumC1904f2 getCardinality();

    int getCardinalityValue();

    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    String getDefaultValue();

    H getDefaultValueBytes();

    String getJsonName();

    H getJsonNameBytes();

    EnumC1925i2 getKind();

    int getKindValue();

    String getName();

    H getNameBytes();

    int getNumber();

    int getOneofIndex();

    Option getOptions(int i9);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    H getTypeUrlBytes();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
