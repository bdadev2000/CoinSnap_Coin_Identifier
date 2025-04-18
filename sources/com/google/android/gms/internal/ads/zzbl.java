package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzbl {
    private final zzz zza;

    static {
        new zzbk().zze();
        Integer.toString(0, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbl)) {
            return false;
        }
        return this.zza.equals(((zzbl) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }
}
