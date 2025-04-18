package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i2 extends y0 implements com.vungle.ads.internal.presenter.a0 {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.presenter.a0
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.a0
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.a0
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.a0
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.a0
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.v
    public boolean isValidAdTypeForPlacement(bh.o3 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.v
    public void renderAd$vungle_ads_release(com.vungle.ads.internal.presenter.c cVar, bh.o3 placement, bh.z advertisement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        com.vungle.ads.internal.ui.i.Companion.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(cVar, placement, advertisement);
    }

    public final void setAlertBodyText$vungle_ads_release(String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }
}
