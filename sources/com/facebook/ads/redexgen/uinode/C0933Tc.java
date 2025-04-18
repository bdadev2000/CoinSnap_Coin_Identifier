package com.facebook.ads.redexgen.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0933Tc extends OL implements OE {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC1173b5 A00;
    public final MC A01;
    public final OG A02;
    public final C0813Om A03;
    public final C0841Po A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{52, 48, 60, 58, 56};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C0933Tc(OP op, boolean z10) {
        super(op, z10);
        int id2;
        int A01;
        this.A01 = op.A09();
        AbstractC1173b5 A04 = op.A04();
        this.A00 = A04;
        C0813Om c0813Om = new C0813Om(op.A05(), op.A02());
        this.A03 = c0813Om;
        c0813Om.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(OL.A07, OL.A07, OL.A07, OL.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (op.A0C()) {
            C0841Po c0841Po = new C0841Po(op.A05());
            this.A04 = c0841Po;
            c0841Po.setPageDetails(op.A04().A10());
            AbstractC0737Lo.A0G(1007, c0841Po);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(2, getCtaButton().getId());
            layoutParams2.setMargins(OL.A07, OL.A07 - (OL.A07 / 2), OL.A07, 0);
            c0841Po.setLayoutParams(layoutParams2);
            id2 = c0841Po.getId();
            A01 = op.A01() - (OL.A07 / 2);
        } else {
            id2 = getCtaButton().getId();
            A01 = op.A01();
            this.A04 = null;
        }
        FrameLayout frameLayout = new FrameLayout(op.A05());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, id2);
        layoutParams3.setMargins(0, A01, 0, 0);
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMargins(OL.A07, 0, OL.A07, 0);
        frameLayout.addView(c0813Om, layoutParams4);
        addView(frameLayout);
        View view = this.A04;
        if (view != null) {
            addView(view);
        }
        addView(getCtaButton());
        getCtaButton().A0A(op.A04(), op.A08());
        View A02 = op.A02();
        OG A012 = OG.A01(op.A05(), A04, this);
        this.A02 = A012;
        OF A09 = A012.A09(A04);
        op.A05().A0F().A00(A09.A01);
        if (A02 != null && A09.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(A012);
            A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0933Tc.this.A13(view2);
                }
            });
        } else if (A02 != null && C0659Ih.A16(getAdContextWrapper())) {
            AbstractC0786Nl.A00(A02, C0659Ih.A17(getAdContextWrapper()), new OW(this));
        }
        if (C0659Ih.A0y(op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C0659Ih.A0z(op.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A10(C1G c1g, String str, double d10, Bundle bundle) {
        super.A10(c1g, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A06 - (OL.A07 * 2)) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 75));
    }

    @Override // com.facebook.ads.redexgen.uinode.OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
