package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgnt {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        int i9 = 17;
        byte[] bArr3 = new byte[17];
        long j7 = 0;
        int i10 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 < length) {
                int min = Math.min(16, length - i10);
                System.arraycopy(bArr2, i10, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i9, (byte) 0);
                }
                long j13 = zzb5 * 5;
                long j14 = zzb4 * 5;
                long j15 = zzb3 * 5;
                long zzb6 = j12 + zzb(bArr3, 0, 0);
                long zzb7 = j9 + zzb(bArr3, 3, 2);
                long zzb8 = j7 + zzb(bArr3, 6, 4);
                long zzb9 = j10 + zzb(bArr3, 9, 6);
                long zzb10 = j11 + (zzb(bArr3, 12, 8) | (bArr3[16] << Ascii.CAN));
                long j16 = zzb7 * zzb;
                long j17 = zzb7 * zzb2;
                long j18 = zzb8 * zzb;
                long j19 = zzb7 * zzb3;
                long j20 = zzb8 * zzb2;
                long j21 = zzb9 * zzb;
                long j22 = zzb7 * zzb4;
                long j23 = zzb8 * zzb3;
                long j24 = zzb9 * zzb2;
                long j25 = zzb10 * zzb;
                long j26 = (zzb2 * 5 * zzb10) + (zzb9 * j15) + (zzb8 * j14) + (zzb7 * j13) + (zzb6 * zzb);
                long j27 = j26 & 67108863;
                long j28 = zzb9 * j14;
                long j29 = j15 * zzb10;
                long j30 = j29 + j28 + (zzb8 * j13) + (zzb6 * zzb2) + j16 + (j26 >> 26);
                long j31 = j14 * zzb10;
                long j32 = j31 + (zzb9 * j13) + (zzb6 * zzb3) + j17 + j18 + (j30 >> 26);
                long j33 = (zzb10 * j13) + (zzb6 * zzb4) + j19 + j20 + j21 + (j32 >> 26);
                long j34 = (zzb6 * zzb5) + j22 + j23 + j24 + j25 + (j33 >> 26);
                long j35 = ((j34 >> 26) * 5) + j27;
                j9 = (j30 & 67108863) + (j35 >> 26);
                i10 += 16;
                j7 = j32 & 67108863;
                j10 = j33 & 67108863;
                j11 = j34 & 67108863;
                i9 = 17;
                j12 = j35 & 67108863;
            } else {
                long j36 = j7 + (j9 >> 26);
                long j37 = j36 & 67108863;
                long j38 = j10 + (j36 >> 26);
                long j39 = j38 & 67108863;
                long j40 = j11 + (j38 >> 26);
                long j41 = j40 & 67108863;
                long j42 = ((j40 >> 26) * 5) + j12;
                long j43 = j42 >> 26;
                long j44 = j42 & 67108863;
                long j45 = j44 + 5;
                long j46 = (j9 & 67108863) + j43;
                long j47 = j46 + (j45 >> 26);
                long j48 = (j47 >> 26) + j37;
                long j49 = j39 + (j48 >> 26);
                long j50 = (j41 + (j49 >> 26)) - 67108864;
                long j51 = j50 >> 63;
                long j52 = ~j51;
                long j53 = (j46 & j51) | (j47 & 67108863 & j52);
                long j54 = (j37 & j51) | (j48 & 67108863 & j52);
                long j55 = (j39 & j51) | (j49 & 67108863 & j52);
                long j56 = (j41 & j51) | (j50 & j52);
                long zzc = (((j44 & j51) | (j45 & 67108863 & j52) | (j53 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j53 >> 6) | (j54 << 20)) & 4294967295L) + zzc(bArr, 20);
                long zzc3 = (((j55 << 14) | (j54 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long zzc4 = (((j55 >> 18) | (j56 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                long j57 = zzc2 + (zzc >> 32);
                zzd(bArr4, j57 & 4294967295L, 4);
                long j58 = zzc3 + (j57 >> 32);
                zzd(bArr4, j58 & 4294967295L, 8);
                zzd(bArr4, (zzc4 + (j58 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    private static long zzb(byte[] bArr, int i9, int i10) {
        return (zzc(bArr, i9) >> i10) & 67108863;
    }

    private static long zzc(byte[] bArr, int i9) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return (((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j7, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i9 + i10] = (byte) (255 & j7);
            j7 >>= 8;
        }
    }
}
