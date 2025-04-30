package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class f {

    @SuppressLint({"StaticFieldLeak"})
    private static f b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f14527a;

    private f() {
    }

    public static f b() {
        return b;
    }

    public Context a() {
        return this.f14527a;
    }

    public void a(Context context) {
        this.f14527a = context != null ? context.getApplicationContext() : null;
    }
}
