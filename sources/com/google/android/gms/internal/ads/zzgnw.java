package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzgnw {
    private static final zzgnw zza = new zzgnw();
    private final AtomicReference zzb = new AtomicReference(new zzgoq(new zzgon(null), null));

    public static zzgnw zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgoq) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgfw zzgfwVar, Class cls) throws GeneralSecurityException {
        return ((zzgoq) this.zzb.get()).zzb(zzgfwVar, cls);
    }

    public final Object zzd(zzgou zzgouVar, Class cls) throws GeneralSecurityException {
        return ((zzgoq) this.zzb.get()).zzc(zzgouVar, cls);
    }

    public final synchronized void zze(zzgom zzgomVar) throws GeneralSecurityException {
        zzgon zzgonVar = new zzgon((zzgoq) this.zzb.get(), null);
        zzgonVar.zza(zzgomVar);
        this.zzb.set(new zzgoq(zzgonVar, null));
    }

    public final synchronized void zzf(zzgov zzgovVar) throws GeneralSecurityException {
        zzgon zzgonVar = new zzgon((zzgoq) this.zzb.get(), null);
        zzgonVar.zzb(zzgovVar);
        this.zzb.set(new zzgoq(zzgonVar, null));
    }
}
