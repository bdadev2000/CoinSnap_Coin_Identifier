package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes4.dex */
public final class zznr implements Supplier<zznq> {
    private static zznr zza = new zznr();
    private final Supplier<zznq> zzb = Suppliers.ofInstance(new zznt());

    @SideEffectFree
    public static boolean zza() {
        return ((zznq) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zznq) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zznq) zza.get()).zzc();
    }

    @SideEffectFree
    public static boolean zzd() {
        return ((zznq) zza.get()).zzd();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zznq get() {
        return this.zzb.get();
    }
}
