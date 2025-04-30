package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum A {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public final String b;

    A(String str) {
        this.b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static A[] valuesCustom() {
        return (A[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
