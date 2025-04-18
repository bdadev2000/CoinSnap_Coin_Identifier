package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class eh {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4453b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4454c;

    public eh(String str, String str2, Context context) {
        this.a = str.replace("android.permission.", "");
        this.f4453b = str2;
        this.f4454c = x3.a(str, context);
    }

    public String a() {
        return this.f4453b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.f4454c;
    }
}
