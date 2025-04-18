package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class zzgam {
    private static final zzgam zza = new zzgaj();
    private static final zzgam zzb = new zzgak(-1);
    private static final zzgam zzc = new zzgak(1);

    public /* synthetic */ zzgam(zzgal zzgalVar) {
    }

    public static zzgam zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzgam zzb(int i2, int i3);

    public abstract zzgam zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzgam zzd(boolean z2, boolean z3);

    public abstract zzgam zze(boolean z2, boolean z3);
}
