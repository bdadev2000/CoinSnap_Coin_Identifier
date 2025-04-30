package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes2.dex */
final class zzaju implements zzajr {
    private final zzfu zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaju(zzajn zzajnVar) {
        zzfu zzfuVar = zzajnVar.zza;
        this.zza = zzfuVar;
        zzfuVar.zzK(12);
        this.zzc = zzfuVar.zzp() & 255;
        this.zzb = zzfuVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzc() {
        int i9 = this.zzc;
        if (i9 == 8) {
            return this.zza.zzm();
        }
        if (i9 == 16) {
            return this.zza.zzq();
        }
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        if (i10 % 2 == 0) {
            int zzm = this.zza.zzm();
            this.zze = zzm;
            return (zzm & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.zze & 15;
    }
}
