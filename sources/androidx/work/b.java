package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b {
    public final ExecutorService a = a(false);

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f2178b = a(true);

    /* renamed from: c, reason: collision with root package name */
    public final c0 f2179c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.d f2180d;

    /* renamed from: e, reason: collision with root package name */
    public final kc.c f2181e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2182f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2183g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2184h;

    public b(d6.h hVar) {
        String str = d0.a;
        this.f2179c = new c0();
        this.f2180d = new z1.d();
        this.f2181e = new kc.c(12);
        this.f2182f = 4;
        this.f2183g = Integer.MAX_VALUE;
        this.f2184h = 20;
    }

    public static ExecutorService a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
    }
}
