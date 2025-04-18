package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzgnn {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j7 = j2 + (j3 >> 26);
                long j8 = j7 & 67108863;
                long j9 = j4 + (j7 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j5 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = ((j11 >> 26) * 5) + j6;
                long j14 = j13 >> 26;
                long j15 = j13 & 67108863;
                long j16 = j15 + 5;
                long j17 = (j3 & 67108863) + j14;
                long j18 = j17 + (j16 >> 26);
                long j19 = (j18 >> 26) + j8;
                long j20 = j10 + (j19 >> 26);
                long j21 = (j12 + (j20 >> 26)) - 67108864;
                long j22 = j21 >> 63;
                long j23 = ~j22;
                long j24 = (j17 & j22) | (j18 & 67108863 & j23);
                long j25 = (j8 & j22) | (j19 & 67108863 & j23);
                long j26 = (j10 & j22) | (j20 & 67108863 & j23);
                long j27 = (j12 & j22) | (j21 & j23);
                long zzc = (((j15 & j22) | (j16 & 67108863 & j23) | (j24 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j24 >> 6) | (j25 << 20)) & 4294967295L) + zzc(bArr, 20);
                long zzc3 = (((j26 << 14) | (j25 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long zzc4 = (((j26 >> 18) | (j27 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                long j28 = zzc2 + (zzc >> 32);
                zzd(bArr4, j28 & 4294967295L, 4);
                long j29 = zzc3 + (j28 >> 32);
                zzd(bArr4, j29 & 4294967295L, 8);
                zzd(bArr4, (zzc4 + (j29 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i2, (byte) 0);
            }
            long j30 = zzb5 * 5;
            long j31 = zzb4 * 5;
            long j32 = zzb3 * 5;
            long zzb6 = j6 + zzb(bArr3, 0, 0);
            long zzb7 = j3 + zzb(bArr3, 3, 2);
            long zzb8 = j2 + zzb(bArr3, 6, 4);
            long zzb9 = j4 + zzb(bArr3, 9, 6);
            long zzb10 = j5 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
            long j33 = zzb7 * zzb;
            long j34 = zzb7 * zzb2;
            long j35 = zzb8 * zzb;
            long j36 = zzb7 * zzb3;
            long j37 = zzb8 * zzb2;
            long j38 = zzb9 * zzb;
            long j39 = zzb7 * zzb4;
            long j40 = zzb8 * zzb3;
            long j41 = zzb9 * zzb2;
            long j42 = zzb10 * zzb;
            long j43 = (zzb2 * 5 * zzb10) + (zzb9 * j32) + (zzb8 * j31) + (zzb7 * j30) + (zzb6 * zzb);
            long j44 = j43 & 67108863;
            long j45 = zzb9 * j31;
            long j46 = j32 * zzb10;
            long j47 = j46 + j45 + (zzb8 * j30) + (zzb6 * zzb2) + j33 + (j43 >> 26);
            long j48 = j31 * zzb10;
            long j49 = j48 + (zzb9 * j30) + (zzb6 * zzb3) + j34 + j35 + (j47 >> 26);
            long j50 = (zzb10 * j30) + (zzb6 * zzb4) + j36 + j37 + j38 + (j49 >> 26);
            long j51 = (zzb6 * zzb5) + j39 + j40 + j41 + j42 + (j50 >> 26);
            long j52 = ((j51 >> 26) * 5) + j44;
            j3 = (j47 & 67108863) + (j52 >> 26);
            i3 += 16;
            j2 = j49 & 67108863;
            j4 = j50 & 67108863;
            j5 = j51 & 67108863;
            i2 = 17;
            j6 = j52 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i2, int i3) {
        return (zzc(bArr, i2) >> i3) & 67108863;
    }

    private static long zzc(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i2 + 2] & UnsignedBytes.MAX_VALUE;
        return (((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i4 << 8) | i3 | (i5 << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }
}
