package com.applovin.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class tm {

    /* renamed from: o */
    private static final ExecutorService f27174o = Executors.newFixedThreadPool(4);

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f27175a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.n f27176b;

    /* renamed from: c */
    private final ScheduledThreadPoolExecutor f27177c;
    private final ScheduledThreadPoolExecutor d;
    private final ScheduledThreadPoolExecutor e;

    /* renamed from: f */
    private final ScheduledThreadPoolExecutor f27178f;

    /* renamed from: g */
    private final ScheduledThreadPoolExecutor f27179g;

    /* renamed from: h */
    private final ScheduledThreadPoolExecutor f27180h;

    /* renamed from: i */
    private final ScheduledThreadPoolExecutor f27181i;

    /* renamed from: j */
    private final Map f27182j = new HashMap();

    /* renamed from: k */
    private final List f27183k = new ArrayList(5);

    /* renamed from: l */
    private final Object f27184l = new Object();

    /* renamed from: m */
    private boolean f27185m;

    /* renamed from: n */
    private boolean f27186n;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27187a;

        static {
            int[] iArr = new int[b.values().length];
            f27187a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27187a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27187a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27187a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* loaded from: classes2.dex */
    public class c implements ThreadFactory {

        /* renamed from: a */
        private final String f27193a;

        /* loaded from: classes2.dex */
        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.n unused = tm.this.f27176b;
                if (com.applovin.impl.sdk.n.a()) {
                    tm.this.f27176b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        public c(String str) {
            this.f27193a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f27193a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) tm.this.f27175a.a(sj.U)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: a */
        private final com.applovin.impl.sdk.j f27196a;

        /* renamed from: b */
        private final String f27197b;

        /* renamed from: c */
        private final com.applovin.impl.sdk.n f27198c;
        private final yl d;

        /* renamed from: f */
        private final b f27199f;

        public d(com.applovin.impl.sdk.j jVar, yl ylVar, b bVar) {
            this.f27196a = jVar;
            this.f27198c = jVar.J();
            this.f27197b = ylVar.c();
            this.d = ylVar;
            this.f27199f = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.z3.a()     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.sdk.j r1 = r6.f27196a     // Catch: java.lang.Throwable -> L26
                boolean r1 = r1.x0()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L38
                com.applovin.impl.yl r1 = r6.d     // Catch: java.lang.Throwable -> L26
                boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L16
                goto L38
            L16:
                boolean r1 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L28
                com.applovin.impl.sdk.n r1 = r6.f27198c     // Catch: java.lang.Throwable -> L26
                java.lang.String r2 = r6.f27197b     // Catch: java.lang.Throwable -> L26
                java.lang.String r3 = "Task re-scheduled..."
                r1.d(r2, r3)     // Catch: java.lang.Throwable -> L26
                goto L28
            L26:
                r1 = move-exception
                goto L83
            L28:
                com.applovin.impl.sdk.j r1 = r6.f27196a     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.tm r1 = r1.j0()     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.yl r2 = r6.d     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.tm$b r3 = r6.f27199f     // Catch: java.lang.Throwable -> L26
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L26
                goto L5b
            L38:
                com.applovin.impl.yl r1 = r6.d     // Catch: java.lang.Throwable -> L26
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.sdk.j r3 = r6.f27196a     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.sj r4 = com.applovin.impl.sj.C     // Catch: java.lang.Throwable -> L26
                java.lang.Object r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L26
                java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L26
                long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L26
                java.util.concurrent.ScheduledFuture r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.yl r2 = r6.d     // Catch: java.lang.Throwable -> L26
                r2.run()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L5b
                r2 = 0
                r1.cancel(r2)     // Catch: java.lang.Throwable -> L26
            L5b:
                boolean r1 = com.applovin.impl.sdk.n.a()
                if (r1 == 0) goto Lc1
                com.applovin.impl.sdk.n r1 = r6.f27198c
                java.lang.String r2 = r6.f27197b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.tm$b r4 = r6.f27199f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.yl r0 = r6.d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
                goto Lc1
            L83:
                boolean r2 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> L93
                if (r2 == 0) goto L95
                com.applovin.impl.sdk.n r2 = r6.f27198c     // Catch: java.lang.Throwable -> L93
                java.lang.String r3 = r6.f27197b     // Catch: java.lang.Throwable -> L93
                java.lang.String r4 = "Task failed execution"
                r2.a(r3, r4, r1)     // Catch: java.lang.Throwable -> L93
                goto L95
            L93:
                r1 = move-exception
                goto Lc2
            L95:
                com.applovin.impl.yl r2 = r6.d     // Catch: java.lang.Throwable -> L93
                r2.a(r1)     // Catch: java.lang.Throwable -> L93
                boolean r1 = com.applovin.impl.sdk.n.a()
                if (r1 == 0) goto Lc1
                com.applovin.impl.sdk.n r1 = r6.f27198c
                java.lang.String r2 = r6.f27197b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.tm$b r4 = r6.f27199f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.yl r0 = r6.d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
            Lc1:
                return
            Lc2:
                boolean r2 = com.applovin.impl.sdk.n.a()
                if (r2 == 0) goto Le9
                com.applovin.impl.sdk.n r2 = r6.f27198c
                java.lang.String r3 = r6.f27197b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.tm$b r5 = r6.f27199f
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.yl r0 = r6.d
                java.lang.String r0 = r0.c()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.d(r3, r0)
            Le9:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.tm.d.run():void");
        }
    }

    public tm(com.applovin.impl.sdk.j jVar) {
        this.f27175a = jVar;
        this.f27176b = jVar.J();
        this.f27186n = ((Boolean) jVar.a(sj.X)).booleanValue();
        this.f27177c = b("auxiliary_operations", ((Integer) jVar.a(sj.S)).intValue());
        this.d = b("shared_thread_pool", ((Integer) jVar.a(sj.R)).intValue());
        this.e = b("core", ((Integer) jVar.a(sj.Y)).intValue());
        this.f27179g = b("caching", ((Integer) jVar.a(sj.Z)).intValue());
        this.f27180h = b("mediation", ((Integer) jVar.a(sj.f26903a0)).intValue());
        this.f27178f = b("timeout", ((Integer) jVar.a(sj.f26905b0)).intValue());
        this.f27181i = b("other", ((Integer) jVar.a(sj.f26908c0)).intValue());
    }

    public ExecutorService a() {
        return this.f27186n ? this.f27181i : this.f27177c;
    }

    public Executor c() {
        return this.f27186n ? this.e : this.d;
    }

    public boolean d() {
        return this.f27185m;
    }

    public void e() {
        synchronized (this.f27184l) {
            try {
                this.f27185m = true;
                for (d dVar : this.f27183k) {
                    a(dVar.d, dVar.f27199f);
                }
                this.f27183k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        synchronized (this.f27184l) {
            this.f27185m = false;
        }
    }

    public ExecutorService b() {
        return this.f27186n ? this.f27179g : f27174o;
    }

    public ExecutorService a(String str, int i2) {
        return Executors.newFixedThreadPool(i2, new c(str));
    }

    private boolean b(d dVar) {
        if (dVar.d.d()) {
            return false;
        }
        synchronized (this.f27184l) {
            try {
                if (this.f27185m) {
                    return false;
                }
                this.f27183k.add(dVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(yl ylVar, b bVar) {
        a(ylVar, bVar, 0L);
    }

    public void a(yl ylVar, b bVar, long j2) {
        a(ylVar, bVar, j2, false);
    }

    public void a(yl ylVar, b bVar, long j2, boolean z2) {
        if (ylVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j2 >= 0) {
            d dVar = new d(this.f27175a, ylVar, bVar);
            if (!b(dVar)) {
                a(dVar, j2, z2);
                return;
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27176b.d(ylVar.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.d.m("Invalid delay (millis) specified: ", j2));
    }

    public ScheduledFuture b(yl ylVar, b bVar, long j2) {
        if (this.f27186n) {
            return a(new d(this.f27175a, ylVar, bVar)).schedule(ylVar, j2, TimeUnit.MILLISECONDS);
        }
        return this.f27177c.schedule(ylVar, j2, TimeUnit.MILLISECONDS);
    }

    private ScheduledThreadPoolExecutor b(String str, int i2) {
        return new ScheduledThreadPoolExecutor(i2, new c(str));
    }

    public void a(yl ylVar, pe peVar) {
        String b2 = peVar.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f27182j.get(b2);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b2, 1);
            this.f27182j.put(b2, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new d(this.f27175a, ylVar, b.MEDIATION));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f27186n) {
            com.applovin.impl.sdk.j jVar = this.f27175a;
            d dVar = new d(jVar, new jn(jVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.f27177c.submit(runnable);
    }

    public void a(yl ylVar) {
        if (ylVar != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f27186n ? this.e : this.d;
            try {
                if (yp.h()) {
                    scheduledThreadPoolExecutor.submit(new d(this.f27175a, ylVar, b.CORE));
                    return;
                }
                ScheduledFuture b2 = ylVar.b(Thread.currentThread(), ((Long) this.f27175a.a(sj.C)).longValue());
                ylVar.run();
                if (b2 != null) {
                    b2.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27176b.a(ylVar.c(), "Task failed execution", th);
                }
                ylVar.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    private void a(d dVar, long j2, boolean z2) {
        ScheduledThreadPoolExecutor a2 = this.f27186n ? a(dVar) : this.d;
        if (j2 <= 0) {
            a2.submit(dVar);
        } else if (z2) {
            x1.a(j2, this.f27175a, new ms(5, a2, dVar));
        } else {
            a2.schedule(dVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(d dVar) {
        int i2 = a.f27187a[dVar.f27199f.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? this.f27181i : this.f27178f : this.f27180h : this.f27179g : this.e;
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.n.a()) {
                this.f27176b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.f27176b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
