package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EC implements XV {
    public static byte[] A03;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A02();
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 75, Ascii.GS, 9, Ascii.EM, 2, 107, 47, 42, 63, 42, 107, 56, 34, 49, 46, 107, 38, 34, 56, 38, 42, 63, 40, 35, 113, 107, 0, 52, 36, 63, 5, 51, 51, 61, 51, 36};
    }

    public EC(long[] jArr, long[] jArr2, long j7) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j7;
    }

    public static EC A00(long j7, long j9, By by, C1217Hz c1217Hz) {
        int A0E;
        long j10 = j9;
        c1217Hz.A0Z(10);
        int numFrames = c1217Hz.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = by.A03;
        long A0F = IF.A0F(numFrames, (sampleRate >= 32000 ? 1152 : 576) * 1000000, sampleRate);
        int A0I = c1217Hz.A0I();
        int numFrames2 = c1217Hz.A0I();
        int A0I2 = c1217Hz.A0I();
        c1217Hz.A0Z(2);
        long j11 = j10 + by.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(j10, j11);
            switch (A0I2) {
                case 1:
                    A0E = c1217Hz.A0E();
                    break;
                case 2:
                    A0E = c1217Hz.A0I();
                    break;
                case 3:
                    A0E = c1217Hz.A0G();
                    break;
                case 4:
                    A0E = c1217Hz.A0H();
                    break;
                default:
                    return null;
            }
            j10 += A0E * numFrames2;
        }
        if (j7 != -1 && j7 != j10) {
            Log.w(A01(27, 10, 87), A01(2, 25, 74) + j7 + A01(0, 2, 106) + j10);
        }
        return new EC(jArr, jArr2, A0F);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j7) {
        int A0B = IF.A0B(this.A02, j7, true, true);
        C2 c22 = new C2(this.A02[A0B], this.A01[A0B]);
        if (c22.A01 < j7) {
            int tableIndex = this.A02.length;
            if (A0B != tableIndex - 1) {
                int tableIndex2 = A0B + 1;
                long j9 = this.A02[tableIndex2];
                int tableIndex3 = A0B + 1;
                C2 nextSeekPoint = new C2(j9, this.A01[tableIndex3]);
                return new C0(c22, nextSeekPoint);
            }
        }
        return new C0(c22);
    }

    @Override // com.meta.analytics.dsp.uinode.XV
    public final long A88(long j7) {
        return this.A02[IF.A0B(this.A01, j7, true, true)];
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
