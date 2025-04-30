package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzgpi {
    private static final zzgpi zza = new zzgpi();
    private final AtomicReference zzb = new AtomicReference(new zzgqe(new zzgqa(null), null));

    public static zzgpi zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgqe) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzghi zzghiVar, Class cls) throws GeneralSecurityException {
        return ((zzgqe) this.zzb.get()).zzb(zzghiVar, cls);
    }

    public final Object zzd(zzgqk zzgqkVar, Class cls) throws GeneralSecurityException {
        return ((zzgqe) this.zzb.get()).zzc(zzgqkVar, cls);
    }

    public final synchronized void zze(zzgpy zzgpyVar) throws GeneralSecurityException {
        zzgqa zzgqaVar = new zzgqa((zzgqe) this.zzb.get(), null);
        zzgqaVar.zza(zzgpyVar);
        this.zzb.set(new zzgqe(zzgqaVar, null));
    }

    public final synchronized void zzf(zzghy zzghyVar) throws GeneralSecurityException {
        zzgqa zzgqaVar = new zzgqa((zzgqe) this.zzb.get(), null);
        zzgqaVar.zzb(zzghyVar);
        this.zzb.set(new zzgqe(zzgqaVar, null));
    }
}
