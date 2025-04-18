package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgnb {
    private HashMap zza = new HashMap();

    public final zzgnd zza() {
        if (this.zza != null) {
            zzgnd zzgndVar = new zzgnd(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzgndVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
