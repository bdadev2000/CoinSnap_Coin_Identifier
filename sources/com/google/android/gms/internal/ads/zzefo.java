package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
final class zzefo implements zzdgv {
    private final VersionInfoParcel zza;
    private final ua.b zzb;
    private final zzfet zzc;
    private final zzcfk zzd;
    private final zzffo zze;
    private final zzbju zzf;
    private final boolean zzg;
    private final zzeea zzh;

    public zzefo(VersionInfoParcel versionInfoParcel, ua.b bVar, zzfet zzfetVar, zzcfk zzcfkVar, zzffo zzffoVar, boolean z10, zzbju zzbjuVar, zzeea zzeeaVar) {
        this.zza = versionInfoParcel;
        this.zzb = bVar;
        this.zzc = zzfetVar;
        this.zzd = zzcfkVar;
        this.zze = zzffoVar;
        this.zzg = z10;
        this.zzf = zzbjuVar;
        this.zzh = zzeeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
        boolean z11;
        boolean z12;
        float f10;
        zzeea zzeeaVar;
        zzcoo zzcooVar = (zzcoo) zzgei.zzq(this.zzb);
        this.zzd.zzaq(true);
        if (this.zzg) {
            z11 = this.zzf.zze(true);
        } else {
            z11 = true;
        }
        boolean z13 = this.zzg;
        if (z13) {
            z12 = this.zzf.zzd();
        } else {
            z12 = false;
        }
        boolean z14 = z12;
        if (z13) {
            f10 = this.zzf.zza();
        } else {
            f10 = 0.0f;
        }
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(z11, true, z14, f10, -1, z10, this.zzc.zzO, false);
        if (zzcwzVar != null) {
            zzcwzVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        zzdgk zzg = zzcooVar.zzg();
        zzcfk zzcfkVar = this.zzd;
        int i10 = this.zzc.zzQ;
        if (i10 == -1) {
            com.google.android.gms.ads.internal.client.zzy zzyVar = this.zze.zzj;
            if (zzyVar != null) {
                int i11 = zzyVar.zza;
                if (i11 == 1) {
                    i10 = 7;
                } else if (i11 == 2) {
                    i10 = 6;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("Error setting app open orientation; no targeting orientation available.");
            i10 = this.zzc.zzQ;
        }
        int i12 = i10;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzfet zzfetVar = this.zzc;
        String str = zzfetVar.zzB;
        zzfey zzfeyVar = zzfetVar.zzs;
        String str2 = zzfeyVar.zzb;
        String str3 = zzfeyVar.zza;
        zzffo zzffoVar = this.zze;
        if (zzfetVar.zzai) {
            zzeeaVar = this.zzh;
        } else {
            zzeeaVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzac) null, zzcfkVar, i12, versionInfoParcel, str, zzlVar, str2, str3, zzffoVar.zzf, zzcwzVar, zzeeaVar), true);
    }
}
