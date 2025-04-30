package com.google.ads.mediation.applovin;

/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ k b;

    public i(k kVar) {
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.b;
        kVar.rewardedAdCallback = kVar.adLoadCallback.onSuccess(kVar);
    }
}
