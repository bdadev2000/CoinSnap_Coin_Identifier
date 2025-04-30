package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface N3 extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    InterfaceC1948l4 getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();

    M3 newBuilderForType();

    M3 toBuilder();

    byte[] toByteArray();

    H toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(AbstractC1895e0 abstractC1895e0) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
