package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzaik {
    public final zzadt zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;

    @Nullable
    public final long[] zzf;

    private zzaik(zzadt zzadtVar, long j2, long j3, @Nullable long[] jArr, int i2, int i3) {
        this.zza = new zzadt(zzadtVar);
        this.zzb = j2;
        this.zzc = j3;
        this.zzf = jArr;
        this.zzd = i2;
        this.zze = i3;
    }

    public static zzaik zzb(zzadt zzadtVar, zzek zzekVar) {
        long[] jArr;
        int i2;
        int i3;
        int zzg = zzekVar.zzg();
        int zzp = (zzg & 1) != 0 ? zzekVar.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzekVar.zzu() : -1L;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr2[i4] = zzekVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzekVar.zzM(4);
        }
        if (zzekVar.zzb() >= 24) {
            zzekVar.zzM(21);
            int zzo = zzekVar.zzo();
            i3 = zzo & 4095;
            i2 = zzo >> 12;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new zzaik(zzadtVar, zzp, zzu, jArr, i2, i3);
    }

    public final long zza() {
        long j2 = this.zzb;
        if (j2 == -1 || j2 == 0) {
            return -9223372036854775807L;
        }
        return zzeu.zzs((j2 * r4.zzg) - 1, this.zza.zzd);
    }
}
