package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02071s {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.instagram.common.viewpoint.core.C1045Zs r12, com.instagram.common.viewpoint.core.C03226f r13, com.instagram.common.viewpoint.core.C0533Fk r14) {
        /*
            com.facebook.ads.redexgen.X.6d r3 = new com.facebook.ads.redexgen.X.6d
            com.facebook.ads.redexgen.X.1Z r0 = r14.A1S()
            java.lang.String r4 = r0.A01()
            int r5 = com.instagram.common.viewpoint.core.QJ.A04
            int r6 = com.instagram.common.viewpoint.core.QJ.A04
            java.lang.String r7 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            boolean r6 = r14.A19()
            if (r6 == 0) goto L4f
            java.lang.String r5 = r14.A0Z()
            java.lang.String r4 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.6b r3 = new com.facebook.ads.redexgen.X.6b
            r3.<init>(r5, r4, r0)
            r0 = 1
            r3.A04 = r0
            r2 = 0
            r1 = 5
            r0 = 66
            java.lang.String r0 = A00(r2, r1, r0)
            r3.A03 = r0
            r13.A0X(r3)
        L4f:
            boolean r0 = com.instagram.common.viewpoint.core.RS.A03()
            boolean r3 = com.instagram.common.viewpoint.core.C0608Im.A2n(r12, r0)
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            java.lang.String r8 = r0.A08()
            com.facebook.ads.redexgen.X.6b r7 = new com.facebook.ads.redexgen.X.6b
            java.lang.String r9 = r14.A0l()
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            long r11 = r0.A05()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r10 = A00(r2, r1, r0)
            r7.<init>(r8, r9, r10, r11)
            if (r6 == 0) goto Lf8
            if (r3 != 0) goto Lf8
            r13.A0X(r7)
        L89:
            com.facebook.ads.redexgen.X.6d r3 = new com.facebook.ads.redexgen.X.6d
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            java.lang.String r4 = r0.A07()
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            int r5 = com.instagram.common.viewpoint.core.AbstractC02021n.A00(r0)
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1I r0 = r0.A0E()
            int r6 = com.instagram.common.viewpoint.core.AbstractC02021n.A01(r0)
            java.lang.String r7 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            com.facebook.ads.redexgen.X.1F r0 = r14.A1P()
            com.facebook.ads.redexgen.X.1Q r0 = r0.A0H()
            java.util.List r0 = r0.A01()
            java.util.Iterator r3 = r0.iterator()
        Ld3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lfc
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.ads.redexgen.X.6d r4 = new com.facebook.ads.redexgen.X.6d
            java.lang.String r8 = r14.A0l()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r9 = A00(r2, r1, r0)
            r6 = -1
            r7 = -1
            r4.<init>(r5, r6, r7, r8, r9)
            r13.A0c(r4)
            goto Ld3
        Lf8:
            r13.A0a(r7)
            goto L89
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AbstractC02071s.A02(com.facebook.ads.redexgen.X.Zs, com.facebook.ads.redexgen.X.6f, com.facebook.ads.redexgen.X.Fk):void");
    }

    public static void A03(C1045Zs c1045Zs, C03226f c03226f, C0533Fk c0533Fk) {
        int i2 = 0;
        for (C1F c1f : c0533Fk.A1W()) {
            C03206d c03206d = new C03206d(c1f.A0E().A07(), AbstractC02021n.A00(c1f.A0E()), AbstractC02021n.A01(c1f.A0E()), c0533Fk.A0l(), A00(5, 12, Opcodes.FNEG));
            if (i2 == 0) {
                c03226f.A0b(c03206d);
            } else {
                c03226f.A0c(c03206d);
            }
            Iterator<String> it = c1f.A0H().A01().iterator();
            while (it.hasNext()) {
                c03226f.A0c(new C03206d(it.next(), -1, -1, c0533Fk.A0l(), A00(5, 12, Opcodes.FNEG)));
            }
            if (!TextUtils.isEmpty(c1f.A0E().A08())) {
                new C03186b(c1f.A0E().A08(), c0533Fk.A0l(), A00(5, 12, Opcodes.FNEG), c1f.A0E().A05()).A04 = false;
            }
            i2++;
        }
    }
}
