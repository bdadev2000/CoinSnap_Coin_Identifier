package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaew implements zzaet {
    public zzaew(long j7) {
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        zzaeu zzaeuVar = new zzaeu(j7, 0L);
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
