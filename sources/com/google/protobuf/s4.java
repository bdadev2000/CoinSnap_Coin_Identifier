package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public interface s4 extends r6 {
    void add(h0 h0Var);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends h0> collection);

    List<byte[]> asByteArrayList();

    @Override // com.google.protobuf.r6
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i10);

    h0 getByteString(int i10);

    Object getRaw(int i10);

    List<?> getUnderlyingElements();

    s4 getUnmodifiableView();

    void mergeFrom(s4 s4Var);

    void set(int i10, h0 h0Var);

    void set(int i10, byte[] bArr);
}
