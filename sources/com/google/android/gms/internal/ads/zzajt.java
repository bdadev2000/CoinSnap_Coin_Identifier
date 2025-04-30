package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzajt implements zzajr {
    private final int zza;
    private final int zzb;
    private final zzfu zzc;

    public zzajt(zzajn zzajnVar, zzan zzanVar) {
        zzfu zzfuVar = zzajnVar.zza;
        this.zzc = zzfuVar;
        zzfuVar.zzK(12);
        int zzp = zzfuVar.zzp();
        if (MimeTypes.AUDIO_RAW.equals(zzanVar.zzn)) {
            int zzm = zzgd.zzm(zzanVar.zzC, zzanVar.zzA);
            if (zzp == 0 || zzp % zzm != 0) {
                zzfk.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzm + ", stsz sample size: " + zzp);
                zzp = zzm;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzfuVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzc() {
        int i9 = this.zza;
        if (i9 == -1) {
            return this.zzc.zzp();
        }
        return i9;
    }
}
