package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public interface M3 extends O3, Cloneable {
    N3 build();

    N3 buildPartial();

    M3 clear();

    /* renamed from: clone */
    M3 mo1clone();

    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

    boolean mergeDelimitedFrom(InputStream inputStream, W1 w1) throws IOException;

    M3 mergeFrom(H h6) throws C1912g3;

    M3 mergeFrom(H h6, W1 w1) throws C1912g3;

    M3 mergeFrom(N3 n32);

    M3 mergeFrom(S s5) throws IOException;

    M3 mergeFrom(S s5, W1 w1) throws IOException;

    M3 mergeFrom(InputStream inputStream) throws IOException;

    M3 mergeFrom(InputStream inputStream, W1 w1) throws IOException;

    M3 mergeFrom(byte[] bArr) throws C1912g3;

    M3 mergeFrom(byte[] bArr, int i9, int i10) throws C1912g3;

    M3 mergeFrom(byte[] bArr, int i9, int i10, W1 w1) throws C1912g3;

    M3 mergeFrom(byte[] bArr, W1 w1) throws C1912g3;
}
