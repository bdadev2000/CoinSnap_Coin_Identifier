package com.applovin.impl;

import com.applovin.impl.ej;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class dl {
    private ro b;

    /* renamed from: c, reason: collision with root package name */
    private k8 f7324c;

    /* renamed from: d, reason: collision with root package name */
    private gg f7325d;

    /* renamed from: e, reason: collision with root package name */
    private long f7326e;

    /* renamed from: f, reason: collision with root package name */
    private long f7327f;

    /* renamed from: g, reason: collision with root package name */
    private long f7328g;

    /* renamed from: h, reason: collision with root package name */
    private int f7329h;

    /* renamed from: i, reason: collision with root package name */
    private int f7330i;

    /* renamed from: k, reason: collision with root package name */
    private long f7332k;
    private boolean l;
    private boolean m;

    /* renamed from: a, reason: collision with root package name */
    private final eg f7323a = new eg();

    /* renamed from: j, reason: collision with root package name */
    private b f7331j = new b();

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        d9 f7333a;
        gg b;
    }

    /* loaded from: classes.dex */
    public static final class c implements gg {
        private c() {
        }

        @Override // com.applovin.impl.gg
        public long a(j8 j8Var) {
            return -1L;
        }

        @Override // com.applovin.impl.gg
        public void a(long j7) {
        }

        @Override // com.applovin.impl.gg
        public ej a() {
            return new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        }
    }

    private void a() {
        AbstractC0669a1.b(this.b);
        yp.a(this.f7324c);
    }

    public abstract long a(yg ygVar);

    public abstract boolean a(yg ygVar, long j7, b bVar);

    public long b(long j7) {
        return (this.f7330i * j7) / 1000000;
    }

    public void c(long j7) {
        this.f7328g = j7;
    }

    private int b(j8 j8Var) {
        if (!a(j8Var)) {
            return -1;
        }
        d9 d9Var = this.f7331j.f7333a;
        this.f7330i = d9Var.f7195A;
        if (!this.m) {
            this.b.a(d9Var);
            this.m = true;
        }
        gg ggVar = this.f7331j.b;
        if (ggVar != null) {
            this.f7325d = ggVar;
        } else if (j8Var.a() == -1) {
            this.f7325d = new c();
        } else {
            fg a6 = this.f7323a.a();
            this.f7325d = new h6(this, this.f7327f, j8Var.a(), a6.f7695h + a6.f7696i, a6.f7690c, (a6.b & 4) != 0);
        }
        this.f7329h = 2;
        this.f7323a.d();
        return 0;
    }

    public long a(long j7) {
        return (j7 * 1000000) / this.f7330i;
    }

    public void a(k8 k8Var, ro roVar) {
        this.f7324c = k8Var;
        this.b = roVar;
        a(true);
    }

    public final int a(j8 j8Var, qh qhVar) {
        a();
        int i9 = this.f7329h;
        if (i9 == 0) {
            return b(j8Var);
        }
        if (i9 == 1) {
            j8Var.a((int) this.f7327f);
            this.f7329h = 2;
            return 0;
        }
        if (i9 == 2) {
            yp.a(this.f7325d);
            return b(j8Var, qhVar);
        }
        if (i9 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    private boolean a(j8 j8Var) {
        while (this.f7323a.a(j8Var)) {
            this.f7332k = j8Var.f() - this.f7327f;
            if (!a(this.f7323a.b(), this.f7327f, this.f7331j)) {
                return true;
            }
            this.f7327f = j8Var.f();
        }
        this.f7329h = 3;
        return false;
    }

    private int b(j8 j8Var, qh qhVar) {
        long a6 = this.f7325d.a(j8Var);
        if (a6 >= 0) {
            qhVar.f10346a = a6;
            return 1;
        }
        if (a6 < -1) {
            c(-(a6 + 2));
        }
        if (!this.l) {
            this.f7324c.a((ej) AbstractC0669a1.b(this.f7325d.a()));
            this.l = true;
        }
        if (this.f7332k <= 0 && !this.f7323a.a(j8Var)) {
            this.f7329h = 3;
            return -1;
        }
        this.f7332k = 0L;
        yg b8 = this.f7323a.b();
        long a9 = a(b8);
        if (a9 >= 0) {
            long j7 = this.f7328g;
            if (j7 + a9 >= this.f7326e) {
                long a10 = a(j7);
                this.b.a(b8, b8.e());
                this.b.a(a10, 1, b8.e(), 0, null);
                this.f7326e = -1L;
            }
        }
        this.f7328g += a9;
        return 0;
    }

    public void a(boolean z8) {
        if (z8) {
            this.f7331j = new b();
            this.f7327f = 0L;
            this.f7329h = 0;
        } else {
            this.f7329h = 1;
        }
        this.f7326e = -1L;
        this.f7328g = 0L;
    }

    public final void a(long j7, long j9) {
        this.f7323a.c();
        if (j7 == 0) {
            a(!this.l);
        } else if (this.f7329h != 0) {
            this.f7326e = b(j9);
            ((gg) yp.a(this.f7325d)).a(this.f7326e);
            this.f7329h = 2;
        }
    }
}
