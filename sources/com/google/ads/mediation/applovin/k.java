package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.AdError;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdError f11459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11460c;

    public k(l lVar, AdError adError) {
        this.f11460c = lVar;
        this.f11459b = adError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11460c.adLoadCallback.onFailure(this.f11459b);
    }
}
