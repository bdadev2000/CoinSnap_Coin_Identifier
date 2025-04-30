package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum d {
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");

    public final String b;

    d(String str) {
        this.b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        return (d[]) Arrays.copyOf(values(), 4);
    }
}
