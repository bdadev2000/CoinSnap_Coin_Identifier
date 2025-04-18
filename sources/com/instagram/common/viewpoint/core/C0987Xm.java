package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0987Xm implements InterfaceC0486Dd {
    public static byte[] A00;
    public static String[] A01 = {"wk8oh2v4CuoEz91Q8ddyD4vW4OkPIqhz", "TrnvrzX", "avvRCVNMMCxdLH2GcUGi3f", "9N2kSsE3lVRujQ8aZphxKZ15", "6oAq20NcGdPAdIGxLKdGW0uH0QkLBftR", "pUHCrP55Ymm0t5Q", "CGpYVsyVcgyLsLvhkYxzWTdg", "6TV83KfgcjdGc5chuG3yAE2DLzpv0l0a"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{60, 9, 9, 24, 16, 13, 9, 24, 25, 93, 9, 18, 93, 30, 15, 24, 28, 9, 24, 93, 25, 24, 30, 18, 25, 24, 15, 93, 27, 18, 15, 93, 8, 19, 14, 8, 13, 13, 18, 15, 9, 24, 25, 93, 27, 18, 15, 16, 28, 9, 24, 9, 9, 21, 16, 26, 24, 13, 16, 22, 23, 86, 16, 29, 74, 20, 5, 5, 25, 28, 22, 20, 1, 28, 26, 27, 90, 13, 88, 16, 24, 6, 18, 14, 31, 31, 3, 6, 12, 14, 27, 6, 0, 1, 64, 23, 66, 28, 12, 27, 10, 92, 90};
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0486Dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.InterfaceC0484Db A4u(com.facebook.ads.internal.exoplayer2.thirdparty.Format r6) {
        /*
            r5 = this;
            java.lang.String r3 = r6.A0O
            int r0 = r3.hashCode()
            switch(r0) {
                case -1248341703: goto L64;
                case 1154383568: goto L2e;
                case 1652648887: goto L1c;
                default: goto L9;
            }
        L9:
            r0 = -1
        La:
            switch(r0) {
                case 0: goto L82;
                case 1: goto L7c;
                case 2: goto L76;
                default: goto Ld;
            }
        Ld:
            r2 = 0
            r1 = 50
            r0 = 40
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L1c:
            r2 = 83
            r1 = 20
            r0 = 58
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2
            goto La
        L2e:
            r4 = 65
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0987Xm.A01
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0987Xm.A01
            java.lang.String r1 = "8oGlDfhTgiX4kZXrmDxnswR6"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "sPUpEdfrXW7HqAznk87fzPk6"
            r0 = 6
            r2[r0] = r1
            r1 = 18
            r0 = 32
            java.lang.String r0 = A00(r4, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L64:
            r2 = 50
            r1 = 15
            r0 = 44
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            goto La
        L76:
            com.facebook.ads.redexgen.X.Xf r0 = new com.facebook.ads.redexgen.X.Xf
            r0.<init>()
            return r0
        L7c:
            com.facebook.ads.redexgen.X.Xk r0 = new com.facebook.ads.redexgen.X.Xk
            r0.<init>()
            return r0
        L82:
            com.facebook.ads.redexgen.X.Xi r0 = new com.facebook.ads.redexgen.X.Xi
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0987Xm.A4u(com.facebook.ads.internal.exoplayer2.thirdparty.Format):com.facebook.ads.redexgen.X.Db");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0486Dd
    public final boolean AH7(Format format) {
        String str = format.A0O;
        String mimeType = A00(50, 15, 44);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(65, 18, 32);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(83, 20, 58);
                boolean equals = mimeType3.equals(str);
                String mimeType4 = A01[5];
                if (mimeType4.length() == 16) {
                    throw new RuntimeException();
                }
                A01[5] = "g8nn2mhnPz";
                if (!equals) {
                    return false;
                }
            }
        }
        return true;
    }
}
