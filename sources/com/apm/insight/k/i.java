package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.l.p;
import com.apm.insight.l.q;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.s;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f5902a;

    private i(Context context) {
        this.f5902a = context;
    }

    public static void a(Context context) {
        a(context, 0);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.apm.insight.b.g.a(this.f5902a).a().f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.b(this.f5902a)) {
                b.a().a(p.b(this.f5902a));
            } else {
                NativeImpl.i();
            }
        } catch (Throwable th) {
            try {
                q.b(th);
                s.a().a(com.apm.insight.i.a().b(), com.apm.insight.entity.b.b());
                if (com.apm.insight.runtime.p.b().a() == null) {
                }
            } finally {
                s.a().a(com.apm.insight.i.a().b(), com.apm.insight.entity.b.b());
                if (com.apm.insight.runtime.p.b().a() != null) {
                    com.apm.insight.j.d.a(com.apm.insight.runtime.p.b().a(), this.f5902a).a();
                }
            }
        }
    }

    public static void a(Context context, int i9) {
        com.apm.insight.runtime.p.b().a(new i(context), i9);
    }

    public static boolean a() {
        return b.a().c() || !com.apm.insight.l.a.b(com.apm.insight.i.g());
    }
}
