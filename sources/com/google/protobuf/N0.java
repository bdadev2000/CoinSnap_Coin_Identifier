package com.google.protobuf;

/* loaded from: classes3.dex */
public final class N0 implements X2 {
    static final X2 INSTANCE = new N0();

    private N0() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (O0.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
