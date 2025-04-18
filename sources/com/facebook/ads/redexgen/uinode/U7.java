package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class U7 implements InterfaceC0765Mq {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ AbstractC0763Mo A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public U7(AbstractC0763Mo abstractC0763Mo) {
        this.A00 = abstractC0763Mo;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0765Mq
    public final void A4L() {
        MC mc2;
        MC mc3;
        mc2 = this.A00.A07;
        if (mc2 != null) {
            mc3 = this.A00.A07;
            mc3.A43(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0765Mq
    public final void A4M() {
        MD md2;
        MD md3;
        this.A00.A0M();
        md2 = this.A00.A08;
        if (md2 != null) {
            md3 = this.A00.A08;
            md3.ACu(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0765Mq
    public final void A8P() {
        C2W c2w;
        C2W c2w2;
        C2W c2w3;
        C1070Yn c1070Yn;
        c2w = this.A00.A03;
        if (c2w == null) {
            A4M();
            return;
        }
        AbstractC0763Mo.A01(this.A00);
        c2w2 = this.A00.A03;
        if (c2w2.A02() == null) {
            AbstractC0763Mo abstractC0763Mo = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            abstractC0763Mo.A0C();
        } else {
            AbstractC0763Mo abstractC0763Mo2 = this.A00;
            c2w3 = abstractC0763Mo2.A03;
            abstractC0763Mo2.A0E(c2w3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c1070Yn = this.A00.A05;
            if (C0659Ih.A23(c1070Yn)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0765Mq
    public final void A9N() {
        C2S c2s;
        C2V c2v;
        C1070Yn c1070Yn;
        C2S c2s2;
        String str;
        c2s = this.A00.A04;
        if (!TextUtils.isEmpty(c2s.A0I())) {
            C0718Kv c0718Kv = new C0718Kv();
            c1070Yn = this.A00.A05;
            c2s2 = this.A00.A04;
            Uri A00 = AbstractC0721Ky.A00(c2s2.A0I());
            str = this.A00.A09;
            C0718Kv.A0M(c0718Kv, c1070Yn, A00, str);
        }
        c2v = this.A00.A02;
        c2v.A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0765Mq
    public final void A9O() {
        MD md2;
        C2S c2s;
        C2V c2v;
        C1070Yn c1070Yn;
        C2S c2s2;
        String str;
        MD md3;
        this.A00.A0M();
        md2 = this.A00.A08;
        if (md2 != null) {
            md3 = this.A00.A08;
            md3.ACu(true);
        }
        c2s = this.A00.A04;
        if (!TextUtils.isEmpty(c2s.A0C())) {
            C0718Kv c0718Kv = new C0718Kv();
            c1070Yn = this.A00.A05;
            c2s2 = this.A00.A04;
            Uri A00 = AbstractC0721Ky.A00(c2s2.A0C());
            str = this.A00.A09;
            C0718Kv.A0M(c0718Kv, c1070Yn, A00, str);
        }
        c2v = this.A00.A02;
        c2v.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0765Mq
    public final void ACI(C2U c2u) {
        C2U c2u2;
        C2S c2s;
        C2W A0B;
        C2S c2s2;
        AbstractC0763Mo.A00(this.A00);
        this.A00.A01 = c2u;
        c2u2 = this.A00.A01;
        if (c2u2 == C2U.A03) {
            c2s2 = this.A00.A04;
            A0B = c2s2.A0A();
        } else {
            c2s = this.A00.A04;
            A0B = c2s.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0765Mq
    public final void ACS(C2W c2w) {
        C2V c2v;
        AbstractC0763Mo.A00(this.A00);
        c2v = this.A00.A02;
        c2v.A07(c2w.A01());
        if (!c2w.A05().isEmpty()) {
            this.A00.A0E(c2w);
        } else {
            this.A00.A0D(c2w);
        }
    }
}
