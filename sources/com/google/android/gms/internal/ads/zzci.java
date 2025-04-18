package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzci {
    public static final zzci zza = new zzci(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzci(int i10, int i11, float f10) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = f10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzci) {
            zzci zzciVar = (zzci) obj;
            if (this.zzb == zzciVar.zzb && this.zzc == zzciVar.zzc && this.zzd == zzciVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + 217;
        float f10 = this.zzd;
        return Float.floatToRawIntBits(f10) + (((i10 * 31) + this.zzc) * 31);
    }
}
