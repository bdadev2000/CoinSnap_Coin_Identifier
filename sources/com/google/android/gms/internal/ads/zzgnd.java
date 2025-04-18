package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgnd {
    public static final zzgnd zza = new zzgnb().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnd)) {
            return false;
        }
        return this.zzb.equals(((zzgnd) obj).zzb);
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
