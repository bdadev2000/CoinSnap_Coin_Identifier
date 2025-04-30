package com.google.protobuf;

/* renamed from: com.google.protobuf.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2043z2 extends D2 implements A2 {
    public /* synthetic */ C2043z2(AbstractC2036y2 abstractC2036y2) {
        this();
    }

    public C2043z2 clearValue() {
        copyOnWrite();
        FloatValue.access$200((FloatValue) this.instance);
        return this;
    }

    @Override // com.google.protobuf.A2
    public float getValue() {
        return ((FloatValue) this.instance).getValue();
    }

    public C2043z2 setValue(float f9) {
        copyOnWrite();
        FloatValue.access$100((FloatValue) this.instance, f9);
        return this;
    }

    private C2043z2() {
        super(FloatValue.access$000());
    }
}
