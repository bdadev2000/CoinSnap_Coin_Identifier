package com.google.protobuf;

/* renamed from: com.google.protobuf.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1970o5 extends D2 implements InterfaceC1977p5 {
    public /* synthetic */ C1970o5(AbstractC1963n5 abstractC1963n5) {
        this();
    }

    public C1970o5 clearValue() {
        copyOnWrite();
        UInt64Value.access$200((UInt64Value) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1977p5
    public long getValue() {
        return ((UInt64Value) this.instance).getValue();
    }

    public C1970o5 setValue(long j7) {
        copyOnWrite();
        UInt64Value.access$100((UInt64Value) this.instance, j7);
        return this;
    }

    private C1970o5() {
        super(UInt64Value.access$000());
    }
}
