package com.google.ads.mediation;

import c3.i;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes3.dex */
public final class c extends InterstitialAdLoadCallback {
    public final AbstractAdViewAdapter a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialListener f11475b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.a = abstractAdViewAdapter;
        this.f11475b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f11475b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        MediationInterstitialListener mediationInterstitialListener = this.f11475b;
        interstitialAd2.setFullScreenContentCallback(new i(abstractAdViewAdapter, mediationInterstitialListener));
        mediationInterstitialListener.onAdLoaded(abstractAdViewAdapter);
    }
}
