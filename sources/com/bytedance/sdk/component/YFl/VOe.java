package com.bytedance.sdk.component.YFl;

/* loaded from: classes.dex */
public enum VOe {
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
