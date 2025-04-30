package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzclk implements zzfbu {
    private final zzcla zza;
    private final zzclk zzb = this;
    private final zzhky zzc;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;

    public /* synthetic */ zzclk(zzcla zzclaVar, Context context, String str, zzclj zzcljVar) {
        zzhky zzhkyVar;
        zzhky zzhkyVar2;
        zzhky zzhkyVar3;
        zzhky zzhkyVar4;
        zzhky zzhkyVar5;
        zzhky zzhkyVar6;
        zzhky zzhkyVar7;
        zzhky zzhkyVar8;
        zzhky zzhkyVar9;
        this.zza = zzclaVar;
        zzhkp zza = zzhkq.zza(context);
        this.zzc = zza;
        zzhkp zza2 = zzhkq.zza(str);
        this.zzd = zza2;
        zzhkyVar = zzclaVar.zzaE;
        zzhkyVar2 = zzclaVar.zzaF;
        zzfem zzfemVar = new zzfem(zza, zzhkyVar, zzhkyVar2);
        this.zze = zzfemVar;
        zzhkyVar3 = zzclaVar.zzaE;
        zzhky zzc = zzhko.zzc(new zzfcs(zzhkyVar3));
        this.zzf = zzc;
        zzhkyVar4 = zzclaVar.zzc;
        zzhkyVar5 = zzclaVar.zzO;
        zzfhq zza3 = zzfhq.zza();
        zzhkyVar6 = zzclaVar.zzl;
        zzhky zzc2 = zzhko.zzc(new zzfcu(zza, zzhkyVar4, zzhkyVar5, zzfemVar, zzc, zza3, zzhkyVar6));
        this.zzg = zzc2;
        zzhkyVar7 = zzclaVar.zzO;
        zzhkyVar8 = zzclaVar.zzl;
        zzhkyVar9 = zzclaVar.zzM;
        this.zzh = zzhko.zzc(new zzfda(zzhkyVar7, zza, zza2, zzc2, zzc, zzhkyVar8, zzhkyVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzfbu
    public final zzfcz zza() {
        return (zzfcz) this.zzh.zzb();
    }
}
