package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes3.dex */
final class zzaik implements zzaig {
    private final zzed zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaik(zzet zzetVar) {
        zzed zzedVar = zzetVar.zza;
        this.zza = zzedVar;
        zzedVar.zzL(12);
        this.zzc = zzedVar.zzp() & 255;
        this.zzb = zzedVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzm();
        }
        if (i10 == 16) {
            return this.zza.zzq();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 == 0) {
            int zzm = this.zza.zzm();
            this.zze = zzm;
            return (zzm & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.zze & 15;
    }
}
