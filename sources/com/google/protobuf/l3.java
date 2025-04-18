package com.google.protobuf;

/* loaded from: classes4.dex */
public final class l3 implements w2 {
    final z3 enumTypeMap;
    final boolean isPacked;
    final boolean isRepeated;
    final int number;
    final t9 type;

    public l3(z3 z3Var, int i10, t9 t9Var, boolean z10, boolean z11) {
        this.enumTypeMap = z3Var;
        this.number = i10;
        this.type = t9Var;
        this.isRepeated = z10;
        this.isPacked = z11;
    }

    @Override // com.google.protobuf.w2
    public z3 getEnumType() {
        return this.enumTypeMap;
    }

    @Override // com.google.protobuf.w2
    public u9 getLiteJavaType() {
        return this.type.getJavaType();
    }

    @Override // com.google.protobuf.w2
    public t9 getLiteType() {
        return this.type;
    }

    @Override // com.google.protobuf.w2
    public int getNumber() {
        return this.number;
    }

    @Override // com.google.protobuf.w2
    public n5 internalMergeFrom(n5 n5Var, o5 o5Var) {
        return ((h3) n5Var).mergeFrom((o3) o5Var);
    }

    @Override // com.google.protobuf.w2
    public boolean isPacked() {
        return this.isPacked;
    }

    @Override // com.google.protobuf.w2
    public boolean isRepeated() {
        return this.isRepeated;
    }

    @Override // java.lang.Comparable
    public int compareTo(l3 l3Var) {
        return this.number - l3Var.number;
    }
}
