package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzd {
    private final zzc[] zzk;
    public static final zzd zza = new zzd(null, new zzc[0], 0, C.TIME_UNSET, 0);
    private static final zzc zzf = new zzc(0).zzb(0);
    private static final String zzg = Integer.toString(1, 36);
    private static final String zzh = Integer.toString(2, 36);
    private static final String zzi = Integer.toString(3, 36);
    private static final String zzj = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zza
    };
    public final long zzd = 0;
    public final int zzc = 0;
    public final int zze = 0;

    private zzd(@Nullable Object obj, zzc[] zzcVarArr, long j7, long j9, int i9) {
        this.zzk = zzcVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            zzd zzdVar = (zzd) obj;
            if (zzgd.zzG(null, null) && Arrays.equals(this.zzk, zzdVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (int) C.TIME_UNSET;
        return Arrays.hashCode(this.zzk) + (i9 * 961);
    }

    public final String toString() {
        return AbstractC2914a.d("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zzc zza(int i9) {
        if (i9 < 0) {
            return zzf;
        }
        return this.zzk[i9];
    }

    public final boolean zzb(int i9) {
        zza(-1);
        zzn zznVar = zzc.zzb;
        return false;
    }
}
