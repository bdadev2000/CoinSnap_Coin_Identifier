package com.applovin.impl;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class yj implements k5 {
    private final Thread a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9224b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f9225c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f9226d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    private final n5[] f9227e;

    /* renamed from: f, reason: collision with root package name */
    private final wg[] f9228f;

    /* renamed from: g, reason: collision with root package name */
    private int f9229g;

    /* renamed from: h, reason: collision with root package name */
    private int f9230h;

    /* renamed from: i, reason: collision with root package name */
    private n5 f9231i;

    /* renamed from: j, reason: collision with root package name */
    private m5 f9232j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9233k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9234l;

    /* renamed from: m, reason: collision with root package name */
    private int f9235m;

    /* loaded from: classes.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            yj.this.m();
        }
    }

    public yj(n5[] n5VarArr, wg[] wgVarArr) {
        this.f9227e = n5VarArr;
        this.f9229g = n5VarArr.length;
        for (int i10 = 0; i10 < this.f9229g; i10++) {
            this.f9227e[i10] = f();
        }
        this.f9228f = wgVarArr;
        this.f9230h = wgVarArr.length;
        for (int i11 = 0; i11 < this.f9230h; i11++) {
            this.f9228f[i11] = g();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    private boolean e() {
        return !this.f9225c.isEmpty() && this.f9230h > 0;
    }

    private boolean h() {
        m5 a10;
        synchronized (this.f9224b) {
            while (!this.f9234l && !e()) {
                this.f9224b.wait();
            }
            if (this.f9234l) {
                return false;
            }
            n5 n5Var = (n5) this.f9225c.removeFirst();
            wg[] wgVarArr = this.f9228f;
            int i10 = this.f9230h - 1;
            this.f9230h = i10;
            wg wgVar = wgVarArr[i10];
            boolean z10 = this.f9233k;
            this.f9233k = false;
            if (n5Var.e()) {
                wgVar.b(4);
            } else {
                if (n5Var.d()) {
                    wgVar.b(Integer.MIN_VALUE);
                }
                try {
                    a10 = a(n5Var, wgVar, z10);
                } catch (OutOfMemoryError e2) {
                    a10 = a((Throwable) e2);
                } catch (RuntimeException e10) {
                    a10 = a((Throwable) e10);
                }
                if (a10 != null) {
                    synchronized (this.f9224b) {
                        this.f9232j = a10;
                    }
                    return false;
                }
            }
            synchronized (this.f9224b) {
                if (this.f9233k) {
                    wgVar.g();
                } else if (wgVar.d()) {
                    this.f9235m++;
                    wgVar.g();
                } else {
                    wgVar.f8770c = this.f9235m;
                    this.f9235m = 0;
                    this.f9226d.addLast(wgVar);
                }
                b(n5Var);
            }
            return true;
        }
    }

    private void k() {
        if (e()) {
            this.f9224b.notify();
        }
    }

    private void l() {
        m5 m5Var = this.f9232j;
        if (m5Var == null) {
        } else {
            throw m5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (h());
    }

    public abstract m5 a(n5 n5Var, wg wgVar, boolean z10);

    public abstract m5 a(Throwable th2);

    @Override // com.applovin.impl.k5
    public final void b() {
        synchronized (this.f9224b) {
            this.f9233k = true;
            this.f9235m = 0;
            n5 n5Var = this.f9231i;
            if (n5Var != null) {
                b(n5Var);
                this.f9231i = null;
            }
            while (!this.f9225c.isEmpty()) {
                b((n5) this.f9225c.removeFirst());
            }
            while (!this.f9226d.isEmpty()) {
                ((wg) this.f9226d.removeFirst()).g();
            }
        }
    }

    public abstract n5 f();

    public abstract wg g();

    @Override // com.applovin.impl.k5
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final n5 d() {
        boolean z10;
        n5 n5Var;
        synchronized (this.f9224b) {
            l();
            if (this.f9231i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1.b(z10);
            int i10 = this.f9229g;
            if (i10 == 0) {
                n5Var = null;
            } else {
                n5[] n5VarArr = this.f9227e;
                int i11 = i10 - 1;
                this.f9229g = i11;
                n5Var = n5VarArr[i11];
            }
            this.f9231i = n5Var;
        }
        return n5Var;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final wg c() {
        synchronized (this.f9224b) {
            l();
            if (this.f9226d.isEmpty()) {
                return null;
            }
            return (wg) this.f9226d.removeFirst();
        }
    }

    @Override // com.applovin.impl.k5
    public final void a(n5 n5Var) {
        synchronized (this.f9224b) {
            l();
            a1.a(n5Var == this.f9231i);
            this.f9225c.addLast(n5Var);
            k();
            this.f9231i = null;
        }
    }

    @Override // com.applovin.impl.k5
    public void a() {
        synchronized (this.f9224b) {
            this.f9234l = true;
            this.f9224b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(n5 n5Var) {
        n5Var.b();
        n5[] n5VarArr = this.f9227e;
        int i10 = this.f9229g;
        this.f9229g = i10 + 1;
        n5VarArr[i10] = n5Var;
    }

    private void b(wg wgVar) {
        wgVar.b();
        wg[] wgVarArr = this.f9228f;
        int i10 = this.f9230h;
        this.f9230h = i10 + 1;
        wgVarArr[i10] = wgVar;
    }

    public void a(wg wgVar) {
        synchronized (this.f9224b) {
            b(wgVar);
            k();
        }
    }

    public final void a(int i10) {
        a1.b(this.f9229g == this.f9227e.length);
        for (n5 n5Var : this.f9227e) {
            n5Var.g(i10);
        }
    }
}
