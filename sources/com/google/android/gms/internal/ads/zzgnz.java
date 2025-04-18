package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzgnz {
    private static final zzgnz zza = (zzgnz) zzgpi.zza(new zzgph() { // from class: com.google.android.gms.internal.ads.zzgnx
        @Override // com.google.android.gms.internal.ads.zzgph
        public final Object zza() {
            zzgnz zzgnzVar = new zzgnz();
            zzgnzVar.zzg(new zzgmt(zzgmz.class, zzgow.class, new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgny
                @Override // com.google.android.gms.internal.ads.zzgmu
                public final zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) {
                    return ((zzgmz) zzgfwVar).zza(zzggnVar);
                }
            }));
            return zzgnzVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgpg(new zzgpc(), null));

    public static zzgnz zzc() {
        return zza;
    }

    public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zza(zzgpbVar, zzggnVar);
    }

    public final zzggj zzb(zzgpb zzgpbVar) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zzb(zzgpbVar);
    }

    public final zzgpb zzd(zzgfw zzgfwVar, Class cls, zzggn zzggnVar) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zzc(zzgfwVar, cls, zzggnVar);
    }

    public final zzgpb zze(zzggj zzggjVar, Class cls) throws GeneralSecurityException {
        return ((zzgpg) this.zzb.get()).zzd(zzggjVar, cls);
    }

    public final synchronized void zzf(zzgms zzgmsVar) throws GeneralSecurityException {
        zzgpc zzgpcVar = new zzgpc((zzgpg) this.zzb.get());
        zzgpcVar.zza(zzgmsVar);
        this.zzb.set(new zzgpg(zzgpcVar, null));
    }

    public final synchronized void zzg(zzgmw zzgmwVar) throws GeneralSecurityException {
        zzgpc zzgpcVar = new zzgpc((zzgpg) this.zzb.get());
        zzgpcVar.zzb(zzgmwVar);
        this.zzb.set(new zzgpg(zzgpcVar, null));
    }

    public final synchronized void zzh(zzgoe zzgoeVar) throws GeneralSecurityException {
        zzgpc zzgpcVar = new zzgpc((zzgpg) this.zzb.get());
        zzgpcVar.zzc(zzgoeVar);
        this.zzb.set(new zzgpg(zzgpcVar, null));
    }

    public final synchronized void zzi(zzgoi zzgoiVar) throws GeneralSecurityException {
        zzgpc zzgpcVar = new zzgpc((zzgpg) this.zzb.get());
        zzgpcVar.zzd(zzgoiVar);
        this.zzb.set(new zzgpg(zzgpcVar, null));
    }

    public final boolean zzj(zzgpb zzgpbVar) {
        return ((zzgpg) this.zzb.get()).zzi(zzgpbVar);
    }

    public final boolean zzk(zzgpb zzgpbVar) {
        return ((zzgpg) this.zzb.get()).zzj(zzgpbVar);
    }
}
