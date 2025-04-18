package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzgax extends zzgaz implements Serializable {
    static final zzgax zza = new zzgax();

    private zzgax() {
    }

    @Override // com.google.android.gms.internal.ads.zzgaz, java.util.Comparator
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

    @Override // com.google.android.gms.internal.ads.zzgaz
    public final zzgaz zza() {
        return zzgbh.zza;
    }
}
