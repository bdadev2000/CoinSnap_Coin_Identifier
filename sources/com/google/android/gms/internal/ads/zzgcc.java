package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class zzgcc extends zzgcg {
    final /* synthetic */ Comparator zza;

    public zzgcc(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
