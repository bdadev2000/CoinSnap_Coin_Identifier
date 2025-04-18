package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdwd extends RewardedInterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdwh zzc;

    public zzdwd(zzdwh zzdwhVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdwhVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdwh zzdwhVar = this.zzc;
        zzl = zzdwh.zzl(loadAdError);
        zzdwhVar.zzm(zzl, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, rewardedInterstitialAd, str);
    }
}
