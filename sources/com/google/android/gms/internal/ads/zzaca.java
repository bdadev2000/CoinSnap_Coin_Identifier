package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzaca {
    public static final zzaca zza = new zzaca(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaca(int i10, long j3, long j10) {
        this.zzb = i10;
        this.zzc = j3;
        this.zzd = j10;
    }

    public static zzaca zzd(long j3, long j10) {
        return new zzaca(-1, j3, j10);
    }

    public static zzaca zze(long j3) {
        return new zzaca(0, C.TIME_UNSET, j3);
    }

    public static zzaca zzf(long j3, long j10) {
        return new zzaca(-2, j3, j10);
    }
}
