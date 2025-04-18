package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes4.dex */
final class zzgcg extends zzgci implements Serializable {
    static final zzgcg zza = new zzgcg();

    private zzgcg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgci, java.util.Comparator
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

    @Override // com.google.android.gms.internal.ads.zzgci
    public final zzgci zza() {
        return zzgcq.zza;
    }
}
