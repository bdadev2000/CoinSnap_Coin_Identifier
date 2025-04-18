package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcps implements zzhfx {
    private final zzcpk zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzcps(zzcpk zzcpkVar, zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzcpkVar;
        this.zzb = zzhgpVar;
        this.zzc = zzhgpVar2;
        this.zzd = zzhgpVar3;
        this.zze = zzhgpVar4;
    }

    public static zzded zza(zzcpk zzcpkVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfet zzfetVar, final zzffo zzffoVar) {
        return new zzded(new zzcya() { // from class: com.google.android.gms.internal.ads.zzcpi
            @Override // com.google.android.gms.internal.ads.zzcya
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzax zzt = com.google.android.gms.ads.internal.zzv.zzt();
                Context context2 = context;
                zzffo zzffoVar2 = zzffoVar;
                zzt.zzn(context2, versionInfoParcel.afmaVersion, zzfetVar.zzC.toString(), zzffoVar2.zzf);
            }
        }, zzcaj.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (Context) this.zzb.zzb(), ((zzcid) this.zzc).zza(), ((zzcsh) this.zzd).zza(), ((zzcwd) this.zze).zza());
    }
}
