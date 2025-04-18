package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbe {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbe zza(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.zza.size()) {
            double doubleValue = ((Double) this.zzc.get(i10)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.zza.add(i10, str);
        this.zzc.add(i10, Double.valueOf(d10));
        this.zzb.add(i10, Double.valueOf(d11));
        return this;
    }

    public final zzbg zzb() {
        return new zzbg(this, null);
    }
}
