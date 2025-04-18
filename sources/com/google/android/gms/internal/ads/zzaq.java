package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzaq {
    public final long zza = C.TIME_UNSET;
    public final long zzb = C.TIME_UNSET;
    public final long zzc = C.TIME_UNSET;
    public final float zzd = -3.4028235E38f;
    public final float zze = -3.4028235E38f;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public /* synthetic */ zzaq(zzap zzapVar, zzav zzavVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaq)) {
            return false;
        }
        long j3 = ((zzaq) obj).zza;
        return true;
    }

    public final int hashCode() {
        int i10 = (int) (-9223372034707292159L);
        return Float.floatToIntBits(-3.4028235E38f) + ((Float.floatToIntBits(-3.4028235E38f) + (((((i10 * 31) + i10) * 31) + i10) * 31)) * 31);
    }
}
