package com.applovin.impl;

/* loaded from: classes.dex */
public class dg implements i8 {

    /* renamed from: d */
    public static final m8 f7294d = new A0(1);

    /* renamed from: a */
    private k8 f7295a;
    private dl b;

    /* renamed from: c */
    private boolean f7296c;

    public static /* synthetic */ i8[] b() {
        return new i8[]{new dg()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    private boolean b(j8 j8Var) {
        fg fgVar = new fg();
        if (fgVar.a(j8Var, true) && (fgVar.b & 2) == 2) {
            int min = Math.min(fgVar.f7696i, 8);
            yg ygVar = new yg(min);
            j8Var.c(ygVar.c(), 0, min);
            if (w8.c(a(ygVar))) {
                this.b = new w8();
            } else if (fr.c(a(ygVar))) {
                this.b = new fr();
            } else if (qg.b(a(ygVar))) {
                this.b = new qg();
            }
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f7295a = k8Var;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        AbstractC0669a1.b(this.f7295a);
        if (this.b == null) {
            if (b(j8Var)) {
                j8Var.b();
            } else {
                throw ah.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f7296c) {
            ro a6 = this.f7295a.a(0, 1);
            this.f7295a.c();
            this.b.a(this.f7295a, a6);
            this.f7296c = true;
        }
        return this.b.a(j8Var, qhVar);
    }

    private static yg a(yg ygVar) {
        ygVar.f(0);
        return ygVar;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        dl dlVar = this.b;
        if (dlVar != null) {
            dlVar.a(j7, j9);
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
