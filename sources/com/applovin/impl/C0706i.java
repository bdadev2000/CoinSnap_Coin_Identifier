package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;

/* renamed from: com.applovin.impl.i */
/* loaded from: classes.dex */
public final class C0706i implements i8 {

    /* renamed from: d */
    public static final m8 f8181d = new A0(5);

    /* renamed from: a */
    private final C0710j f8182a = new C0710j();
    private final yg b = new yg(2786);

    /* renamed from: c */
    private boolean f8183c;

    public static /* synthetic */ i8[] b() {
        return new i8[]{new C0706i()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f8182a.a(k8Var, new ep.d(0, 1));
        k8Var.c();
        k8Var.a(new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int a6 = j8Var.a(this.b.c(), 0, 2786);
        if (a6 == -1) {
            return -1;
        }
        this.b.f(0);
        this.b.e(a6);
        if (!this.f8183c) {
            this.f8182a.a(0L, 4);
            this.f8183c = true;
        }
        this.f8182a.a(this.b);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        this.f8183c = false;
        this.f8182a.a();
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        yg ygVar = new yg(10);
        int i9 = 0;
        while (true) {
            j8Var.c(ygVar.c(), 0, 10);
            ygVar.f(0);
            if (ygVar.z() != 4801587) {
                break;
            }
            ygVar.g(3);
            int v6 = ygVar.v();
            i9 += v6 + 10;
            j8Var.c(v6);
        }
        j8Var.b();
        j8Var.c(i9);
        int i10 = 0;
        int i11 = i9;
        while (true) {
            j8Var.c(ygVar.c(), 0, 6);
            ygVar.f(0);
            if (ygVar.C() != 2935) {
                j8Var.b();
                i11++;
                if (i11 - i9 >= 8192) {
                    return false;
                }
                j8Var.c(i11);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int a6 = AbstractC0714k.a(ygVar.c());
                if (a6 == -1) {
                    return false;
                }
                j8Var.c(a6 - 6);
            }
        }
    }
}
