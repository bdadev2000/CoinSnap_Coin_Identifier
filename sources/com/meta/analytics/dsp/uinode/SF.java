package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class SF implements QF {
    public static byte[] A0B;
    public boolean A00;
    public boolean A01;
    public final C1636Yn A02;
    public final J2 A03;
    public final SA A04;
    public final AbstractC1413Pu A05;
    public final AbstractC1404Pl A06;
    public final AbstractC1380On A07;
    public final SY A08;
    public final String A09;
    public final Map<String, String> A0A;

    static {
        A09();
    }

    public static String A06(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0B = new byte[]{125, 105, 122, 118, 126, 104};
    }

    public SF(C1636Yn c1636Yn, J2 j22, SA sa, String str, QS qs, Map<String, String> map) {
        AbstractC1404Pl abstractC1404Pl = new AbstractC1404Pl() { // from class: com.facebook.ads.redexgen.X.9N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9F c9f) {
                boolean z8;
                String str2;
                SY sy;
                C1636Yn c1636Yn2;
                z8 = SF.this.A01;
                if (!z8) {
                    SF.this.A01 = true;
                    c1636Yn2 = SF.this.A02;
                    c1636Yn2.A0E().AFU();
                }
                str2 = SF.this.A09;
                SZ sz = new SZ(str2, c9f.A03(), c9f.A01(), c9f.A02());
                if (c9f.A00() >= 0.05d) {
                    sz.A06(c9f.A01());
                }
                sy = SF.this.A08;
                sy.A0C(sz);
            }
        };
        this.A06 = abstractC1404Pl;
        AbstractC1380On abstractC1380On = new AbstractC1380On() { // from class: com.facebook.ads.redexgen.X.9M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                C1636Yn c1636Yn2;
                c1636Yn2 = SF.this.A02;
                c1636Yn2.A0E().AFb();
                SF.this.A0D();
            }
        };
        this.A07 = abstractC1380On;
        AbstractC1413Pu abstractC1413Pu = new AbstractC1413Pu() { // from class: com.facebook.ads.redexgen.X.9L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                C1636Yn c1636Yn2;
                c1636Yn2 = SF.this.A02;
                c1636Yn2.A0E().AFZ();
                SF.this.A0D();
            }
        };
        this.A05 = abstractC1413Pu;
        this.A00 = false;
        this.A01 = false;
        this.A02 = c1636Yn;
        this.A03 = j22;
        this.A09 = str;
        this.A0A = map;
        this.A04 = sa;
        this.A08 = new SY(str);
        if (C1225Ih.A1i(c1636Yn)) {
            c1636Yn.A0E().AFW();
            qs.A0h(this);
            sa.getEventBus().A05(abstractC1404Pl);
        } else {
            c1636Yn.A0E().AFX();
            sa.getEventBus().A03(abstractC1404Pl, abstractC1380On, abstractC1413Pu);
        }
    }

    private Map<String, String> A08(String str) {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.A0A;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(A06(0, 6, 123), str);
        return hashMap;
    }

    public final void A0C() {
        SG sg = new SG(this);
        if (this.A04.A0l()) {
            ExecutorC1297Li.A00(sg);
        } else {
            this.A04.getStateHandler().post(sg);
        }
    }

    public final synchronized void A0D() {
        String A04 = SY.A04(this.A08.A0B());
        if (A04 != null) {
            this.A02.A0E().AFc();
            J2 j22 = this.A03;
            String encodedFrameData = this.A09;
            j22.AA1(encodedFrameData, A08(A04));
        } else if (!this.A00) {
            this.A02.A0E().AFV();
            this.A03.AA1(this.A09, A08(A06(0, 0, 56)));
            this.A00 = true;
        } else {
            this.A02.A0E().AFe();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.QF
    public final void AC8() {
        this.A02.A0E().AFa();
        A0D();
    }
}
