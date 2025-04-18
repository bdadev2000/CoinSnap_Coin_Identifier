package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class i implements i8 {

    /* renamed from: d */
    public static final m8 f5214d = new ht(5);
    private final j a = new j();

    /* renamed from: b */
    private final yg f5215b = new yg(2786);

    /* renamed from: c */
    private boolean f5216c;

    public static /* synthetic */ i8[] b() {
        return new i8[]{new i()};
    }

    public static /* synthetic */ i8[] c() {
        return b();
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.a.a(k8Var, new ep.d(0, 1));
        k8Var.c();
        k8Var.a(new ej.b(C.TIME_UNSET));
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int a = j8Var.a(this.f5215b.c(), 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f5215b.f(0);
        this.f5215b.e(a);
        if (!this.f5216c) {
            this.a.a(0L, 4);
            this.f5216c = true;
        }
        this.a.a(this.f5215b);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        this.f5216c = false;
        this.a.a();
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        yg ygVar = new yg(10);
        int i10 = 0;
        while (true) {
            j8Var.c(ygVar.c(), 0, 10);
            ygVar.f(0);
            if (ygVar.z() != 4801587) {
                break;
            }
            ygVar.g(3);
            int v10 = ygVar.v();
            i10 += v10 + 10;
            j8Var.c(v10);
        }
        j8Var.b();
        j8Var.c(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            j8Var.c(ygVar.c(), 0, 6);
            ygVar.f(0);
            if (ygVar.C() != 2935) {
                j8Var.b();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                j8Var.c(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int a = k.a(ygVar.c());
                if (a == -1) {
                    return false;
                }
                j8Var.c(a - 6);
            }
        }
    }
}
