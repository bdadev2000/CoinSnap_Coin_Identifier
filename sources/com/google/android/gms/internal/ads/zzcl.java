package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzcl {
    public final float zzc;
    public final float zzd;
    private final int zzg;
    public static final zzcl zza = new zzcl(1.0f, 1.0f);
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzck
    };

    public zzcl(float f9, float f10) {
        boolean z8;
        if (f9 > 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        zzeq.zzd(f10 > 0.0f);
        this.zzc = f9;
        this.zzd = f10;
        this.zzg = Math.round(f9 * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcl.class == obj.getClass()) {
            zzcl zzclVar = (zzcl) obj;
            if (this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToRawIntBits = Float.floatToRawIntBits(this.zzc) + 527;
        return Float.floatToRawIntBits(this.zzd) + (floatToRawIntBits * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j7) {
        return j7 * this.zzg;
    }
}
