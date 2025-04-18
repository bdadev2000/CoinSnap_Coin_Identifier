package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class go {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f24144a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f24145b;

    /* renamed from: c, reason: collision with root package name */
    private long f24146c;
    private long d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24147f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f24148g;

    /* renamed from: h, reason: collision with root package name */
    private long f24149h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f24150i = new Object();

    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                go.this.f24148g.run();
                synchronized (go.this.f24150i) {
                    try {
                        if (go.this.f24147f) {
                            go.this.f24146c = System.currentTimeMillis();
                            go goVar = go.this;
                            goVar.d = goVar.e;
                        } else {
                            go.this.f24145b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (go.this.f24144a != null) {
                        go.this.f24144a.J();
                        if (com.applovin.impl.sdk.n.a()) {
                            go.this.f24144a.J().a("Timer", "Encountered error while executing timed task", th);
                        }
                        go.this.f24144a.E().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (go.this.f24150i) {
                        try {
                            if (go.this.f24147f) {
                                go.this.f24146c = System.currentTimeMillis();
                                go goVar2 = go.this;
                                goVar2.d = goVar2.e;
                            } else {
                                go.this.f24145b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (go.this.f24150i) {
                        try {
                            if (go.this.f24147f) {
                                go.this.f24146c = System.currentTimeMillis();
                                go goVar3 = go.this;
                                goVar3.d = goVar3.e;
                            } else {
                                go.this.f24145b = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private go(com.applovin.impl.sdk.j jVar, Runnable runnable) {
        this.f24144a = jVar;
        this.f24148g = runnable;
    }

    public long c() {
        if (this.f24145b == null) {
            return this.d - this.f24149h;
        }
        return this.d - (System.currentTimeMillis() - this.f24146c);
    }

    public void d() {
        synchronized (this.f24150i) {
            Timer timer = this.f24145b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f24149h = Math.max(1L, System.currentTimeMillis() - this.f24146c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.j jVar = this.f24144a;
                        if (jVar != null) {
                            jVar.J();
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f24144a.J();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f24144a.J().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f24145b = null;
                    } finally {
                        this.f24145b = null;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.f24150i) {
            long j2 = this.f24149h;
            if (j2 > 0) {
                try {
                    long j3 = this.d - j2;
                    this.d = j3;
                    if (j3 < 0) {
                        this.d = 0L;
                    }
                    this.f24145b = new Timer();
                    a(b(), this.d, this.f24147f, this.e);
                    this.f24146c = System.currentTimeMillis();
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.j jVar = this.f24144a;
                        if (jVar != null) {
                            jVar.J();
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f24144a.J();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f24144a.J().a("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                        this.f24149h = 0L;
                    } finally {
                        this.f24149h = 0L;
                    }
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public void a() {
        synchronized (this.f24150i) {
            Timer timer = this.f24145b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f24145b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.j jVar = this.f24144a;
                        if (jVar != null) {
                            jVar.J();
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f24144a.J();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f24144a.J().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f24145b = null;
                    } catch (Throwable th2) {
                        this.f24145b = null;
                        this.f24149h = 0L;
                        throw th2;
                    }
                }
                this.f24149h = 0L;
            }
        }
    }

    public static go a(long j2, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return a(j2, false, jVar, runnable);
    }

    public static go a(long j2, boolean z2, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j2 + ".");
        }
        if (runnable != null) {
            go goVar = new go(jVar, runnable);
            goVar.f24146c = System.currentTimeMillis();
            goVar.d = j2;
            goVar.f24147f = z2;
            goVar.e = j2;
            try {
                goVar.f24145b = new Timer();
                goVar.a(goVar.b(), j2, z2, goVar.e);
            } catch (OutOfMemoryError e) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return goVar;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    private void a(TimerTask timerTask, long j2, boolean z2, long j3) {
        if (z2) {
            this.f24145b.schedule(timerTask, j2, j3);
        } else {
            this.f24145b.schedule(timerTask, j2);
        }
    }
}
