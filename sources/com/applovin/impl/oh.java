package com.applovin.impl;

import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class oh {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6600b;

    /* renamed from: c, reason: collision with root package name */
    private final j3 f6601c;

    /* renamed from: d, reason: collision with root package name */
    private final go f6602d;

    /* renamed from: e, reason: collision with root package name */
    private int f6603e;

    /* renamed from: f, reason: collision with root package name */
    private Object f6604f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f6605g;

    /* renamed from: h, reason: collision with root package name */
    private int f6606h;

    /* renamed from: i, reason: collision with root package name */
    private long f6607i = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6608j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6609k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6610l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6611m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6612n;

    /* loaded from: classes.dex */
    public interface a {
        void a(oh ohVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, Object obj);
    }

    public oh(a aVar, b bVar, go goVar, int i10, j3 j3Var, Looper looper) {
        this.f6600b = aVar;
        this.a = bVar;
        this.f6602d = goVar;
        this.f6605g = looper;
        this.f6601c = j3Var;
        this.f6606h = i10;
    }

    public synchronized boolean a(long j3) {
        boolean z10;
        a1.b(this.f6609k);
        a1.b(this.f6605g.getThread() != Thread.currentThread());
        long c10 = this.f6601c.c() + j3;
        while (true) {
            z10 = this.f6611m;
            if (z10 || j3 <= 0) {
                break;
            }
            this.f6601c.b();
            wait(j3);
            j3 = c10 - this.f6601c.c();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f6610l;
    }

    public Looper b() {
        return this.f6605g;
    }

    public Object c() {
        return this.f6604f;
    }

    public long d() {
        return this.f6607i;
    }

    public b e() {
        return this.a;
    }

    public go f() {
        return this.f6602d;
    }

    public int g() {
        return this.f6603e;
    }

    public int h() {
        return this.f6606h;
    }

    public synchronized boolean i() {
        return this.f6612n;
    }

    public oh j() {
        a1.b(!this.f6609k);
        if (this.f6607i == C.TIME_UNSET) {
            a1.a(this.f6608j);
        }
        this.f6609k = true;
        this.f6600b.a(this);
        return this;
    }

    public boolean a() {
        return this.f6608j;
    }

    public synchronized void a(boolean z10) {
        this.f6610l = z10 | this.f6610l;
        this.f6611m = true;
        notifyAll();
    }

    public oh a(Object obj) {
        a1.b(!this.f6609k);
        this.f6604f = obj;
        return this;
    }

    public oh a(int i10) {
        a1.b(!this.f6609k);
        this.f6603e = i10;
        return this;
    }
}
