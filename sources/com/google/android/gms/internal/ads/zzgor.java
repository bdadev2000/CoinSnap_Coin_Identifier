package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzgor {
    private HashMap zza = new HashMap();

    public final zzgot zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgot zzgotVar = new zzgot(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgotVar;
    }
}
