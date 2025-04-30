package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzapq {
    public static int zza(byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] != 71) {
            i9++;
        }
        return i9;
    }

    public static long zzb(zzfu zzfuVar, int i9, int i10) {
        zzfuVar.zzK(i9);
        if (zzfuVar.zzb() >= 5) {
            int zzg = zzfuVar.zzg();
            if ((8388608 & zzg) == 0 && ((zzg >> 8) & 8191) == i10 && (zzg & 32) != 0 && zzfuVar.zzm() >= 7 && zzfuVar.zzb() >= 7 && (zzfuVar.zzm() & 16) == 16) {
                byte[] bArr = new byte[6];
                zzfuVar.zzG(bArr, 0, 6);
                long j7 = bArr[0];
                long j9 = bArr[1];
                long j10 = bArr[2];
                long j11 = bArr[3] & 255;
                return ((j7 & 255) << 25) | ((j9 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }
}
