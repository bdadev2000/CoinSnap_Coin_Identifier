package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbf {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbf zza(String str, double d, double d2) {
        int i2 = 0;
        while (i2 < this.zza.size()) {
            double doubleValue = ((Double) this.zzc.get(i2)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i2)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i2++;
        }
        this.zza.add(i2, str);
        this.zzc.add(i2, Double.valueOf(d));
        this.zzb.add(i2, Double.valueOf(d2));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}
