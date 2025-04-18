package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class zzgao extends zzgas {
    final /* synthetic */ Comparator zza;

    public zzgao(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
