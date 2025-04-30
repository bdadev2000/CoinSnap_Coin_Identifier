package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfdw implements zzfek {
    private final zzfjc zza;
    private final Executor zzb;
    private final zzgfp zzc = new zzfdu(this);

    public zzfdw(zzfjc zzfjcVar, Executor executor) {
        this.zza = zzfjcVar;
        this.zzb = executor;
    }

    public final /* synthetic */ f4.c zza(zzcys zzcysVar, zzfef zzfefVar) throws Exception {
        zzfjc zzfjcVar = this.zza;
        zzfjm zzfjmVar = zzfefVar.zzb;
        zzbxu zzbxuVar = zzfefVar.zza;
        zzfjl zzb = zzfjcVar.zzb(zzfjmVar);
        if (zzb != null && zzbxuVar != null) {
            zzgft.zzr(zzcysVar.zzb().zzh(zzbxuVar), this.zzc, this.zzb);
        }
        return zzgft.zzh(new zzfdv(zzfjmVar, zzbxuVar, zzb));
    }

    public final f4.c zzb(zzfel zzfelVar, zzfej zzfejVar, final zzcys zzcysVar) {
        return zzgft.zze(zzgft.zzn(zzgfk.zzu(new zzfeg(this.zza, zzcysVar, this.zzb).zzc()), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfds
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzfdw.this.zza(zzcysVar, (zzfef) obj);
            }
        }, this.zzb), Exception.class, new zzfdt(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ f4.c zzc(zzfel zzfelVar, zzfej zzfejVar, Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
