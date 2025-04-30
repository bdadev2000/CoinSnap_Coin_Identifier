package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzdqx {
    private final zzczj zza;
    private final zzdas zzb;
    private final zzdbf zzc;
    private final zzdbr zzd;
    private final zzdef zze;
    private final zzdhg zzf;
    private final zzdvc zzg;
    private final zzfoe zzh;
    private final zzefz zzi;
    private final zzcqd zzj;

    public zzdqx(zzczj zzczjVar, zzdas zzdasVar, zzdbf zzdbfVar, zzdbr zzdbrVar, zzdef zzdefVar, zzdhg zzdhgVar, zzdvc zzdvcVar, zzfoe zzfoeVar, zzefz zzefzVar, zzcqd zzcqdVar) {
        this.zza = zzczjVar;
        this.zzb = zzdasVar;
        this.zzc = zzdbfVar;
        this.zzd = zzdbrVar;
        this.zze = zzdefVar;
        this.zzf = zzdhgVar;
        this.zzg = zzdvcVar;
        this.zzh = zzfoeVar;
        this.zzi = zzefzVar;
        this.zzj = zzcqdVar;
    }

    public final void zza(zzdqy zzdqyVar, zzchd zzchdVar) {
        zzdqv zzdqvVar;
        zzdqvVar = zzdqyVar.zza;
        final zzdas zzdasVar = this.zzb;
        Objects.requireNonNull(zzdasVar);
        zzdqvVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                zzdas.this.zzb();
            }
        }, this.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkg)).booleanValue() && zzchdVar != null && zzchdVar.zzN() != null) {
            zzciv zzN = zzchdVar.zzN();
            zzN.zzI(this.zzj, this.zzi, this.zzh);
            zzN.zzK(this.zzj, this.zzi, this.zzg);
        }
    }
}
