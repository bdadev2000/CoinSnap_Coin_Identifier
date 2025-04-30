package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.impl.L;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzapz {
    public static Pair zza(zzadv zzadvVar) throws IOException {
        zzadvVar.zzj();
        zzapy zzd = zzd(1684108385, zzadvVar, new zzfu(8));
        ((zzadi) zzadvVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzadvVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzapx zzb(zzadv zzadvVar) throws IOException {
        boolean z8;
        byte[] bArr;
        zzfu zzfuVar = new zzfu(16);
        zzapy zzd = zzd(1718449184, zzadvVar, zzfuVar);
        if (zzd.zzb >= 16) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzm(zzfuVar.zzM(), 0, 16, false);
        zzfuVar.zzK(0);
        int zzk = zzfuVar.zzk();
        int zzk2 = zzfuVar.zzk();
        int zzj = zzfuVar.zzj();
        int zzj2 = zzfuVar.zzj();
        int zzk3 = zzfuVar.zzk();
        int zzk4 = zzfuVar.zzk();
        int i9 = ((int) zzd.zzb) - 16;
        if (i9 > 0) {
            byte[] bArr2 = new byte[i9];
            zzadiVar.zzm(bArr2, 0, i9, false);
            bArr = bArr2;
        } else {
            bArr = zzgd.zzf;
        }
        ((zzadi) zzadvVar).zzo((int) (zzadvVar.zze() - zzadvVar.zzf()), false);
        return new zzapx(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzadv zzadvVar) throws IOException {
        zzfu zzfuVar = new zzfu(8);
        int i9 = zzapy.zza(zzadvVar, zzfuVar).zza;
        if (i9 != 1380533830 && i9 != 1380333108) {
            return false;
        }
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, 4, false);
        zzfuVar.zzK(0);
        int zzg = zzfuVar.zzg();
        if (zzg != 1463899717) {
            zzfk.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
            return false;
        }
        return true;
    }

    private static zzapy zzd(int i9, zzadv zzadvVar, zzfu zzfuVar) throws IOException {
        zzapy zza = zzapy.zza(zzadvVar, zzfuVar);
        while (true) {
            int i10 = zza.zza;
            if (i10 != i9) {
                L.z(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j7 = zza.zzb;
                long j9 = 8 + j7;
                if ((1 & j7) != 0) {
                    j9 = j7 + 9;
                }
                if (j9 <= 2147483647L) {
                    ((zzadi) zzadvVar).zzo((int) j9, false);
                    zza = zzapy.zza(zzadvVar, zzfuVar);
                } else {
                    throw zzch.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
                }
            } else {
                return zza;
            }
        }
    }
}
