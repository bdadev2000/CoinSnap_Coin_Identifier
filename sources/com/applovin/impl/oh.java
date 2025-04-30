package com.applovin.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class oh {

    /* renamed from: a, reason: collision with root package name */
    private final b f9535a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private final j3 f9536c;

    /* renamed from: d, reason: collision with root package name */
    private final go f9537d;

    /* renamed from: e, reason: collision with root package name */
    private int f9538e;

    /* renamed from: f, reason: collision with root package name */
    private Object f9539f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f9540g;

    /* renamed from: h, reason: collision with root package name */
    private int f9541h;

    /* renamed from: i, reason: collision with root package name */
    private long f9542i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9543j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9544k;
    private boolean l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9545n;

    /* loaded from: classes.dex */
    public interface a {
        void a(oh ohVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i9, Object obj);
    }

    public oh(a aVar, b bVar, go goVar, int i9, j3 j3Var, Looper looper) {
        this.b = aVar;
        this.f9535a = bVar;
        this.f9537d = goVar;
        this.f9540g = looper;
        this.f9536c = j3Var;
        this.f9541h = i9;
    }

    public synchronized boolean a(long j7) {
        boolean z8;
        try {
            AbstractC0669a1.b(this.f9544k);
            AbstractC0669a1.b(this.f9540g.getThread() != Thread.currentThread());
            long c9 = this.f9536c.c() + j7;
            while (true) {
                z8 = this.m;
                if (z8 || j7 <= 0) {
                    break;
                }
                this.f9536c.b();
                wait(j7);
                j7 = c9 - this.f9536c.c();
            }
            if (!z8) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public Looper b() {
        return this.f9540g;
    }

    public Object c() {
        return this.f9539f;
    }

    public long d() {
        return this.f9542i;
    }

    public b e() {
        return this.f9535a;
    }

    public go f() {
        return this.f9537d;
    }

    public int g() {
        return this.f9538e;
    }

    public int h() {
        return this.f9541h;
    }

    public synchronized boolean i() {
        return this.f9545n;
    }

    public oh j() {
        AbstractC0669a1.b(!this.f9544k);
        if (this.f9542i == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            AbstractC0669a1.a(this.f9543j);
        }
        this.f9544k = true;
        this.b.a(this);
        return this;
    }

    public boolean a() {
        return this.f9543j;
    }

    public synchronized void a(boolean z8) {
        this.l = z8 | this.l;
        this.m = true;
        notifyAll();
    }

    public oh a(Object obj) {
        AbstractC0669a1.b(!this.f9544k);
        this.f9539f = obj;
        return this;
    }

    public oh a(int i9) {
        AbstractC0669a1.b(!this.f9544k);
        this.f9538e = i9;
        return this;
    }
}
