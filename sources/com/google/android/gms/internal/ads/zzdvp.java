package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes4.dex */
public final class zzdvp implements zzdvd {
    private final long zza;
    private final zzeoj zzb;

    public zzdvp(long j2, Context context, zzdvi zzdviVar, zzcho zzchoVar, String str) {
        this.zza = j2;
        zzfem zzv = zzchoVar.zzv();
        zzv.zzc(context);
        zzv.zza(new com.google.android.gms.ads.internal.client.zzs());
        zzv.zzb(str);
        zzeoj zza = zzv.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdvo(this, zzdviVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
