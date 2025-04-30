package com.google.android.gms.internal.measurement;

import c4.e;
import c4.h;

/* loaded from: classes2.dex */
public final class zznx implements e {
    private static zznx zza = new zznx();
    private final e zzb = new h(new zznz());

    public static boolean zza() {
        return ((zzoa) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzoa) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzoa) zza.get()).zzc();
    }

    @Override // c4.e
    public final /* synthetic */ Object get() {
        return (zzoa) this.zzb.get();
    }
}
