package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class ho {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f5177b;

    /* renamed from: c, reason: collision with root package name */
    private long f5178c;

    /* renamed from: d, reason: collision with root package name */
    private long f5179d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f5180e;

    /* renamed from: f, reason: collision with root package name */
    private long f5181f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f5182g = new Object();

    /* loaded from: classes.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                ho.this.f5180e.run();
                synchronized (ho.this.f5182g) {
                    ho.this.f5177b = null;
                }
            } catch (Throwable th2) {
                try {
                    if (ho.this.a != null) {
                        ho.this.a.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            ho.this.a.L().a("Timer", "Encountered error while executing timed task", th2);
                        }
                        ho.this.a.B().a("Timer", "executingTimedTask", th2);
                    }
                    synchronized (ho.this.f5182g) {
                        ho.this.f5177b = null;
                    }
                } catch (Throwable th3) {
                    synchronized (ho.this.f5182g) {
                        ho.this.f5177b = null;
                        throw th3;
                    }
                }
            }
        }
    }

    private ho(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.a = kVar;
        this.f5180e = runnable;
    }

    public void d() {
        synchronized (this.f5182g) {
            Timer timer = this.f5177b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f5181f = Math.max(1L, System.currentTimeMillis() - this.f5178c);
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.a.L().a("Timer", "Encountered error while pausing timer", th2);
                                }
                            }
                        }
                        this.f5177b = null;
                    } finally {
                        this.f5177b = null;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.f5182g) {
            long j3 = this.f5181f;
            if (j3 > 0) {
                try {
                    long j10 = this.f5179d - j3;
                    this.f5179d = j10;
                    if (j10 < 0) {
                        this.f5179d = 0L;
                    }
                    Timer timer = new Timer();
                    this.f5177b = timer;
                    timer.schedule(b(), this.f5179d);
                    this.f5178c = System.currentTimeMillis();
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.a.L().a("Timer", "Encountered error while resuming timer", th2);
                                }
                            }
                        }
                        this.f5181f = 0L;
                    } finally {
                        this.f5181f = 0L;
                    }
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public long c() {
        if (this.f5177b != null) {
            return this.f5179d - (System.currentTimeMillis() - this.f5178c);
        }
        return this.f5179d - this.f5181f;
    }

    public void a() {
        synchronized (this.f5182g) {
            Timer timer = this.f5177b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f5177b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.a;
                        if (kVar != null) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                this.a.L();
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.a.L().a("Timer", "Encountered error while cancelling timer", th2);
                                }
                            }
                        }
                        this.f5177b = null;
                    } catch (Throwable th3) {
                        this.f5177b = null;
                        this.f5181f = 0L;
                        throw th3;
                    }
                }
                this.f5181f = 0L;
            }
        }
    }

    public static ho a(long j3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j3 < 0) {
            throw new IllegalArgumentException(a4.j.f("Cannot create a scheduled timer. Invalid fire time passed in: ", j3, "."));
        }
        if (runnable != null) {
            ho hoVar = new ho(kVar, runnable);
            hoVar.f5178c = System.currentTimeMillis();
            hoVar.f5179d = j3;
            try {
                Timer timer = new Timer();
                hoVar.f5177b = timer;
                timer.schedule(hoVar.b(), j3);
            } catch (OutOfMemoryError e2) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Timer", "Failed to create timer due to OOM error", e2);
                }
            }
            return hoVar;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }
}
