package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f12166b = new g();
    private Context a;

    private g() {
    }

    public static g b() {
        return f12166b;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
