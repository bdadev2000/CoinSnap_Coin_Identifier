package com.vungle.ads;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f19757c;

    public /* synthetic */ S(U u8, int i9) {
        this.b = i9;
        this.f19757c = u8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                T.m16onAdStart$lambda0(this.f19757c);
                return;
            case 1:
                T.m14onAdLeftApplication$lambda5(this.f19757c);
                return;
            case 2:
                T.m11onAdClick$lambda3(this.f19757c);
                return;
            case 3:
                T.m12onAdEnd$lambda2(this.f19757c);
                return;
            case 4:
                T.m15onAdRewarded$lambda4(this.f19757c);
                return;
            default:
                T.m13onAdImpression$lambda1(this.f19757c);
                return;
        }
    }
}
