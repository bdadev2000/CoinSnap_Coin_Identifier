package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08301t {
    public static byte[] A00;
    public static String[] A01 = {"SZD1gnuwYC0ZDT5XCpN5wGg04vpvlXtv", "38Pkme0hctlwOycqXgIFmSt4EwGMsPu", "PZ5YSJhnqoOlFoXIJ", "MKZOkal4amZt32sY0duMnYWyMVrdvNv7", "PmMqC", "MtvBWYcgrX5nN2Ecp9gb0xGXALHF8kJ8", "836OSMulKGxVhnpon", "Ud77gBKi5ZcurXFgX0oEk2YfAMQgAhDP"};

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.EM, 95, 67, 90, 91, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 3, Ascii.DC4, 6, Ascii.DLE, 3, Ascii.NAK, Ascii.DC4, Ascii.NAK, 46, 7, Ascii.CAN, Ascii.NAK, Ascii.DC4, Ascii.RS};
    }

    static {
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.meta.analytics.dsp.uinode.C1636Yn r12, com.meta.analytics.dsp.uinode.C09416c r13, com.meta.analytics.dsp.uinode.FS r14) {
        /*
            com.facebook.ads.redexgen.X.6a r3 = new com.facebook.ads.redexgen.X.6a
            com.facebook.ads.redexgen.X.1a r0 = r14.A10()
            java.lang.String r4 = r0.A01()
            int r5 = com.meta.analytics.dsp.uinode.C1407Po.A04
            int r6 = com.meta.analytics.dsp.uinode.C1407Po.A04
            java.lang.String r7 = r14.A0S()
            r2 = 17
            r1 = 14
            r0 = 99
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            boolean r6 = r14.A0m()
            if (r6 == 0) goto L4f
            java.lang.String r5 = r14.A0M()
            java.lang.String r4 = r14.A0S()
            r2 = 17
            r1 = 14
            r0 = 99
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.6Y r3 = new com.facebook.ads.redexgen.X.6Y
            r3.<init>(r5, r4, r0)
            r0 = 1
            r3.A04 = r0
            r2 = 0
            r1 = 5
            r0 = 37
            java.lang.String r0 = A00(r2, r1, r0)
            r3.A03 = r0
            r13.A0X(r3)
        L4f:
            boolean r0 = com.meta.analytics.dsp.uinode.C1441Qw.A03()
            boolean r3 = com.meta.analytics.dsp.uinode.C1225Ih.A2R(r12, r0)
            com.facebook.ads.redexgen.X.1G r0 = r14.A0x()
            com.facebook.ads.redexgen.X.1J r0 = r0.A0D()
            java.lang.String r8 = r0.A08()
            com.facebook.ads.redexgen.X.6Y r7 = new com.facebook.ads.redexgen.X.6Y
            java.lang.String r9 = r14.A0S()
            r2 = 17
            r1 = 14
            r0 = 99
            java.lang.String r10 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.1G r0 = r14.A0x()
            com.facebook.ads.redexgen.X.1J r0 = r0.A0D()
            long r11 = r0.A05()
            r7.<init>(r8, r9, r10, r11)
            if (r6 == 0) goto Lf8
            if (r3 != 0) goto Lf8
            r13.A0X(r7)
        L89:
            com.facebook.ads.redexgen.X.6a r3 = new com.facebook.ads.redexgen.X.6a
            com.facebook.ads.redexgen.X.1G r0 = r14.A0x()
            com.facebook.ads.redexgen.X.1J r0 = r0.A0D()
            java.lang.String r4 = r0.A07()
            com.facebook.ads.redexgen.X.1G r0 = r14.A0x()
            com.facebook.ads.redexgen.X.1J r0 = r0.A0D()
            int r5 = com.meta.analytics.dsp.uinode.AbstractC08251o.A00(r0)
            com.facebook.ads.redexgen.X.1G r0 = r14.A0x()
            com.facebook.ads.redexgen.X.1J r0 = r0.A0D()
            int r6 = com.meta.analytics.dsp.uinode.AbstractC08251o.A01(r0)
            java.lang.String r7 = r14.A0S()
            r2 = 17
            r1 = 14
            r0 = 99
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            com.facebook.ads.redexgen.X.1G r0 = r14.A0x()
            com.facebook.ads.redexgen.X.1R r0 = r0.A0G()
            java.util.List r0 = r0.A01()
            java.util.Iterator r3 = r0.iterator()
        Ld3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lfc
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.ads.redexgen.X.6a r4 = new com.facebook.ads.redexgen.X.6a
            r6 = -1
            r7 = -1
            java.lang.String r8 = r14.A0S()
            r2 = 17
            r1 = 14
            r0 = 99
            java.lang.String r9 = A00(r2, r1, r0)
            r4.<init>(r5, r6, r7, r8, r9)
            r13.A0c(r4)
            goto Ld3
        Lf8:
            r13.A0a(r7)
            goto L89
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC08301t.A02(com.facebook.ads.redexgen.X.Yn, com.facebook.ads.redexgen.X.6c, com.facebook.ads.redexgen.X.FS):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.A0D().A08()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        new com.meta.analytics.dsp.uinode.C6Y(r0.A0D().A08(), r15.A0S(), A00(5, 12, 28), r0.A0D().A05()).A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(com.meta.analytics.dsp.uinode.C1636Yn r13, com.meta.analytics.dsp.uinode.C09416c r14, com.meta.analytics.dsp.uinode.FS r15) {
        /*
            r7 = 0
            java.util.List r0 = r15.A14()
            java.util.Iterator r6 = r0.iterator()
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Ld4
            java.lang.Object r0 = r6.next()
            com.facebook.ads.redexgen.X.1G r0 = (com.meta.analytics.dsp.uinode.C1G) r0
            com.facebook.ads.redexgen.X.6a r8 = new com.facebook.ads.redexgen.X.6a
            com.facebook.ads.redexgen.X.1J r1 = r0.A0D()
            java.lang.String r9 = r1.A07()
            com.facebook.ads.redexgen.X.1J r1 = r0.A0D()
            int r10 = com.meta.analytics.dsp.uinode.AbstractC08251o.A00(r1)
            com.facebook.ads.redexgen.X.1J r1 = r0.A0D()
            int r11 = com.meta.analytics.dsp.uinode.AbstractC08251o.A01(r1)
            java.lang.String r12 = r15.A0S()
            r3 = 5
            r2 = 12
            r1 = 28
            java.lang.String r13 = A00(r3, r2, r1)
            r8.<init>(r9, r10, r11, r12, r13)
            if (r7 != 0) goto Lcf
            r14.A0b(r8)
        L44:
            com.facebook.ads.redexgen.X.1R r1 = r0.A0G()
            java.util.List r1 = r1.A01()
            java.util.Iterator r5 = r1.iterator()
        L50:
            boolean r4 = r5.hasNext()
            java.lang.String[] r3 = com.meta.analytics.dsp.uinode.AbstractC08301t.A01
            r1 = 2
            r2 = r3[r1]
            r1 = 6
            r1 = r3[r1]
            int r2 = r2.length()
            int r1 = r1.length()
            if (r2 == r1) goto L6c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6c:
            java.lang.String[] r3 = com.meta.analytics.dsp.uinode.AbstractC08301t.A01
            java.lang.String r2 = "d4OGgqInyGax2uUwuJ6rocUy9OK0g6RJ"
            r1 = 0
            r3[r1] = r2
            java.lang.String r2 = "8ZRzgNChvbJeQD0ONiajCC1PQNrhJWUQ"
            r1 = 7
            r3[r1] = r2
            if (r4 == 0) goto L98
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            com.facebook.ads.redexgen.X.6a r8 = new com.facebook.ads.redexgen.X.6a
            r10 = -1
            r11 = -1
            java.lang.String r12 = r15.A0S()
            r3 = 5
            r2 = 12
            r1 = 28
            java.lang.String r13 = A00(r3, r2, r1)
            r8.<init>(r9, r10, r11, r12, r13)
            r14.A0c(r8)
            goto L50
        L98:
            com.facebook.ads.redexgen.X.1J r1 = r0.A0D()
            java.lang.String r1 = r1.A08()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lcb
            com.facebook.ads.redexgen.X.6Y r8 = new com.facebook.ads.redexgen.X.6Y
            com.facebook.ads.redexgen.X.1J r1 = r0.A0D()
            java.lang.String r9 = r1.A08()
            java.lang.String r10 = r15.A0S()
            r3 = 5
            r2 = 12
            r1 = 28
            java.lang.String r11 = A00(r3, r2, r1)
            com.facebook.ads.redexgen.X.1J r0 = r0.A0D()
            long r12 = r0.A05()
            r8.<init>(r9, r10, r11, r12)
            r0 = 0
            r8.A04 = r0
        Lcb:
            int r7 = r7 + 1
            goto L9
        Lcf:
            r14.A0c(r8)
            goto L44
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC08301t.A03(com.facebook.ads.redexgen.X.Yn, com.facebook.ads.redexgen.X.6c, com.facebook.ads.redexgen.X.FS):void");
    }
}
