package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzdpy {
    private final zzcxy zza;
    private final zzczh zzb;
    private final zzczu zzc;
    private final zzdag zzd;
    private final zzdcx zze;
    private final zzdfy zzf;
    private final zzdud zzg;
    private final zzfng zzh;
    private final zzeey zzi;
    private final zzcop zzj;

    public zzdpy(zzcxy zzcxyVar, zzczh zzczhVar, zzczu zzczuVar, zzdag zzdagVar, zzdcx zzdcxVar, zzdfy zzdfyVar, zzdud zzdudVar, zzfng zzfngVar, zzeey zzeeyVar, zzcop zzcopVar) {
        this.zza = zzcxyVar;
        this.zzb = zzczhVar;
        this.zzc = zzczuVar;
        this.zzd = zzdagVar;
        this.zze = zzdcxVar;
        this.zzf = zzdfyVar;
        this.zzg = zzdudVar;
        this.zzh = zzfngVar;
        this.zzi = zzeeyVar;
        this.zzj = zzcopVar;
    }

    public final void zza(zzdpz zzdpzVar, zzcfo zzcfoVar) {
        zzdpw zzdpwVar;
        zzdpwVar = zzdpzVar.zza;
        final zzczh zzczhVar = this.zzb;
        Objects.requireNonNull(zzczhVar);
        zzdpwVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzczh.this.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjM)).booleanValue() || zzcfoVar == null || zzcfoVar.zzN() == null) {
            return;
        }
        zzchg zzN = zzcfoVar.zzN();
        zzN.zzI(this.zzj, this.zzi, this.zzh);
        zzN.zzK(this.zzj, this.zzi, this.zzg);
    }
}
