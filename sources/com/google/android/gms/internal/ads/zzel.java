package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzel {
    public static final zzel zza = new zzel(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzel(0, 0);
    }

    public zzel(int i2, int i3) {
        boolean z2 = false;
        if ((i2 == -1 || i2 >= 0) && (i3 == -1 || i3 >= 0)) {
            z2 = true;
        }
        zzdi.zzd(z2);
        this.zzb = i2;
        this.zzc = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzel) {
            zzel zzelVar = (zzel) obj;
            if (this.zzb == zzelVar.zzb && this.zzc == zzelVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        return ((i2 >>> 16) | (i2 << 16)) ^ this.zzc;
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
