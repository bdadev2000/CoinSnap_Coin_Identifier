package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1084aV extends AbstractC01790q {
    public static byte[] A03;
    public static String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public View A00;
    public final C5P A01;
    public final C0515Ei A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C1084aV(C5P c5p) {
        this.A02 = c5p.A09();
        this.A01 = c5p;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0C() {
        this.A02.A0E().A4A();
        KP.A00(new C1086aX(this));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0D() {
        this.A02.A0E().A4D();
        KP.A00(new C1085aW(this));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0E(View view) {
        if (view != null) {
            C0515Ei c0515Ei = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "eqHc";
            c0515Ei.A0E().A4C();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof C0916Up) || (this.A00 instanceof C0705Mm)) {
                AbstractC0631Jn.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C0532Fj controller = this.A01.A08();
            if (controller != null) {
                controller.A0K();
            }
            KP.A00(new C1087aY(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && C0608Im.A16(this.A01.A07().getContext())) {
                final O6 o6 = new O6();
                this.A01.A0D(o6);
                o6.A0C(this.A01.getPlacementId());
                o6.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0I() != null) {
                    o6.A09(this.A01.A08().A0I().A0C());
                }
                if (this.A00 instanceof C0916Up) {
                    o6.A0A(((C0916Up) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5X
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        View view3;
                        View view4;
                        View view5;
                        view3 = C1084aV.this.A00;
                        if (view3 != null) {
                            O6 o62 = o6;
                            view4 = C1084aV.this.A00;
                            int width = view4.getWidth();
                            view5 = C1084aV.this.A00;
                            o62.setBounds(0, 0, width, view5.getHeight());
                            o6.A0D(!o6.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(o6);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0F(InterfaceC01780p interfaceC01780p) {
        this.A02.A0E().A4B(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0L();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0G(C0625Jg c0625Jg) {
        this.A02.A0E().A38(C0687Lu.A01(this.A01.A04()), c0625Jg.A03().getErrorCode(), c0625Jg.A04());
        KP.A00(new C1088aZ(this, c0625Jg));
    }
}
