package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class hh {

    /* renamed from: a, reason: collision with root package name */
    private final String f24314a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24315b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24316c;

    public hh(String str, String str2, Context context) {
        this.f24314a = str.replace("android.permission.", "");
        this.f24315b = str2;
        this.f24316c = z3.a(str, context);
    }

    public String a() {
        return this.f24315b;
    }

    public String b() {
        return this.f24314a;
    }

    public boolean c() {
        return this.f24316c;
    }
}
