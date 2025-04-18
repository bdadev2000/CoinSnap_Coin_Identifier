package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import vd.e;

/* loaded from: classes3.dex */
public final class zzb {
    public static final zzb zza = new zzb(null, new zza[0], 0, C.TIME_UNSET, 0);
    private static final zza zze = new zza(0).zzb(0);
    private final zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private zzb(@Nullable Object obj, zza[] zzaVarArr, long j3, long j10, int i10) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzb.class == obj.getClass() && Arrays.equals(this.zzf, ((zzb) obj).zzf)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) C.TIME_UNSET;
        return Arrays.hashCode(this.zzf) + (i10 * 961);
    }

    public final String toString() {
        return e.e("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zza zza(int i10) {
        return i10 < 0 ? zze : this.zzf[i10];
    }

    public final boolean zzb(int i10) {
        zza(-1);
        int i11 = zza.zzi;
        return false;
    }
}
