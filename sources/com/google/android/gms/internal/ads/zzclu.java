package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
final class zzclu implements zzfdi {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcla zzd;
    private final zzclu zze = this;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;
    private final zzhky zzk;

    public /* synthetic */ zzclu(zzcla zzclaVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzclt zzcltVar) {
        zzhky zzhkyVar;
        zzhky zzhkyVar2;
        zzhky zzhkyVar3;
        this.zzd = zzclaVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzhkp zza = zzhkq.zza(context);
        this.zzf = zza;
        zzhkp zza2 = zzhkq.zza(zzqVar);
        this.zzg = zza2;
        zzhkyVar = zzclaVar.zzM;
        zzhky zzc = zzhko.zzc(new zzepd(zzhkyVar));
        this.zzh = zzc;
        zzhky zzc2 = zzhko.zzc(zzepi.zza());
        this.zzi = zzc2;
        zzhky zzc3 = zzhko.zzc(zzdej.zza());
        this.zzj = zzc3;
        zzhkyVar2 = zzclaVar.zzc;
        zzhkyVar3 = zzclaVar.zzO;
        this.zzk = zzhko.zzc(new zzfdg(zza, zzhkyVar2, zza2, zzhkyVar3, zzc, zzc2, zzfhq.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final zzeoi zza() {
        zzcjg zzcjgVar;
        zzhky zzhkyVar;
        zzfdf zzfdfVar = (zzfdf) this.zzk.zzb();
        zzepc zzepcVar = (zzepc) this.zzh.zzb();
        zzcjgVar = this.zzd.zza;
        VersionInfoParcel zze = zzcjgVar.zze();
        zzhkx.zzb(zze);
        zzhkyVar = this.zzd.zzM;
        return new zzeoi(this.zza, this.zzb, this.zzc, zzfdfVar, zzepcVar, zze, (zzdvc) zzhkyVar.zzb());
    }
}
