package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f28967b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f28968a;

    private g() {
    }

    public static g b() {
        return f28967b;
    }

    public Context a() {
        return this.f28968a;
    }

    public void a(Context context) {
        this.f28968a = context != null ? context.getApplicationContext() : null;
    }
}
