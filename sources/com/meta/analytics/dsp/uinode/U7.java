package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class U7 implements InterfaceC1331Mq {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ AbstractC1329Mo A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 111);
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

    public U7(AbstractC1329Mo abstractC1329Mo) {
        this.A00 = abstractC1329Mo;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1331Mq
    public final void A4L() {
        MC mc;
        MC mc2;
        mc = this.A00.A07;
        if (mc != null) {
            mc2 = this.A00.A07;
            mc2.A43(A00(0, 53, 17));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1331Mq
    public final void A4M() {
        MD md;
        MD md2;
        this.A00.A0M();
        md = this.A00.A08;
        if (md != null) {
            md2 = this.A00.A08;
            md2.ACu(true);
        }
        this.A00.A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1331Mq
    public final void A8P() {
        C2W c2w;
        C2W c2w2;
        C2W c2w3;
        C1636Yn c1636Yn;
        c2w = this.A00.A03;
        if (c2w == null) {
            A4M();
            return;
        }
        AbstractC1329Mo.A01(this.A00);
        c2w2 = this.A00.A03;
        if (c2w2.A02() == null) {
            AbstractC1329Mo abstractC1329Mo = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            abstractC1329Mo.A0C();
        } else {
            AbstractC1329Mo abstractC1329Mo2 = this.A00;
            c2w3 = abstractC1329Mo2.A03;
            abstractC1329Mo2.A0E(c2w3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c1636Yn = this.A00.A05;
            if (C1225Ih.A23(c1636Yn)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1331Mq
    public final void A9N() {
        C2S c2s;
        C2V c2v;
        C1636Yn c1636Yn;
        C2S c2s2;
        String str;
        c2s = this.A00.A04;
        if (!TextUtils.isEmpty(c2s.A0I())) {
            C1284Kv c1284Kv = new C1284Kv();
            c1636Yn = this.A00.A05;
            c2s2 = this.A00.A04;
            Uri A00 = AbstractC1287Ky.A00(c2s2.A0I());
            str = this.A00.A09;
            C1284Kv.A0M(c1284Kv, c1636Yn, A00, str);
        }
        c2v = this.A00.A02;
        c2v.A04();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1331Mq
    public final void A9O() {
        MD md;
        C2S c2s;
        C2V c2v;
        C1636Yn c1636Yn;
        C2S c2s2;
        String str;
        MD md2;
        this.A00.A0M();
        md = this.A00.A08;
        if (md != null) {
            md2 = this.A00.A08;
            md2.ACu(true);
        }
        c2s = this.A00.A04;
        if (!TextUtils.isEmpty(c2s.A0C())) {
            C1284Kv c1284Kv = new C1284Kv();
            c1636Yn = this.A00.A05;
            c2s2 = this.A00.A04;
            Uri A00 = AbstractC1287Ky.A00(c2s2.A0C());
            str = this.A00.A09;
            C1284Kv.A0M(c1284Kv, c1636Yn, A00, str);
        }
        c2v = this.A00.A02;
        c2v.A06();
        this.A00.A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1331Mq
    public final void ACI(C2U c2u) {
        C2U c2u2;
        C2S c2s;
        C2W A0B;
        C2S c2s2;
        AbstractC1329Mo.A00(this.A00);
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

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1331Mq
    public final void ACS(C2W c2w) {
        C2V c2v;
        AbstractC1329Mo.A00(this.A00);
        c2v = this.A00.A02;
        c2v.A07(c2w.A01());
        if (!c2w.A05().isEmpty()) {
            this.A00.A0E(c2w);
        } else {
            this.A00.A0D(c2w);
        }
    }
}
