package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes4.dex */
public final class zzod implements Supplier<zzoc> {
    private static zzod zza = new zzod();
    private final Supplier<zzoc> zzb = Suppliers.ofInstance(new zzof());

    @SideEffectFree
    public static boolean zza() {
        return ((zzoc) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzoc) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoc get() {
        return this.zzb.get();
    }
}
