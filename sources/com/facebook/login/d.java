package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum d {
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");


    /* renamed from: b, reason: collision with root package name */
    public final String f11196b;

    d(String str) {
        this.f11196b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        return (d[]) Arrays.copyOf(values(), 4);
    }
}
