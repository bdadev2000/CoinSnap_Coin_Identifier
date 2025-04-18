package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1211cb extends AbstractC0832Rj {
    public static byte[] A01;
    public final /* synthetic */ GL A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C1211cb(GL gl) {
        this.A00 = gl;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        C0688Lv c0688Lv;
        C0688Lv c0688Lv2;
        C0515Ei c0515Ei;
        C1195cL c1195cL;
        C0515Ei c0515Ei2;
        C0536Fn c0536Fn;
        C0833Rk c0833Rk;
        C0688Lv c0688Lv3;
        C0536Fn c0536Fn2;
        J7 j7;
        C0536Fn c0536Fn3;
        C0515Ei c0515Ei3;
        C0536Fn c0536Fn4;
        C0536Fn c0536Fn5;
        C1T A1Q;
        C0515Ei c0515Ei4;
        C0833Rk c0833Rk2;
        C0515Ei c0515Ei5;
        C0536Fn c0536Fn6;
        c0688Lv = this.A00.A07;
        if (!c0688Lv.A07()) {
            c0688Lv2 = this.A00.A07;
            c0688Lv2.A05();
            c0515Ei = this.A00.A04;
            InterfaceC1229ct A0E = c0515Ei.A0E();
            c1195cL = this.A00.A02;
            A0E.A46(c1195cL != null);
            c0515Ei2 = this.A00.A04;
            c0515Ei2.A0E().A36();
            c0536Fn = this.A00.A03;
            C2M.A02(c0536Fn.A0a(), AbstractC0671Le.A00(A00(0, 6, 63)));
            O8 o8 = new O8();
            c0833Rk = this.A00.A0C;
            O8 A03 = o8.A03(c0833Rk);
            c0688Lv3 = this.A00.A07;
            O8 A02 = A03.A02(c0688Lv3);
            c0536Fn2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c0536Fn2.A0b()).A05();
            j7 = this.A00.A05;
            c0536Fn3 = this.A00.A03;
            j7.AA6(c0536Fn3.A1U(), A05);
            c0515Ei3 = this.A00.A04;
            if (C0608Im.A14(c0515Ei3)) {
                c0515Ei5 = this.A00.A04;
                C0651Kh A00 = C0651Kh.A00(c0515Ei5);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c0536Fn6 = this.A00.A03;
                A00.A0E(adPlacementType, c0536Fn6.A1U());
            }
            c0536Fn4 = this.A00.A03;
            if (c0536Fn4 == null) {
                A1Q = null;
            } else {
                c0536Fn5 = this.A00.A03;
                A1Q = c0536Fn5.A1Q();
            }
            c0515Ei4 = this.A00.A04;
            C1T.A07(A1Q, c0515Ei4);
            c0833Rk2 = this.A00.A0C;
            c0833Rk2.A0V();
        }
    }
}
