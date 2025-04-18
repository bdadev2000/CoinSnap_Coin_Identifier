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

/* loaded from: classes3.dex */
public final class c implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f11441k = 0;

    /* renamed from: b, reason: collision with root package name */
    public b f11442b;

    /* renamed from: c, reason: collision with root package name */
    public AppLovinSdk f11443c;

    /* renamed from: d, reason: collision with root package name */
    public Context f11444d;

    /* renamed from: f, reason: collision with root package name */
    public String f11445f;

    /* renamed from: g, reason: collision with root package name */
    public final f f11446g;

    /* renamed from: h, reason: collision with root package name */
    public final a f11447h;

    /* renamed from: i, reason: collision with root package name */
    public final MediationAdLoadCallback f11448i;

    /* renamed from: j, reason: collision with root package name */
    public MediationBannerAdCallback f11449j;

    public c(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, f fVar, a aVar) {
        this.f11448i = mediationAdLoadCallback;
        this.f11446g = fVar;
        this.f11447h = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public final void adClicked(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.a, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11449j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(com.mbridge.msdk.foundation.controller.a.a, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11449j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.a, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11449j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(com.mbridge.msdk.foundation.controller.a.a, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.a, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(com.mbridge.msdk.foundation.controller.a.a, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11449j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(com.mbridge.msdk.foundation.controller.a.a, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11449j;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        Log.d(com.mbridge.msdk.foundation.controller.a.a, "Banner did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + this.f11445f);
        this.f11442b.a.renderAd(appLovinAd);
        this.f11449j = (MediationBannerAdCallback) this.f11448i.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        eb.j.v("Failed to load banner ad with error: ", i10, com.mbridge.msdk.foundation.controller.a.a);
        this.f11448i.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f11442b.a;
    }
}
