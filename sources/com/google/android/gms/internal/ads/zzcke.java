package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
final class zzcke implements zzfcw {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final String zzc;
    private final zzcjk zzd;
    private final zzhir zze;
    private final zzhir zzf;
    private final zzhir zzg;
    private final zzhir zzh;
    private final zzhir zzi;
    private final zzhir zzj;

    public /* synthetic */ zzcke(zzcjk zzcjkVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzckd zzckdVar) {
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzhir zzhirVar3;
        this.zzd = zzcjkVar;
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        zzhii zza = zzhij.zza(context);
        this.zze = zza;
        zzhii zza2 = zzhij.zza(zzsVar);
        this.zzf = zza2;
        zzhirVar = zzcjkVar.zzM;
        zzhir zzc = zzhih.zzc(new zzeoc(zzhirVar));
        this.zzg = zzc;
        zzhir zzc2 = zzhih.zzc(zzeoh.zza());
        this.zzh = zzc2;
        zzhir zzc3 = zzhih.zzc(zzddb.zza());
        this.zzi = zzc3;
        zzhirVar2 = zzcjkVar.zzc;
        zzhirVar3 = zzcjkVar.zzR;
        this.zzj = zzhih.zzc(new zzfcu(zza, zzhirVar2, zza2, zzhirVar3, zzc, zzc2, zzfhe.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfcw
    public final zzenh zza() {
        zzchr zzchrVar;
        zzhir zzhirVar;
        zzfct zzfctVar = (zzfct) this.zzj.zzb();
        zzeob zzeobVar = (zzeob) this.zzg.zzb();
        zzchrVar = this.zzd.zza;
        VersionInfoParcel zzc = zzcih.zzc(zzchrVar);
        zzhirVar = this.zzd.zzM;
        return new zzenh(this.zza, this.zzb, this.zzc, zzfctVar, zzeobVar, zzc, (zzdud) zzhirVar.zzb());
    }
}
