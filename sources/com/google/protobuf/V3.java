package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface V3 extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    String getName();

    H getNameBytes();

    Option getOptions(int i9);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    H getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    H getResponseTypeUrlBytes();

    Z4 getSyntax();

    int getSyntaxValue();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
