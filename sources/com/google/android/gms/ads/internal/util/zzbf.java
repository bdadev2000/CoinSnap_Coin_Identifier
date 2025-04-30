package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbf {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbf zza(String str, double d2, double d9) {
        int i9 = 0;
        while (i9 < this.zza.size()) {
            double doubleValue = ((Double) this.zzc.get(i9)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i9)).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d9 < doubleValue2)) {
                break;
            }
            i9++;
        }
        this.zza.add(i9, str);
        this.zzc.add(i9, Double.valueOf(d2));
        this.zzb.add(i9, Double.valueOf(d9));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}
