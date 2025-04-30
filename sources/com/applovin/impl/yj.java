package com.applovin.impl;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class yj implements k5 {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f12422a;
    private final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f12423c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f12424d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    private final n5[] f12425e;

    /* renamed from: f, reason: collision with root package name */
    private final wg[] f12426f;

    /* renamed from: g, reason: collision with root package name */
    private int f12427g;

    /* renamed from: h, reason: collision with root package name */
    private int f12428h;

    /* renamed from: i, reason: collision with root package name */
    private n5 f12429i;

    /* renamed from: j, reason: collision with root package name */
    private m5 f12430j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12431k;
    private boolean l;
    private int m;

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
        this.f12425e = n5VarArr;
        this.f12427g = n5VarArr.length;
        for (int i9 = 0; i9 < this.f12427g; i9++) {
            this.f12425e[i9] = f();
        }
        this.f12426f = wgVarArr;
        this.f12428h = wgVarArr.length;
        for (int i10 = 0; i10 < this.f12428h; i10++) {
            this.f12426f[i10] = g();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f12422a = aVar;
        aVar.start();
    }

    private boolean e() {
        if (!this.f12423c.isEmpty() && this.f12428h > 0) {
            return true;
        }
        return false;
    }

    private boolean h() {
        m5 a6;
        synchronized (this.b) {
            while (!this.l && !e()) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            n5 n5Var = (n5) this.f12423c.removeFirst();
            wg[] wgVarArr = this.f12426f;
            int i9 = this.f12428h - 1;
            this.f12428h = i9;
            wg wgVar = wgVarArr[i9];
            boolean z8 = this.f12431k;
            this.f12431k = false;
            if (n5Var.e()) {
                wgVar.b(4);
            } else {
                if (n5Var.d()) {
                    wgVar.b(Integer.MIN_VALUE);
                }
                try {
                    a6 = a(n5Var, wgVar, z8);
                } catch (OutOfMemoryError e4) {
                    a6 = a((Throwable) e4);
                } catch (RuntimeException e9) {
                    a6 = a((Throwable) e9);
                }
                if (a6 != null) {
                    synchronized (this.b) {
                        this.f12430j = a6;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.f12431k) {
                        wgVar.g();
                    } else if (wgVar.d()) {
                        this.m++;
                        wgVar.g();
                    } else {
                        wgVar.f11983c = this.m;
                        this.m = 0;
                        this.f12424d.addLast(wgVar);
                    }
                    b(n5Var);
                } finally {
                }
            }
            return true;
        }
    }

    private void k() {
        if (e()) {
            this.b.notify();
        }
    }

    private void l() {
        m5 m5Var = this.f12430j;
        if (m5Var == null) {
        } else {
            throw m5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        do {
            try {
            } catch (InterruptedException e4) {
                throw new IllegalStateException(e4);
            }
        } while (h());
    }

    public abstract m5 a(n5 n5Var, wg wgVar, boolean z8);

    public abstract m5 a(Throwable th);

    @Override // com.applovin.impl.k5
    public final void b() {
        synchronized (this.b) {
            try {
                this.f12431k = true;
                this.m = 0;
                n5 n5Var = this.f12429i;
                if (n5Var != null) {
                    b(n5Var);
                    this.f12429i = null;
                }
                while (!this.f12423c.isEmpty()) {
                    b((n5) this.f12423c.removeFirst());
                }
                while (!this.f12424d.isEmpty()) {
                    ((wg) this.f12424d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract n5 f();

    public abstract wg g();

    @Override // com.applovin.impl.k5
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final n5 d() {
        boolean z8;
        n5 n5Var;
        synchronized (this.b) {
            l();
            if (this.f12429i == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC0669a1.b(z8);
            int i9 = this.f12427g;
            if (i9 == 0) {
                n5Var = null;
            } else {
                n5[] n5VarArr = this.f12425e;
                int i10 = i9 - 1;
                this.f12427g = i10;
                n5Var = n5VarArr[i10];
            }
            this.f12429i = n5Var;
        }
        return n5Var;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final wg c() {
        synchronized (this.b) {
            try {
                l();
                if (this.f12424d.isEmpty()) {
                    return null;
                }
                return (wg) this.f12424d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.k5
    public final void a(n5 n5Var) {
        synchronized (this.b) {
            l();
            AbstractC0669a1.a(n5Var == this.f12429i);
            this.f12423c.addLast(n5Var);
            k();
            this.f12429i = null;
        }
    }

    @Override // com.applovin.impl.k5
    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f12422a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(n5 n5Var) {
        n5Var.b();
        n5[] n5VarArr = this.f12425e;
        int i9 = this.f12427g;
        this.f12427g = i9 + 1;
        n5VarArr[i9] = n5Var;
    }

    private void b(wg wgVar) {
        wgVar.b();
        wg[] wgVarArr = this.f12426f;
        int i9 = this.f12428h;
        this.f12428h = i9 + 1;
        wgVarArr[i9] = wgVar;
    }

    public void a(wg wgVar) {
        synchronized (this.b) {
            b(wgVar);
            k();
        }
    }

    public final void a(int i9) {
        AbstractC0669a1.b(this.f12427g == this.f12425e.length);
        for (n5 n5Var : this.f12425e) {
            n5Var.g(i9);
        }
    }
}
