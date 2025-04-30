package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class o extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f13863g = new HashMap();
    public AppLovinSdk b;

    /* renamed from: c, reason: collision with root package name */
    public Context f13864c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f13865d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13866f;

    public final void a() {
        if (!TextUtils.isEmpty(this.zoneId)) {
            HashMap hashMap = f13863g;
            if (hashMap.containsKey(this.zoneId) && equals(((WeakReference) hashMap.get(this.zoneId)).get())) {
                hashMap.remove(this.zoneId);
            }
        }
    }

    @Override // com.google.ads.mediation.applovin.g, com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        a();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.g, com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i9) {
        a();
        super.failedToReceiveAd(i9);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.b.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.f13865d));
        a aVar = this.appLovinAdFactory;
        AppLovinSdk appLovinSdk = this.b;
        aVar.getClass();
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(appLovinSdk, context);
        create.setAdDisplayListener(this);
        create.setAdClickListener(this);
        create.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            String str = g.TAG;
            Log.d(str, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                Log.d(str, "Showing interstitial preloaded by SDK.");
                create.show();
                return;
            }
            return;
        }
        Log.d(g.TAG, "Showing interstitial for zone: " + this.zoneId);
        create.showAndRender(this.appLovinInterstitialAd);
        if (this.f13866f) {
            a();
        }
    }
}
