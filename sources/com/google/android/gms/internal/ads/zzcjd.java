package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcjd implements zzezu {
    private final zzciy zza;
    private final zzhgg zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;

    public /* synthetic */ zzcjd(zzciy zzciyVar, Context context, String str, zzckd zzckdVar) {
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzhgg zzhggVar3;
        zzhgg zzhggVar4;
        zzhgg zzhggVar5;
        zzhgg zzhggVar6;
        zzhgg zzhggVar7;
        zzhgg zzhggVar8;
        zzhgg zzhggVar9;
        this.zza = zzciyVar;
        zzhfx zza = zzhfy.zza(context);
        this.zzb = zza;
        zzhfx zza2 = zzhfy.zza(str);
        this.zzc = zza2;
        zzhggVar = zzciyVar.zzbd;
        zzhggVar2 = zzciyVar.zzbe;
        zzfcm zzfcmVar = new zzfcm(zza, zzhggVar, zzhggVar2);
        this.zzd = zzfcmVar;
        zzhggVar3 = zzciyVar.zzbd;
        zzhgg zzc = zzhfw.zzc(new zzfas(zzhggVar3));
        this.zze = zzc;
        zzhggVar4 = zzciyVar.zzc;
        zzhggVar5 = zzciyVar.zzS;
        zzffq zza3 = zzffq.zza();
        zzhggVar6 = zzciyVar.zzl;
        zzhgg zzc2 = zzhfw.zzc(new zzfau(zza, zzhggVar4, zzhggVar5, zzfcmVar, zzc, zza3, zzhggVar6));
        this.zzf = zzc2;
        zzhggVar7 = zzciyVar.zzS;
        zzhggVar8 = zzciyVar.zzl;
        zzhggVar9 = zzciyVar.zzM;
        this.zzg = zzhfw.zzc(new zzfba(zzhggVar7, zza, zza2, zzc2, zzc, zzhggVar8, zzhggVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzezu
    public final zzfaz zza() {
        return (zzfaz) this.zzg.zzb();
    }
}
