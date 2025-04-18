package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzbfe {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbfc zza() {
        return (zzbfc) zza.get();
    }

    public static zzbfd zzb() {
        return (zzbfd) zzb.get();
    }

    public static void zzc(zzbfc zzbfcVar) {
        zza.set(zzbfcVar);
    }
}
