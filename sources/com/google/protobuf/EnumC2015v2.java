package com.google.protobuf;

/* renamed from: com.google.protobuf.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2015v2 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    EnumC2015v2(boolean z8) {
        this.isList = z8;
    }

    public boolean isList() {
        return this.isList;
    }
}
