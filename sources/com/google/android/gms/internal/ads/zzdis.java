package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdis implements zzgee {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdit zzb;

    public zzdis(zzdit zzditVar, View view) {
        this.zza = view;
        this.zzb = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfl)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzad(this.zza, (zzeew) obj);
    }
}
