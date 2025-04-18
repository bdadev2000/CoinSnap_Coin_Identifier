package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdwa extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdwh zzd;

    public zzdwa(zzdwh zzdwhVar, String str, AdView adView, String str2) {
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
        this.zzd = zzdwhVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdwh zzdwhVar = this.zzd;
        zzl = zzdwh.zzl(loadAdError);
        zzdwhVar.zzm(zzl, this.zzc);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
