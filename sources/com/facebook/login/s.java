package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum s {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR("error");


    /* renamed from: b, reason: collision with root package name */
    public final String f11286b;

    s(String str) {
        this.f11286b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static s[] valuesCustom() {
        return (s[]) Arrays.copyOf(values(), 3);
    }
}
