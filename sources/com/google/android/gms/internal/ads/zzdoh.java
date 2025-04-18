package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzdoh {
    private final zzcwk zza;
    private final zzcxt zzb;
    private final zzcyg zzc;
    private final zzcys zzd;
    private final zzdbi zze;
    private final zzdej zzf;
    private final zzdsm zzg;
    private final zzflr zzh;
    private final zzedp zzi;
    private final zzcnb zzj;

    public zzdoh(zzcwk zzcwkVar, zzcxt zzcxtVar, zzcyg zzcygVar, zzcys zzcysVar, zzdbi zzdbiVar, zzdej zzdejVar, zzdsm zzdsmVar, zzflr zzflrVar, zzedp zzedpVar, zzcnb zzcnbVar) {
        this.zza = zzcwkVar;
        this.zzb = zzcxtVar;
        this.zzc = zzcygVar;
        this.zzd = zzcysVar;
        this.zze = zzdbiVar;
        this.zzf = zzdejVar;
        this.zzg = zzdsmVar;
        this.zzh = zzflrVar;
        this.zzi = zzedpVar;
        this.zzj = zzcnbVar;
    }

    public final void zza(zzdoi zzdoiVar, zzcfk zzcfkVar) {
        zzdof zzdofVar;
        zzdofVar = zzdoiVar.zza;
        final zzcxt zzcxtVar = this.zzb;
        Objects.requireNonNull(zzcxtVar);
        zzdofVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdog
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzcxt.this.zzb();
            }
        }, this.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjO)).booleanValue() && zzcfkVar != null && zzcfkVar.zzN() != null) {
            zzchc zzN = zzcfkVar.zzN();
            zzN.zzJ(this.zzj, this.zzi, this.zzh);
            zzN.zzL(this.zzj, this.zzi, this.zzg);
        }
    }
}
