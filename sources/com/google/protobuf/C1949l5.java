package com.google.protobuf;

/* renamed from: com.google.protobuf.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1949l5 extends D2 implements InterfaceC1956m5 {
    public /* synthetic */ C1949l5(AbstractC1942k5 abstractC1942k5) {
        this();
    }

    public C1949l5 clearValue() {
        copyOnWrite();
        UInt32Value.access$200((UInt32Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1956m5
    public int getValue() {
        return ((UInt32Value) this.instance).getValue();
    }

    public C1949l5 setValue(int i9) {
        copyOnWrite();
        UInt32Value.access$100((UInt32Value) this.instance, i9);
        return this;
    }

    private C1949l5() {
        super(UInt32Value.access$000());
    }
}
