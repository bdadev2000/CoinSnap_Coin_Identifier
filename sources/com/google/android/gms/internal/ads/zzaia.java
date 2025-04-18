package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzaia {
    public final zzadj zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;

    @Nullable
    public final long[] zzf;

    private zzaia(zzadj zzadjVar, long j3, long j10, @Nullable long[] jArr, int i10, int i11) {
        this.zza = new zzadj(zzadjVar);
        this.zzb = j3;
        this.zzc = j10;
        this.zzf = jArr;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzaia zzb(zzadj zzadjVar, zzed zzedVar) {
        int i10;
        long j3;
        long[] jArr;
        int i11;
        int i12;
        int zzg = zzedVar.zzg();
        if ((zzg & 1) != 0) {
            i10 = zzedVar.zzp();
        } else {
            i10 = -1;
        }
        if ((zzg & 2) != 0) {
            j3 = zzedVar.zzu();
        } else {
            j3 = -1;
        }
        long j10 = j3;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr2[i13] = zzedVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzedVar.zzM(4);
        }
        if (zzedVar.zzb() >= 24) {
            zzedVar.zzM(21);
            int zzo = zzedVar.zzo();
            i12 = zzo & 4095;
            i11 = zzo >> 12;
        } else {
            i11 = -1;
            i12 = -1;
        }
        return new zzaia(zzadjVar, i10, j10, jArr, i11, i12);
    }

    public final long zza() {
        long j3 = this.zzb;
        if (j3 == -1 || j3 == 0) {
            return C.TIME_UNSET;
        }
        return zzen.zzt((j3 * r4.zzg) - 1, this.zza.zzd);
    }
}
