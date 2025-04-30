package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcmi implements zzdwm {
    private final Context zza;
    private final zzbmo zzb;
    private final zzcla zzc;
    private final zzcmi zzd = this;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;

    public /* synthetic */ zzcmi(zzcla zzclaVar, Context context, zzbmo zzbmoVar, zzcmh zzcmhVar) {
        this.zzc = zzclaVar;
        this.zza = context;
        this.zzb = zzbmoVar;
        zzhkp zza = zzhkq.zza(this);
        this.zze = zza;
        zzhkp zza2 = zzhkq.zza(zzbmoVar);
        this.zzf = zza2;
        zzdwi zzdwiVar = new zzdwi(zza2);
        this.zzg = zzdwiVar;
        this.zzh = zzhko.zzc(new zzdwk(zza, zzdwiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwm
    public final zzdwd zzb() {
        return new zzcmc(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdwm
    public final zzdwj zzd() {
        return (zzdwj) this.zzh.zzb();
    }
}
