package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes4.dex */
final class zzgcq extends zzgci implements Serializable {
    static final zzgcq zza = new zzgcq();

    private zzgcq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgci, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
