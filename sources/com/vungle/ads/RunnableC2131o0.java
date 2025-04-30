package com.vungle.ads;

/* renamed from: com.vungle.ads.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2131o0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2144v0 f19774c;

    public /* synthetic */ RunnableC2131o0(C2144v0 c2144v0, int i9) {
        this.b = i9;
        this.f19774c = c2144v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C2133p0.m101onAdImpression$lambda1(this.f19774c);
                return;
            case 1:
                C2133p0.m100onAdEnd$lambda2(this.f19774c);
                return;
            case 2:
                C2133p0.m103onAdStart$lambda0(this.f19774c);
                return;
            case 3:
                C2133p0.m102onAdLeftApplication$lambda4(this.f19774c);
                return;
            default:
                C2133p0.m99onAdClick$lambda3(this.f19774c);
                return;
        }
    }
}
