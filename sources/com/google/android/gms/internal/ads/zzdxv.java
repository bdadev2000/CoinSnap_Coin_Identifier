package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdxv extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdxy zzb;

    public zzdxv(zzdxy zzdxyVar, String str) {
        this.zza = str;
        this.zzb = zzdxyVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdxy zzdxyVar = this.zzb;
        zzl = zzdxy.zzl(loadAdError);
        zzdxyVar.zzm(zzl, this.zza);
    }
}
