package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
final class zzaij implements zzaig {
    private final int zza;
    private final int zzb;
    private final zzed zzc;

    public zzaij(zzet zzetVar, zzad zzadVar) {
        zzed zzedVar = zzetVar.zza;
        this.zzc = zzedVar;
        zzedVar.zzL(12);
        int zzp = zzedVar.zzp();
        if (MimeTypes.AUDIO_RAW.equals(zzadVar.zzo)) {
            int zzk = zzen.zzk(zzadVar.zzE) * zzadVar.zzC;
            if (zzp == 0 || zzp % zzk != 0) {
                zzdt.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + zzk + ", stsz sample size: " + zzp);
                zzp = zzk;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzedVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzp() : i10;
    }
}
