package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgmk {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgmk() {
    }

    public final zzgmk zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzgmm zzb() {
        return new zzgmm(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzgmk(zzgml zzgmlVar) {
    }
}
