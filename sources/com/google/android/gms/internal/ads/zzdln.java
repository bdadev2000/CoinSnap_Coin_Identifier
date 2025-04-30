package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdln implements zzgfp {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdlo zzb;

    public zzdln(zzdlo zzdloVar, View view) {
        this.zza = view;
        this.zzb = zzdloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzac(this.zza, (zzehg) obj);
    }
}
