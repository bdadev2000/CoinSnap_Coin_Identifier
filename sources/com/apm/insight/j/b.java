package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.i;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.s;
import java.util.Map;

/* loaded from: classes.dex */
public class b extends a {
    private static Runnable b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public void run() {
            p.b().a().removeCallbacks(this);
            p.b().a(new b(p.b().a(), 0L, 30000L, i.g()));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private Context f5845a;

    public b(Handler handler, long j7, long j9, Context context) {
        super(handler, j7, j9);
        this.f5845a = context;
    }

    public static void d() {
        p.b().a(b, 100L);
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, Object> map;
        try {
            map = i.a().c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (com.apm.insight.runtime.d.a(map)) {
                    a(c());
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        s.a().a(map, com.apm.insight.entity.b.b());
    }
}
