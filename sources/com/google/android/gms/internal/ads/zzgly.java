package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzgly {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j3 = 0;
        int i11 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 < length) {
                int min = Math.min(16, length - i11);
                System.arraycopy(bArr2, i11, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i10, (byte) 0);
                }
                long j14 = zzb5 * 5;
                long j15 = zzb4 * 5;
                long j16 = zzb3 * 5;
                long zzb6 = j13 + zzb(bArr3, 0, 0);
                long zzb7 = j10 + zzb(bArr3, 3, 2);
                long zzb8 = j3 + zzb(bArr3, 6, 4);
                long zzb9 = j11 + zzb(bArr3, 9, 6);
                long zzb10 = j12 + (zzb(bArr3, 12, 8) | (bArr3[16] << Ascii.CAN));
                long j17 = zzb7 * zzb;
                long j18 = zzb7 * zzb2;
                long j19 = zzb8 * zzb;
                long j20 = zzb7 * zzb3;
                long j21 = zzb8 * zzb2;
                long j22 = zzb9 * zzb;
                long j23 = zzb7 * zzb4;
                long j24 = zzb8 * zzb3;
                long j25 = zzb9 * zzb2;
                long j26 = zzb10 * zzb;
                long j27 = (zzb2 * 5 * zzb10) + (zzb9 * j16) + (zzb8 * j15) + (zzb7 * j14) + (zzb6 * zzb);
                long j28 = j27 & 67108863;
                long j29 = zzb9 * j15;
                long j30 = j16 * zzb10;
                long j31 = j30 + j29 + (zzb8 * j14) + (zzb6 * zzb2) + j17 + (j27 >> 26);
                long j32 = j15 * zzb10;
                long j33 = j32 + (zzb9 * j14) + (zzb6 * zzb3) + j18 + j19 + (j31 >> 26);
                long j34 = (zzb10 * j14) + (zzb6 * zzb4) + j20 + j21 + j22 + (j33 >> 26);
                long j35 = (zzb6 * zzb5) + j23 + j24 + j25 + j26 + (j34 >> 26);
                long j36 = ((j35 >> 26) * 5) + j28;
                j10 = (j31 & 67108863) + (j36 >> 26);
                i11 += 16;
                j3 = j33 & 67108863;
                j11 = j34 & 67108863;
                j12 = j35 & 67108863;
                i10 = 17;
                j13 = j36 & 67108863;
            } else {
                long j37 = j3 + (j10 >> 26);
                long j38 = j37 & 67108863;
                long j39 = j11 + (j37 >> 26);
                long j40 = j39 & 67108863;
                long j41 = j12 + (j39 >> 26);
                long j42 = j41 & 67108863;
                long j43 = ((j41 >> 26) * 5) + j13;
                long j44 = j43 >> 26;
                long j45 = j43 & 67108863;
                long j46 = j45 + 5;
                long j47 = (j10 & 67108863) + j44;
                long j48 = j47 + (j46 >> 26);
                long j49 = (j48 >> 26) + j38;
                long j50 = j40 + (j49 >> 26);
                long j51 = (j42 + (j50 >> 26)) - 67108864;
                long j52 = j51 >> 63;
                long j53 = ~j52;
                long j54 = (j47 & j52) | (j48 & 67108863 & j53);
                long j55 = (j38 & j52) | (j49 & 67108863 & j53);
                long j56 = (j40 & j52) | (j50 & 67108863 & j53);
                long j57 = (j42 & j52) | (j51 & j53);
                long zzc = (((j45 & j52) | (j46 & 67108863 & j53) | (j54 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j54 >> 6) | (j55 << 20)) & 4294967295L) + zzc(bArr, 20);
                long zzc3 = (((j56 << 14) | (j55 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long zzc4 = (((j56 >> 18) | (j57 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                long j58 = zzc2 + (zzc >> 32);
                zzd(bArr4, j58 & 4294967295L, 4);
                long j59 = zzc3 + (j58 >> 32);
                zzd(bArr4, j59 & 4294967295L, 8);
                zzd(bArr4, (zzc4 + (j59 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    private static long zzb(byte[] bArr, int i10, int i11) {
        return (zzc(bArr, i10) >> i11) & 67108863;
    }

    private static long zzc(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
        int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
        return (((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j3, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j3);
            j3 >>= 8;
        }
    }
}
