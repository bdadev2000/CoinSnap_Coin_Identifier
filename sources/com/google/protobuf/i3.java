package com.google.protobuf;

/* loaded from: classes4.dex */
public final class i3 extends d {
    private final o3 defaultInstance;

    public i3(o3 o3Var) {
        this.defaultInstance = o3Var;
    }

    @Override // com.google.protobuf.d, com.google.protobuf.m6
    public o3 parsePartialFrom(r0 r0Var, a2 a2Var) throws h4 {
        return o3.parsePartialFrom(this.defaultInstance, r0Var, a2Var);
    }

    @Override // com.google.protobuf.d, com.google.protobuf.m6
    public o3 parsePartialFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4 {
        o3 parsePartialFrom;
        parsePartialFrom = o3.parsePartialFrom(this.defaultInstance, bArr, i10, i11, a2Var);
        return parsePartialFrom;
    }
}
