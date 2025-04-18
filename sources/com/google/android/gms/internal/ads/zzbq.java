package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbq(@FloatRange float f2, @FloatRange float f3) {
        zzdi.zzd(f2 > 0.0f);
        zzdi.zzd(f3 > 0.0f);
        this.zzb = f2;
        this.zzc = f3;
        this.zzd = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbq.class == obj.getClass()) {
            zzbq zzbqVar = (zzbq) obj;
            if (this.zzb == zzbqVar.zzb && this.zzc == zzbqVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToRawIntBits = Float.floatToRawIntBits(this.zzb) + 527;
        return Float.floatToRawIntBits(this.zzc) + (floatToRawIntBits * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    public final long zza(long j2) {
        return j2 * this.zzd;
    }
}
