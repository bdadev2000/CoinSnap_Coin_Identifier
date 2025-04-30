package com.google.protobuf;

/* loaded from: classes3.dex */
public final class W0 implements X2 {
    static final X2 INSTANCE = new W0();

    private W0() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (X0.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
