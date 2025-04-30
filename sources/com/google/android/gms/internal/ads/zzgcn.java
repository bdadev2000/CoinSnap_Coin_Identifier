package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class zzgcn implements Comparator {
    public static zzgcn zzb(Comparator comparator) {
        return new zzgan(comparator);
    }

    public static zzgcn zzc() {
        return zzgcl.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgcn zza() {
        return new zzgcw(this);
    }
}
