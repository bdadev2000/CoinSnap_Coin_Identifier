package com.applovin.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class rh {

    /* renamed from: a, reason: collision with root package name */
    private final b f26308a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26309b;

    /* renamed from: c, reason: collision with root package name */
    private final l3 f26310c;
    private final fo d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private Object f26311f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f26312g;

    /* renamed from: h, reason: collision with root package name */
    private int f26313h;

    /* renamed from: i, reason: collision with root package name */
    private long f26314i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26315j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26316k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26317l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26318m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26319n;

    /* loaded from: classes.dex */
    public interface a {
        void a(rh rhVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i2, Object obj);
    }

    public rh(a aVar, b bVar, fo foVar, int i2, l3 l3Var, Looper looper) {
        this.f26309b = aVar;
        this.f26308a = bVar;
        this.d = foVar;
        this.f26312g = looper;
        this.f26310c = l3Var;
        this.f26313h = i2;
    }

    public boolean a() {
        return this.f26315j;
    }

    public Looper b() {
        return this.f26312g;
    }

    public Object c() {
        return this.f26311f;
    }

    public long d() {
        return this.f26314i;
    }

    public b e() {
        return this.f26308a;
    }

    public fo f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f26313h;
    }

    public synchronized boolean i() {
        return this.f26319n;
    }

    public rh j() {
        b1.b(!this.f26316k);
        if (this.f26314i == -9223372036854775807L) {
            b1.a(this.f26315j);
        }
        this.f26316k = true;
        this.f26309b.a(this);
        return this;
    }

    public synchronized boolean a(long j2) {
        boolean z2;
        try {
            b1.b(this.f26316k);
            b1.b(this.f26312g.getThread() != Thread.currentThread());
            long c2 = this.f26310c.c() + j2;
            while (true) {
                z2 = this.f26318m;
                if (z2 || j2 <= 0) {
                    break;
                }
                this.f26310c.b();
                wait(j2);
                j2 = c2 - this.f26310c.c();
            }
            if (!z2) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f26317l;
    }

    public synchronized void a(boolean z2) {
        this.f26317l = z2 | this.f26317l;
        this.f26318m = true;
        notifyAll();
    }

    public rh a(Object obj) {
        b1.b(!this.f26316k);
        this.f26311f = obj;
        return this;
    }

    public rh a(int i2) {
        b1.b(!this.f26316k);
        this.e = i2;
        return this;
    }
}
