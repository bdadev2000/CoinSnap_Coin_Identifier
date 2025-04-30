package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdyu extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdyx zzb;

    public zzdyu(zzdyx zzdyxVar, String str) {
        this.zza = str;
        this.zzb = zzdyxVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdyx zzdyxVar = this.zzb;
        zzl = zzdyx.zzl(loadAdError);
        zzdyxVar.zzm(zzl, this.zza);
    }
}
