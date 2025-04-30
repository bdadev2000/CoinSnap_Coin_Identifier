package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1502Tf extends OL implements OE {
    public static byte[] A03;
    public final AbstractC1739b5 A00;
    public final MC A01;
    public final OG A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-22, -18, -30, -24, -26};
    }

    public C1502Tf(OP op, boolean z8) {
        super(op, true);
        FrameLayout.LayoutParams layoutParams;
        this.A01 = op.A09();
        AbstractC1739b5 A04 = op.A04();
        this.A00 = A04;
        RelativeLayout relativeLayout = new RelativeLayout(op.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        AbstractC1303Lo.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(op.A05());
        linearLayout.setOrientation(!z8 ? 1 : 0);
        linearLayout.setGravity(80);
        AbstractC1303Lo.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(OL.A07, 0, OL.A07, OL.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z8 ? -2 : -1, -2);
        layoutParams4.setMargins(z8 ? OL.A07 : 0, z8 ? 0 : OL.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z8 ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        OG A01 = OG.A01(op.A05(), A04, this);
        this.A02 = A01;
        OF A09 = A01.A09(A04);
        op.A05().A0F().A00(A09.A01);
        if (op.A0C() && !z8) {
            C1407Po c1407Po = new C1407Po(op.A05());
            c1407Po.setPageDetails(op.A04().A10());
            int A042 = this.A06.A04().A0w().A00().A04(true);
            c1407Po.A02(A042, A042);
            AbstractC1303Lo.A0G(1007, c1407Po);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, OL.A07, 0, 0);
            linearLayout.addView(c1407Po, layoutParams6);
            if (C1225Ih.A0z(op.A05())) {
                c1407Po.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0A(op.A04(), op.A08());
        View A02 = op.A02();
        if (A02 != null && (A09.A00 || C1225Ih.A16(getAdContextWrapper()))) {
            if (z8) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(op.A05());
            frameLayout.addView(A02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            if (A09.A00) {
                getCtaButton().setCreativeAsCtaLoggingHelper(A01);
                A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OJ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1502Tf.this.A13(view);
                    }
                });
            } else {
                AbstractC1352Nl.A00(A02, C1225Ih.A17(getAdContextWrapper()), new OK(this));
            }
        } else if (A02 != null) {
            addView(A02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (C1225Ih.A0y(op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A10(C1G c1g, String str, double d2, Bundle bundle) {
        super.A10(c1g, str, d2, bundle);
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return true;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 88));
    }

    @Override // com.meta.analytics.dsp.uinode.OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
