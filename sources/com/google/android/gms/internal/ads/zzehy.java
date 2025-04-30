package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
final class zzehy implements zzdjp {
    private final VersionInfoParcel zza;
    private final f4.c zzb;
    private final zzfgt zzc;
    private final zzchd zzd;
    private final zzfho zze;
    private final zzbls zzf;
    private final boolean zzg;
    private final zzegk zzh;

    public zzehy(VersionInfoParcel versionInfoParcel, f4.c cVar, zzfgt zzfgtVar, zzchd zzchdVar, zzfho zzfhoVar, boolean z8, zzbls zzblsVar, zzegk zzegkVar) {
        this.zza = versionInfoParcel;
        this.zzb = cVar;
        this.zzc = zzfgtVar;
        this.zzd = zzchdVar;
        this.zze = zzfhoVar;
        this.zzg = z8;
        this.zzf = zzblsVar;
        this.zzh = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjp
    public final void zza(boolean z8, Context context, zzczy zzczyVar) {
        boolean z9;
        boolean z10;
        float f9;
        zzegk zzegkVar;
        zzcrq zzcrqVar = (zzcrq) zzgft.zzq(this.zzb);
        this.zzd.zzaq(true);
        if (this.zzg) {
            z9 = this.zzf.zze(true);
        } else {
            z9 = true;
        }
        boolean z11 = this.zzg;
        if (z11) {
            z10 = this.zzf.zzd();
        } else {
            z10 = false;
        }
        boolean z12 = z10;
        if (z11) {
            f9 = this.zzf.zza();
        } else {
            f9 = 0.0f;
        }
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(z9, true, z12, f9, -1, z8, this.zzc.zzP, false);
        if (zzczyVar != null) {
            zzczyVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdje zzg = zzcrqVar.zzg();
        zzchd zzchdVar = this.zzd;
        int i9 = this.zzc.zzR;
        if (i9 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i10 = zzwVar.zza;
                if (i10 == 1) {
                    i9 = 7;
                } else if (i10 == 2) {
                    i9 = 6;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("Error setting app open orientation; no targeting orientation available.");
            i9 = this.zzc.zzR;
        }
        int i11 = i9;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzfgt zzfgtVar = this.zzc;
        String str = zzfgtVar.zzC;
        zzfgy zzfgyVar = zzfgtVar.zzt;
        String str2 = zzfgyVar.zzb;
        String str3 = zzfgyVar.zza;
        zzfho zzfhoVar = this.zze;
        if (zzfgtVar.zzaj) {
            zzegkVar = this.zzh;
        } else {
            zzegkVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzchdVar, i11, versionInfoParcel, str, zzkVar, str2, str3, zzfhoVar.zzf, zzczyVar, zzegkVar), true);
    }
}
