package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzbk {
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;
    public static final zzbk zza = new zzbk(new zzbi());
    private static final String zzh = Integer.toString(0, 36);
    private static final String zzi = Integer.toString(1, 36);
    private static final String zzj = Integer.toString(2, 36);
    private static final String zzk = Integer.toString(3, 36);
    private static final String zzl = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbh
    };

    private zzbk(zzbi zzbiVar) {
        this.zzc = C.TIME_UNSET;
        this.zzd = C.TIME_UNSET;
        this.zze = C.TIME_UNSET;
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbk)) {
            return false;
        }
        long j7 = ((zzbk) obj).zzc;
        return true;
    }

    public final int hashCode() {
        int i9 = (int) (-9223372034707292159L);
        return Float.floatToIntBits(-3.4028235E38f) + ((Float.floatToIntBits(-3.4028235E38f) + (((((i9 * 31) + i9) * 31) + i9) * 31)) * 31);
    }
}
