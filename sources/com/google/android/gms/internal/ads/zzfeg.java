package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzfeg {
    private final zzfjc zza;
    private final zzcys zzb;
    private final Executor zzc;
    private zzfef zzd;

    public zzfeg(zzfjc zzfjcVar, zzcys zzcysVar, Executor executor) {
        this.zza = zzfjcVar;
        this.zzb = zzcysVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfjm zze() {
        zzfho zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final f4.c zzc() {
        f4.c zze;
        zzfef zzfefVar = this.zzd;
        if (zzfefVar == null) {
            if (!((Boolean) zzbgr.zza.zze()).booleanValue()) {
                zzfef zzfefVar2 = new zzfef(null, zze(), null);
                this.zzd = zzfefVar2;
                zze = zzgft.zzh(zzfefVar2);
            } else {
                zze = zzgft.zze(zzgft.zzm(zzgfk.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfed(this), this.zzc), zzebh.class, new zzfec(this), this.zzc);
            }
            return zzgft.zzm(zze, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfeb
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    return (zzfef) obj;
                }
            }, this.zzc);
        }
        return zzgft.zzh(zzfefVar);
    }
}
