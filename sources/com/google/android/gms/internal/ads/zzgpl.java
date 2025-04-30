package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzgpl {
    private static final zzgpl zza = (zzgpl) zzgqz.zza(new zzgqy() { // from class: com.google.android.gms.internal.ads.zzgpj
        @Override // com.google.android.gms.internal.ads.zzgqy
        public final Object zza() {
            zzgpl zzgplVar = new zzgpl();
            zzgplVar.zzg(new zzgoo(zzgou.class, zzgql.class, new zzgop() { // from class: com.google.android.gms.internal.ads.zzgpk
                @Override // com.google.android.gms.internal.ads.zzgop
                public final zzgqq zza(zzghi zzghiVar, zzgic zzgicVar) {
                    return ((zzgou) zzghiVar).zza(zzgicVar);
                }
            }));
            return zzgplVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgqx(new zzgqr(), null));

    public static zzgpl zzc() {
        return zza;
    }

    public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) throws GeneralSecurityException {
        return ((zzgqx) this.zzb.get()).zza(zzgqqVar, zzgicVar);
    }

    public final zzghx zzb(zzgqq zzgqqVar) throws GeneralSecurityException {
        return ((zzgqx) this.zzb.get()).zzb(zzgqqVar);
    }

    public final zzgqq zzd(zzghi zzghiVar, Class cls, zzgic zzgicVar) throws GeneralSecurityException {
        return ((zzgqx) this.zzb.get()).zzc(zzghiVar, cls, zzgicVar);
    }

    public final zzgqq zze(zzghx zzghxVar, Class cls) throws GeneralSecurityException {
        return ((zzgqx) this.zzb.get()).zzd(zzghxVar, cls);
    }

    public final synchronized void zzf(zzgon zzgonVar) throws GeneralSecurityException {
        zzgqr zzgqrVar = new zzgqr((zzgqx) this.zzb.get());
        zzgqrVar.zza(zzgonVar);
        this.zzb.set(new zzgqx(zzgqrVar, null));
    }

    public final synchronized void zzg(zzgor zzgorVar) throws GeneralSecurityException {
        zzgqr zzgqrVar = new zzgqr((zzgqx) this.zzb.get());
        zzgqrVar.zzb(zzgorVar);
        this.zzb.set(new zzgqx(zzgqrVar, null));
    }

    public final synchronized void zzh(zzgpq zzgpqVar) throws GeneralSecurityException {
        zzgqr zzgqrVar = new zzgqr((zzgqx) this.zzb.get());
        zzgqrVar.zzc(zzgpqVar);
        this.zzb.set(new zzgqx(zzgqrVar, null));
    }

    public final synchronized void zzi(zzgpu zzgpuVar) throws GeneralSecurityException {
        zzgqr zzgqrVar = new zzgqr((zzgqx) this.zzb.get());
        zzgqrVar.zzd(zzgpuVar);
        this.zzb.set(new zzgqx(zzgqrVar, null));
    }

    public final boolean zzj(zzgqq zzgqqVar) {
        return ((zzgqx) this.zzb.get()).zzi(zzgqqVar);
    }

    public final boolean zzk(zzgqq zzgqqVar) {
        return ((zzgqx) this.zzb.get()).zzj(zzgqqVar);
    }
}
