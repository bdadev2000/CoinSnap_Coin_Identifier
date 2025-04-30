package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class ho {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8156a;
    private Timer b;

    /* renamed from: c, reason: collision with root package name */
    private long f8157c;

    /* renamed from: d, reason: collision with root package name */
    private long f8158d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f8159e;

    /* renamed from: f, reason: collision with root package name */
    private long f8160f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f8161g = new Object();

    /* loaded from: classes.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                ho.this.f8159e.run();
                synchronized (ho.this.f8161g) {
                    ho.this.b = null;
                }
            } catch (Throwable th) {
                try {
                    if (ho.this.f8156a != null) {
                        ho.this.f8156a.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            ho.this.f8156a.L().a("Timer", "Encountered error while executing timed task", th);
                        }
                        ho.this.f8156a.B().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (ho.this.f8161g) {
                        ho.this.b = null;
                    }
                } catch (Throwable th2) {
                    synchronized (ho.this.f8161g) {
                        ho.this.b = null;
                        throw th2;
                    }
                }
            }
        }
    }

    private ho(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f8156a = kVar;
        this.f8159e = runnable;
    }

    public void d() {
        synchronized (this.f8161g) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8160f = Math.max(1L, System.currentTimeMillis() - this.f8157c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8156a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f8156a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f8156a.L().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } finally {
                        this.b = null;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.f8161g) {
            long j7 = this.f8160f;
            if (j7 > 0) {
                try {
                    long j9 = this.f8158d - j7;
                    this.f8158d = j9;
                    if (j9 < 0) {
                        this.f8158d = 0L;
                    }
                    Timer timer = new Timer();
                    this.b = timer;
                    timer.schedule(b(), this.f8158d);
                    this.f8157c = System.currentTimeMillis();
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8156a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f8156a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f8156a.L().a("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                        this.f8160f = 0L;
                    } finally {
                        this.f8160f = 0L;
                    }
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public long c() {
        if (this.b != null) {
            return this.f8158d - (System.currentTimeMillis() - this.f8157c);
        }
        return this.f8158d - this.f8160f;
    }

    public void a() {
        synchronized (this.f8161g) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8156a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f8156a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f8156a.L().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (Throwable th2) {
                        this.b = null;
                        this.f8160f = 0L;
                        throw th2;
                    }
                }
                this.f8160f = 0L;
            }
        }
    }

    public static ho a(long j7, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j7 < 0) {
            throw new IllegalArgumentException(L.j("Cannot create a scheduled timer. Invalid fire time passed in: ", j7, "."));
        }
        if (runnable != null) {
            ho hoVar = new ho(kVar, runnable);
            hoVar.f8157c = System.currentTimeMillis();
            hoVar.f8158d = j7;
            try {
                Timer timer = new Timer();
                hoVar.b = timer;
                timer.schedule(hoVar.b(), j7);
            } catch (OutOfMemoryError e4) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Timer", "Failed to create timer due to OOM error", e4);
                }
            }
            return hoVar;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }
}
