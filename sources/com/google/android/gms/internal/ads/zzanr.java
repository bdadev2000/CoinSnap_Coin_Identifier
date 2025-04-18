package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzanr implements zzacb {
    private final zzek zza;
    private final zzed zzb = new zzed();
    private final int zzc;

    public zzanr(int i10, zzek zzekVar, int i11) {
        this.zzc = i10;
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final zzaca zza(zzacs zzacsVar, long j3) throws IOException {
        int zza;
        int zza2;
        long zzf = zzacsVar.zzf();
        int min = (int) Math.min(112800L, zzacsVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzacsVar.zzh(this.zzb.zzN(), 0, min);
        zzed zzedVar = this.zzb;
        int zze = zzedVar.zze();
        long j10 = -1;
        long j11 = -9223372036854775807L;
        long j12 = -1;
        while (zzedVar.zzb() >= 188 && (zza2 = (zza = zzaoc.zza(zzedVar.zzN(), zzedVar.zzd(), zze)) + 188) <= zze) {
            long zzb = zzaoc.zzb(zzedVar, zza, this.zzc);
            if (zzb != C.TIME_UNSET) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j3) {
                    if (j11 == C.TIME_UNSET) {
                        return zzaca.zzd(zzb2, zzf);
                    }
                } else {
                    j12 = zza;
                    if (100000 + zzb2 <= j3) {
                        j11 = zzb2;
                    }
                }
                return zzaca.zze(zzf + j12);
            }
            zzedVar.zzL(zza2);
            j10 = zza2;
        }
        if (j11 != C.TIME_UNSET) {
            return zzaca.zzf(j11, zzf + j10);
        }
        return zzaca.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zzb() {
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
