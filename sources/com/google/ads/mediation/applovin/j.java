package com.google.ads.mediation.applovin;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11458b;

    public j(l lVar) {
        this.f11458b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f11458b;
        lVar.rewardedAdCallback = lVar.adLoadCallback.onSuccess(lVar);
    }
}
