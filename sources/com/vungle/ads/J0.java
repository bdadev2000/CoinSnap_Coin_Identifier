package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AbstractC2115v;

/* loaded from: classes3.dex */
public final class J0 extends U {
    public /* synthetic */ J0(Context context, String str, C2073d c2073d, int i9, G7.f fVar) {
        this(context, str, (i9 & 4) != 0 ? new C2073d() : c2073d);
    }

    private final K0 getRewardedAdInternal() {
        AbstractC2115v adInternal = getAdInternal();
        G7.j.c(adInternal, "null cannot be cast to non-null type com.vungle.ads.RewardedAdInternal");
        return (K0) adInternal;
    }

    public final void setAlertBodyText(String str) {
        G7.j.e(str, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(str);
    }

    public final void setAlertCloseButtonText(String str) {
        G7.j.e(str, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(str);
    }

    public final void setAlertContinueButtonText(String str) {
        G7.j.e(str, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(str);
    }

    public final void setAlertTitleText(String str) {
        G7.j.e(str, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(str);
    }

    public final void setUserId(String str) {
        G7.j.e(str, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(Context context, String str, C2073d c2073d) {
        super(context, str, c2073d);
        G7.j.e(context, "context");
        G7.j.e(str, "placementId");
        G7.j.e(c2073d, "adConfig");
    }

    @Override // com.vungle.ads.P
    public K0 constructAdInternal$vungle_ads_release(Context context) {
        G7.j.e(context, "context");
        return new K0(context);
    }
}
