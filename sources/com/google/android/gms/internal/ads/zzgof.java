package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgof {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgof() {
    }

    public final zzgof zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzgoh zzb() {
        return new zzgoh(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzgof(zzgoe zzgoeVar) {
    }
}
