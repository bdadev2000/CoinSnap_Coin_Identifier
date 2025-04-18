package com.google.android.gms.internal.measurement;

import ra.p;
import ra.s;

/* loaded from: classes3.dex */
public final class zznx implements p {
    private static zznx zza = new zznx();
    private final p zzb = new s(new zznz());

    public static boolean zza() {
        return ((zznw) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznw) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zznw) zza.get()).zzc();
    }

    @Override // ra.p
    public final /* synthetic */ Object get() {
        return (zznw) this.zzb.get();
    }
}
