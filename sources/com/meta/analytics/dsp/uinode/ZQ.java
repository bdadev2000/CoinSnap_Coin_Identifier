package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZQ extends AbstractC08010q {
    public static byte[] A03;
    public View A00;
    public final C5P A01;
    public final EQ A02;

    static {
        A03();
    }

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, Ascii.DC4, Ascii.DC4, Ascii.NAK, Ascii.SUB, -58, Ascii.SYN, Ascii.CAN, Ascii.VT, Ascii.EM, Ascii.VT, Ascii.DC4, Ascii.SUB, -58, Ascii.DC4, Ascii.ESC, Ascii.DC2, Ascii.DC2, -58, 7, 10, -4, Ascii.SI, Ascii.VT, Ascii.GS};
    }

    public ZQ(C5P c5p) {
        this.A02 = c5p.A09();
        this.A01 = c5p;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0C() {
        this.A02.A0E().A3o();
        KK.A00(new ZS(this));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0D() {
        this.A02.A0E().A3r();
        KK.A00(new ZR(this));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0E().A3q();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C1515Ts) {
                AbstractC1248Ji.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            FR controller = this.A01.A08();
            if (controller != null) {
                controller.A0I();
            }
            KK.A00(new ZT(this));
            C5P c5p = this.A01;
            c5p.A0B(c5p.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && C1225Ih.A11(this.A01.A07().getContext())) {
                final C1347Ng c1347Ng = new C1347Ng();
                this.A01.A0D(c1347Ng);
                c1347Ng.A0C(this.A01.getPlacementId());
                c1347Ng.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0H() != null) {
                    c1347Ng.A09(this.A01.A08().A0H().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C1515Ts) {
                    c1347Ng.A0A(((C1515Ts) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5Z
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = ZQ.this.A00;
                        if (view4 != null) {
                            C1347Ng c1347Ng2 = c1347Ng;
                            view5 = ZQ.this.A00;
                            int width = view5.getWidth();
                            view6 = ZQ.this.A00;
                            c1347Ng2.setBounds(0, 0, width, view6.getHeight());
                            c1347Ng.A0D(!r1.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(c1347Ng);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0F(InterfaceC08000p interfaceC08000p) {
        this.A02.A0E().A3p(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0J();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0G(C1242Jb c1242Jb) {
        this.A02.A0E().A2m(C1294Lf.A01(this.A01.A04()), c1242Jb.A03().getErrorCode(), c1242Jb.A04());
        KK.A00(new ZU(this, c1242Jb));
    }
}
