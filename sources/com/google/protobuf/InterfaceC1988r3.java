package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1988r3 extends InterfaceC1983q4 {
    void add(H h6);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends H> collection);

    List<byte[]> asByteArrayList();

    @Override // com.google.protobuf.InterfaceC1983q4
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i9);

    H getByteString(int i9);

    Object getRaw(int i9);

    List<?> getUnderlyingElements();

    InterfaceC1988r3 getUnmodifiableView();

    void mergeFrom(InterfaceC1988r3 interfaceC1988r3);

    void set(int i9, H h6);

    void set(int i9, byte[] bArr);
}
