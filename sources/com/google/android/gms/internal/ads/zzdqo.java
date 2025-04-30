package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzdqo {
    private final zzczj zza;
    private final zzdas zzb;
    private final zzdbf zzc;
    private final zzdbr zzd;
    private final zzdef zze;
    private final zzfgt zzf;
    private final zzfgw zzg;
    private final zzcqd zzh;

    public zzdqo(zzczj zzczjVar, zzdas zzdasVar, zzdbf zzdbfVar, zzdbr zzdbrVar, zzdef zzdefVar, zzfgt zzfgtVar, zzfgw zzfgwVar, zzcqd zzcqdVar) {
        this.zza = zzczjVar;
        this.zzb = zzdasVar;
        this.zzc = zzdbfVar;
        this.zzd = zzdbrVar;
        this.zze = zzdefVar;
        this.zzf = zzfgtVar;
        this.zzg = zzfgwVar;
        this.zzh = zzcqdVar;
    }

    public final void zza(zzdqs zzdqsVar) {
        zzdqf zzdqfVar;
        final zzdas zzdasVar = this.zzb;
        zzdqfVar = zzdqsVar.zza;
        Objects.requireNonNull(zzdasVar);
        zzdqfVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                zzdas.this.zzb();
            }
        });
        zzdqsVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
