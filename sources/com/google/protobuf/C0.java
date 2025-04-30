package com.google.protobuf;

/* loaded from: classes3.dex */
public final class C0 implements X2 {
    static final X2 INSTANCE = new C0();

    private C0() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (D0.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
