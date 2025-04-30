package com.google.protobuf;

/* loaded from: classes3.dex */
public final class K0 implements X2 {
    static final X2 INSTANCE = new K0();

    private K0() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (L0.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
