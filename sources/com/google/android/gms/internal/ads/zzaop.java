package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaop {
    public static int zza(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static long zzb(zzek zzekVar, int i2, int i3) {
        zzekVar.zzL(i2);
        if (zzekVar.zzb() < 5) {
            return -9223372036854775807L;
        }
        int zzg = zzekVar.zzg();
        if ((8388608 & zzg) != 0 || ((zzg >> 8) & 8191) != i3 || (zzg & 32) == 0 || zzekVar.zzm() < 7 || zzekVar.zzb() < 7 || (zzekVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzekVar.zzH(bArr, 0, 6);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3] & 255;
        return ((j2 & 255) << 25) | ((j3 & 255) << 17) | ((j4 & 255) << 9) | (j5 + j5) | ((bArr[4] & 255) >> 7);
    }
}
