package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzadc {
    public static final zzadc zza = new zzadc(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzadc(int i9, long j7, long j9) {
        this.zzb = i9;
        this.zzc = j7;
        this.zzd = j9;
    }

    public static zzadc zzd(long j7, long j9) {
        return new zzadc(-1, j7, j9);
    }

    public static zzadc zze(long j7) {
        return new zzadc(0, C.TIME_UNSET, j7);
    }

    public static zzadc zzf(long j7, long j9) {
        return new zzadc(-2, j7, j9);
    }
}
