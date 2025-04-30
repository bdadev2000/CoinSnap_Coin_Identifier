package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdyr extends InterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdyx zzc;

    public zzdyr(zzdyx zzdyxVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdyxVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        String zzl;
        zzdyx zzdyxVar = this.zzc;
        zzl = zzdyx.zzl(loadAdError);
        zzdyxVar.zzm(zzl, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, interstitialAd, str);
    }
}
