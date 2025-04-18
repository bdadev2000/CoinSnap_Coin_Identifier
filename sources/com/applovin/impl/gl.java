package com.applovin.impl;

import com.applovin.impl.ij;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class gl {

    /* renamed from: b, reason: collision with root package name */
    private qo f24125b;

    /* renamed from: c, reason: collision with root package name */
    private m8 f24126c;
    private kg d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private long f24127f;

    /* renamed from: g, reason: collision with root package name */
    private long f24128g;

    /* renamed from: h, reason: collision with root package name */
    private int f24129h;

    /* renamed from: i, reason: collision with root package name */
    private int f24130i;

    /* renamed from: k, reason: collision with root package name */
    private long f24132k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24133l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f24134m;

    /* renamed from: a, reason: collision with root package name */
    private final ig f24124a = new ig();

    /* renamed from: j, reason: collision with root package name */
    private b f24131j = new b();

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        f9 f24135a;

        /* renamed from: b, reason: collision with root package name */
        kg f24136b;
    }

    /* loaded from: classes2.dex */
    public static final class c implements kg {
        private c() {
        }

        @Override // com.applovin.impl.kg
        public long a(l8 l8Var) {
            return -1L;
        }

        @Override // com.applovin.impl.kg
        public void a(long j2) {
        }

        @Override // com.applovin.impl.kg
        public ij a() {
            return new ij.b(-9223372036854775807L);
        }
    }

    private void a() {
        b1.b(this.f24125b);
        xp.a(this.f24126c);
    }

    public abstract long a(bh bhVar);

    public abstract boolean a(bh bhVar, long j2, b bVar);

    public long b(long j2) {
        return (this.f24130i * j2) / 1000000;
    }

    public void c(long j2) {
        this.f24128g = j2;
    }

    private int b(l8 l8Var) {
        if (!a(l8Var)) {
            return -1;
        }
        f9 f9Var = this.f24131j.f24135a;
        this.f24130i = f9Var.A;
        if (!this.f24134m) {
            this.f24125b.a(f9Var);
            this.f24134m = true;
        }
        kg kgVar = this.f24131j.f24136b;
        if (kgVar != null) {
            this.d = kgVar;
        } else if (l8Var.a() == -1) {
            this.d = new c();
        } else {
            jg a2 = this.f24124a.a();
            this.d = new j6(this, this.f24127f, l8Var.a(), a2.f24678h + a2.f24679i, a2.f24675c, (a2.f24674b & 4) != 0);
        }
        this.f24129h = 2;
        this.f24124a.d();
        return 0;
    }

    public long a(long j2) {
        return (j2 * 1000000) / this.f24130i;
    }

    public void a(m8 m8Var, qo qoVar) {
        this.f24126c = m8Var;
        this.f24125b = qoVar;
        a(true);
    }

    public final int a(l8 l8Var, th thVar) {
        a();
        int i2 = this.f24129h;
        if (i2 == 0) {
            return b(l8Var);
        }
        if (i2 == 1) {
            l8Var.a((int) this.f24127f);
            this.f24129h = 2;
            return 0;
        }
        if (i2 == 2) {
            xp.a(this.d);
            return b(l8Var, thVar);
        }
        if (i2 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    private boolean a(l8 l8Var) {
        while (this.f24124a.a(l8Var)) {
            this.f24132k = l8Var.f() - this.f24127f;
            if (!a(this.f24124a.b(), this.f24127f, this.f24131j)) {
                return true;
            }
            this.f24127f = l8Var.f();
        }
        this.f24129h = 3;
        return false;
    }

    private int b(l8 l8Var, th thVar) {
        long a2 = this.d.a(l8Var);
        if (a2 >= 0) {
            thVar.f27165a = a2;
            return 1;
        }
        if (a2 < -1) {
            c(-(a2 + 2));
        }
        if (!this.f24133l) {
            this.f24126c.a((ij) b1.b(this.d.a()));
            this.f24133l = true;
        }
        if (this.f24132k <= 0 && !this.f24124a.a(l8Var)) {
            this.f24129h = 3;
            return -1;
        }
        this.f24132k = 0L;
        bh b2 = this.f24124a.b();
        long a3 = a(b2);
        if (a3 >= 0) {
            long j2 = this.f24128g;
            if (j2 + a3 >= this.e) {
                long a4 = a(j2);
                this.f24125b.a(b2, b2.e());
                this.f24125b.a(a4, 1, b2.e(), 0, null);
                this.e = -1L;
            }
        }
        this.f24128g += a3;
        return 0;
    }

    public void a(boolean z2) {
        if (z2) {
            this.f24131j = new b();
            this.f24127f = 0L;
            this.f24129h = 0;
        } else {
            this.f24129h = 1;
        }
        this.e = -1L;
        this.f24128g = 0L;
    }

    public final void a(long j2, long j3) {
        this.f24124a.c();
        if (j2 == 0) {
            a(!this.f24133l);
        } else if (this.f24129h != 0) {
            this.e = b(j3);
            ((kg) xp.a(this.d)).a(this.e);
            this.f24129h = 2;
        }
    }
}
