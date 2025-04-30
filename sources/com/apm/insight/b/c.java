package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.p;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;

/* loaded from: classes.dex */
public class c {
    private static long b;

    /* renamed from: a, reason: collision with root package name */
    private final b f5660a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5661c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f5662d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f5661c) {
                    return;
                }
                c.this.f5660a.d();
                long unused = c.b = SystemClock.uptimeMillis();
                f.a();
                p.b().a(c.this.f5662d, 500L);
                com.apm.insight.runtime.b.a(c.b);
            }
        };
        this.f5662d = runnable;
        this.f5660a = bVar;
        p.b().a(runnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - b <= 15000;
    }

    public void a() {
        if (this.f5661c) {
            return;
        }
        p.b().a(this.f5662d, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public void b() {
        this.f5661c = true;
    }
}
