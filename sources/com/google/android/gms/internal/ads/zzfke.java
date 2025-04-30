package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfke {
    private final zzfjx zza;
    private final f4.c zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfke(final zzfjc zzfjcVar, final zzfjw zzfjwVar, final zzfjx zzfjxVar) {
        this.zza = zzfjxVar;
        this.zzb = zzgft.zzf(zzgft.zzn(zzfjwVar.zza(zzfjxVar), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfkc
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzfke.this.zzb(zzfjwVar, zzfjcVar, zzfjxVar, (zzfjl) obj);
            }
        }, zzfjxVar.zzb()), Exception.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfkd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzfke.this.zzc(zzfjwVar, (Exception) obj);
            }
        }, zzfjxVar.zzb());
    }

    public final synchronized f4.c zza(zzfjx zzfjxVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfjxVar.zza() != null && this.zza.zza().equals(zzfjxVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    public final /* synthetic */ f4.c zzb(zzfjw zzfjwVar, zzfjc zzfjcVar, zzfjx zzfjxVar, zzfjl zzfjlVar) throws Exception {
        synchronized (this) {
            try {
                this.zzd = true;
                zzfjwVar.zzb(zzfjlVar);
                if (!this.zzc) {
                    zzfjcVar.zzd(zzfjxVar.zza(), zzfjlVar);
                    return zzgft.zzh(null);
                }
                return zzgft.zzh(new zzfjv(zzfjlVar, zzfjxVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ f4.c zzc(zzfjw zzfjwVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgfp zzgfpVar) {
        zzgft.zzr(zzgft.zzn(this.zzb, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfkb
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzi();
            }
        }, this.zza.zzb()), zzgfpVar, this.zza.zzb());
    }
}
