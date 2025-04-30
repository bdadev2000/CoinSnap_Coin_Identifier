package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbqq {
    private final zzbpt zza;
    private f4.c zzb;

    public zzbqq(zzbpt zzbptVar) {
        this.zza = zzbptVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzccn zzccnVar = new zzccn();
            this.zzb = zzccnVar;
            this.zza.zzb(null).zzj(new zzccr() { // from class: com.google.android.gms.internal.ads.zzbqn
                @Override // com.google.android.gms.internal.ads.zzccr
                public final void zza(Object obj) {
                    zzccn.this.zzc((zzbpu) obj);
                }
            }, new zzccp() { // from class: com.google.android.gms.internal.ads.zzbqo
                @Override // com.google.android.gms.internal.ads.zzccp
                public final void zza() {
                    zzccn.this.zzd(new zzbpw("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbqt zza(String str, zzbqa zzbqaVar, zzbpz zzbpzVar) {
        zzd();
        return new zzbqt(this.zzb, "google.afma.activeView.handleUpdate", zzbqaVar, zzbpzVar);
    }

    public final void zzb(final String str, final zzblp zzblpVar) {
        zzd();
        this.zzb = zzgft.zzn(this.zzb, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzbqp
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                zzbpu zzbpuVar = (zzbpu) obj;
                zzbpuVar.zzq(str, zzblpVar);
                return zzgft.zzh(zzbpuVar);
            }
        }, zzcci.zzf);
    }

    public final void zzc(final String str, final zzblp zzblpVar) {
        this.zzb = zzgft.zzm(this.zzb, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbqm
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzbpu zzbpuVar = (zzbpu) obj;
                zzbpuVar.zzr(str, zzblpVar);
                return zzbpuVar;
            }
        }, zzcci.zzf);
    }
}
