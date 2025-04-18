package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzadt implements zzadq {
    public zzadt(long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        zzadr zzadrVar = new zzadr(j3, 0L);
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
