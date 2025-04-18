package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class zzav {
    public final long zza = -9223372036854775807L;
    public final long zzb = -9223372036854775807L;
    public final long zzc = -9223372036854775807L;
    public final float zzd = -3.4028235E38f;
    public final float zze = -3.4028235E38f;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public /* synthetic */ zzav(zzat zzatVar, zzau zzauVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzav)) {
            return false;
        }
        long j2 = ((zzav) obj).zza;
        return true;
    }

    public final int hashCode() {
        int i2 = (int) (-9223372034707292159L);
        return Float.floatToIntBits(-3.4028235E38f) + ((Float.floatToIntBits(-3.4028235E38f) + (((((i2 * 31) + i2) * 31) + i2) * 31)) * 31);
    }
}
