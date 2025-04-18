package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzdpp {
    private final zzcxy zza;
    private final zzczh zzb;
    private final zzczu zzc;
    private final zzdag zzd;
    private final zzdcx zze;
    private final zzfgh zzf;
    private final zzfgk zzg;
    private final zzcop zzh;

    public zzdpp(zzcxy zzcxyVar, zzczh zzczhVar, zzczu zzczuVar, zzdag zzdagVar, zzdcx zzdcxVar, zzfgh zzfghVar, zzfgk zzfgkVar, zzcop zzcopVar) {
        this.zza = zzcxyVar;
        this.zzb = zzczhVar;
        this.zzc = zzczuVar;
        this.zzd = zzdagVar;
        this.zze = zzdcxVar;
        this.zzf = zzfghVar;
        this.zzg = zzfgkVar;
        this.zzh = zzcopVar;
    }

    public final void zza(zzdpt zzdptVar) {
        zzdpg zzdpgVar;
        final zzczh zzczhVar = this.zzb;
        zzdpgVar = zzdptVar.zza;
        Objects.requireNonNull(zzczhVar);
        zzdpgVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzczh.this.zzb();
            }
        });
        zzdptVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
