package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.p;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static long f2983b;
    private final b a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2984c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f2985d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f2984c) {
                    return;
                }
                c.this.a.d();
                long unused = c.f2983b = SystemClock.uptimeMillis();
                f.a();
                p.b().a(c.this.f2985d, 500L);
                com.apm.insight.runtime.b.a(c.f2983b);
            }
        };
        this.f2985d = runnable;
        this.a = bVar;
        p.b().a(runnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f2983b <= 15000;
    }

    public void a() {
        if (this.f2984c) {
            return;
        }
        p.b().a(this.f2985d, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public void b() {
        this.f2984c = true;
    }
}
