package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes4.dex */
public final class zzoj implements Supplier<zzoi> {
    private static zzoj zza = new zzoj();
    private final Supplier<zzoi> zzb = Suppliers.ofInstance(new zzol());

    @SideEffectFree
    public static boolean zza() {
        return ((zzoi) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoi get() {
        return this.zzb.get();
    }
}
