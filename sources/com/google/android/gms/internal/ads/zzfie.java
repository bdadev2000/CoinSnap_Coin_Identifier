package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfie {
    private final zzfhx zza;
    private final ua.b zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfie(final zzfhc zzfhcVar, final zzfhw zzfhwVar, final zzfhx zzfhxVar) {
        this.zza = zzfhxVar;
        this.zzb = zzgei.zzf(zzgei.zzn(zzfhwVar.zza(zzfhxVar), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfic
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzfie.this.zzb(zzfhwVar, zzfhcVar, zzfhxVar, (zzfhl) obj);
            }
        }, zzfhxVar.zzb()), Exception.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzfie.this.zzc(zzfhwVar, (Exception) obj);
            }
        }, zzfhxVar.zzb());
    }

    public final synchronized ua.b zza(zzfhx zzfhxVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfhxVar.zza() != null && this.zza.zza().equals(zzfhxVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    public final /* synthetic */ ua.b zzb(zzfhw zzfhwVar, zzfhc zzfhcVar, zzfhx zzfhxVar, zzfhl zzfhlVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfhwVar.zzb(zzfhlVar);
            if (!this.zzc) {
                zzfhcVar.zzd(zzfhxVar.zza(), zzfhlVar);
                return zzgei.zzh(null);
            }
            return zzgei.zzh(new zzfhv(zzfhlVar, zzfhxVar));
        }
    }

    public final /* synthetic */ ua.b zzc(zzfhw zzfhwVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgee zzgeeVar) {
        zzgei.zzr(zzgei.zzn(this.zzb, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfib
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzi();
            }
        }, this.zza.zzb()), zzgeeVar, this.zza.zzb());
    }
}
