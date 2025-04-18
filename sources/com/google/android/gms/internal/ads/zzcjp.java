package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcjp implements zzdtw {
    private final Context zza;
    private final zzbkq zzb;
    private final zzciy zzc;
    private final zzcjp zzd = this;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;

    public /* synthetic */ zzcjp(zzciy zzciyVar, Context context, zzbkq zzbkqVar, zzckd zzckdVar) {
        this.zzc = zzciyVar;
        this.zza = context;
        this.zzb = zzbkqVar;
        zzhfx zza = zzhfy.zza(this);
        this.zze = zza;
        zzhfx zza2 = zzhfy.zza(zzbkqVar);
        this.zzf = zza2;
        zzdts zzdtsVar = new zzdts(zza2);
        this.zzg = zzdtsVar;
        this.zzh = zzhfw.zzc(new zzdtu(zza, zzdtsVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtw
    public final zzdtn zzb() {
        return new zzcjm(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdtw
    public final zzdtt zzd() {
        return (zzdtt) this.zzh.zzb();
    }
}
