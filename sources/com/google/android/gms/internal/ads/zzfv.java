package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfv {
    public static final zzfv zza = new zzfv(-1, -1);
    public static final zzfv zzb = new zzfv(0, 0);
    private final int zzc;
    private final int zzd;

    public zzfv(int i9, int i10) {
        boolean z8 = false;
        if ((i9 == -1 || i9 >= 0) && (i10 == -1 || i10 >= 0)) {
            z8 = true;
        }
        zzeq.zzd(z8);
        this.zzc = i9;
        this.zzd = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfv) {
            zzfv zzfvVar = (zzfv) obj;
            if (this.zzc == zzfvVar.zzc && this.zzd == zzfvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzc;
        return ((i9 >>> 16) | (i9 << 16)) ^ this.zzd;
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
