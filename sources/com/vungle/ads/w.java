package com.vungle.ads;

/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f16779c;

    public /* synthetic */ w(y yVar, int i10) {
        this.f16778b = i10;
        this.f16779c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16778b;
        y yVar = this.f16779c;
        switch (i10) {
            case 0:
                x.m122onAdClick$lambda3(yVar);
                return;
            case 1:
                x.m125onAdLeftApplication$lambda4(yVar);
                return;
            case 2:
                x.m123onAdEnd$lambda2(yVar);
                return;
            case 3:
                x.m124onAdImpression$lambda1(yVar);
                return;
            default:
                x.m126onAdStart$lambda0(yVar);
                return;
        }
    }
}
