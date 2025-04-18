package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public interface n5 extends p5, Cloneable {
    o5 build();

    o5 buildPartial();

    n5 clear();

    /* renamed from: clone */
    n5 mo4clone();

    @Override // com.google.protobuf.p5, com.google.protobuf.k3
    /* synthetic */ o5 getDefaultInstanceForType();

    @Override // com.google.protobuf.p5
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

    boolean mergeDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException;

    n5 mergeFrom(h0 h0Var) throws h4;

    n5 mergeFrom(h0 h0Var, a2 a2Var) throws h4;

    n5 mergeFrom(o5 o5Var);

    n5 mergeFrom(r0 r0Var) throws IOException;

    n5 mergeFrom(r0 r0Var, a2 a2Var) throws IOException;

    n5 mergeFrom(InputStream inputStream) throws IOException;

    n5 mergeFrom(InputStream inputStream, a2 a2Var) throws IOException;

    n5 mergeFrom(byte[] bArr) throws h4;

    n5 mergeFrom(byte[] bArr, int i10, int i11) throws h4;

    n5 mergeFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4;

    n5 mergeFrom(byte[] bArr, a2 a2Var) throws h4;
}
