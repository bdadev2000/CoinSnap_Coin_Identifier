package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
final class zzgbx extends zzgcb {
    final /* synthetic */ Comparator zza;

    public zzgbx(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
