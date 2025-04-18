package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class EZ implements InterfaceC1001Ya {
    public static byte[] A03;
    public static String[] A04 = {"hDr4AhOelyV4M87pxxzrySU8", "ag02JsPBw1CSC6lAevKl8ElSb7ghegxm", "8KgIWPNY6Gpuv5I23X99L6M1", "BC5znNfWRALdfcPg4enkL0n", "sH1sq28fUh4pGPjb57fY53htTKBjXus7", "cCA6T6hrJ6nKn0yn0LF0tCx", "oJ6ugJrvZKDALziksWoJHm", "OeXUOmYCRuSHACW5UkCDsaSWUNhRh"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        String[] strArr = A04;
        if (strArr[5].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A04[4] = "eDFZ3Zqg0xNSdShrMJsmVraFmK4fXi8F";
        A03 = new byte[]{48, 60, 83, 71, 87, 76, 37, 97, 100, 113, 100, 37, 118, 108, Byte.MAX_VALUE, 96, 37, 104, 108, 118, 104, 100, 113, 102, 109, Utf8.REPLACEMENT_BYTE, 37, 26, 46, 62, 37, 31, 41, 41, 39, 41, 62};
    }

    static {
        A02();
    }

    public EZ(long[] jArr, long[] jArr2, long j2) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j2;
    }

    public static EZ A00(long j2, long j3, C3 c3, I4 i4) {
        int A0E;
        long j4 = j3;
        i4.A0Z(10);
        int numFrames = i4.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = c3.A03;
        long A0F = IK.A0F(numFrames, (sampleRate >= 32000 ? 1152 : 576) * 1000000, sampleRate);
        int A0I = i4.A0I();
        int numFrames2 = i4.A0I();
        int A0I2 = i4.A0I();
        i4.A0Z(2);
        long j5 = j4 + c3.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(j4, j5);
            switch (A0I2) {
                case 1:
                    A0E = i4.A0E();
                    break;
                case 2:
                    A0E = i4.A0I();
                    break;
                case 3:
                    A0E = i4.A0G();
                    break;
                case 4:
                    A0E = i4.A0H();
                    break;
                default:
                    return null;
            }
            j4 += A0E * numFrames2;
        }
        if (j2 != -1 && j2 != j4) {
            Log.w(A01(27, 10, 54), A01(2, 25, 127) + j2 + A01(0, 2, 102) + j4);
        }
        return new EZ(jArr, jArr2, A0F);
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        int A0B = IK.A0B(this.A02, j2, true, true);
        C7 c7 = new C7(this.A02[A0B], this.A01[A0B]);
        if (c7.A01 < j2) {
            int tableIndex = this.A02.length;
            if (A0B != tableIndex - 1) {
                int tableIndex2 = A0B + 1;
                long j3 = this.A02[tableIndex2];
                int tableIndex3 = A0B + 1;
                C7 nextSeekPoint = new C7(j3, this.A01[tableIndex3]);
                return new C5(c7, nextSeekPoint);
            }
        }
        return new C5(c7);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1001Ya
    public final long A8W(long j2) {
        return this.A02[IK.A0B(this.A01, j2, true, true)];
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return true;
    }
}
