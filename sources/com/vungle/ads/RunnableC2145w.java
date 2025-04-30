package com.vungle.ads;

/* renamed from: com.vungle.ads.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2145w implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2149y f19777c;

    public /* synthetic */ RunnableC2145w(C2149y c2149y, int i9) {
        this.b = i9;
        this.f19777c = c2149y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C2147x.m118onAdStart$lambda0(this.f19777c);
                return;
            case 1:
                C2147x.m117onAdLeftApplication$lambda4(this.f19777c);
                return;
            case 2:
                C2147x.m114onAdClick$lambda3(this.f19777c);
                return;
            case 3:
                C2147x.m115onAdEnd$lambda2(this.f19777c);
                return;
            default:
                C2147x.m116onAdImpression$lambda1(this.f19777c);
                return;
        }
    }
}
