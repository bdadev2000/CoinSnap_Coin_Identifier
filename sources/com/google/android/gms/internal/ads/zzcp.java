package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcp {
    public static final zzcp zza = new zzcp(0, 0, 1.0f);

    @IntRange
    public final int zzb;

    @IntRange
    public final int zzc;

    @FloatRange
    public final float zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzcp(@IntRange int i2, @IntRange int i3, @FloatRange float f2) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = f2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcp) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzb == zzcpVar.zzb && this.zzc == zzcpVar.zzc && this.zzd == zzcpVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb + 217;
        float f2 = this.zzd;
        return Float.floatToRawIntBits(f2) + (((i2 * 31) + this.zzc) * 31);
    }
}
