package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes4.dex */
public final class zznf implements Supplier<zzne> {
    private static zznf zza = new zznf();
    private final Supplier<zzne> zzb = Suppliers.ofInstance(new zznh());

    @SideEffectFree
    public static boolean zza() {
        return ((zzne) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzne get() {
        return this.zzb.get();
    }
}
