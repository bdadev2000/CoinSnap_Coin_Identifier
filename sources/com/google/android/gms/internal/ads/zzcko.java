package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcko implements zzdvf {
    private final Long zza;
    private final String zzb;
    private final zzcjk zzc;
    private final zzcks zzd;

    public /* synthetic */ zzcko(zzcjk zzcjkVar, zzcks zzcksVar, Long l2, String str, zzckn zzcknVar) {
        this.zzc = zzcjkVar;
        this.zzd = zzcksVar;
        this.zza = l2;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdvf
    public final zzdvp zza() {
        Context context;
        zzdvi zzc;
        zzcks zzcksVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcksVar.zza;
        zzc = zzdvj.zzc(zzcksVar.zzb);
        return zzdvq.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdvf
    public final zzdvt zzb() {
        Context context;
        zzdvi zzc;
        zzcks zzcksVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcksVar.zza;
        zzc = zzdvj.zzc(zzcksVar.zzb);
        return zzdvu.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
