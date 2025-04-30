package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class SD extends KT {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SA A02;
    public final /* synthetic */ RB A03;

    public SD(SA sa, RB rb, int i9, int i10) {
        this.A02 = sa;
        this.A03 = rb;
        this.A00 = i9;
        this.A01 = i10;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C1636Yn c1636Yn;
        Handler handler;
        C09978r c09978r;
        C1636Yn c1636Yn2;
        C09978r c09978r2;
        C1315Ma c1315Ma;
        Handler handler2;
        C1636Yn c1636Yn3;
        C09978r c09978r3;
        Handler handler3;
        C1636Yn c1636Yn4;
        C1636Yn c1636Yn5;
        C09978r c09978r4;
        O8 o82;
        Handler handler4;
        C1636Yn c1636Yn6;
        C1636Yn c1636Yn7;
        Handler handler5;
        C09978r c09978r5;
        C09978r c09978r6;
        C1412Pt c1412Pt;
        C1636Yn c1636Yn8;
        C09978r c09978r7;
        if (this.A03 == RB.A07) {
            this.A02.A0L(J9.A0q);
            c1636Yn8 = this.A02.A0A;
            c1636Yn8.A0E().A38();
            c09978r7 = this.A02.A0B;
            c09978r7.A02(SA.A0C());
            return;
        }
        if (this.A03 == RB.A03) {
            this.A02.A0L(J9.A0l);
            this.A02.A03 = true;
            c09978r6 = this.A02.A0B;
            c1412Pt = SA.A0G;
            c09978r6.A02(c1412Pt);
            this.A02.A0K(this.A00);
            return;
        }
        RB rb = this.A03;
        RB rb2 = RB.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (rb == rb2) {
            this.A02.A0L(J9.A0k);
            c1636Yn7 = this.A02.A0A;
            c1636Yn7.A0E().A30();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c09978r5 = this.A02.A0B;
            int i9 = this.A01;
            c09978r5.A02(new C9H(i9, i9));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == RB.A0A) {
            c1636Yn4 = this.A02.A0A;
            if (C1225Ih.A1W(c1636Yn4)) {
                c1636Yn6 = this.A02.A0A;
                c1636Yn6.A0A().ADg();
            }
            this.A02.A0L(J9.A0o);
            c1636Yn5 = this.A02.A0A;
            c1636Yn5.A0E().A3F();
            c09978r4 = this.A02.A0B;
            o82 = SA.A0H;
            c09978r4.A02(o82);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == RB.A05) {
            this.A02.A0L(J9.A0n);
            c1636Yn3 = this.A02.A0A;
            c1636Yn3.A0E().A34();
            c09978r3 = this.A02.A0B;
            final int i10 = this.A00;
            c09978r3.A02(new AbstractC1414Pv(i10) { // from class: com.facebook.ads.redexgen.X.98
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == RB.A04) {
            this.A02.A0L(J9.A0m);
            c1636Yn2 = this.A02.A0A;
            c1636Yn2.A0E().A31();
            c09978r2 = this.A02.A0B;
            c1315Ma = SA.A0K;
            c09978r2.A02(c1315Ma);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == RB.A09) {
            this.A02.A0L(J9.A0k);
            c1636Yn = this.A02.A0A;
            c1636Yn.A0E().A3A();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c09978r = this.A02.A0B;
            c09978r.A02(new C9H(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
