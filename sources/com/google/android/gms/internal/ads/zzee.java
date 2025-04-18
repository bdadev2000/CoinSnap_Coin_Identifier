package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzee {
    public static final zzee zza = new zzee(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzee(0, 0);
    }

    public zzee(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        zzdb.zzd(z10);
        this.zzb = i10;
        this.zzc = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzee) {
            zzee zzeeVar = (zzee) obj;
            if (this.zzb == zzeeVar.zzb && this.zzc == zzeeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.zzc;
    }

    public final String toString() {
        return this.zzb + "x" + this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }
}
