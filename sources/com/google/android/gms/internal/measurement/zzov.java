package com.google.android.gms.internal.measurement;

import ra.p;
import ra.s;

/* loaded from: classes3.dex */
public final class zzov implements p {
    private static zzov zza = new zzov();
    private final p zzb = new s(new zzox());

    public static boolean zza() {
        return ((zzou) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzou) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzou) zza.get()).zzc();
    }

    @Override // ra.p
    public final /* synthetic */ Object get() {
        return (zzou) this.zzb.get();
    }
}
