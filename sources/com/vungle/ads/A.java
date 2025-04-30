package com.vungle.ads;

import android.content.Context;
import c7.C0665z;
import com.vungle.ads.internal.AbstractC2115v;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class A extends AbstractC2115v {
    private final C adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, C c9) {
        super(context);
        G7.j.e(context, "context");
        G7.j.e(c9, "adSize");
        this.adSize = c9;
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public void adLoadedAndUpdateConfigure$vungle_ads_release(C0665z c0665z) {
        G7.j.e(c0665z, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(c0665z);
        c0665z.setAdSize(this.adSize);
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public String getAdSizeForAdRequest() {
        return this.adSize.getSizeName();
    }

    public final boolean isBannerAdSize$vungle_ads_release(String str) {
        G7.j.e(str, "adSize");
        if (!str.equals(C.BANNER.getSizeName()) && !str.equals(C.BANNER_LEADERBOARD.getSizeName()) && !str.equals(C.BANNER_SHORT.getSizeName()) && !str.equals(C.VUNGLE_MREC.getSizeName())) {
            return false;
        }
        return true;
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public boolean isValidAdSize(String str) {
        c7.p1 placement;
        String str2;
        String str3;
        c7.p1 placement2;
        G7.j.e(str, "adSize");
        boolean isBannerAdSize$vungle_ads_release = isBannerAdSize$vungle_ads_release(str);
        if ((isBannerAdSize$vungle_ads_release && (placement2 = getPlacement()) != null && placement2.isMREC() && !str.equals(C.VUNGLE_MREC.getSizeName())) || (isBannerAdSize$vungle_ads_release && (placement = getPlacement()) != null && placement.isBannerNonMREC() && str.equals(C.VUNGLE_MREC.getSizeName()))) {
            isBannerAdSize$vungle_ads_release = false;
        }
        if (!isBannerAdSize$vungle_ads_release) {
            C2137s c2137s = C2137s.INSTANCE;
            String e4 = AbstractC2914a.e("Invalidate size ", str, " for banner ad");
            c7.p1 placement3 = getPlacement();
            if (placement3 != null) {
                str2 = placement3.getReferenceId();
            } else {
                str2 = null;
            }
            C0665z advertisement = getAdvertisement();
            if (advertisement != null) {
                str3 = advertisement.eventId();
            } else {
                str3 = null;
            }
            c2137s.logError$vungle_ads_release(500, e4, (r13 & 4) != 0 ? null : str2, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : str3);
        }
        return isBannerAdSize$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public boolean isValidAdTypeForPlacement(c7.p1 p1Var) {
        G7.j.e(p1Var, "placement");
        return p1Var.isBanner();
    }

    public final com.vungle.ads.internal.presenter.d wrapCallback$vungle_ads_release(com.vungle.ads.internal.presenter.c cVar) {
        G7.j.e(cVar, "adPlayCallback");
        return new C2151z(cVar, this);
    }
}
