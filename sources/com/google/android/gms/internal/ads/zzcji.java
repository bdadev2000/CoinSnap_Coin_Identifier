package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
final class zzcji implements zzfbi {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final String zzc;
    private final zzciy zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;
    private final zzhgg zzj;

    public /* synthetic */ zzcji(zzciy zzciyVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzckd zzckdVar) {
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzhgg zzhggVar3;
        this.zzd = zzciyVar;
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        zzhfx zza = zzhfy.zza(context);
        this.zze = zza;
        zzhfx zza2 = zzhfy.zza(zzsVar);
        this.zzf = zza2;
        zzhggVar = zzciyVar.zzM;
        zzhgg zzc = zzhfw.zzc(new zzemt(zzhggVar));
        this.zzg = zzc;
        zzhgg zzc2 = zzhfw.zzc(zzemy.zza());
        this.zzh = zzc2;
        zzhgg zzc3 = zzhfw.zzc(zzdbm.zza());
        this.zzi = zzc3;
        zzhggVar2 = zzciyVar.zzc;
        zzhggVar3 = zzciyVar.zzS;
        this.zzj = zzhfw.zzc(new zzfbg(zza, zzhggVar2, zza2, zzhggVar3, zzc, zzc2, zzffq.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final zzely zza() {
        zzchn zzchnVar;
        zzhgg zzhggVar;
        zzfbf zzfbfVar = (zzfbf) this.zzj.zzb();
        zzems zzemsVar = (zzems) this.zzg.zzb();
        zzchnVar = this.zzd.zza;
        VersionInfoParcel zzc = zzcid.zzc(zzchnVar);
        zzhggVar = this.zzd.zzM;
        return new zzely(this.zza, this.zzb, this.zzc, zzfbfVar, zzemsVar, zzc, (zzdsm) zzhggVar.zzb());
    }
}
