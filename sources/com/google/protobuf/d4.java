package com.google.protobuf;

/* loaded from: classes4.dex */
public interface d4 extends e4 {
    void addLong(long j3);

    long getLong(int i10);

    @Override // com.google.protobuf.e4
    /* synthetic */ boolean isModifiable();

    @Override // com.google.protobuf.e4
    /* synthetic */ void makeImmutable();

    d4 mutableCopyWithCapacity(int i10);

    @Override // com.google.protobuf.e4, com.google.protobuf.d4
    /* synthetic */ e4 mutableCopyWithCapacity(int i10);

    long setLong(int i10, long j3);
}
