package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends o0 {
    private final com.vungle.ads.internal.presenter.d adPlayCallback;
    private c0 adSize;
    private k0 bannerView;

    private y(Context context, String str, c0 c0Var, d dVar) {
        super(context, str, dVar);
        this.adSize = c0Var;
        com.vungle.ads.internal.v adInternal = getAdInternal();
        Intrinsics.checkNotNull(adInternal, "null cannot be cast to non-null type com.vungle.ads.BannerAdInternal");
        this.adPlayCallback = ((a0) adInternal).wrapCallback$vungle_ads_release(new x(this, str));
    }

    /* renamed from: getBannerView$lambda-0 */
    public static final void m128getBannerView$lambda0(y this$0, n3 n3Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this$0, n3Var);
        }
    }

    public final void finishAd() {
        k0 k0Var = this.bannerView;
        if (k0Var != null) {
            k0Var.finishAdInternal(true);
        }
    }

    public final k0 getBannerView() {
        bh.o3 placement;
        s sVar = s.INSTANCE;
        sVar.logMetric$vungle_ads_release(new f3(com.vungle.ads.internal.protos.n.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        k0 k0Var = this.bannerView;
        if (k0Var != null) {
            return k0Var;
        }
        n3 canPlayAd = getAdInternal().canPlayAd(true);
        if (canPlayAd != null) {
            if (getAdInternal().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal().setAdState(com.vungle.ads.internal.g.ERROR);
            }
            com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new v(this, canPlayAd, 0));
            return null;
        }
        bh.z advertisement = getAdInternal().getAdvertisement();
        if (advertisement == null || (placement = getAdInternal().getPlacement()) == null) {
            return null;
        }
        getAdInternal().cancelDownload$vungle_ads_release();
        try {
            try {
                this.bannerView = new k0(getContext(), placement, advertisement, this.adSize, getAdConfig(), this.adPlayCallback, getAdInternal().getBidPayload());
                getResponseToShowMetric$vungle_ads_release().markEnd();
                s.logMetric$vungle_ads_release$default(sVar, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
                getShowToDisplayMetric$vungle_ads_release().markStart();
                return this.bannerView;
            } catch (InstantiationException e2) {
                com.vungle.ads.internal.util.v.Companion.e("BannerAd", "Can not create banner view: " + e2.getMessage(), e2);
                getResponseToShowMetric$vungle_ads_release().markEnd();
                s.logMetric$vungle_ads_release$default(s.INSTANCE, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
                return null;
            }
        } catch (Throwable th2) {
            getResponseToShowMetric$vungle_ads_release().markEnd();
            s.logMetric$vungle_ads_release$default(s.INSTANCE, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
            throw th2;
        }
    }

    @Override // com.vungle.ads.o0
    public a0 constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a0(context, this.adSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Context context, String placementId, c0 adSize) {
        this(context, placementId, adSize, new d());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
    }
}
