package com.google.android.gms.internal.measurement;

import ra.p;
import ra.s;

/* loaded from: classes3.dex */
public final class zzpb implements p {
    private static zzpb zza = new zzpb();
    private final p zzb = new s(new zzpd());

    public static boolean zza() {
        return ((zzpa) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpa) zza.get()).zzb();
    }

    @Override // ra.p
    public final /* synthetic */ Object get() {
        return (zzpa) this.zzb.get();
    }
}
