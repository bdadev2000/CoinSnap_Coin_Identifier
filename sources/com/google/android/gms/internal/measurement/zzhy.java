package com.google.android.gms.internal.measurement;

import com.google.common.collect.y0;

/* loaded from: classes3.dex */
public final class zzhy {
    private final boolean zza;

    public zzhy(zzhx zzhxVar) {
        if (zzhxVar != null) {
            this.zza = !zzhxVar.zza();
            return;
        }
        throw new NullPointerException("BuildInfo must be non-null");
    }

    public final boolean zza(String str) {
        if (str != null) {
            if (!this.zza) {
                return true;
            }
            return ((y0) zzia.zza.get()).c(str);
        }
        throw new NullPointerException("flagName must not be null");
    }
}
