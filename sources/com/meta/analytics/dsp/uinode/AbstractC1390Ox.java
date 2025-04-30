package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1390Ox {
    public static B4 A00(final OP op, int i9, final String str, final C1472Sb c1472Sb) {
        if (i9 == 1) {
            return new B4(op, str, c1472Sb) { // from class: com.facebook.ads.redexgen.X.3Q
                public static final int A00 = (int) (LD.A02 * 20.0f);
                public static final int A01 = (int) (LD.A02 * 16.0f);

                @Override // com.meta.analytics.dsp.uinode.OL
                public final boolean A01() {
                    return false;
                }

                @Override // com.meta.analytics.dsp.uinode.B4
                public final void A19(C1636Yn c1636Yn) {
                    O9 titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c1636Yn);
                    AbstractC1303Lo.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i10 = A01;
                    linearLayout.setPadding(i10, i10, i10, i10);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new B4(op, str, c1472Sb) { // from class: com.facebook.ads.redexgen.X.3b
            public static final int A00 = (int) (LD.A02 * 12.0f);

            @Override // com.meta.analytics.dsp.uinode.OL
            public final boolean A00() {
                return false;
            }

            @Override // com.meta.analytics.dsp.uinode.B4, com.meta.analytics.dsp.uinode.OL
            public final boolean A0D() {
                return false;
            }

            @Override // com.meta.analytics.dsp.uinode.B4
            public final void A19(C1636Yn c1636Yn) {
                O9 titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                int i10 = A00;
                titleDescContainer.setPadding(i10, i10, i10, i10);
                AbstractC1303Lo.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
