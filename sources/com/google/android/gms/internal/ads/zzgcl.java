package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zzgcl extends zzgcn implements Serializable {
    static final zzgcl zza = new zzgcl();

    private zzgcl() {
    }

    @Override // com.google.android.gms.internal.ads.zzgcn, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzgcn
    public final zzgcn zza() {
        return zzgcv.zza;
    }
}
