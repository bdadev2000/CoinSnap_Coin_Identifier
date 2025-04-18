package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcju implements zzfcz {
    private final zzciy zza;
    private final zzhgg zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;

    public /* synthetic */ zzcju(zzciy zzciyVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzckd zzckdVar) {
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzhgg zzhggVar3;
        zzhgg zzhggVar4;
        zzhgg zzhggVar5;
        zzhgg zzhggVar6;
        zzhgg zzhggVar7;
        this.zza = zzciyVar;
        zzhfx zza = zzhfy.zza(context);
        this.zzb = zza;
        zzhfx zza2 = zzhfy.zza(zzsVar);
        this.zzc = zza2;
        zzhfx zza3 = zzhfy.zza(str);
        this.zzd = zza3;
        zzhggVar = zzciyVar.zzM;
        zzhgg zzc = zzhfw.zzc(new zzemt(zzhggVar));
        this.zze = zzc;
        zzhggVar2 = zzciyVar.zzbd;
        zzhgg zzc2 = zzhfw.zzc(new zzfdx(zzhggVar2));
        this.zzf = zzc2;
        zzhggVar3 = zzciyVar.zzc;
        zzhggVar4 = zzciyVar.zzS;
        zzhgg zzc3 = zzhfw.zzc(new zzfcx(zza, zzhggVar3, zzhggVar4, zzc, zzc2, zzffq.zza()));
        this.zzg = zzc3;
        zzhggVar5 = zzciyVar.zzl;
        zzhggVar6 = zzciyVar.zzU;
        zzhggVar7 = zzciyVar.zzM;
        this.zzh = zzhfw.zzc(new zzenb(zza, zza2, zza3, zzc3, zzc, zzc2, zzhggVar5, zzhggVar6, zzhggVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzfcz
    public final zzena zza() {
        return (zzena) this.zzh.zzb();
    }
}
