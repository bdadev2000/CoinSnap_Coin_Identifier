package com.google.android.gms.internal.measurement;

import c4.e;
import c4.h;

/* loaded from: classes2.dex */
public final class zznr implements e {
    private static zznr zza = new zznr();
    private final e zzb = new h(new zznt());

    public static boolean zza() {
        return ((zznu) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznu) zza.get()).zzb();
    }

    @Override // c4.e
    public final /* synthetic */ Object get() {
        return (zznu) this.zzb.get();
    }
}
