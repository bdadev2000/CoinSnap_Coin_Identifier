package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.impl.adview.t;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaox {
    public static Pair zza(zzadc zzadcVar) throws IOException {
        zzadcVar.zzj();
        zzaow zzd = zzd(1684108385, zzadcVar, new zzek(8));
        zzadcVar.zzk(8);
        return Pair.create(Long.valueOf(zzadcVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaov zzb(zzadc zzadcVar) throws IOException {
        byte[] bArr;
        zzek zzekVar = new zzek(16);
        zzaow zzd = zzd(1718449184, zzadcVar, zzekVar);
        zzdi.zzf(zzd.zzb >= 16);
        zzadcVar.zzh(zzekVar.zzN(), 0, 16);
        zzekVar.zzL(0);
        int zzk = zzekVar.zzk();
        int zzk2 = zzekVar.zzk();
        int zzj = zzekVar.zzj();
        int zzj2 = zzekVar.zzj();
        int zzk3 = zzekVar.zzk();
        int zzk4 = zzekVar.zzk();
        int i2 = ((int) zzd.zzb) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            zzadcVar.zzh(bArr2, 0, i2);
            bArr = bArr2;
        } else {
            bArr = zzeu.zzf;
        }
        zzadcVar.zzk((int) (zzadcVar.zze() - zzadcVar.zzf()));
        return new zzaov(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzadc zzadcVar) throws IOException {
        zzek zzekVar = new zzek(8);
        int i2 = zzaow.zza(zzadcVar, zzekVar).zza;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        zzadcVar.zzh(zzekVar.zzN(), 0, 4);
        zzekVar.zzL(0);
        int zzg = zzekVar.zzg();
        if (zzg == 1463899717) {
            return true;
        }
        zzea.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
        return false;
    }

    private static zzaow zzd(int i2, zzadc zzadcVar, zzek zzekVar) throws IOException {
        zzaow zza = zzaow.zza(zzadcVar, zzekVar);
        while (true) {
            int i3 = zza.zza;
            if (i3 == i2) {
                return zza;
            }
            t.C("Ignoring unknown WAV chunk: ", i3, "WavHeaderReader");
            long j2 = zza.zzb;
            long j3 = 8 + j2;
            if ((1 & j2) != 0) {
                j3 = j2 + 9;
            }
            if (j3 > 2147483647L) {
                throw zzbo.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            zzadcVar.zzk((int) j3);
            zza = zzaow.zza(zzadcVar, zzekVar);
        }
    }
}
