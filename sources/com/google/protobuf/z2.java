package com.google.protobuf;

/* loaded from: classes4.dex */
public enum z2 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    z2(boolean z10) {
        this.isList = z10;
    }

    public boolean isList() {
        return this.isList;
    }
}
