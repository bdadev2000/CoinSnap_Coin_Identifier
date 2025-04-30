package com.google.protobuf;

/* loaded from: classes3.dex */
public final class F0 implements X2 {
    static final X2 INSTANCE = new F0();

    private F0() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (G0.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
