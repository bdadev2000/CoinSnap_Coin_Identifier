package com.vungle.ads;

/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f16772c;

    public /* synthetic */ m1(t1 t1Var, int i10) {
        this.f16771b = i10;
        this.f16772c = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16771b;
        t1 t1Var = this.f16772c;
        switch (i10) {
            case 0:
                n1.m98onAdClick$lambda3(t1Var);
                return;
            case 1:
                n1.m102onAdStart$lambda0(t1Var);
                return;
            case 2:
                n1.m101onAdLeftApplication$lambda4(t1Var);
                return;
            case 3:
                n1.m99onAdEnd$lambda2(t1Var);
                return;
            default:
                n1.m100onAdImpression$lambda1(t1Var);
                return;
        }
    }
}
