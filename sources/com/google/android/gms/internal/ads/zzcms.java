package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcms implements zzfez {
    private final zzcla zza;
    private final zzcms zzb = this;
    private final zzhky zzc;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;

    public /* synthetic */ zzcms(zzcla zzclaVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcmr zzcmrVar) {
        zzhky zzhkyVar;
        zzhky zzhkyVar2;
        zzhky zzhkyVar3;
        zzhky zzhkyVar4;
        zzhky zzhkyVar5;
        zzhky zzhkyVar6;
        zzhky zzhkyVar7;
        this.zza = zzclaVar;
        zzhkp zza = zzhkq.zza(context);
        this.zzc = zza;
        zzhkp zza2 = zzhkq.zza(zzqVar);
        this.zzd = zza2;
        zzhkp zza3 = zzhkq.zza(str);
        this.zze = zza3;
        zzhkyVar = zzclaVar.zzM;
        zzhky zzc = zzhko.zzc(new zzepd(zzhkyVar));
        this.zzf = zzc;
        zzhkyVar2 = zzclaVar.zzaE;
        zzhky zzc2 = zzhko.zzc(new zzffx(zzhkyVar2));
        this.zzg = zzc2;
        zzhkyVar3 = zzclaVar.zzc;
        zzhkyVar4 = zzclaVar.zzO;
        zzhky zzc3 = zzhko.zzc(new zzfex(zza, zzhkyVar3, zzhkyVar4, zzc, zzc2, zzfhq.zza()));
        this.zzh = zzc3;
        zzhkyVar5 = zzclaVar.zzl;
        zzhkyVar6 = zzclaVar.zzQ;
        zzhkyVar7 = zzclaVar.zzM;
        this.zzi = zzhko.zzc(new zzepl(zza, zza2, zza3, zzc3, zzc, zzc2, zzhkyVar5, zzhkyVar6, zzhkyVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzfez
    public final zzepk zza() {
        return (zzepk) this.zzi.zzb();
    }
}
