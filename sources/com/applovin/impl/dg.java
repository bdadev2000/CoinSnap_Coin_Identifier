package com.applovin.impl;

/* loaded from: classes.dex */
public class dg implements i8 {

    /* renamed from: d */
    public static final m8 f4299d = new ht(1);
    private k8 a;

    /* renamed from: b */
    private dl f4300b;

    /* renamed from: c */
    private boolean f4301c;

    public static /* synthetic */ i8[] b() {
        return new i8[]{new dg()};
    }

    public static /* synthetic */ i8[] c() {
        return b();
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    private boolean b(j8 j8Var) {
        fg fgVar = new fg();
        if (fgVar.a(j8Var, true) && (fgVar.f4732b & 2) == 2) {
            int min = Math.min(fgVar.f4739i, 8);
            yg ygVar = new yg(min);
            j8Var.c(ygVar.c(), 0, min);
            if (w8.c(a(ygVar))) {
                this.f4300b = new w8();
            } else if (fr.c(a(ygVar))) {
                this.f4300b = new fr();
            } else if (qg.b(a(ygVar))) {
                this.f4300b = new qg();
            }
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.a = k8Var;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        a1.b(this.a);
        if (this.f4300b == null) {
            if (b(j8Var)) {
                j8Var.b();
            } else {
                throw ah.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f4301c) {
            ro a = this.a.a(0, 1);
            this.a.c();
            this.f4300b.a(this.a, a);
            this.f4301c = true;
        }
        return this.f4300b.a(j8Var, qhVar);
    }

    private static yg a(yg ygVar) {
        ygVar.f(0);
        return ygVar;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        dl dlVar = this.f4300b;
        if (dlVar != null) {
            dlVar.a(j3, j10);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        try {
            return b(j8Var);
        } catch (ah unused) {
            return false;
        }
    }
}
