package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h2 extends s0 {
    public /* synthetic */ h2(Context context, String str, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? new d() : dVar);
    }

    private final i2 getRewardedAdInternal() {
        com.vungle.ads.internal.v adInternal = getAdInternal();
        Intrinsics.checkNotNull(adInternal, "null cannot be cast to non-null type com.vungle.ads.RewardedAdInternal");
        return (i2) adInternal;
    }

    public final void setAlertBodyText(String bodyText) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(String closeButtonText) {
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(String continueButtonText) {
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, String placementId, d adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.o0
    public i2 constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new i2(context);
    }
}
