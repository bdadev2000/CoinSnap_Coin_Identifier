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
    private static final ExecutorService f8032o = Executors.newFixedThreadPool(4);
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.t f8033b;

    /* renamed from: c */
    private final ScheduledThreadPoolExecutor f8034c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f8035d;

    /* renamed from: e */
    private final ScheduledThreadPoolExecutor f8036e;

    /* renamed from: f */
    private final ScheduledThreadPoolExecutor f8037f;

    /* renamed from: g */
    private final ScheduledThreadPoolExecutor f8038g;

    /* renamed from: h */
    private final ScheduledThreadPoolExecutor f8039h;

    /* renamed from: i */
    private final ScheduledThreadPoolExecutor f8040i;

    /* renamed from: j */
    private final Map f8041j = new HashMap();

    /* renamed from: k */
    private final List f8042k = new ArrayList(5);

    /* renamed from: l */
    private final Object f8043l = new Object();

    /* renamed from: m */
    private boolean f8044m;

    /* renamed from: n */
    private boolean f8045n;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TIMEOUT.ordinal()] = 4;
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
        private final String a;

        /* loaded from: classes.dex */
        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                com.applovin.impl.sdk.t unused = sm.this.f8033b;
                if (com.applovin.impl.sdk.t.a()) {
                    sm.this.f8033b.a("TaskManager", "Caught unhandled exception", th2);
                }
            }
        }

        public c(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) sm.this.a.a(oj.R)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {
        private final com.applovin.impl.sdk.k a;

        /* renamed from: b */
        private final String f8052b;

        /* renamed from: c */
        private final com.applovin.impl.sdk.t f8053c;

        /* renamed from: d */
        private final xl f8054d;

        /* renamed from: f */
        private final b f8055f;

        public d(com.applovin.impl.sdk.k kVar, xl xlVar, b bVar) {
            this.a = kVar;
            this.f8053c = kVar.L();
            this.f8052b = xlVar.c();
            this.f8054d = xlVar;
            this.f8055f = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
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
                com.applovin.impl.x3.a()     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.sdk.k r1 = r6.a     // Catch: java.lang.Throwable -> L80
                boolean r1 = r1.A0()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L35
                com.applovin.impl.xl r1 = r6.f8054d     // Catch: java.lang.Throwable -> L80
                boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L16
                goto L35
            L16:
                boolean r1 = com.applovin.impl.sdk.t.a()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L25
                com.applovin.impl.sdk.t r1 = r6.f8053c     // Catch: java.lang.Throwable -> L80
                java.lang.String r2 = r6.f8052b     // Catch: java.lang.Throwable -> L80
                java.lang.String r3 = "Task re-scheduled..."
                r1.d(r2, r3)     // Catch: java.lang.Throwable -> L80
            L25:
                com.applovin.impl.sdk.k r1 = r6.a     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.sm r1 = r1.l0()     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.xl r2 = r6.f8054d     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.sm$b r3 = r6.f8055f     // Catch: java.lang.Throwable -> L80
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L80
                goto L58
            L35:
                com.applovin.impl.xl r1 = r6.f8054d     // Catch: java.lang.Throwable -> L80
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.sdk.k r3 = r6.a     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.oj r4 = com.applovin.impl.oj.L     // Catch: java.lang.Throwable -> L80
                java.lang.Object r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L80
                java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L80
                long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L80
                java.util.concurrent.ScheduledFuture r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.xl r2 = r6.f8054d     // Catch: java.lang.Throwable -> L80
                r2.run()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L58
                r2 = 0
                r1.cancel(r2)     // Catch: java.lang.Throwable -> L80
            L58:
                boolean r1 = com.applovin.impl.sdk.t.a()
                if (r1 == 0) goto Lbc
                com.applovin.impl.sdk.t r1 = r6.f8053c
                java.lang.String r2 = r6.f8052b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.sm$b r4 = r6.f8055f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.xl r0 = r6.f8054d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
                goto Lbc
            L80:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.t.a()     // Catch: java.lang.Throwable -> Lbd
                if (r2 == 0) goto L90
                com.applovin.impl.sdk.t r2 = r6.f8053c     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r3 = r6.f8052b     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r4 = "Task failed execution"
                r2.a(r3, r4, r1)     // Catch: java.lang.Throwable -> Lbd
            L90:
                com.applovin.impl.xl r2 = r6.f8054d     // Catch: java.lang.Throwable -> Lbd
                r2.a(r1)     // Catch: java.lang.Throwable -> Lbd
                boolean r1 = com.applovin.impl.sdk.t.a()
                if (r1 == 0) goto Lbc
                com.applovin.impl.sdk.t r1 = r6.f8053c
                java.lang.String r2 = r6.f8052b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.sm$b r4 = r6.f8055f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.xl r0 = r6.f8054d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
            Lbc:
                return
            Lbd:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.t.a()
                if (r2 == 0) goto Le5
                com.applovin.impl.sdk.t r2 = r6.f8053c
                java.lang.String r3 = r6.f8052b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sm$b r5 = r6.f8055f
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.xl r0 = r6.f8054d
                java.lang.String r0 = r0.c()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.d(r3, r0)
            Le5:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sm.d.run():void");
        }
    }

    public sm(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f8033b = kVar.L();
        this.f8045n = ((Boolean) kVar.a(oj.U)).booleanValue();
        this.f8034c = b("auxiliary_operations", ((Integer) kVar.a(oj.P)).intValue());
        this.f8035d = b("shared_thread_pool", ((Integer) kVar.a(oj.O)).intValue());
        this.f8036e = b("core", ((Integer) kVar.a(oj.V)).intValue());
        this.f8038g = b("caching", ((Integer) kVar.a(oj.W)).intValue());
        this.f8039h = b("mediation", ((Integer) kVar.a(oj.X)).intValue());
        this.f8037f = b("timeout", ((Integer) kVar.a(oj.Y)).intValue());
        this.f8040i = b("other", ((Integer) kVar.a(oj.Z)).intValue());
    }

    public Executor c() {
        return this.f8045n ? this.f8036e : this.f8035d;
    }

    public boolean d() {
        return this.f8044m;
    }

    public void e() {
        synchronized (this.f8043l) {
            this.f8044m = true;
            for (d dVar : this.f8042k) {
                a(dVar.f8054d, dVar.f8055f);
            }
            this.f8042k.clear();
        }
    }

    public void f() {
        synchronized (this.f8043l) {
            this.f8044m = false;
        }
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new c(str));
    }

    public void a(xl xlVar, b bVar) {
        a(xlVar, bVar, 0L);
    }

    public ExecutorService b() {
        return this.f8045n ? this.f8038g : f8032o;
    }

    private boolean b(d dVar) {
        if (dVar.f8054d.d()) {
            return false;
        }
        synchronized (this.f8043l) {
            if (this.f8044m) {
                return false;
            }
            this.f8042k.add(dVar);
            return true;
        }
    }

    public void a(xl xlVar, b bVar, long j3) {
        a(xlVar, bVar, j3, false);
    }

    public void a(xl xlVar, b bVar, long j3, boolean z10) {
        if (xlVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j3 >= 0) {
            d dVar = new d(this.a, xlVar, bVar);
            if (!b(dVar)) {
                a(dVar, j3, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f8033b.d(xlVar.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Invalid delay (millis) specified: ", j3));
    }

    public ScheduledFuture b(xl xlVar, b bVar, long j3) {
        if (this.f8045n) {
            return a(new d(this.a, xlVar, bVar)).schedule(xlVar, j3, TimeUnit.MILLISECONDS);
        }
        return this.f8034c.schedule(xlVar, j3, TimeUnit.MILLISECONDS);
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new c(str));
    }

    public void a(xl xlVar, ke keVar) {
        String b3 = keVar.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f8041j.get(b3);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b3, 1);
            this.f8041j.put(b3, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new d(this.a, xlVar, b.MEDIATION));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f8045n) {
            com.applovin.impl.sdk.k kVar = this.a;
            d dVar = new d(kVar, new kn(kVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.f8034c.submit(runnable);
    }

    public void a(xl xlVar) {
        if (xlVar != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f8045n ? this.f8036e : this.f8035d;
            try {
                if (zp.h()) {
                    scheduledThreadPoolExecutor.submit(new d(this.a, xlVar, b.CORE));
                    return;
                }
                ScheduledFuture b3 = xlVar.b(Thread.currentThread(), ((Long) this.a.a(oj.L)).longValue());
                xlVar.run();
                if (b3 != null) {
                    b3.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f8033b.a(xlVar.c(), "Task failed execution", th2);
                }
                xlVar.a(th2);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public ExecutorService a() {
        return this.f8045n ? this.f8040i : this.f8034c;
    }

    private void a(d dVar, long j3, boolean z10) {
        ScheduledThreadPoolExecutor a10 = this.f8045n ? a(dVar) : this.f8035d;
        if (j3 <= 0) {
            a10.submit(dVar);
        } else if (z10) {
            w1.a(j3, this.a, new rs(4, a10, dVar));
        } else {
            a10.schedule(dVar, j3, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(d dVar) {
        int i10 = a.a[dVar.f8055f.ordinal()];
        if (i10 == 1) {
            return this.f8036e;
        }
        if (i10 == 2) {
            return this.f8038g;
        }
        if (i10 == 3) {
            return this.f8039h;
        }
        if (i10 != 4) {
            return this.f8040i;
        }
        return this.f8037f;
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8033b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.f8033b.a("TaskManager", "Awaiting tasks were interrupted", th2);
            return null;
        }
    }
}
