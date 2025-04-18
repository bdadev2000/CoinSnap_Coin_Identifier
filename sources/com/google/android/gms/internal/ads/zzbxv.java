package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* loaded from: classes3.dex */
public final class zzbxv extends zzbxi {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbxw zzb;

    public zzbxv(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbxw zzbxwVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg() {
        zzbxw zzbxwVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbxwVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbxwVar);
    }
}
