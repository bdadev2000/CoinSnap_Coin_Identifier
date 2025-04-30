package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class g {

    @SuppressLint({"StaticFieldLeak"})
    private static g b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f14426a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.f14426a;
    }

    public void a(Context context) {
        this.f14426a = context != null ? context.getApplicationContext() : null;
    }
}
