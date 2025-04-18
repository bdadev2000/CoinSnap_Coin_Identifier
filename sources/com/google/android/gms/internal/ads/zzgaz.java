package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class zzgaz implements Comparator {
    public static zzgaz zzb(Comparator comparator) {
        return new zzfyz(comparator);
    }

    public static zzgaz zzc() {
        return zzgax.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgaz zza() {
        return new zzgbi(this);
    }
}
