package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzbhb {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    public static zzbgz zza() {
        return (zzbgz) zzb.get();
    }

    public static zzbha zzb() {
        return (zzbha) zzc.get();
    }

    public static void zzc(zzbgz zzbgzVar) {
        zzb.set(zzbgzVar);
    }
}
