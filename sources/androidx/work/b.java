package androidx.work;

import j5.C2400c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import q4.C2645d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5195a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));
    public final ExecutorService b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final w f5196c;

    /* renamed from: d, reason: collision with root package name */
    public final L4.f f5197d;

    /* renamed from: e, reason: collision with root package name */
    public final C2400c f5198e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5199f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5200g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5201h;

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.work.w, java.lang.Object] */
    public b(C2645d c2645d) {
        String str = x.f5253a;
        this.f5196c = new Object();
        this.f5197d = new L4.f(16);
        this.f5198e = new C2400c(20);
        this.f5199f = 4;
        this.f5200g = Integer.MAX_VALUE;
        this.f5201h = 20;
    }
}
