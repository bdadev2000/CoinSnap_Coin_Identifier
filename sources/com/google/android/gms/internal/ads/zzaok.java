package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.impl.mediation.ads.e;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzaok {
    public static Pair zza(zzacs zzacsVar) throws IOException {
        zzacsVar.zzj();
        zzaoj zzd = zzd(1684108385, zzacsVar, new zzed(8));
        zzacsVar.zzk(8);
        return Pair.create(Long.valueOf(zzacsVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaoi zzb(zzacs zzacsVar) throws IOException {
        boolean z10;
        byte[] bArr;
        zzed zzedVar = new zzed(16);
        zzaoj zzd = zzd(1718449184, zzacsVar, zzedVar);
        if (zzd.zzb >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        zzacsVar.zzh(zzedVar.zzN(), 0, 16);
        zzedVar.zzL(0);
        int zzk = zzedVar.zzk();
        int zzk2 = zzedVar.zzk();
        int zzj = zzedVar.zzj();
        int zzj2 = zzedVar.zzj();
        int zzk3 = zzedVar.zzk();
        int zzk4 = zzedVar.zzk();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            zzacsVar.zzh(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = zzen.zzf;
        }
        zzacsVar.zzk((int) (zzacsVar.zze() - zzacsVar.zzf()));
        return new zzaoi(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzacs zzacsVar) throws IOException {
        zzed zzedVar = new zzed(8);
        int i10 = zzaoj.zza(zzacsVar, zzedVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        zzacsVar.zzh(zzedVar.zzN(), 0, 4);
        zzedVar.zzL(0);
        int zzg = zzedVar.zzg();
        if (zzg != 1463899717) {
            zzdt.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
            return false;
        }
        return true;
    }

    private static zzaoj zzd(int i10, zzacs zzacsVar, zzed zzedVar) throws IOException {
        zzaoj zza = zzaoj.zza(zzacsVar, zzedVar);
        while (true) {
            int i11 = zza.zza;
            if (i11 != i10) {
                e.r("Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
                long j3 = zza.zzb;
                long j10 = j3 & 1;
                long j11 = j3 + 8;
                if (j10 != 0) {
                    j11++;
                }
                if (j11 <= 2147483647L) {
                    zzacsVar.zzk((int) j11);
                    zza = zzaoj.zza(zzacsVar, zzedVar);
                } else {
                    throw zzbh.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
                }
            } else {
                return zza;
            }
        }
    }
}
