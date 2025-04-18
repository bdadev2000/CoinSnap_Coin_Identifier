package s4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import eb.j;
import g4.b0;
import g4.g0;
import g4.k;
import g4.r;
import g4.v;
import h.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kf.h3;
import kotlin.jvm.internal.Intrinsics;
import w4.m;

/* loaded from: classes.dex */
public final class h implements c, t4.d, g {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public boolean A;
    public final RuntimeException B;
    public int C;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.d f24212b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24213c;

    /* renamed from: d, reason: collision with root package name */
    public final e f24214d;

    /* renamed from: e, reason: collision with root package name */
    public final d f24215e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f24216f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.g f24217g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f24218h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f24219i;

    /* renamed from: j, reason: collision with root package name */
    public final a f24220j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24221k;

    /* renamed from: l, reason: collision with root package name */
    public final int f24222l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.h f24223m;

    /* renamed from: n, reason: collision with root package name */
    public final t4.e f24224n;

    /* renamed from: o, reason: collision with root package name */
    public final List f24225o;

    /* renamed from: p, reason: collision with root package name */
    public final z1.d f24226p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f24227q;

    /* renamed from: r, reason: collision with root package name */
    public g0 f24228r;

    /* renamed from: s, reason: collision with root package name */
    public k f24229s;

    /* renamed from: t, reason: collision with root package name */
    public long f24230t;
    public volatile r u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f24231v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f24232w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f24233x;

    /* renamed from: y, reason: collision with root package name */
    public int f24234y;

    /* renamed from: z, reason: collision with root package name */
    public int f24235z;

    public h(Context context, com.bumptech.glide.g gVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.h hVar, t4.e eVar, ArrayList arrayList, d dVar, r rVar) {
        String str;
        z1.d dVar2 = a6.c.f252d;
        q0 q0Var = d6.g.f16894k;
        if (D) {
            str = String.valueOf(hashCode());
        } else {
            str = null;
        }
        this.a = str;
        this.f24212b = new x4.d();
        this.f24213c = obj;
        this.f24216f = context;
        this.f24217g = gVar;
        this.f24218h = obj2;
        this.f24219i = cls;
        this.f24220j = aVar;
        this.f24221k = i10;
        this.f24222l = i11;
        this.f24223m = hVar;
        this.f24224n = eVar;
        this.f24214d = null;
        this.f24225o = arrayList;
        this.f24215e = dVar;
        this.u = rVar;
        this.f24226p = dVar2;
        this.f24227q = q0Var;
        this.C = 1;
        if (this.B == null && ((Map) gVar.f9670h.f20640c).containsKey(com.bumptech.glide.d.class)) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // s4.c
    public final boolean a() {
        boolean z10;
        synchronized (this.f24213c) {
            if (this.C == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void b() {
        if (!this.A) {
            this.f24212b.a();
            this.f24224n.h(this);
            k kVar = this.f24229s;
            if (kVar != null) {
                synchronized (((r) kVar.f18103c)) {
                    ((v) kVar.a).h((g) kVar.f18102b);
                }
                this.f24229s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable c() {
        int i10;
        if (this.f24232w == null) {
            a aVar = this.f24220j;
            Drawable drawable = aVar.f24190i;
            this.f24232w = drawable;
            if (drawable == null && (i10 = aVar.f24191j) > 0) {
                this.f24232w = e(i10);
            }
        }
        return this.f24232w;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:11:0x0013, B:13:0x001b, B:14:0x001f, B:16:0x0023, B:21:0x002f, B:22:0x0038, B:23:0x003a, B:30:0x0046, B:31:0x004d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // s4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f24213c
            monitor-enter(r0)
            boolean r1 = r5.A     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L46
            x4.d r1 = r5.f24212b     // Catch: java.lang.Throwable -> L4e
            r1.a()     // Catch: java.lang.Throwable -> L4e
            int r1 = r5.C     // Catch: java.lang.Throwable -> L4e
            r2 = 6
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return
        L13:
            r5.b()     // Catch: java.lang.Throwable -> L4e
            g4.g0 r1 = r5.f24228r     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L1e
            r5.f24228r = r3     // Catch: java.lang.Throwable -> L4e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            s4.d r3 = r5.f24215e     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2c
            boolean r3 = r3.c(r5)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            t4.e r3 = r5.f24224n     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r4 = r5.c()     // Catch: java.lang.Throwable -> L4e
            r3.f(r4)     // Catch: java.lang.Throwable -> L4e
        L38:
            r5.C = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L45
            g4.r r0 = r5.u
            r0.getClass()
            g4.r.e(r1)
        L45:
            return
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.h.clear():void");
    }

    public final boolean d() {
        d dVar = this.f24215e;
        return dVar == null || !dVar.getRoot().a();
    }

    public final Drawable e(int i10) {
        Resources.Theme theme = this.f24220j.f24203w;
        Context context = this.f24216f;
        if (theme == null) {
            theme = context.getTheme();
        }
        return com.facebook.internal.i.u(context, context, i10, theme);
    }

    @Override // s4.c
    public final boolean f() {
        boolean z10;
        synchronized (this.f24213c) {
            if (this.C == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // s4.c
    public final boolean g() {
        boolean z10;
        synchronized (this.f24213c) {
            if (this.C == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // s4.c
    public final boolean h(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.h hVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.h hVar2;
        int i15;
        boolean equals;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f24213c) {
            i10 = this.f24221k;
            i11 = this.f24222l;
            obj = this.f24218h;
            cls = this.f24219i;
            aVar = this.f24220j;
            hVar = this.f24223m;
            List list = this.f24225o;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        h hVar3 = (h) cVar;
        synchronized (hVar3.f24213c) {
            i13 = hVar3.f24221k;
            i14 = hVar3.f24222l;
            obj2 = hVar3.f24218h;
            cls2 = hVar3.f24219i;
            aVar2 = hVar3.f24220j;
            hVar2 = hVar3.f24223m;
            List list2 = hVar3.f24225o;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = m.a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && aVar.equals(aVar2) && hVar == hVar2 && i12 == i15) {
                return true;
            }
        }
        return false;
    }

    public final void i(String str) {
        StringBuilder n10 = j.n(str, " this: ");
        n10.append(this.a);
        Log.v("GlideRequest", n10.toString());
    }

    @Override // s4.c
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f24213c) {
            int i10 = this.C;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // s4.c
    public final void j() {
        int i10;
        synchronized (this.f24213c) {
            try {
                if (!this.A) {
                    this.f24212b.a();
                    int i11 = w4.g.f26732b;
                    this.f24230t = SystemClock.elapsedRealtimeNanos();
                    int i12 = 3;
                    if (this.f24218h == null) {
                        if (m.h(this.f24221k, this.f24222l)) {
                            this.f24234y = this.f24221k;
                            this.f24235z = this.f24222l;
                        }
                        if (this.f24233x == null) {
                            a aVar = this.f24220j;
                            Drawable drawable = aVar.f24198q;
                            this.f24233x = drawable;
                            if (drawable == null && (i10 = aVar.f24199r) > 0) {
                                this.f24233x = e(i10);
                            }
                        }
                        if (this.f24233x == null) {
                            i12 = 5;
                        }
                        k(new b0("Received null model"), i12);
                        return;
                    }
                    int i13 = this.C;
                    if (i13 != 2) {
                        boolean z10 = false;
                        if (i13 == 4) {
                            l(this.f24228r, e4.a.MEMORY_CACHE, false);
                            return;
                        }
                        List<e> list = this.f24225o;
                        if (list != null) {
                            for (e eVar : list) {
                            }
                        }
                        this.C = 3;
                        if (m.h(this.f24221k, this.f24222l)) {
                            n(this.f24221k, this.f24222l);
                        } else {
                            this.f24224n.b(this);
                        }
                        int i14 = this.C;
                        if (i14 == 2 || i14 == 3) {
                            d dVar = this.f24215e;
                            if (dVar == null || dVar.i(this)) {
                                z10 = true;
                            }
                            if (z10) {
                                this.f24224n.d(c());
                            }
                        }
                        if (D) {
                            i("finished run method in " + w4.g.a(this.f24230t));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(b0 b0Var, int i10) {
        int i11;
        int i12;
        this.f24212b.a();
        synchronized (this.f24213c) {
            b0Var.getClass();
            int i13 = this.f24217g.f9671i;
            if (i13 <= i10) {
                Log.w("Glide", "Load failed for [" + this.f24218h + "] with dimensions [" + this.f24234y + "x" + this.f24235z + "]", b0Var);
                if (i13 <= 4) {
                    b0Var.e();
                }
            }
            Drawable drawable = null;
            this.f24229s = null;
            this.C = 5;
            d dVar = this.f24215e;
            if (dVar != null) {
                dVar.d(this);
            }
            boolean z10 = true;
            this.A = true;
            try {
                List<e> list = this.f24225o;
                if (list != null) {
                    for (e eVar : list) {
                        d();
                        LottieAnimationView animLoading = ((h3) ((rg.a) eVar).a).f20778t;
                        Intrinsics.checkNotNullExpressionValue(animLoading, "animLoading");
                        com.bumptech.glide.e.V(animLoading);
                    }
                }
                e eVar2 = this.f24214d;
                if (eVar2 != null) {
                    d();
                    LottieAnimationView animLoading2 = ((h3) ((rg.a) eVar2).a).f20778t;
                    Intrinsics.checkNotNullExpressionValue(animLoading2, "animLoading");
                    com.bumptech.glide.e.V(animLoading2);
                }
                d dVar2 = this.f24215e;
                if (dVar2 != null && !dVar2.i(this)) {
                    z10 = false;
                }
                if (this.f24218h == null) {
                    if (this.f24233x == null) {
                        a aVar = this.f24220j;
                        Drawable drawable2 = aVar.f24198q;
                        this.f24233x = drawable2;
                        if (drawable2 == null && (i12 = aVar.f24199r) > 0) {
                            this.f24233x = e(i12);
                        }
                    }
                    drawable = this.f24233x;
                }
                if (drawable == null) {
                    if (this.f24231v == null) {
                        a aVar2 = this.f24220j;
                        Drawable drawable3 = aVar2.f24188g;
                        this.f24231v = drawable3;
                        if (drawable3 == null && (i11 = aVar2.f24189h) > 0) {
                            this.f24231v = e(i11);
                        }
                    }
                    drawable = this.f24231v;
                }
                if (drawable == null) {
                    drawable = c();
                }
                this.f24224n.g(drawable);
            } finally {
                this.A = false;
            }
        }
    }

    public final void l(g0 g0Var, e4.a aVar, boolean z10) {
        h hVar;
        Throwable th2;
        Object obj;
        String str;
        boolean z11;
        this.f24212b.a();
        g0 g0Var2 = null;
        try {
            synchronized (this.f24213c) {
                try {
                    this.f24229s = null;
                    if (g0Var == null) {
                        k(new b0("Expected to receive a Resource<R> with an object of " + this.f24219i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = g0Var.get();
                    try {
                        if (obj2 != null && this.f24219i.isAssignableFrom(obj2.getClass())) {
                            d dVar = this.f24215e;
                            if (dVar != null && !dVar.b(this)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (!z11) {
                                this.f24228r = null;
                                this.C = 4;
                                this.u.getClass();
                                r.e(g0Var);
                            }
                            m(g0Var, obj2, aVar);
                            return;
                        }
                        this.f24228r = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f24219i);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb2.append(obj);
                        sb2.append("{");
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(g0Var);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        k(new b0(sb2.toString()), 5);
                        this.u.getClass();
                        r.e(g0Var);
                    } catch (Throwable th3) {
                        th2 = th3;
                        g0Var2 = g0Var;
                        hVar = this;
                        while (true) {
                            try {
                                try {
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (g0Var2 != null) {
                                        hVar.u.getClass();
                                        r.e(g0Var2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                hVar = hVar;
                            }
                            th2 = th5;
                            hVar = hVar;
                        }
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    hVar = this;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            hVar = this;
        }
    }

    public final void m(g0 g0Var, Object obj, e4.a aVar) {
        d();
        this.C = 4;
        this.f24228r = g0Var;
        if (this.f24217g.f9671i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f24218h + " with size [" + this.f24234y + "x" + this.f24235z + "] in " + w4.g.a(this.f24230t) + " ms");
        }
        d dVar = this.f24215e;
        if (dVar != null) {
            dVar.e(this);
        }
        this.A = true;
        try {
            List list = this.f24225o;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    rg.a aVar2 = (rg.a) ((e) it.next());
                    aVar2.getClass();
                    LottieAnimationView animLoading = ((h3) aVar2.a).f20778t;
                    Intrinsics.checkNotNullExpressionValue(animLoading, "animLoading");
                    com.bumptech.glide.e.D(animLoading);
                }
            }
            e eVar = this.f24214d;
            if (eVar != null) {
                LottieAnimationView animLoading2 = ((h3) ((rg.a) eVar).a).f20778t;
                Intrinsics.checkNotNullExpressionValue(animLoading2, "animLoading");
                com.bumptech.glide.e.D(animLoading2);
            }
            this.f24226p.getClass();
            this.f24224n.c(obj);
        } finally {
            this.A = false;
        }
    }

    public final void n(int i10, int i11) {
        Object obj;
        int round;
        int i12 = i10;
        this.f24212b.a();
        Object obj2 = this.f24213c;
        synchronized (obj2) {
            try {
                boolean z10 = D;
                if (z10) {
                    i("Got onSizeReady in " + w4.g.a(this.f24230t));
                }
                if (this.C == 3) {
                    this.C = 2;
                    float f10 = this.f24220j.f24185c;
                    if (i12 != Integer.MIN_VALUE) {
                        i12 = Math.round(i12 * f10);
                    }
                    this.f24234y = i12;
                    if (i11 == Integer.MIN_VALUE) {
                        round = i11;
                    } else {
                        round = Math.round(f10 * i11);
                    }
                    this.f24235z = round;
                    if (z10) {
                        i("finished setup for calling load in " + w4.g.a(this.f24230t));
                    }
                    r rVar = this.u;
                    com.bumptech.glide.g gVar = this.f24217g;
                    Object obj3 = this.f24218h;
                    a aVar = this.f24220j;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                    try {
                        this.f24229s = rVar.a(gVar, obj3, aVar.f24195n, this.f24234y, this.f24235z, aVar.u, this.f24219i, this.f24223m, aVar.f24186d, aVar.f24201t, aVar.f24196o, aVar.A, aVar.f24200s, aVar.f24192k, aVar.f24205y, aVar.B, aVar.f24206z, this, this.f24227q);
                        if (this.C != 2) {
                            this.f24229s = null;
                        }
                        if (z10) {
                            i("finished onSizeReady in " + w4.g.a(this.f24230t));
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    @Override // s4.c
    public final void pause() {
        synchronized (this.f24213c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f24213c) {
            obj = this.f24218h;
            cls = this.f24219i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
