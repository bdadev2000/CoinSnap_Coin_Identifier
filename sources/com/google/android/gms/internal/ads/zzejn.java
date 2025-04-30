package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
final class zzejn implements zzdjp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final f4.c zzc;
    private final zzfgt zzd;
    private final zzchd zze;
    private final zzfho zzf;
    private final zzbls zzg;
    private final boolean zzh;
    private final zzegk zzi;

    public zzejn(Context context, VersionInfoParcel versionInfoParcel, f4.c cVar, zzfgt zzfgtVar, zzchd zzchdVar, zzfho zzfhoVar, boolean z8, zzbls zzblsVar, zzegk zzegkVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = cVar;
        this.zzd = zzfgtVar;
        this.zze = zzchdVar;
        this.zzf = zzfhoVar;
        this.zzg = zzblsVar;
        this.zzh = z8;
        this.zzi = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjp
    public final void zza(boolean z8, Context context, zzczy zzczyVar) {
        boolean z9;
        boolean z10;
        float f9;
        zzegk zzegkVar;
        zzdih zzdihVar = (zzdih) zzgft.zzq(this.zzc);
        this.zze.zzaq(true);
        if (this.zzh) {
            z9 = this.zzg.zze(false);
        } else {
            z9 = false;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        Context context2 = this.zza;
        boolean z11 = this.zzh;
        boolean zzI = com.google.android.gms.ads.internal.util.zzt.zzI(context2);
        if (z11) {
            z10 = this.zzg.zzd();
        } else {
            z10 = false;
        }
        if (this.zzh) {
            f9 = this.zzg.zza();
        } else {
            f9 = 0.0f;
        }
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(z9, zzI, z10, f9, -1, z8, this.zzd.zzP, false);
        if (zzczyVar != null) {
            zzczyVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdje zzh = zzdihVar.zzh();
        zzchd zzchdVar = this.zze;
        zzfgt zzfgtVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i9 = zzfgtVar.zzR;
        String str = zzfgtVar.zzC;
        zzfgy zzfgyVar = zzfgtVar.zzt;
        String str2 = zzfgyVar.zzb;
        String str3 = zzfgyVar.zza;
        zzfho zzfhoVar = this.zzf;
        if (zzfgtVar.zzaj) {
            zzegkVar = this.zzi;
        } else {
            zzegkVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzchdVar, i9, versionInfoParcel, str, zzkVar, str2, str3, zzfhoVar.zzf, zzczyVar, zzegkVar), true);
    }
}
