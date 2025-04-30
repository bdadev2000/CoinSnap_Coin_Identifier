package com.google.android.gms.internal.measurement;

import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzbq extends zzay {
    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        if (str != null && !str.isEmpty() && zzhVar.zzb(str)) {
            zzaq zza = zzhVar.zza(str);
            if (zza instanceof zzal) {
                return ((zzal) zza).zza(zzhVar, list);
            }
            throw new IllegalArgumentException(AbstractC2914a.e("Function ", str, " is not defined"));
        }
        throw new IllegalArgumentException(AbstractC2914a.d("Command not found: ", str));
    }
}
