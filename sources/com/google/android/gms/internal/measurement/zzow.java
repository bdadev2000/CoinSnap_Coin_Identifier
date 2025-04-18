package com.google.android.gms.internal.measurement;

import ra.p;
import ra.s;

/* loaded from: classes3.dex */
public final class zzow implements p {
    private static zzow zza = new zzow();
    private final p zzb = new s(new zzoy());

    public static boolean zza() {
        return ((zzoz) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzoz) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzoz) zza.get()).zzc();
    }

    @Override // ra.p
    public final /* synthetic */ Object get() {
        return (zzoz) this.zzb.get();
    }
}
