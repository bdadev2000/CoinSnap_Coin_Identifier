package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzgpl {
    private static final zzgpl zza = new zzgpl();
    private static final zzgpk zzb = new zzgpk(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgpl zzb() {
        return zza;
    }

    public final zzgov zza() {
        zzgov zzgovVar = (zzgov) this.zzc.get();
        return zzgovVar == null ? zzb : zzgovVar;
    }
}
