package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgti {
    private HashMap zza = new HashMap();

    public final zzgtk zza() {
        if (this.zza != null) {
            zzgtk zzgtkVar = new zzgtk(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzgtkVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
