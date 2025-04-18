package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzaoc {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzed zzedVar, int i10, int i11) {
        zzedVar.zzL(i10);
        if (zzedVar.zzb() >= 5) {
            int zzg = zzedVar.zzg();
            if ((8388608 & zzg) == 0 && ((zzg >> 8) & 8191) == i11 && (zzg & 32) != 0 && zzedVar.zzm() >= 7 && zzedVar.zzb() >= 7 && (zzedVar.zzm() & 16) == 16) {
                byte[] bArr = new byte[6];
                zzedVar.zzH(bArr, 0, 6);
                long j3 = bArr[0];
                long j10 = bArr[1];
                long j11 = bArr[2];
                long j12 = bArr[3] & 255;
                return ((j3 & 255) << 25) | ((j10 & 255) << 17) | ((j11 & 255) << 9) | (j12 + j12) | ((bArr[4] & 255) >> 7);
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }
}
