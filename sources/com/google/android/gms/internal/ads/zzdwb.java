package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdwb extends InterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdwh zzc;

    public zzdwb(zzdwh zzdwhVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdwhVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        String zzl;
        zzdwh zzdwhVar = this.zzc;
        zzl = zzdwh.zzl(loadAdError);
        zzdwhVar.zzm(zzl, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, interstitialAd, str);
    }
}
