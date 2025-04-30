package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ AdError b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f13861c;

    public j(k kVar, AdError adError) {
        this.f13861c = kVar;
        this.b = adError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13861c.adLoadCallback.onFailure(this.b);
    }
}
