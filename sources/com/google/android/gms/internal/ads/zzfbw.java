package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfbw implements zzfck {
    private final zzfhc zza;
    private final Executor zzb;
    private final zzgee zzc = new zzfbu(this);

    public zzfbw(zzfhc zzfhcVar, Executor executor) {
        this.zza = zzfhcVar;
        this.zzb = executor;
    }

    public final /* synthetic */ ua.b zza(zzcvt zzcvtVar, zzfce zzfceVar) throws Exception {
        zzfhc zzfhcVar = this.zza;
        zzfhm zzfhmVar = zzfceVar.zzb;
        zzbvx zzbvxVar = zzfceVar.zza;
        zzfhl zzb = zzfhcVar.zzb(zzfhmVar);
        if (zzb != null && zzbvxVar != null) {
            zzgei.zzr(zzcvtVar.zzb().zzh(zzbvxVar), this.zzc, this.zzb);
        }
        return zzgei.zzh(new zzfbv(zzfhmVar, zzbvxVar, zzb));
    }

    public final ua.b zzb(zzfcl zzfclVar, zzfcj zzfcjVar, final zzcvt zzcvtVar) {
        return (zzgdz) zzgei.zze((zzgdz) zzgei.zzn(zzgdz.zzu(new zzfcg(this.zza, zzcvtVar, this.zzb).zzc()), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfbs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzfbw.this.zza(zzcvtVar, (zzfce) obj);
            }
        }, this.zzb), Exception.class, new zzfbt(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ ua.b zzc(zzfcl zzfclVar, zzfcj zzfcjVar, Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
