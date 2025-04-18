package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzclg implements zzfgb {
    private final zzcjk zza;
    private final zzhir zzb;
    private final zzhir zzc;
    private final zzhir zzd;
    private final zzhir zze;
    private final zzhir zzf;
    private final zzhir zzg;
    private final zzhir zzh;
    private final zzhir zzi;

    public /* synthetic */ zzclg(zzcjk zzcjkVar, Context context, String str, zzclf zzclfVar) {
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzhir zzhirVar3;
        zzhir zzhirVar4;
        zzhir zzhirVar5;
        zzhir zzhirVar6;
        zzhir zzhirVar7;
        zzhir zzhirVar8;
        this.zza = zzcjkVar;
        zzhii zza = zzhij.zza(context);
        this.zzb = zza;
        zzhirVar = zzcjkVar.zzaL;
        zzhirVar2 = zzcjkVar.zzaM;
        zzfeb zzfebVar = new zzfeb(zza, zzhirVar, zzhirVar2);
        this.zzc = zzfebVar;
        zzhirVar3 = zzcjkVar.zzaL;
        zzhir zzc = zzhih.zzc(new zzffl(zzhirVar3));
        this.zzd = zzc;
        zzhir zzc2 = zzhih.zzc(zzfgz.zza());
        this.zze = zzc2;
        zzhirVar4 = zzcjkVar.zzc;
        zzhirVar5 = zzcjkVar.zzR;
        zzhir zzc3 = zzhih.zzc(new zzffv(zza, zzhirVar4, zzhirVar5, zzfebVar, zzc, zzfhe.zza(), zzc2));
        this.zzf = zzc3;
        this.zzg = zzhih.zzc(new zzfgf(zzc3, zzc, zzc2));
        zzhii zzc4 = zzhij.zzc(str);
        this.zzh = zzc4;
        zzhirVar6 = zzcjkVar.zzl;
        zzhirVar7 = zzcjkVar.zzT;
        zzhirVar8 = zzcjkVar.zzM;
        this.zzi = zzhih.zzc(new zzffz(zzc4, zzc3, zza, zzc, zzc2, zzhirVar6, zzhirVar7, zzhirVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfgb
    public final zzffy zza() {
        return (zzffy) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfgb
    public final zzfge zzb() {
        return (zzfge) this.zzg.zzb();
    }
}
