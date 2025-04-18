package com.google.protobuf;

/* loaded from: classes4.dex */
public final class i2 implements a4 {
    static final a4 INSTANCE = new i2();

    private i2() {
    }

    @Override // com.google.protobuf.a4
    public boolean isInRange(int i10) {
        return j2.forNumber(i10) != null;
    }
}
