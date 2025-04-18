package com.facebook.ads.redexgen.uinode;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0793Ns {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3n] */
    public static C03103n A00(final OP op, final V2 v22, final String str, final BQ bq) {
        final boolean z10 = true;
        return new BK(op, v22, z10, str, bq) { // from class: com.facebook.ads.redexgen.X.3n
            public ViewOnClickListenerC0942Tl A00;
            public C0842Pp A01;
            public final J2 A02 = this.A0I.A05().A01().A09();
            public final V2 A03;
            public final BQ A04;
            public final String A05;
            public static final int A07 = (int) (LD.A02 * (-4.0f));
            public static final int A06 = (int) (LD.A02 * 6.0f);

            {
                this.A03 = v22;
                this.A05 = str;
                this.A04 = bq;
                v22.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.uinode.TS
            public void setupNativeCtaExtension(C0842Pp c0842Pp) {
                C1U A0y;
                this.A01 = c0842Pp;
                int A0M = C0659Ih.A0M(this.A0I.A05());
                C1P A01 = this.A03.A0z().A0w().A01();
                C1070Yn A05 = this.A0I.A05();
                String A0L = this.A03.A0z().A0L();
                J2 j22 = this.A02;
                MC dummyListener = NW.getDummyListener();
                RE A0b = this.A04.A0b();
                C0729Lg A19 = this.A03.A19();
                if (this.A03.A0z() == null) {
                    A0y = null;
                } else {
                    A0y = this.A03.A0z().A0y();
                }
                ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl = new ViewOnClickListenerC0942Tl(A05, A0L, A01, j22, dummyListener, A0b, A19, A0y);
                this.A00 = viewOnClickListenerC0942Tl;
                viewOnClickListenerC0942Tl.setCta(c0842Pp.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0M == 1) {
                    layoutParams.addRule(12);
                    AbstractC0737Lo.A0P(this.A00, A06, 5, A01.A09(false));
                    ((BK) this).A06.addView(this.A00, layoutParams);
                } else {
                    if (A0M != 2) {
                        return;
                    }
                    layoutParams.addRule(3, ((BK) this).A06.getId());
                    int extensionVariant = A07;
                    layoutParams.setMargins(0, extensionVariant, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((BK) this).A06.bringToFront();
                }
            }
        };
    }
}
