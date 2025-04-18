package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzvy implements zzym {
    public long zza;
    public long zzb;

    @Nullable
    public zzyl zzc;

    @Nullable
    public zzvy zzd;

    public zzvy(long j3, int i10) {
        zze(j3, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public final int zza(long j3) {
        long j10 = j3 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j10;
    }

    public final zzvy zzb() {
        this.zzc = null;
        zzvy zzvyVar = this.zzd;
        this.zzd = null;
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzyl zzc() {
        zzyl zzylVar = this.zzc;
        zzylVar.getClass();
        return zzylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    @Nullable
    public final zzym zzd() {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar == null || zzvyVar.zzc == null) {
            return null;
        }
        return zzvyVar;
    }

    public final void zze(long j3, int i10) {
        zzdb.zzf(this.zzc == null);
        this.zza = j3;
        this.zzb = j3 + 65536;
    }
}
