package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzdny {
    private final zzcwk zza;
    private final zzcxt zzb;
    private final zzcyg zzc;
    private final zzcys zzd;
    private final zzdbi zze;
    private final zzfet zzf;
    private final zzfew zzg;
    private final zzcnb zzh;

    public zzdny(zzcwk zzcwkVar, zzcxt zzcxtVar, zzcyg zzcygVar, zzcys zzcysVar, zzdbi zzdbiVar, zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar) {
        this.zza = zzcwkVar;
        this.zzb = zzcxtVar;
        this.zzc = zzcygVar;
        this.zzd = zzcysVar;
        this.zze = zzdbiVar;
        this.zzf = zzfetVar;
        this.zzg = zzfewVar;
        this.zzh = zzcnbVar;
    }

    public final void zza(zzdoc zzdocVar) {
        zzdnp zzdnpVar;
        final zzcxt zzcxtVar = this.zzb;
        zzdnpVar = zzdocVar.zza;
        Objects.requireNonNull(zzcxtVar);
        zzdnpVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdnx
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzcxt.this.zzb();
            }
        });
        zzdocVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
