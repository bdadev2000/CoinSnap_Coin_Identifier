package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzgbh extends zzgaz implements Serializable {
    static final zzgbh zza = new zzgbh();

    private zzgbh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgaz, java.util.Comparator
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
