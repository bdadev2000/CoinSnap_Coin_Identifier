package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationInterstitialListener {
    void onAdClicked(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdClosed(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter, int i9);

    void onAdFailedToLoad(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter, @NonNull AdError adError);

    void onAdLeftApplication(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdLoaded(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);
}
