package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class G3 {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{9, 43, 39, 27, 58, 47, 50, -8, 8, -5, -27, -5, -11, -19, -24, -29, -5, -7, 0, 0, -7, -2, -9, -80, 2, -11, -3, -15, -7, -2, -12, -11, 2, -80, -1, -10, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -29, -43, -39, -80, -34, -47, -36, -80, 5, -2, -7, 4, -66};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A03(long j2, I4 i4, C9[] c9Arr) {
        while (i4.A04() > 1) {
            int A002 = A00(i4);
            int A003 = A00(i4);
            int A06 = i4.A06() + A003;
            if (A003 == -1 || A003 > i4.A04()) {
                Log.w(A01(0, 7, 126), A01(15, 45, 72));
                A06 = i4.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = i4.A0E();
                int A0I = i4.A0I();
                int A08 = A0I == 49 ? i4.A08() : 0;
                int A0E2 = i4.A0E();
                if (A0I == 47) {
                    i4.A0Z(1);
                }
                boolean z2 = A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3;
                if (A0I == 49) {
                    z2 &= A08 == A02 || A08 == A01;
                }
                if (z2) {
                    int A0E3 = i4.A0E() & 31;
                    i4.A0Z(1);
                    int i2 = A0E3 * 3;
                    int A062 = i4.A06();
                    for (C9 c9 : c9Arr) {
                        i4.A0Y(A062);
                        c9.AFv(i4, i2);
                        c9.AFw(j2, 1, i2, 0, null);
                    }
                }
            }
            i4.A0Y(A06);
        }
    }

    static {
        A02();
        A02 = IK.A08(A01(11, 4, 108));
        A01 = IK.A08(A01(7, 4, 108));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(com.instagram.common.viewpoint.core.I4 r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.A04()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            int r1 = r3.A0E()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.G3.A00(com.facebook.ads.redexgen.X.I4):int");
    }
}
