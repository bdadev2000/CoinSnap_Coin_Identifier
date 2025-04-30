package com.google.android.gms.internal.ads;

import Q7.n0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzapt implements zzapu {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzadx zzc;
    private final zzafa zzd;
    private final zzapx zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfu zzh;
    private final int zzi;
    private final zzan zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzapt(zzadx zzadxVar, zzafa zzafaVar, zzapx zzapxVar) throws zzch {
        this.zzc = zzadxVar;
        this.zzd = zzafaVar;
        this.zze = zzapxVar;
        int max = Math.max(1, zzapxVar.zzc / 10);
        this.zzi = max;
        zzfu zzfuVar = new zzfu(zzapxVar.zzf);
        zzfuVar.zzk();
        int zzk = zzfuVar.zzk();
        this.zzf = zzk;
        int i9 = zzapxVar.zzb;
        int i10 = zzapxVar.zzd;
        int v6 = n0.v(i10 - (i9 * 4), 8, zzapxVar.zze * i9, 1);
        if (zzk == v6) {
            int i11 = zzgd.zza;
            int i12 = ((max + zzk) - 1) / zzk;
            this.zzg = new byte[i10 * i12];
            this.zzh = new zzfu((zzk + zzk) * i9 * i12);
            int i13 = ((zzapxVar.zzc * zzapxVar.zzd) * 8) / zzk;
            zzal zzalVar = new zzal();
            zzalVar.zzX(MimeTypes.AUDIO_RAW);
            zzalVar.zzx(i13);
            zzalVar.zzS(i13);
            zzalVar.zzP((max + max) * i9);
            zzalVar.zzy(zzapxVar.zzb);
            zzalVar.zzY(zzapxVar.zzc);
            zzalVar.zzR(2);
            this.zzj = zzalVar.zzad();
            return;
        }
        throw zzch.zza("Expected frames per block: " + v6 + "; got: " + zzk, null);
    }

    private final int zzd(int i9) {
        int i10 = this.zze.zzb;
        return i9 / (i10 + i10);
    }

    private final int zze(int i9) {
        return (i9 + i9) * this.zze.zzb;
    }

    private final void zzf(int i9) {
        long zzt = this.zzl + zzgd.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i9);
        this.zzd.zzs(zzt, 1, zze, this.zzm - zze, null);
        this.zzn += i9;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zza(int i9, long j7) {
        this.zzc.zzO(new zzaqa(this.zze, this.zzf, i9, j7));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final void zzb(long j7) {
        this.zzk = 0;
        this.zzl = j7;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzapu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadv r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapt.zzc(com.google.android.gms.internal.ads.zzadv, long):boolean");
    }
}
