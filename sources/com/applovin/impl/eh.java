package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class eh {

    /* renamed from: a, reason: collision with root package name */
    private final String f7424a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7425c;

    public eh(String str, String str2, Context context) {
        this.f7424a = str.replace("android.permission.", "");
        this.b = str2;
        this.f7425c = x3.a(str, context);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f7424a;
    }

    public boolean c() {
        return this.f7425c;
    }
}
