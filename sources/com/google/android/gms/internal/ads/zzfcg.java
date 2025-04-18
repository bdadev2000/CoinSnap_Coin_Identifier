package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzfcg {
    private final zzfhc zza;
    private final zzcvt zzb;
    private final Executor zzc;
    private zzfce zzd;

    public zzfcg(zzfhc zzfhcVar, zzcvt zzcvtVar, Executor executor) {
        this.zza = zzfhcVar;
        this.zzb = zzcvtVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfhm zze() {
        zzffo zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final ua.b zzc() {
        ua.b bVar;
        zzfce zzfceVar = this.zzd;
        if (zzfceVar == null) {
            if (!((Boolean) zzbeu.zza.zze()).booleanValue()) {
                zzfce zzfceVar2 = new zzfce(null, zze(), 0 == true ? 1 : 0);
                this.zzd = zzfceVar2;
                bVar = zzgei.zzh(zzfceVar2);
            } else {
                bVar = (zzgdz) zzgei.zze((zzgdz) zzgei.zzm(zzgdz.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfcd(this), this.zzc), zzdyw.class, new zzfcc(this), this.zzc);
            }
            return zzgei.zzm(bVar, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzfcb
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    return (zzfce) obj;
                }
            }, this.zzc);
        }
        return zzgei.zzh(zzfceVar);
    }
}
