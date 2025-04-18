package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
final class zzehd implements zzdgv {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ua.b zzc;
    private final zzfet zzd;
    private final zzcfk zze;
    private final zzffo zzf;
    private final zzbju zzg;
    private final boolean zzh;
    private final zzeea zzi;

    public zzehd(Context context, VersionInfoParcel versionInfoParcel, ua.b bVar, zzfet zzfetVar, zzcfk zzcfkVar, zzffo zzffoVar, boolean z10, zzbju zzbjuVar, zzeea zzeeaVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = bVar;
        this.zzd = zzfetVar;
        this.zze = zzcfkVar;
        this.zzf = zzffoVar;
        this.zzg = zzbjuVar;
        this.zzh = z10;
        this.zzi = zzeeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
        boolean z11;
        boolean z12;
        float f10;
        zzeea zzeeaVar;
        zzdfk zzdfkVar = (zzdfk) zzgei.zzq(this.zzc);
        this.zze.zzaq(true);
        if (this.zzh) {
            z11 = this.zzg.zze(false);
        } else {
            z11 = false;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        Context context2 = this.zza;
        boolean z13 = this.zzh;
        boolean zzI = com.google.android.gms.ads.internal.util.zzs.zzI(context2);
        if (z13) {
            z12 = this.zzg.zzd();
        } else {
            z12 = false;
        }
        if (this.zzh) {
            f10 = this.zzg.zza();
        } else {
            f10 = 0.0f;
        }
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(z11, zzI, z12, f10, -1, z10, this.zzd.zzO, false);
        if (zzcwzVar != null) {
            zzcwzVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        zzdgk zzh = zzdfkVar.zzh();
        zzcfk zzcfkVar = this.zze;
        zzfet zzfetVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i10 = zzfetVar.zzQ;
        String str = zzfetVar.zzB;
        zzfey zzfeyVar = zzfetVar.zzs;
        String str2 = zzfeyVar.zzb;
        String str3 = zzfeyVar.zza;
        zzffo zzffoVar = this.zzf;
        if (zzfetVar.zzai) {
            zzeeaVar = this.zzi;
        } else {
            zzeeaVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzac) null, zzcfkVar, i10, versionInfoParcel, str, zzlVar, str2, str3, zzffoVar.zzf, zzcwzVar, zzeeaVar), true);
    }
}
