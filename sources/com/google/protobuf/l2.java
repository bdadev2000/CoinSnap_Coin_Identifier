package com.google.protobuf;

/* loaded from: classes4.dex */
public final class l2 implements a4 {
    static final a4 INSTANCE = new l2();

    private l2() {
    }

    @Override // com.google.protobuf.a4
    public boolean isInRange(int i10) {
        return m2.forNumber(i10) != null;
    }
}
