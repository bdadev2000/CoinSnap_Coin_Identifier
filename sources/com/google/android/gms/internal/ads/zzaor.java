package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import okhttp3.internal.http.StatusLine;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class zzaor implements zzaos {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Opcodes.FNEG, 130, Opcodes.D2L, 157, Opcodes.LRETURN, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzade zzc;
    private final zzaeh zzd;
    private final zzaov zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzek zzh;
    private final int zzi;
    private final zzaf zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaor(zzade zzadeVar, zzaeh zzaehVar, zzaov zzaovVar) throws zzbo {
        this.zzc = zzadeVar;
        this.zzd = zzaehVar;
        this.zze = zzaovVar;
        int max = Math.max(1, zzaovVar.zzc / 10);
        this.zzi = max;
        zzek zzekVar = new zzek(zzaovVar.zzf);
        zzekVar.zzk();
        int zzk = zzekVar.zzk();
        this.zzf = zzk;
        int i2 = zzaovVar.zzb;
        int i3 = zzaovVar.zzd;
        int z2 = androidx.compose.foundation.text.input.a.z(i3 - (i2 * 4), 8, zzaovVar.zze * i2, 1);
        if (zzk != z2) {
            throw zzbo.zza("Expected frames per block: " + z2 + "; got: " + zzk, null);
        }
        int i4 = zzeu.zza;
        int i5 = ((max + zzk) - 1) / zzk;
        this.zzg = new byte[i3 * i5];
        this.zzh = new zzek((zzk + zzk) * i2 * i5);
        int i6 = ((zzaovVar.zzc * zzaovVar.zzd) * 8) / zzk;
        zzad zzadVar = new zzad();
        zzadVar.zzZ("audio/raw");
        zzadVar.zzy(i6);
        zzadVar.zzU(i6);
        zzadVar.zzQ((max + max) * i2);
        zzadVar.zzz(zzaovVar.zzb);
        zzadVar.zzaa(zzaovVar.zzc);
        zzadVar.zzT(2);
        this.zzj = zzadVar.zzaf();
    }

    private final int zzd(int i2) {
        int i3 = this.zze.zzb;
        return i2 / (i3 + i3);
    }

    private final int zze(int i2) {
        return (i2 + i2) * this.zze.zzb;
    }

    private final void zzf(int i2) {
        long zzt = this.zzl + zzeu.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i2);
        this.zzd.zzs(zzt, 1, zze, this.zzm - zze, null);
        this.zzn += i2;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zza(int i2, long j2) {
        this.zzc.zzO(new zzaoy(this.zze, this.zzf, i2, j2));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zzb(long j2) {
        this.zzk = 0;
        this.zzl = j2;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaos
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadc r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaor.zzc(com.google.android.gms.internal.ads.zzadc, long):boolean");
    }
}
