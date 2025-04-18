package com.google.protobuf;

/* loaded from: classes4.dex */
public final class z7 implements a4 {
    static final a4 INSTANCE = new z7();

    private z7() {
    }

    @Override // com.google.protobuf.a4
    public boolean isInRange(int i10) {
        return a8.forNumber(i10) != null;
    }
}
