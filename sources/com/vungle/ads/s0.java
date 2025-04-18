package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class s0 extends o0 implements x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, String placementId, d adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.o0, com.vungle.ads.a
    public void load(String str) {
        setSignaledAd$vungle_ads_release(getSignalManager().getSignaledAd(getPlacementId()));
        super.load(str);
    }

    @Override // com.vungle.ads.o0
    public void onAdLoaded$vungle_ads_release(bh.z advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        com.vungle.ads.internal.signals.m signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(System.currentTimeMillis());
        }
    }

    @Override // com.vungle.ads.x0
    public void play(Context context) {
        s sVar = s.INSTANCE;
        sVar.logMetric$vungle_ads_release(new f3(com.vungle.ads.internal.protos.n.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        s.logMetric$vungle_ads_release$default(sVar, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric$vungle_ads_release().markStart();
        com.vungle.ads.internal.signals.m signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getAdInternal().play(context, new r0(this));
    }
}
