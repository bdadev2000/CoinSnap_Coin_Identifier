package com.google.protobuf;

/* loaded from: classes3.dex */
public final class E2 extends AbstractC1887d {
    private final L2 defaultInstance;

    public E2(L2 l2) {
        this.defaultInstance = l2;
    }

    @Override // com.google.protobuf.AbstractC1887d, com.google.protobuf.InterfaceC1948l4
    public L2 parsePartialFrom(S s5, W1 w1) throws C1912g3 {
        return L2.parsePartialFrom(this.defaultInstance, s5, w1);
    }

    @Override // com.google.protobuf.AbstractC1887d, com.google.protobuf.InterfaceC1948l4
    public L2 parsePartialFrom(byte[] bArr, int i9, int i10, W1 w1) throws C1912g3 {
        L2 parsePartialFrom;
        parsePartialFrom = L2.parsePartialFrom(this.defaultInstance, bArr, i9, i10, w1);
        return parsePartialFrom;
    }
}
