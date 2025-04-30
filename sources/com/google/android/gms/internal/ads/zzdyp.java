package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdyp extends AppOpenAd.AppOpenAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdyx zzc;

    public zzdyp(zzdyx zzdyxVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdyxVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdyx zzdyxVar = this.zzc;
        zzl = zzdyx.zzl(loadAdError);
        zzdyxVar.zzm(zzl, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, appOpenAd, str);
    }
}
