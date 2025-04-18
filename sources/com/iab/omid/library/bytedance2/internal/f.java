package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f12260b = new f();
    private Context a;

    private f() {
    }

    public static f b() {
        return f12260b;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
