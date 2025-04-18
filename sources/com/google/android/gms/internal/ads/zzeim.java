package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
final class zzeim implements zzdik {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfgh zzd;
    private final zzcfo zze;
    private final zzfhc zzf;
    private final zzbjz zzg;
    private final boolean zzh;
    private final zzefj zzi;

    public zzeim(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfgh zzfghVar, zzcfo zzcfoVar, zzfhc zzfhcVar, boolean z2, zzbjz zzbjzVar, zzefj zzefjVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfghVar;
        this.zze = zzcfoVar;
        this.zzf = zzfhcVar;
        this.zzg = zzbjzVar;
        this.zzh = z2;
        this.zzi = zzefjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
        zzdgz zzdgzVar = (zzdgz) zzgfo.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zze, com.google.android.gms.ads.internal.util.zzt.zzI(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z2, this.zzd.zzO, false);
        if (zzcynVar != null) {
            zzcynVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdhz zzh = zzdgzVar.zzh();
        zzcfo zzcfoVar = this.zze;
        zzfgh zzfghVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i2 = zzfghVar.zzQ;
        String str = zzfghVar.zzB;
        zzfgm zzfgmVar = zzfghVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzac) null, zzcfoVar, i2, versionInfoParcel, str, zzkVar, zzfgmVar.zzb, zzfgmVar.zza, this.zzf.zzf, zzcynVar, zzfghVar.zzai ? this.zzi : null), true);
    }
}
