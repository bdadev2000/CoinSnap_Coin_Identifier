package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class zzgci implements Comparator {
    public static zzgci zzb(Comparator comparator) {
        return new zzgai(comparator);
    }

    public static zzgci zzc() {
        return zzgcg.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgci zza() {
        return new zzgcr(this);
    }
}
