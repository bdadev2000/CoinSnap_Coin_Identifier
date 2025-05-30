package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationBannerListener {
    void onAdClicked(@NonNull MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(@NonNull MediationBannerAdapter mediationBannerAdapter);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationBannerAdapter mediationBannerAdapter, int i9);

    void onAdFailedToLoad(@NonNull MediationBannerAdapter mediationBannerAdapter, @NonNull AdError adError);

    void onAdLeftApplication(@NonNull MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(@NonNull MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(@NonNull MediationBannerAdapter mediationBannerAdapter);

    void zzb(@NonNull MediationBannerAdapter mediationBannerAdapter, @NonNull String str, @NonNull String str2);
}
