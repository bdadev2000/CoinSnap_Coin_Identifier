package com.google.android.gms.internal.measurement;

import c4.e;
import c4.h;

/* loaded from: classes2.dex */
public final class zznq implements e {
    private static zznq zza = new zznq();
    private final e zzb = new h(new zzns());

    public static boolean zza() {
        return ((zznp) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznp) zza.get()).zzb();
    }

    @Override // c4.e
    public final /* synthetic */ Object get() {
        return (zznp) this.zzb.get();
    }
}
