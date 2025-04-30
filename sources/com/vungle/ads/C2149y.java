package com.vungle.ads;

import android.content.Context;
import c7.C0665z;
import com.vungle.ads.internal.AbstractC2115v;
import com.vungle.ads.internal.EnumC2091g;

/* renamed from: com.vungle.ads.y */
/* loaded from: classes3.dex */
public final class C2149y extends P {
    private final com.vungle.ads.internal.presenter.d adPlayCallback;
    private C adSize;
    private K bannerView;

    private C2149y(Context context, String str, C c9, C2073d c2073d) {
        super(context, str, c2073d);
        this.adSize = c9;
        AbstractC2115v adInternal = getAdInternal();
        G7.j.c(adInternal, "null cannot be cast to non-null type com.vungle.ads.BannerAdInternal");
        this.adPlayCallback = ((A) adInternal).wrapCallback$vungle_ads_release(new C2147x(this, str));
    }

    /* renamed from: getBannerView$lambda-0 */
    public static final void m120getBannerView$lambda0(C2149y c2149y, o1 o1Var) {
        G7.j.e(c2149y, "this$0");
        Q adListener = c2149y.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(c2149y, o1Var);
        }
    }

    public final void finishAd() {
        K k6 = this.bannerView;
        if (k6 != null) {
            k6.finishAdInternal(true);
        }
    }

    public final K getBannerView() {
        c7.p1 placement;
        C2137s c2137s = C2137s.INSTANCE;
        c2137s.logMetric$vungle_ads_release(new g1(com.vungle.ads.internal.protos.n.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        K k6 = this.bannerView;
        if (k6 != null) {
            return k6;
        }
        o1 canPlayAd = getAdInternal().canPlayAd(true);
        if (canPlayAd != null) {
            if (getAdInternal().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal().setAdState(EnumC2091g.ERROR);
            }
            com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2143v(this, canPlayAd, 0));
            return null;
        }
        C0665z advertisement = getAdInternal().getAdvertisement();
        if (advertisement == null || (placement = getAdInternal().getPlacement()) == null) {
            return null;
        }
        getAdInternal().cancelDownload$vungle_ads_release();
        try {
            try {
                this.bannerView = new K(getContext(), placement, advertisement, this.adSize, getAdConfig(), this.adPlayCallback, getAdInternal().getBidPayload());
                getResponseToShowMetric$vungle_ads_release().markEnd();
                C2137s.logMetric$vungle_ads_release$default(c2137s, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
                getShowToDisplayMetric$vungle_ads_release().markStart();
                return this.bannerView;
            } catch (InstantiationException e4) {
                com.vungle.ads.internal.util.v.Companion.e("BannerAd", "Can not create banner view: " + e4.getMessage(), e4);
                getResponseToShowMetric$vungle_ads_release().markEnd();
                C2137s.logMetric$vungle_ads_release$default(C2137s.INSTANCE, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
                return null;
            }
        } catch (Throwable th) {
            getResponseToShowMetric$vungle_ads_release().markEnd();
            C2137s.logMetric$vungle_ads_release$default(C2137s.INSTANCE, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
            throw th;
        }
    }

    @Override // com.vungle.ads.P
    public A constructAdInternal$vungle_ads_release(Context context) {
        G7.j.e(context, "context");
        return new A(context, this.adSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2149y(Context context, String str, C c9) {
        this(context, str, c9, new C2073d());
        G7.j.e(context, "context");
        G7.j.e(str, "placementId");
        G7.j.e(c9, "adSize");
    }
}
