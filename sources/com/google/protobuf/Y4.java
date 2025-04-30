package com.google.protobuf;

/* loaded from: classes3.dex */
public final class Y4 implements X2 {
    static final X2 INSTANCE = new Y4();

    private Y4() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (Z4.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
