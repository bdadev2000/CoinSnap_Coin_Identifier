package com.applovin.impl;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class bk implements m5 {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f23107a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23108b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f23109c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();
    private final p5[] e;

    /* renamed from: f, reason: collision with root package name */
    private final zg[] f23110f;

    /* renamed from: g, reason: collision with root package name */
    private int f23111g;

    /* renamed from: h, reason: collision with root package name */
    private int f23112h;

    /* renamed from: i, reason: collision with root package name */
    private p5 f23113i;

    /* renamed from: j, reason: collision with root package name */
    private o5 f23114j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23115k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23116l;

    /* renamed from: m, reason: collision with root package name */
    private int f23117m;

    /* loaded from: classes.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            bk.this.m();
        }
    }

    public bk(p5[] p5VarArr, zg[] zgVarArr) {
        this.e = p5VarArr;
        this.f23111g = p5VarArr.length;
        for (int i2 = 0; i2 < this.f23111g; i2++) {
            this.e[i2] = f();
        }
        this.f23110f = zgVarArr;
        this.f23112h = zgVarArr.length;
        for (int i3 = 0; i3 < this.f23112h; i3++) {
            this.f23110f[i3] = g();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f23107a = aVar;
        aVar.start();
    }

    private boolean e() {
        return !this.f23109c.isEmpty() && this.f23112h > 0;
    }

    private boolean h() {
        o5 a2;
        synchronized (this.f23108b) {
            while (!this.f23116l && !e()) {
                try {
                    this.f23108b.wait();
                } finally {
                }
            }
            if (this.f23116l) {
                return false;
            }
            p5 p5Var = (p5) this.f23109c.removeFirst();
            zg[] zgVarArr = this.f23110f;
            int i2 = this.f23112h - 1;
            this.f23112h = i2;
            zg zgVar = zgVarArr[i2];
            boolean z2 = this.f23115k;
            this.f23115k = false;
            if (p5Var.e()) {
                zgVar.b(4);
            } else {
                if (p5Var.d()) {
                    zgVar.b(Integer.MIN_VALUE);
                }
                try {
                    a2 = a(p5Var, zgVar, z2);
                } catch (OutOfMemoryError e) {
                    a2 = a((Throwable) e);
                } catch (RuntimeException e2) {
                    a2 = a((Throwable) e2);
                }
                if (a2 != null) {
                    synchronized (this.f23108b) {
                        this.f23114j = a2;
                    }
                    return false;
                }
            }
            synchronized (this.f23108b) {
                try {
                    if (this.f23115k) {
                        zgVar.g();
                    } else if (zgVar.d()) {
                        this.f23117m++;
                        zgVar.g();
                    } else {
                        zgVar.f28348c = this.f23117m;
                        this.f23117m = 0;
                        this.d.addLast(zgVar);
                    }
                    b(p5Var);
                } finally {
                }
            }
            return true;
        }
    }

    private void k() {
        if (e()) {
            this.f23108b.notify();
        }
    }

    private void l() {
        o5 o5Var = this.f23114j;
        if (o5Var != null) {
            throw o5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (h());
    }

    public abstract o5 a(p5 p5Var, zg zgVar, boolean z2);

    public abstract o5 a(Throwable th);

    @Override // com.applovin.impl.m5
    public final void b() {
        synchronized (this.f23108b) {
            try {
                this.f23115k = true;
                this.f23117m = 0;
                p5 p5Var = this.f23113i;
                if (p5Var != null) {
                    b(p5Var);
                    this.f23113i = null;
                }
                while (!this.f23109c.isEmpty()) {
                    b((p5) this.f23109c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    ((zg) this.d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract p5 f();

    public abstract zg g();

    @Override // com.applovin.impl.m5
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final p5 d() {
        p5 p5Var;
        synchronized (this.f23108b) {
            l();
            b1.b(this.f23113i == null);
            int i2 = this.f23111g;
            if (i2 == 0) {
                p5Var = null;
            } else {
                p5[] p5VarArr = this.e;
                int i3 = i2 - 1;
                this.f23111g = i3;
                p5Var = p5VarArr[i3];
            }
            this.f23113i = p5Var;
        }
        return p5Var;
    }

    @Override // com.applovin.impl.m5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final zg c() {
        synchronized (this.f23108b) {
            try {
                l();
                if (this.d.isEmpty()) {
                    return null;
                }
                return (zg) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.m5
    public final void a(p5 p5Var) {
        synchronized (this.f23108b) {
            l();
            b1.a(p5Var == this.f23113i);
            this.f23109c.addLast(p5Var);
            k();
            this.f23113i = null;
        }
    }

    private void b(p5 p5Var) {
        p5Var.b();
        p5[] p5VarArr = this.e;
        int i2 = this.f23111g;
        this.f23111g = i2 + 1;
        p5VarArr[i2] = p5Var;
    }

    @Override // com.applovin.impl.m5
    public void a() {
        synchronized (this.f23108b) {
            this.f23116l = true;
            this.f23108b.notify();
        }
        try {
            this.f23107a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(zg zgVar) {
        zgVar.b();
        zg[] zgVarArr = this.f23110f;
        int i2 = this.f23112h;
        this.f23112h = i2 + 1;
        zgVarArr[i2] = zgVar;
    }

    public void a(zg zgVar) {
        synchronized (this.f23108b) {
            b(zgVar);
            k();
        }
    }

    public final void a(int i2) {
        b1.b(this.f23111g == this.e.length);
        for (p5 p5Var : this.e) {
            p5Var.g(i2);
        }
    }
}
