package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdListener f10916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ad f10917c;

    public f(AdListener adListener, Ad ad2) {
        this.f10916b = adListener;
        this.f10917c = ad2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10916b.onError(this.f10917c, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
    }
}
