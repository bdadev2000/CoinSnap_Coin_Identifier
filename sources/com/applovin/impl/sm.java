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

/* loaded from: classes.dex */
public class sm {

    /* renamed from: o */
    private static final ExecutorService f11196o = Executors.newFixedThreadPool(4);

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f11197a;
    private final com.applovin.impl.sdk.t b;

    /* renamed from: c */
    private final ScheduledThreadPoolExecutor f11198c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f11199d;

    /* renamed from: e */
    private final ScheduledThreadPoolExecutor f11200e;

    /* renamed from: f */
    private final ScheduledThreadPoolExecutor f11201f;

    /* renamed from: g */
    private final ScheduledThreadPoolExecutor f11202g;

    /* renamed from: h */
    private final ScheduledThreadPoolExecutor f11203h;

    /* renamed from: i */
    private final ScheduledThreadPoolExecutor f11204i;

    /* renamed from: j */
    private final Map f11205j = new HashMap();

    /* renamed from: k */
    private final List f11206k = new ArrayList(5);
    private final Object l = new Object();
    private boolean m;

    /* renamed from: n */
    private boolean f11207n;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11208a;

        static {
            int[] iArr = new int[b.values().length];
            f11208a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11208a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11208a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11208a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* loaded from: classes.dex */
    public class c implements ThreadFactory {

        /* renamed from: a */
        private final String f11214a;

        /* loaded from: classes.dex */
        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.t unused = sm.this.b;
                if (com.applovin.impl.sdk.t.a()) {
                    sm.this.b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        public c(String str) {
            this.f11214a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f11214a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) sm.this.f11197a.a(oj.f9662R)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: a */
        private final com.applovin.impl.sdk.k f11216a;
        private final String b;

        /* renamed from: c */
        private final com.applovin.impl.sdk.t f11217c;

        /* renamed from: d */
        private final xl f11218d;

        /* renamed from: f */
        private final b f11219f;

        public d(com.applovin.impl.sdk.k kVar, xl xlVar, b bVar) {
            this.f11216a = kVar;
            this.f11217c = kVar.L();
            this.b = xlVar.c();
            this.f11218d = xlVar;
            this.f11219f = bVar;
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
                com.applovin.impl.x3.a()     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.sdk.k r1 = r6.f11216a     // Catch: java.lang.Throwable -> L26
                boolean r1 = r1.A0()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L38
                com.applovin.impl.xl r1 = r6.f11218d     // Catch: java.lang.Throwable -> L26
                boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L16
                goto L38
            L16:
                boolean r1 = com.applovin.impl.sdk.t.a()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L28
                com.applovin.impl.sdk.t r1 = r6.f11217c     // Catch: java.lang.Throwable -> L26
                java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L26
                java.lang.String r3 = "Task re-scheduled..."
                r1.d(r2, r3)     // Catch: java.lang.Throwable -> L26
                goto L28
            L26:
                r1 = move-exception
                goto L83
            L28:
                com.applovin.impl.sdk.k r1 = r6.f11216a     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.sm r1 = r1.l0()     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.xl r2 = r6.f11218d     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.sm$b r3 = r6.f11219f     // Catch: java.lang.Throwable -> L26
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L26
                goto L5b
            L38:
                com.applovin.impl.xl r1 = r6.f11218d     // Catch: java.lang.Throwable -> L26
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.sdk.k r3 = r6.f11216a     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.oj r4 = com.applovin.impl.oj.f9622L     // Catch: java.lang.Throwable -> L26
                java.lang.Object r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L26
                java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L26
                long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L26
                java.util.concurrent.ScheduledFuture r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L26
                com.applovin.impl.xl r2 = r6.f11218d     // Catch: java.lang.Throwable -> L26
                r2.run()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L5b
                r2 = 0
                r1.cancel(r2)     // Catch: java.lang.Throwable -> L26
            L5b:
                boolean r1 = com.applovin.impl.sdk.t.a()
                if (r1 == 0) goto Lc1
                com.applovin.impl.sdk.t r1 = r6.f11217c
                java.lang.String r2 = r6.b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.sm$b r4 = r6.f11219f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.xl r0 = r6.f11218d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
                goto Lc1
            L83:
                boolean r2 = com.applovin.impl.sdk.t.a()     // Catch: java.lang.Throwable -> L93
                if (r2 == 0) goto L95
                com.applovin.impl.sdk.t r2 = r6.f11217c     // Catch: java.lang.Throwable -> L93
                java.lang.String r3 = r6.b     // Catch: java.lang.Throwable -> L93
                java.lang.String r4 = "Task failed execution"
                r2.a(r3, r4, r1)     // Catch: java.lang.Throwable -> L93
                goto L95
            L93:
                r1 = move-exception
                goto Lc2
            L95:
                com.applovin.impl.xl r2 = r6.f11218d     // Catch: java.lang.Throwable -> L93
                r2.a(r1)     // Catch: java.lang.Throwable -> L93
                boolean r1 = com.applovin.impl.sdk.t.a()
                if (r1 == 0) goto Lc1
                com.applovin.impl.sdk.t r1 = r6.f11217c
                java.lang.String r2 = r6.b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.sm$b r4 = r6.f11219f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.xl r0 = r6.f11218d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
            Lc1:
                return
            Lc2:
                boolean r2 = com.applovin.impl.sdk.t.a()
                if (r2 == 0) goto Le9
                com.applovin.impl.sdk.t r2 = r6.f11217c
                java.lang.String r3 = r6.b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sm$b r5 = r6.f11219f
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.xl r0 = r6.f11218d
                java.lang.String r0 = r0.c()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.d(r3, r0)
            Le9:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sm.d.run():void");
        }
    }

    public sm(com.applovin.impl.sdk.k kVar) {
        this.f11197a = kVar;
        this.b = kVar.L();
        this.f11207n = ((Boolean) kVar.a(oj.f9681U)).booleanValue();
        this.f11198c = b("auxiliary_operations", ((Integer) kVar.a(oj.f9649P)).intValue());
        this.f11199d = b("shared_thread_pool", ((Integer) kVar.a(oj.O)).intValue());
        this.f11200e = b("core", ((Integer) kVar.a(oj.f9688V)).intValue());
        this.f11202g = b("caching", ((Integer) kVar.a(oj.f9695W)).intValue());
        this.f11203h = b("mediation", ((Integer) kVar.a(oj.f9701X)).intValue());
        this.f11201f = b("timeout", ((Integer) kVar.a(oj.f9708Y)).intValue());
        this.f11204i = b("other", ((Integer) kVar.a(oj.f9715Z)).intValue());
    }

    public Executor c() {
        if (this.f11207n) {
            return this.f11200e;
        }
        return this.f11199d;
    }

    public boolean d() {
        return this.m;
    }

    public void e() {
        synchronized (this.l) {
            try {
                this.m = true;
                for (d dVar : this.f11206k) {
                    a(dVar.f11218d, dVar.f11219f);
                }
                this.f11206k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        synchronized (this.l) {
            this.m = false;
        }
    }

    public ExecutorService a(String str, int i9) {
        return Executors.newFixedThreadPool(i9, new c(str));
    }

    public void a(xl xlVar, b bVar) {
        a(xlVar, bVar, 0L);
    }

    public ExecutorService b() {
        return this.f11207n ? this.f11202g : f11196o;
    }

    private boolean b(d dVar) {
        if (dVar.f11218d.d()) {
            return false;
        }
        synchronized (this.l) {
            try {
                if (this.m) {
                    return false;
                }
                this.f11206k.add(dVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(xl xlVar, b bVar, long j7) {
        a(xlVar, bVar, j7, false);
    }

    public void a(xl xlVar, b bVar, long j7, boolean z8) {
        if (xlVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j7 >= 0) {
            d dVar = new d(this.f11197a, xlVar, bVar);
            if (!b(dVar)) {
                a(dVar, j7, z8);
                return;
            } else {
                if (com.applovin.impl.sdk.t.a()) {
                    this.b.d(xlVar.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(Q7.n0.g(j7, "Invalid delay (millis) specified: "));
    }

    public ScheduledFuture b(xl xlVar, b bVar, long j7) {
        if (this.f11207n) {
            return a(new d(this.f11197a, xlVar, bVar)).schedule(xlVar, j7, TimeUnit.MILLISECONDS);
        }
        return this.f11198c.schedule(xlVar, j7, TimeUnit.MILLISECONDS);
    }

    private ScheduledThreadPoolExecutor b(String str, int i9) {
        return new ScheduledThreadPoolExecutor(i9, new c(str));
    }

    public void a(xl xlVar, ke keVar) {
        String b8 = keVar.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f11205j.get(b8);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b8, 1);
            this.f11205j.put(b8, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new d(this.f11197a, xlVar, b.MEDIATION));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f11207n) {
            com.applovin.impl.sdk.k kVar = this.f11197a;
            d dVar = new d(kVar, new kn(kVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.f11198c.submit(runnable);
    }

    public void a(xl xlVar) {
        if (xlVar != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f11207n ? this.f11200e : this.f11199d;
            try {
                if (zp.h()) {
                    scheduledThreadPoolExecutor.submit(new d(this.f11197a, xlVar, b.CORE));
                    return;
                }
                ScheduledFuture b8 = xlVar.b(Thread.currentThread(), ((Long) this.f11197a.a(oj.f9622L)).longValue());
                xlVar.run();
                if (b8 != null) {
                    b8.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.b.a(xlVar.c(), "Task failed execution", th);
                }
                xlVar.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public ExecutorService a() {
        return this.f11207n ? this.f11204i : this.f11198c;
    }

    private void a(d dVar, long j7, boolean z8) {
        ScheduledThreadPoolExecutor a6 = this.f11207n ? a(dVar) : this.f11199d;
        if (j7 <= 0) {
            a6.submit(dVar);
        } else if (z8) {
            C0771w1.a(j7, this.f11197a, new F(4, a6, dVar));
        } else {
            a6.schedule(dVar, j7, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(d dVar) {
        int i9 = a.f11208a[dVar.f11219f.ordinal()];
        if (i9 == 1) {
            return this.f11200e;
        }
        if (i9 == 2) {
            return this.f11202g;
        }
        if (i9 == 3) {
            return this.f11203h;
        }
        if (i9 != 4) {
            return this.f11204i;
        }
        return this.f11201f;
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
