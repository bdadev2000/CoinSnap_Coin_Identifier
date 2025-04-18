package com.google.android.gms.internal.ads;

import a4.j;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzaoe implements zzaof {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacu zzc;
    private final zzadx zzd;
    private final zzaoi zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzed zzh;
    private final int zzi;
    private final zzad zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaoe(zzacu zzacuVar, zzadx zzadxVar, zzaoi zzaoiVar) throws zzbh {
        this.zzc = zzacuVar;
        this.zzd = zzadxVar;
        this.zze = zzaoiVar;
        int max = Math.max(1, zzaoiVar.zzc / 10);
        this.zzi = max;
        zzed zzedVar = new zzed(zzaoiVar.zzf);
        zzedVar.zzk();
        int zzk = zzedVar.zzk();
        this.zzf = zzk;
        int i10 = zzaoiVar.zzb;
        int i11 = zzaoiVar.zzd;
        int z10 = j.z(i11 - (i10 * 4), 8, zzaoiVar.zze * i10, 1);
        if (zzk == z10) {
            int i12 = zzen.zza;
            int i13 = ((max + zzk) - 1) / zzk;
            this.zzg = new byte[i11 * i13];
            this.zzh = new zzed((zzk + zzk) * i10 * i13);
            int i14 = ((zzaoiVar.zzc * zzaoiVar.zzd) * 8) / zzk;
            zzab zzabVar = new zzab();
            zzabVar.zzZ(MimeTypes.AUDIO_RAW);
            zzabVar.zzy(i14);
            zzabVar.zzU(i14);
            zzabVar.zzQ((max + max) * i10);
            zzabVar.zzz(zzaoiVar.zzb);
            zzabVar.zzaa(zzaoiVar.zzc);
            zzabVar.zzT(2);
            this.zzj = zzabVar.zzaf();
            return;
        }
        throw zzbh.zza("Expected frames per block: " + z10 + "; got: " + zzk, null);
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long zzu = this.zzl + zzen.zzu(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i10);
        this.zzd.zzs(zzu, 1, zze, this.zzm - zze, null);
        this.zzn += i10;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zza(int i10, long j3) {
        this.zzc.zzO(new zzaol(this.zze, this.zzf, i10, j3));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzaof
    public final void zzb(long j3) {
        this.zzk = 0;
        this.zzl = j3;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzacs r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoe.zzc(com.google.android.gms.internal.ads.zzacs, long):boolean");
    }
}
