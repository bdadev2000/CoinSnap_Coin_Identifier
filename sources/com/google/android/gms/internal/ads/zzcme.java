package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcme implements zzdwe {
    private final Long zza;
    private final String zzb;
    private final zzcla zzc;
    private final zzcmi zzd;
    private final zzcme zze = this;

    public /* synthetic */ zzcme(zzcla zzclaVar, zzcmi zzcmiVar, Long l, String str, zzcmd zzcmdVar) {
        this.zzc = zzclaVar;
        this.zzd = zzcmiVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdwe
    public final zzdwo zza() {
        Context context;
        zzdwh zzc;
        zzcmi zzcmiVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcmiVar.zza;
        zzc = zzdwi.zzc(zzcmiVar.zzb);
        return zzdwp.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdwe
    public final zzdws zzb() {
        Context context;
        zzdwh zzc;
        zzcmi zzcmiVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcmiVar.zza;
        zzc = zzdwi.zzc(zzcmiVar.zzb);
        return zzdwt.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
