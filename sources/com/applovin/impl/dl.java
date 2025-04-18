package com.applovin.impl;

import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class dl {

    /* renamed from: b, reason: collision with root package name */
    private ro f4331b;

    /* renamed from: c, reason: collision with root package name */
    private k8 f4332c;

    /* renamed from: d, reason: collision with root package name */
    private gg f4333d;

    /* renamed from: e, reason: collision with root package name */
    private long f4334e;

    /* renamed from: f, reason: collision with root package name */
    private long f4335f;

    /* renamed from: g, reason: collision with root package name */
    private long f4336g;

    /* renamed from: h, reason: collision with root package name */
    private int f4337h;

    /* renamed from: i, reason: collision with root package name */
    private int f4338i;

    /* renamed from: k, reason: collision with root package name */
    private long f4340k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4341l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4342m;
    private final eg a = new eg();

    /* renamed from: j, reason: collision with root package name */
    private b f4339j = new b();

    /* loaded from: classes.dex */
    public static class b {
        d9 a;

        /* renamed from: b, reason: collision with root package name */
        gg f4343b;
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
        public void a(long j3) {
        }

        @Override // com.applovin.impl.gg
        public ej a() {
            return new ej.b(C.TIME_UNSET);
        }
    }

    private void a() {
        a1.b(this.f4331b);
        yp.a(this.f4332c);
    }

    public abstract long a(yg ygVar);

    public abstract boolean a(yg ygVar, long j3, b bVar);

    public long b(long j3) {
        return (this.f4338i * j3) / 1000000;
    }

    public void c(long j3) {
        this.f4336g = j3;
    }

    private int b(j8 j8Var) {
        if (!a(j8Var)) {
            return -1;
        }
        d9 d9Var = this.f4339j.a;
        this.f4338i = d9Var.A;
        if (!this.f4342m) {
            this.f4331b.a(d9Var);
            this.f4342m = true;
        }
        gg ggVar = this.f4339j.f4343b;
        if (ggVar != null) {
            this.f4333d = ggVar;
        } else if (j8Var.a() == -1) {
            this.f4333d = new c();
        } else {
            fg a10 = this.a.a();
            this.f4333d = new h6(this, this.f4335f, j8Var.a(), a10.f4738h + a10.f4739i, a10.f4733c, (a10.f4732b & 4) != 0);
        }
        this.f4337h = 2;
        this.a.d();
        return 0;
    }

    public long a(long j3) {
        return (j3 * 1000000) / this.f4338i;
    }

    public void a(k8 k8Var, ro roVar) {
        this.f4332c = k8Var;
        this.f4331b = roVar;
        a(true);
    }

    public final int a(j8 j8Var, qh qhVar) {
        a();
        int i10 = this.f4337h;
        if (i10 == 0) {
            return b(j8Var);
        }
        if (i10 == 1) {
            j8Var.a((int) this.f4335f);
            this.f4337h = 2;
            return 0;
        }
        if (i10 == 2) {
            yp.a(this.f4333d);
            return b(j8Var, qhVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    private boolean a(j8 j8Var) {
        while (this.a.a(j8Var)) {
            this.f4340k = j8Var.f() - this.f4335f;
            if (!a(this.a.b(), this.f4335f, this.f4339j)) {
                return true;
            }
            this.f4335f = j8Var.f();
        }
        this.f4337h = 3;
        return false;
    }

    private int b(j8 j8Var, qh qhVar) {
        long a10 = this.f4333d.a(j8Var);
        if (a10 >= 0) {
            qhVar.a = a10;
            return 1;
        }
        if (a10 < -1) {
            c(-(a10 + 2));
        }
        if (!this.f4341l) {
            this.f4332c.a((ej) a1.b(this.f4333d.a()));
            this.f4341l = true;
        }
        if (this.f4340k <= 0 && !this.a.a(j8Var)) {
            this.f4337h = 3;
            return -1;
        }
        this.f4340k = 0L;
        yg b3 = this.a.b();
        long a11 = a(b3);
        if (a11 >= 0) {
            long j3 = this.f4336g;
            if (j3 + a11 >= this.f4334e) {
                long a12 = a(j3);
                this.f4331b.a(b3, b3.e());
                this.f4331b.a(a12, 1, b3.e(), 0, null);
                this.f4334e = -1L;
            }
        }
        this.f4336g += a11;
        return 0;
    }

    public void a(boolean z10) {
        if (z10) {
            this.f4339j = new b();
            this.f4335f = 0L;
            this.f4337h = 0;
        } else {
            this.f4337h = 1;
        }
        this.f4334e = -1L;
        this.f4336g = 0L;
    }

    public final void a(long j3, long j10) {
        this.a.c();
        if (j3 == 0) {
            a(!this.f4341l);
        } else if (this.f4337h != 0) {
            this.f4334e = b(j10);
            ((gg) yp.a(this.f4333d)).a(this.f4334e);
            this.f4337h = 2;
        }
    }
}
