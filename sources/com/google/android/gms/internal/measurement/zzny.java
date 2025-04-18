package com.google.android.gms.internal.measurement;

import ra.p;
import ra.s;

/* loaded from: classes3.dex */
public final class zzny implements p {
    private static zzny zza = new zzny();
    private final p zzb = new s(new zzoa());

    public static boolean zza() {
        return ((zzob) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzob) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzob) zza.get()).zzc();
    }

    @Override // ra.p
    public final /* synthetic */ Object get() {
        return (zzob) this.zzb.get();
    }
}
