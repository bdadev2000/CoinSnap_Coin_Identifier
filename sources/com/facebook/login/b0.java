package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum b0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* renamed from: b, reason: collision with root package name */
    public final String f11190b;

    b0(String str) {
        this.f11190b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static b0[] valuesCustom() {
        return (b0[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11190b;
    }
}
