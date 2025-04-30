package com.vungle.ads;

import android.content.Context;
import c7.C0665z;

/* loaded from: classes3.dex */
public abstract class U extends P implements Z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Context context, String str, C2073d c2073d) {
        super(context, str, c2073d);
        G7.j.e(context, "context");
        G7.j.e(str, "placementId");
        G7.j.e(c2073d, "adConfig");
    }

    @Override // com.vungle.ads.P, com.vungle.ads.InterfaceC2067a
    public void load(String str) {
        setSignaledAd$vungle_ads_release(getSignalManager().getSignaledAd(getPlacementId()));
        super.load(str);
    }

    @Override // com.vungle.ads.P
    public void onAdLoaded$vungle_ads_release(C0665z c0665z) {
        G7.j.e(c0665z, "advertisement");
        super.onAdLoaded$vungle_ads_release(c0665z);
        com.vungle.ads.internal.signals.m signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(System.currentTimeMillis());
        }
    }

    @Override // com.vungle.ads.Z
    public void play(Context context) {
        C2137s c2137s = C2137s.INSTANCE;
        c2137s.logMetric$vungle_ads_release(new g1(com.vungle.ads.internal.protos.n.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        C2137s.logMetric$vungle_ads_release$default(c2137s, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric$vungle_ads_release().markStart();
        com.vungle.ads.internal.signals.m signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getAdInternal().play(context, new T(this));
    }
}
