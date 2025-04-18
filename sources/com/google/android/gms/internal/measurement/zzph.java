package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes4.dex */
public final class zzph implements Supplier<zzpg> {
    private static zzph zza = new zzph();
    private final Supplier<zzpg> zzb = Suppliers.ofInstance(new zzpj());

    @SideEffectFree
    public static double zza() {
        return ((zzpg) zza.get()).zza();
    }

    @SideEffectFree
    public static long zzb() {
        return ((zzpg) zza.get()).zzb();
    }

    @SideEffectFree
    public static long zzc() {
        return ((zzpg) zza.get()).zzc();
    }

    @SideEffectFree
    public static long zzd() {
        return ((zzpg) zza.get()).zzd();
    }

    @SideEffectFree
    public static String zze() {
        return ((zzpg) zza.get()).zze();
    }

    @SideEffectFree
    public static boolean zzf() {
        return ((zzpg) zza.get()).zzf();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpg get() {
        return this.zzb.get();
    }
}
