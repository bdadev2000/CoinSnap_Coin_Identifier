package com.google.ads.mediation.applovin;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public final class c implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f13848k = 0;
    public b b;

    /* renamed from: c, reason: collision with root package name */
    public AppLovinSdk f13849c;

    /* renamed from: d, reason: collision with root package name */
    public Context f13850d;

    /* renamed from: f, reason: collision with root package name */
    public String f13851f;

    /* renamed from: g, reason: collision with root package name */
    public final f f13852g;

    /* renamed from: h, reason: collision with root package name */
    public final a f13853h;

    /* renamed from: i, reason: collision with root package name */
    public final MediationAdLoadCallback f13854i;

    /* renamed from: j, reason: collision with root package name */
    public MediationBannerAdCallback f13855j;

    public c(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, f fVar, a aVar) {
        this.f13854i = mediationAdLoadCallback;
        this.f13852g = fVar;
        this.f13853h = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public final void adClicked(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f13855j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f13855j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f13855j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f13855j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f13855j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Banner did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + this.f13851f);
        this.b.f13847a.renderAd(appLovinAd);
        this.f13855j = (MediationBannerAdCallback) this.f13854i.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i9) {
        AdError adError = AppLovinUtils.getAdError(i9);
        com.mbridge.msdk.foundation.entity.o.z(i9, "Failed to load banner ad with error: ", com.mbridge.msdk.foundation.controller.a.f15376a);
        this.f13854i.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.b.f13847a;
    }
}
