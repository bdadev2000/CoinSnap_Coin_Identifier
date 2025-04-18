package com.google.android.gms.internal.measurement;

import ra.p;
import ra.s;

/* loaded from: classes3.dex */
public final class zzph implements p {
    private static zzph zza = new zzph();
    private final p zzb = new s(new zzpj());

    public static double zza() {
        return ((zzpg) zza.get()).zza();
    }

    public static long zzb() {
        return ((zzpg) zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzpg) zza.get()).zzc();
    }

    public static long zzd() {
        return ((zzpg) zza.get()).zzd();
    }

    public static String zze() {
        return ((zzpg) zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzpg) zza.get()).zzf();
    }

    @Override // ra.p
    public final /* synthetic */ Object get() {
        return (zzpg) this.zzb.get();
    }
}
