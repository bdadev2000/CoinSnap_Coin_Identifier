package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgoa {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgoa() {
    }

    public final zzgoa zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzgoc zzb() {
        return new zzgoc(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzgoa(zzgnz zzgnzVar) {
    }
}
