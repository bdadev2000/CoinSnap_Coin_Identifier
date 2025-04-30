package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f5673a;

    /* renamed from: c, reason: collision with root package name */
    private static h f5674c;
    private final b b;

    private g(@NonNull Context context) {
        this.b = new b(context);
        h hVar = new h(0);
        f5674c = hVar;
        hVar.b();
    }

    public static h b() {
        return f5674c;
    }

    public b a() {
        return this.b;
    }

    public void c() {
        this.b.a();
    }

    public void d() {
        this.b.b();
    }

    public static g a(Context context) {
        if (f5673a == null) {
            synchronized (g.class) {
                try {
                    if (f5673a == null) {
                        f5673a = new g(context);
                    }
                } finally {
                }
            }
        }
        return f5673a;
    }
}
