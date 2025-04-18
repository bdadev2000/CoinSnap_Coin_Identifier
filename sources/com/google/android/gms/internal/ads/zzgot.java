package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgot {
    public static final zzgot zza = new zzgor().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgot) {
            return this.zzb.equals(((zzgot) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
