package com.applovin.impl;

/* loaded from: classes.dex */
public class hg implements k8 {
    public static final o8 d = new dt(2);

    /* renamed from: a */
    private m8 f24311a;

    /* renamed from: b */
    private gl f24312b;

    /* renamed from: c */
    private boolean f24313c;

    public static /* synthetic */ k8[] b() {
        return new k8[]{new hg()};
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    private boolean b(l8 l8Var) {
        jg jgVar = new jg();
        if (jgVar.a(l8Var, true) && (jgVar.f24674b & 2) == 2) {
            int min = Math.min(jgVar.f24679i, 8);
            bh bhVar = new bh(min);
            l8Var.c(bhVar.c(), 0, min);
            if (y8.c(a(bhVar))) {
                this.f24312b = new y8();
            } else if (er.c(a(bhVar))) {
                this.f24312b = new er();
            } else if (tg.b(a(bhVar))) {
                this.f24312b = new tg();
            }
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f24311a = m8Var;
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        b1.b(this.f24311a);
        if (this.f24312b == null) {
            if (b(l8Var)) {
                l8Var.b();
            } else {
                throw dh.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f24313c) {
            qo a2 = this.f24311a.a(0, 1);
            this.f24311a.c();
            this.f24312b.a(this.f24311a, a2);
            this.f24313c = true;
        }
        return this.f24312b.a(l8Var, thVar);
    }

    private static bh a(bh bhVar) {
        bhVar.f(0);
        return bhVar;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        gl glVar = this.f24312b;
        if (glVar != null) {
            glVar.a(j2, j3);
        }
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        try {
            return b(l8Var);
        } catch (dh unused) {
            return false;
        }
    }
}
