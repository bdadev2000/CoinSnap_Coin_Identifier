package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ AdListener b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ad f13467c;

    public f(AdListener adListener, Ad ad) {
        this.b = adListener;
        this.f13467c = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.onError(this.f13467c, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
    }
}
