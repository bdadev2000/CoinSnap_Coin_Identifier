package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class g {
    private static volatile g a;

    /* renamed from: c, reason: collision with root package name */
    private static h f2995c;

    /* renamed from: b, reason: collision with root package name */
    private final b f2996b;

    private g(@NonNull Context context) {
        this.f2996b = new b(context);
        h hVar = new h(0);
        f2995c = hVar;
        hVar.b();
    }

    public static h b() {
        return f2995c;
    }

    public b a() {
        return this.f2996b;
    }

    public void c() {
        this.f2996b.a();
    }

    public void d() {
        this.f2996b.b();
    }

    public static g a(Context context) {
        if (a == null) {
            synchronized (g.class) {
                if (a == null) {
                    a = new g(context);
                }
            }
        }
        return a;
    }
}
