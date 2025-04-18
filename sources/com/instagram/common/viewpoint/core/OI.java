package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class OI {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3n] */
    public static C02543n A00(final C0757Om c0757Om, final W7 w7, final String str, final C0443Bl c0443Bl) {
        final boolean z2 = true;
        return new BZ(c0757Om, w7, z2, str, c0443Bl) { // from class: com.facebook.ads.redexgen.X.3n
            public ViewOnClickListenerC0909Ui A00;
            public QK A01;
            public final J7 A02 = this.A0I.A05().A01().A09();
            public final W7 A03;
            public final C0443Bl A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (LP.A02 * (-4.0f));
            public static final int A07 = (int) (LP.A02 * 6.0f);

            {
                this.A03 = w7;
                this.A05 = str;
                this.A04 = c0443Bl;
                this.A03.A1K(this);
            }

            @Override // com.instagram.common.viewpoint.core.UO
            public void setupNativeCtaExtension(QK qk) {
                C1T A1Q;
                this.A01 = qk;
                int A0O = C0608Im.A0O(this.A0I.A05());
                C1O A01 = this.A03.A0z().A1O().A01();
                C1045Zs A05 = this.A0I.A05();
                String A0Y = this.A03.A0z().A0Y();
                J7 j7 = this.A02;
                MR dummyListener = C0741Nw.getDummyListener();
                C0833Rk A0b = this.A04.A0b();
                C0688Lv A19 = this.A03.A19();
                if (this.A03.A0z() == null) {
                    A1Q = null;
                } else {
                    A1Q = this.A03.A0z().A1Q();
                }
                this.A00 = new ViewOnClickListenerC0909Ui(A05, A0Y, A01, j7, dummyListener, A0b, A19, A1Q);
                this.A00.setCta(qk.A03().A0G(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0O == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    M3.A0P(this.A00, A07, 5, A01.A09(false));
                    ((BZ) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (A0O == 2) {
                    layoutParams.addRule(3, ((BZ) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((BZ) this).A06.bringToFront();
                }
            }
        };
    }
}
