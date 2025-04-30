package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class BI extends AbstractC1503Tg {
    public static byte[] A0F;
    public static String[] A0G = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    public View A00;
    public View A01;
    public C1636Yn A02;
    public L9 A03;
    public MB A04;
    public Q5 A05;
    public KA A06;
    public boolean A07;
    public boolean A08;
    public final MC A09;
    public final O0 A0A;
    public final O1 A0B;
    public final SA A0C;
    public final KP A0D;
    public final AtomicBoolean A0E;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A08();
    }

    public BI(OP op) {
        super(op, false);
        this.A0E = new AtomicBoolean(false);
        this.A08 = false;
        this.A07 = false;
        this.A02 = op.A05();
        this.A04 = op.A08();
        View view = new View(this.A02);
        this.A01 = view;
        AbstractC1303Lo.A0K(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A05();
        MC A09 = op.A09();
        this.A09 = A09;
        OA.A00(op.A05(), this, getAdInfo().A0D().A07());
        SA A01 = A01(op);
        this.A0C = A01;
        getAdDetailsView().bringToFront();
        KP A02 = A02(op);
        this.A0D = A02;
        A14();
        this.A05 = new Q5(this.A02, op.A06(), getAdDataBundle());
        C1501Te c1501Te = new C1501Te(this);
        this.A0A = c1501Te;
        this.A0B = new O1(op, getAdDataBundle(), A01, A02, getAdDetailsView(), A09, c1501Te);
        OF supported = super.A07.A09(getAdDataBundle());
        this.A02.A0F().A00(supported.A01);
        if (supported.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(super.A07);
            A01.getVideoImplView().setOnClickListener(new OS(this));
        } else {
            if (!C1225Ih.A18(getAdContextWrapper())) {
                return;
            }
            AbstractC1352Nl.A00(A01.getVideoImplView(), C1225Ih.A19(getAdContextWrapper()), new OT(this));
        }
    }

    private SA A01(OP op) {
        SA sa = (SA) op.A02();
        int A13 = A13(op.A08());
        ImageView imageView = (ImageView) op.A03();
        int i9 = AbstractC1503Tg.A0F;
        int i10 = AbstractC1503Tg.A0F;
        int toolbarHeight = AbstractC1503Tg.A0F;
        imageView.setPadding(i9, i10, toolbarHeight, AbstractC1503Tg.A0F);
        int toolbarHeight2 = AbstractC1503Tg.A0G;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC1503Tg.A0G);
        int toolbarHeight3 = AbstractC1503Tg.A0E;
        layoutParams.setMargins(0, A13, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(sa, layoutParams2);
        sa.addView(imageView, layoutParams);
        return sa;
    }

    private KP A02(OP op) {
        KP A0A = op.A0A();
        A0A.A06(-1, AbstractC1503Tg.A0B);
        A0A.setPadding(AbstractC1503Tg.A0J, AbstractC1503Tg.A0J, AbstractC1503Tg.A0J, AbstractC1503Tg.A0J);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1503Tg.A0I);
        progressBarLayoutParams.addRule(12);
        addView(A0A, progressBarLayoutParams);
        return A0A;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0C.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        MB mb = this.A04;
        if (mb == null) {
            return;
        }
        this.A06 = new KA(mb, 400, -mb.getToolbarHeight(), 0);
    }

    private void A06() {
        new JA(getAdDataBundle().A12(), getAdEventManager()).A04(J9.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0E.set(true);
        AbstractC1303Lo.A0T(this);
        AbstractC1303Lo.A0H(this.A0C);
        AbstractC1303Lo.A0a(this.A0C, this.A0D, this.A0B, this.A00);
        AbstractC1303Lo.A0L(this.A04);
        Q5 q52 = this.A05;
        ViewOnClickListenerC1508Tl ctaButton = getCtaButton();
        String[] strArr = A0G;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<Q4, View> A03 = q52.A03(ctaButton);
        this.A00 = (View) A03.second;
        switch (OU.A00[((Q4) A03.first).ordinal()]) {
            case 1:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A13(this.A04), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case 2:
                AbstractC1303Lo.A0a(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC1503Tg.A0H, AbstractC1503Tg.A0H, AbstractC1503Tg.A0H, AbstractC1503Tg.A0H);
                addView(this.A00, layoutParams2);
                break;
        }
        if (getAdInfo().A0G().A00() >= 0) {
            this.A07 = true;
            MB mb = this.A04;
            if (mb != null) {
                mb.setToolbarActionMode(2);
                this.A04.setProgressImmediate(0.0f);
            }
            L9 l9 = new L9((int) getAdInfo().A0G().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1500Td(this));
            this.A03 = l9;
            l9.A07();
        }
    }

    private void A07() {
        KA ka = this.A06;
        if (ka != null) {
            ka.A3Y(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3Y(true, false);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A0B(C9H c9h) {
        super.A0B(c9h);
        A06();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A0C(AnonymousClass93 anonymousClass93) {
        super.A0C(anonymousClass93);
        int videoLengthMs = anonymousClass93.A00();
        int duration = this.A0C.getDuration() - videoLengthMs;
        if (getAnimationPlugin() != null) {
            int videoLengthMs2 = A0G[1].charAt(18);
            if (videoLengthMs2 != 51) {
                throw new RuntimeException();
            }
            A0G[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1503Tg, com.meta.analytics.dsp.uinode.OL
    public final void A0v() {
        super.A0v();
        A04();
        this.A04 = null;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1503Tg, com.meta.analytics.dsp.uinode.OL
    public final void A10(C1G c1g, String str, double d2, Bundle bundle) {
        super.A10(c1g, str, d2, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(0, 31, 118), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(55, 18, 103), false)) {
            A06();
        }
        if (bundle.getBoolean(A03(31, 24, 116), false)) {
            O1 o12 = this.A0B;
            if (A0G[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            o12.A07(this);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A12(boolean z8) {
        if (z8 && !this.A08) {
            boolean z9 = this.A0E.get();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0G;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z9) {
                    this.A0B.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0G[5].charAt(17) != 'k') {
            A0G[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0E.get()) {
                this.A0C.A0a(QH.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1503Tg
    public final void A14() {
        super.A14();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A9R(this.A0C);
        }
    }

    public final boolean A15() {
        return getAdInfo().A0O();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public int getCloseButtonStyle() {
        if (this.A07) {
            return 2;
        }
        if (A15() && !this.A0E.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1503Tg, com.meta.analytics.dsp.uinode.OL, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
