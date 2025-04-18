package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
final class zzegx implements zzdik {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfgh zzc;
    private final zzcfo zzd;
    private final zzfhc zze;
    private final zzbjz zzf;
    private final boolean zzg;
    private final zzefj zzh;

    public zzegx(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfgh zzfghVar, zzcfo zzcfoVar, zzfhc zzfhcVar, boolean z2, zzbjz zzbjzVar, zzefj zzefjVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfghVar;
        this.zzd = zzcfoVar;
        this.zze = zzfhcVar;
        this.zzg = z2;
        this.zzf = zzbjzVar;
        this.zzh = zzefjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
        zzcqc zzcqcVar = (zzcqc) zzgfo.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z3 = this.zzg;
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zze, true, z3 ? this.zzf.zzd() : false, z3 ? this.zzf.zza() : 0.0f, -1, z2, this.zzc.zzO, false);
        if (zzcynVar != null) {
            zzcynVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdhz zzg = zzcqcVar.zzg();
        zzcfo zzcfoVar = this.zzd;
        int i2 = this.zzc.zzQ;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzy zzyVar = this.zze.zzj;
            if (zzyVar != null) {
                int i3 = zzyVar.zza;
                if (i3 == 1) {
                    i2 = 7;
                } else if (i3 == 2) {
                    i2 = 6;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzQ;
        }
        int i4 = i2;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzfgh zzfghVar = this.zzc;
        String str = zzfghVar.zzB;
        zzfgm zzfgmVar = zzfghVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzac) null, zzcfoVar, i4, versionInfoParcel, str, zzkVar, zzfgmVar.zzb, zzfgmVar.zza, this.zze.zzf, zzcynVar, zzfghVar.zzai ? this.zzh : null), true);
    }
}
