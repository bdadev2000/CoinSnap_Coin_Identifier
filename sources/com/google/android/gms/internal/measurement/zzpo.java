package com.google.android.gms.internal.measurement;

import ra.p;
import ra.s;

/* loaded from: classes3.dex */
public final class zzpo implements p {
    private static zzpo zza = new zzpo();
    private final p zzb = new s(new zzpq());

    public static boolean zza() {
        return ((zzpr) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpr) zza.get()).zzb();
    }

    @Override // ra.p
    public final /* synthetic */ Object get() {
        return (zzpr) this.zzb.get();
    }
}
