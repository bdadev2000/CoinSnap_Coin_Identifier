package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum r {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR("error");

    public final String b;

    r(String str) {
        this.b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static r[] valuesCustom() {
        return (r[]) Arrays.copyOf(values(), 3);
    }
}
