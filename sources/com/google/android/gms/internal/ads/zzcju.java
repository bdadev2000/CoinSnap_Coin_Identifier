package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcju implements zzfbi {
    private final zzcjk zza;
    private final zzhir zzb;
    private final zzhir zzc;
    private final zzhir zzd;
    private final zzhir zze;
    private final zzhir zzf;
    private final zzhir zzg;

    public /* synthetic */ zzcju(zzcjk zzcjkVar, Context context, String str, zzcjt zzcjtVar) {
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzhir zzhirVar3;
        zzhir zzhirVar4;
        zzhir zzhirVar5;
        zzhir zzhirVar6;
        zzhir zzhirVar7;
        zzhir zzhirVar8;
        zzhir zzhirVar9;
        this.zza = zzcjkVar;
        zzhii zza = zzhij.zza(context);
        this.zzb = zza;
        zzhii zza2 = zzhij.zza(str);
        this.zzc = zza2;
        zzhirVar = zzcjkVar.zzaL;
        zzhirVar2 = zzcjkVar.zzaM;
        zzfea zzfeaVar = new zzfea(zza, zzhirVar, zzhirVar2);
        this.zzd = zzfeaVar;
        zzhirVar3 = zzcjkVar.zzaL;
        zzhir zzc = zzhih.zzc(new zzfcg(zzhirVar3));
        this.zze = zzc;
        zzhirVar4 = zzcjkVar.zzc;
        zzhirVar5 = zzcjkVar.zzR;
        zzfhe zza3 = zzfhe.zza();
        zzhirVar6 = zzcjkVar.zzl;
        zzhir zzc2 = zzhih.zzc(new zzfci(zza, zzhirVar4, zzhirVar5, zzfeaVar, zzc, zza3, zzhirVar6));
        this.zzf = zzc2;
        zzhirVar7 = zzcjkVar.zzR;
        zzhirVar8 = zzcjkVar.zzl;
        zzhirVar9 = zzcjkVar.zzM;
        this.zzg = zzhih.zzc(new zzfco(zzhirVar7, zza, zza2, zzc2, zzc, zzhirVar8, zzhirVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final zzfcn zza() {
        return (zzfcn) this.zzg.zzb();
    }
}
