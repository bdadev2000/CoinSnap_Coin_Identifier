package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcjw implements zzfen {
    private final zzciy zza;
    private final zzhgg zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;

    public /* synthetic */ zzcjw(zzciy zzciyVar, Context context, String str, zzckd zzckdVar) {
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzhgg zzhggVar3;
        zzhgg zzhggVar4;
        zzhgg zzhggVar5;
        zzhgg zzhggVar6;
        zzhgg zzhggVar7;
        zzhgg zzhggVar8;
        this.zza = zzciyVar;
        zzhfx zza = zzhfy.zza(context);
        this.zzb = zza;
        zzhggVar = zzciyVar.zzbd;
        zzhggVar2 = zzciyVar.zzbe;
        zzfcn zzfcnVar = new zzfcn(zza, zzhggVar, zzhggVar2);
        this.zzc = zzfcnVar;
        zzhggVar3 = zzciyVar.zzbd;
        zzhgg zzc = zzhfw.zzc(new zzfdx(zzhggVar3));
        this.zzd = zzc;
        zzhgg zzc2 = zzhfw.zzc(zzffl.zza());
        this.zze = zzc2;
        zzhggVar4 = zzciyVar.zzc;
        zzhggVar5 = zzciyVar.zzS;
        zzhgg zzc3 = zzhfw.zzc(new zzfeh(zza, zzhggVar4, zzhggVar5, zzfcnVar, zzc, zzffq.zza(), zzc2));
        this.zzf = zzc3;
        this.zzg = zzhfw.zzc(new zzfer(zzc3, zzc, zzc2));
        zzhfx zzc4 = zzhfy.zzc(str);
        this.zzh = zzc4;
        zzhggVar6 = zzciyVar.zzl;
        zzhggVar7 = zzciyVar.zzU;
        zzhggVar8 = zzciyVar.zzM;
        this.zzi = zzhfw.zzc(new zzfel(zzc4, zzc3, zza, zzc, zzc2, zzhggVar6, zzhggVar7, zzhggVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final zzfek zza() {
        return (zzfek) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final zzfeq zzb() {
        return (zzfeq) this.zzg.zzb();
    }
}
