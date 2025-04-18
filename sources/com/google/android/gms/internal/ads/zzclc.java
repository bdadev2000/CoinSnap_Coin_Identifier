package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzclc implements zzfen {
    private final zzcjk zza;
    private final zzhir zzb;
    private final zzhir zzc;
    private final zzhir zzd;
    private final zzhir zze;
    private final zzhir zzf;
    private final zzhir zzg;
    private final zzhir zzh;

    public /* synthetic */ zzclc(zzcjk zzcjkVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzclb zzclbVar) {
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzhir zzhirVar3;
        zzhir zzhirVar4;
        zzhir zzhirVar5;
        zzhir zzhirVar6;
        zzhir zzhirVar7;
        this.zza = zzcjkVar;
        zzhii zza = zzhij.zza(context);
        this.zzb = zza;
        zzhii zza2 = zzhij.zza(zzsVar);
        this.zzc = zza2;
        zzhii zza3 = zzhij.zza(str);
        this.zzd = zza3;
        zzhirVar = zzcjkVar.zzM;
        zzhir zzc = zzhih.zzc(new zzeoc(zzhirVar));
        this.zze = zzc;
        zzhirVar2 = zzcjkVar.zzaL;
        zzhir zzc2 = zzhih.zzc(new zzffl(zzhirVar2));
        this.zzf = zzc2;
        zzhirVar3 = zzcjkVar.zzc;
        zzhirVar4 = zzcjkVar.zzR;
        zzhir zzc3 = zzhih.zzc(new zzfel(zza, zzhirVar3, zzhirVar4, zzc, zzc2, zzfhe.zza()));
        this.zzg = zzc3;
        zzhirVar5 = zzcjkVar.zzl;
        zzhirVar6 = zzcjkVar.zzT;
        zzhirVar7 = zzcjkVar.zzM;
        this.zzh = zzhih.zzc(new zzeok(zza, zza2, zza3, zzc3, zzc, zzc2, zzhirVar5, zzhirVar6, zzhirVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final zzeoj zza() {
        return (zzeoj) this.zzh.zzb();
    }
}
