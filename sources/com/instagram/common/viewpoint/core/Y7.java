package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class Y7 implements D3 {
    public static byte[] A0D;
    public static String[] A0E = {"U6xxaTgwnpyvNF7dBrF7jy8H0ccYS7uh", "pwqCU4MsG0tpC07kMa2Cozx", "ro9PG3kfplkcrc4zDf47Uz", "tgqRKbRXEgm18AdaPVJDwdGzzx4woeSa", "ILDgXZMCDuz6PSZvyES1oo4T", "cxVIvU", "tSDqSS", "Q0WPqxsOUB7bJ5SYfd3WG"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C9 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final D4 A0B = new D4(128);

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = copyOfRange[i5];
            String[] strArr = A0E;
            if (strArr[3].charAt(9) == strArr[0].charAt(9)) {
                throw new RuntimeException();
            }
            A0E[7] = "RfqzANvJ1I6uK4DDRBmzx";
            copyOfRange[i5] = (byte) ((b2 ^ i4) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{53, 42, 39, 38, 44, 108, 46, 51, 38, 36, 113};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(D4 d4, String str) {
        byte[] copyOf = Arrays.copyOf(d4.A02, d4.A00);
        int i2 = copyOf[4] & UnsignedBytes.MAX_VALUE;
        int firstByte = copyOf[5] & UnsignedBytes.MAX_VALUE;
        int i3 = (i2 << 4) | (firstByte >> 4);
        int i4 = ((firstByte & 15) << 8) | (copyOf[6] & UnsignedBytes.MAX_VALUE);
        float f2 = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                int frameRateExtensionD = i4 * 4;
                float f3 = frameRateExtensionD;
                int frameRateExtensionD2 = i3 * 3;
                f2 = f3 / frameRateExtensionD2;
                break;
            case 3:
                int frameRateExtensionD3 = i4 * 16;
                float f4 = frameRateExtensionD3;
                int frameRateExtensionD4 = i3 * 9;
                f2 = f4 / frameRateExtensionD4;
                break;
            case 4:
                int frameRateExtensionD5 = i4 * Opcodes.LSHL;
                float f5 = frameRateExtensionD5;
                int frameRateExtensionD6 = i3 * 100;
                f2 = f5 / frameRateExtensionD6;
                break;
        }
        Format A03 = Format.A03(str, A01(0, 11, 36), null, -1, -1, i3, i4, -1.0f, Collections.singletonList(copyOf), -1, f2, null);
        long j2 = 0;
        int i5 = (copyOf[7] & 15) - 1;
        if (i5 >= 0 && i5 < A0F.length) {
            double d = A0F[i5];
            int aspectRatioCode = d4.A01;
            int i6 = (copyOf[aspectRatioCode + 9] & 96) >> 5;
            int aspectRatioCode2 = copyOf[aspectRatioCode + 9] & 31;
            if (i6 != aspectRatioCode2) {
                double d2 = i6 + 1.0d;
                int thirdByte = aspectRatioCode2 + 1;
                String[] strArr = A0E;
                String str2 = strArr[5];
                String str3 = strArr[6];
                int length = str2.length();
                int frameRateExtensionD7 = str3.length();
                if (length != frameRateExtensionD7) {
                    throw new RuntimeException();
                }
                A0E[7] = "NpF2DYCqOiHWIi5aD2n7H";
                d *= d2 / thirdByte;
            }
            j2 = (long) (1000000.0d / d);
        }
        return Pair.create(A03, Long.valueOf(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (r21.A07 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        r21.A05.AFw(r21.A03, r21.A09 ? 1 : 0, ((int) (r21.A04 - r21.A02)) - r4, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if (r3 != false) goto L32;
     */
    @Override // com.instagram.common.viewpoint.core.D3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4n(com.instagram.common.viewpoint.core.I4 r22) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.Y7.A4n(com.facebook.ads.redexgen.X.I4):void");
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void A5B(InterfaceC0457Bz interfaceC0457Bz, DH dh) {
        dh.A05();
        this.A06 = dh.A04();
        this.A05 = interfaceC0457Bz.AHA(dh.A03(), 2);
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEL() {
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEM(long j2, boolean z2) {
        this.A01 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AG6() {
        I0.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
