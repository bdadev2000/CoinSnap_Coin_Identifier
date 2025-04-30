package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzape implements zzadd {
    private final zzgb zza;
    private final zzfu zzb = new zzfu();
    private final int zzc;

    public zzape(int i9, zzgb zzgbVar, int i10) {
        this.zzc = i9;
        this.zza = zzgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final zzadc zza(zzadv zzadvVar, long j7) throws IOException {
        int zza;
        int zza2;
        long zzf = zzadvVar.zzf();
        int min = (int) Math.min(112800L, zzadvVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, min, false);
        zzfu zzfuVar = this.zzb;
        int zze = zzfuVar.zze();
        long j9 = -1;
        long j10 = -9223372036854775807L;
        long j11 = -1;
        while (zzfuVar.zzb() >= 188 && (zza2 = (zza = zzapq.zza(zzfuVar.zzM(), zzfuVar.zzd(), zze)) + 188) <= zze) {
            long zzb = zzapq.zzb(zzfuVar, zza, this.zzc);
            if (zzb != C.TIME_UNSET) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j7) {
                    if (j10 == C.TIME_UNSET) {
                        return zzadc.zzd(zzb2, zzf);
                    }
                } else {
                    j11 = zza;
                    if (100000 + zzb2 <= j7) {
                        j10 = zzb2;
                    }
                }
                return zzadc.zze(zzf + j11);
            }
            zzfuVar.zzK(zza2);
            j9 = zza2;
        }
        if (j10 != C.TIME_UNSET) {
            return zzadc.zzf(j10, zzf + j9);
        }
        return zzadc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final void zzb() {
        byte[] bArr = zzgd.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
