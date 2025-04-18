package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdwe extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwh zzb;

    public zzdwe(zzdwh zzdwhVar, String str) {
        this.zza = str;
        this.zzb = zzdwhVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdwh zzdwhVar = this.zzb;
        zzl = zzdwh.zzl(loadAdError);
        zzdwhVar.zzm(zzl, this.zza);
    }
}
