package com.vungle.ads;

/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f16774c;

    public /* synthetic */ q0(s0 s0Var, int i10) {
        this.f16773b = i10;
        this.f16774c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16773b;
        s0 s0Var = this.f16774c;
        switch (i10) {
            case 0:
                r0.m111onAdRewarded$lambda4(s0Var);
                return;
            case 1:
                r0.m109onAdImpression$lambda1(s0Var);
                return;
            case 2:
                r0.m107onAdClick$lambda3(s0Var);
                return;
            case 3:
                r0.m108onAdEnd$lambda2(s0Var);
                return;
            case 4:
                r0.m112onAdStart$lambda0(s0Var);
                return;
            default:
                r0.m110onAdLeftApplication$lambda5(s0Var);
                return;
        }
    }
}
