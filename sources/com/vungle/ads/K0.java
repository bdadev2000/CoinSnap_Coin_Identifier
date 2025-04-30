package com.vungle.ads;

import android.content.Context;
import c7.C0665z;

/* loaded from: classes3.dex */
public final class K0 extends AbstractC2068a0 implements com.vungle.ads.internal.presenter.A {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(Context context) {
        super(context);
        G7.j.e(context, "context");
    }

    @Override // com.vungle.ads.internal.presenter.A
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.A
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.A
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.A
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.A
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public boolean isValidAdTypeForPlacement(c7.p1 p1Var) {
        G7.j.e(p1Var, "placement");
        return p1Var.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public void renderAd$vungle_ads_release(com.vungle.ads.internal.presenter.c cVar, c7.p1 p1Var, C0665z c0665z) {
        G7.j.e(p1Var, "placement");
        G7.j.e(c0665z, "advertisement");
        com.vungle.ads.internal.ui.i.Companion.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(cVar, p1Var, c0665z);
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
