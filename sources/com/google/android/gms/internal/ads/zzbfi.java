package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzbfi {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbfg zza() {
        return (zzbfg) zza.get();
    }

    public static zzbfh zzb() {
        return (zzbfh) zzb.get();
    }

    public static void zzc(zzbfg zzbfgVar) {
        zza.set(zzbfgVar);
    }
}
