package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class TA extends KY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ T7 A02;
    public final /* synthetic */ EnumC0830Rh A03;

    public TA(T7 t7, EnumC0830Rh enumC0830Rh, int i2, int i3) {
        this.A02 = t7;
        this.A03 = enumC0830Rh;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C1045Zs c1045Zs;
        Handler handler;
        C03798w c03798w;
        C1045Zs c1045Zs2;
        C03798w c03798w2;
        C0822Qz c0822Qz;
        Handler handler2;
        C1045Zs c1045Zs3;
        C03798w c03798w3;
        Handler handler3;
        C1045Zs c1045Zs4;
        C1045Zs c1045Zs5;
        C03798w c03798w4;
        SZ sz;
        Handler handler4;
        C1045Zs c1045Zs6;
        C1045Zs c1045Zs7;
        Handler handler5;
        C03798w c03798w5;
        C03798w c03798w6;
        C0857Si c0857Si;
        C1045Zs c1045Zs8;
        C03798w c03798w7;
        C0829Rg c0829Rg;
        if (this.A03 == EnumC0830Rh.A07) {
            this.A02.A0L(JE.A0w);
            c1045Zs8 = this.A02.A0A;
            c1045Zs8.A0E().A3U();
            c03798w7 = this.A02.A0B;
            c0829Rg = T7.A0I;
            c03798w7.A02(c0829Rg);
            return;
        }
        if (this.A03 == EnumC0830Rh.A03) {
            this.A02.A0L(JE.A0r);
            this.A02.A03 = true;
            c03798w6 = this.A02.A0B;
            c0857Si = T7.A0G;
            c03798w6.A02(c0857Si);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == EnumC0830Rh.A06) {
            this.A02.A0L(JE.A0q);
            c1045Zs7 = this.A02.A0A;
            c1045Zs7.A0E().A3M();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c03798w5 = this.A02.A0B;
            c03798w5.A02(new C9R(this.A01, this.A01));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == EnumC0830Rh.A0A) {
            c1045Zs4 = this.A02.A0A;
            if (C0608Im.A1p(c1045Zs4)) {
                c1045Zs6 = this.A02.A0A;
                c1045Zs6.A0A().AE9();
            }
            this.A02.A0L(JE.A0u);
            c1045Zs5 = this.A02.A0A;
            c1045Zs5.A0E().A3b();
            c03798w4 = this.A02.A0B;
            sz = T7.A0H;
            c03798w4.A02(sz);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == EnumC0830Rh.A05) {
            this.A02.A0L(JE.A0t);
            c1045Zs3 = this.A02.A0A;
            c1045Zs3.A0E().A3Q();
            c03798w3 = this.A02.A0B;
            final int i2 = this.A00;
            c03798w3.A02(new AbstractC0859Sk(i2) { // from class: com.facebook.ads.redexgen.X.9P
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == EnumC0830Rh.A04) {
            this.A02.A0L(JE.A0s);
            c1045Zs2 = this.A02.A0A;
            c1045Zs2.A0E().A3N();
            c03798w2 = this.A02.A0B;
            c0822Qz = T7.A0K;
            c03798w2.A02(c0822Qz);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC0830Rh.A09) {
            this.A02.A0L(JE.A0q);
            c1045Zs = this.A02.A0A;
            c1045Zs.A0E().A3W();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c03798w = this.A02.A0B;
            c03798w.A02(new C9R(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
