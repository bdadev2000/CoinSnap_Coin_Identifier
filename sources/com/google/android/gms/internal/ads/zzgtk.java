package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgtk {
    public static final zzgtk zza = new zzgti().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtk)) {
            return false;
        }
        return this.zzb.equals(((zzgtk) obj).zzb);
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
