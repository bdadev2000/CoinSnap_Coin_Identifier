package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzgnu {
    private static final zzgnu zza = new zzgnu();
    private static final zzgns zzb = new zzgns(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgnu zzb() {
        return zza;
    }

    public final zzgnf zza() {
        zzgnf zzgnfVar = (zzgnf) this.zzc.get();
        return zzgnfVar == null ? zzb : zzgnfVar;
    }
}
