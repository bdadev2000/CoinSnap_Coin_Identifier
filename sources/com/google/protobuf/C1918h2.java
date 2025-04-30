package com.google.protobuf;

/* renamed from: com.google.protobuf.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1918h2 implements X2 {
    static final X2 INSTANCE = new C1918h2();

    private C1918h2() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (EnumC1925i2.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
