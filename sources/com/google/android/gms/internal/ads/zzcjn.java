package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcjn implements zzdto {
    private final Long zza;
    private final String zzb;
    private final zzciy zzc;
    private final zzcjp zzd;

    public /* synthetic */ zzcjn(zzciy zzciyVar, zzcjp zzcjpVar, Long l10, String str, zzckd zzckdVar) {
        this.zzc = zzciyVar;
        this.zzd = zzcjpVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final zzdty zza() {
        Context context;
        zzdtr zzc;
        zzcjp zzcjpVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcjpVar.zza;
        zzc = zzdts.zzc(zzcjpVar.zzb);
        return zzdtz.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final zzduc zzb() {
        Context context;
        zzdtr zzc;
        zzcjp zzcjpVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcjpVar.zza;
        zzc = zzdts.zzc(zzcjpVar.zzb);
        return zzdud.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
