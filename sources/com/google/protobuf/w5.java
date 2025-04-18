package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface w5 extends p5 {
    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    String getName();

    h0 getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    h0 getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    h0 getResponseTypeUrlBytes();

    a8 getSyntax();

    int getSyntaxValue();

    @Override // com.google.protobuf.p5
    /* synthetic */ boolean isInitialized();
}
