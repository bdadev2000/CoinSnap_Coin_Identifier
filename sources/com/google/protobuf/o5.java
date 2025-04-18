package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public interface o5 extends p5 {
    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    m6 getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.p5
    /* synthetic */ boolean isInitialized();

    n5 newBuilderForType();

    n5 toBuilder();

    byte[] toByteArray();

    h0 toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(d1 d1Var) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
