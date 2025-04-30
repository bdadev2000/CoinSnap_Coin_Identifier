package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhy {
    private final Map zza = new HashMap();

    @Nullable
    private Map zzb;

    public final synchronized Map zza() {
        try {
            if (this.zzb == null) {
                this.zzb = Collections.unmodifiableMap(new HashMap(this.zza));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb;
    }
}
