package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class zzfzd {
    private static final zzfzd zza = new zzfza();
    private static final zzfzd zzb = new zzfzb(-1);
    private static final zzfzd zzc = new zzfzb(1);

    public /* synthetic */ zzfzd(zzfzc zzfzcVar) {
    }

    public static zzfzd zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfzd zzb(int i10, int i11);

    public abstract zzfzd zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfzd zzd(boolean z10, boolean z11);

    public abstract zzfzd zze(boolean z10, boolean z11);
}
