package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcmw implements zzfgn {
    private final zzcla zza;
    private final zzcmw zzb = this;
    private final zzhky zzc;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;

    public /* synthetic */ zzcmw(zzcla zzclaVar, Context context, String str, zzcmv zzcmvVar) {
        zzhky zzhkyVar;
        zzhky zzhkyVar2;
        zzhky zzhkyVar3;
        zzhky zzhkyVar4;
        zzhky zzhkyVar5;
        zzhky zzhkyVar6;
        zzhky zzhkyVar7;
        zzhky zzhkyVar8;
        this.zza = zzclaVar;
        zzhkp zza = zzhkq.zza(context);
        this.zzc = zza;
        zzhkyVar = zzclaVar.zzaE;
        zzhkyVar2 = zzclaVar.zzaF;
        zzfen zzfenVar = new zzfen(zza, zzhkyVar, zzhkyVar2);
        this.zzd = zzfenVar;
        zzhkyVar3 = zzclaVar.zzaE;
        zzhky zzc = zzhko.zzc(new zzffx(zzhkyVar3));
        this.zze = zzc;
        zzhky zzc2 = zzhko.zzc(zzfhl.zza());
        this.zzf = zzc2;
        zzhkyVar4 = zzclaVar.zzc;
        zzhkyVar5 = zzclaVar.zzO;
        zzhky zzc3 = zzhko.zzc(new zzfgh(zza, zzhkyVar4, zzhkyVar5, zzfenVar, zzc, zzfhq.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzhko.zzc(new zzfgr(zzc3, zzc, zzc2));
        zzhkp zzc4 = zzhkq.zzc(str);
        this.zzi = zzc4;
        zzhkyVar6 = zzclaVar.zzl;
        zzhkyVar7 = zzclaVar.zzQ;
        zzhkyVar8 = zzclaVar.zzM;
        this.zzj = zzhko.zzc(new zzfgl(zzc4, zzc3, zza, zzc, zzc2, zzhkyVar6, zzhkyVar7, zzhkyVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfgn
    public final zzfgk zza() {
        return (zzfgk) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfgn
    public final zzfgq zzb() {
        return (zzfgq) this.zzh.zzb();
    }
}
