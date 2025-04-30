package com.bytedance.sdk.component.zp;

/* loaded from: classes.dex */
public enum yRU {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    @Override // java.lang.Enum
    public String toString() {
        if (this == PRIVATE) {
            return "private";
        }
        if (this == PROTECTED) {
            return "protected";
        }
        return "public";
    }
}
