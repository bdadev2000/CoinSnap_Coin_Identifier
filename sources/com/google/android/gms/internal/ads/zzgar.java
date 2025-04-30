package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class zzgar {
    private static final zzgar zza = new zzgao();
    private static final zzgar zzb = new zzgap(-1);
    private static final zzgar zzc = new zzgap(1);

    public /* synthetic */ zzgar(zzgaq zzgaqVar) {
    }

    public static zzgar zzk() {
        return zza;
    }

    public abstract int zza();

    public abstract zzgar zzb(int i9, int i10);

    public abstract zzgar zzc(long j7, long j9);

    public abstract zzgar zzd(Object obj, Object obj2, Comparator comparator);

    public abstract zzgar zze(boolean z8, boolean z9);

    public abstract zzgar zzf(boolean z8, boolean z9);
}
