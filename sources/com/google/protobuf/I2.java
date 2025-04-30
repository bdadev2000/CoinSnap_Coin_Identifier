package com.google.protobuf;

/* loaded from: classes3.dex */
public final class I2 implements InterfaceC1994s2 {
    final W2 enumTypeMap;
    final boolean isPacked;
    final boolean isRepeated;
    final int number;
    final S5 type;

    public I2(W2 w2, int i9, S5 s5, boolean z8, boolean z9) {
        this.enumTypeMap = w2;
        this.number = i9;
        this.type = s5;
        this.isRepeated = z8;
        this.isPacked = z9;
    }

    @Override // com.google.protobuf.InterfaceC1994s2
    public W2 getEnumType() {
        return this.enumTypeMap;
    }

    @Override // com.google.protobuf.InterfaceC1994s2
    public T5 getLiteJavaType() {
        return this.type.getJavaType();
    }

    @Override // com.google.protobuf.InterfaceC1994s2
    public S5 getLiteType() {
        return this.type;
    }

    @Override // com.google.protobuf.InterfaceC1994s2
    public int getNumber() {
        return this.number;
    }

    @Override // com.google.protobuf.InterfaceC1994s2
    public M3 internalMergeFrom(M3 m32, N3 n32) {
        return ((D2) m32).mergeFrom((L2) n32);
    }

    @Override // com.google.protobuf.InterfaceC1994s2
    public boolean isPacked() {
        return this.isPacked;
    }

    @Override // com.google.protobuf.InterfaceC1994s2
    public boolean isRepeated() {
        return this.isRepeated;
    }

    @Override // java.lang.Comparable
    public int compareTo(I2 i22) {
        return this.number - i22.number;
    }
}
