package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class U6 extends AbstractC1329Mo {
    public static final int A03 = (int) (LD.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2S A01;
    public final C1636Yn A02;

    public U6(C1636Yn c1636Yn, J2 j22, String str, C08111a c08111a, MD md, MC mc) {
        super(c1636Yn, j22, str, c08111a, md, mc);
        this.A02 = c1636Yn;
        this.A01 = C2T.A00(c1636Yn.A01());
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A00 = relativeLayout;
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC1303Lo.A0M(relativeLayout, -1728053248);
        relativeLayout.setOnClickListener(new ViewOnClickListenerC1334Mt(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z8) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z8 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            AbstractC1303Lo.A0V(this, transitionSet);
            return;
        }
        AbstractC1303Lo.A0T(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0L() {
        C2W A0A = this.A01.A0A();
        N3 n32 = new N3(this.A02);
        n32.setInfo(EnumC1311Lw.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        n32.setOnClickListener(new ViewOnClickListenerC1335Mu(this));
        C2W A0B = this.A01.A0B();
        N3 n33 = new N3(this.A02);
        n33.setInfo(EnumC1311Lw.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        n33.setOnClickListener(new ViewOnClickListenerC1336Mv(this));
        N3 n34 = new N3(this.A02);
        n34.setInfo(EnumC1311Lw.AD_CHOICES_ICON, this.A01.A0M(), "");
        n34.setOnClickListener(new ViewOnClickListenerC1337Mw(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i9 = A03;
        linearLayout.setPadding(i9 * 2, i9, i9 * 2, i9);
        AbstractC1303Lo.A0M(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(n32, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(n33, layoutParams);
        }
        linearLayout.addView(n34, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0M() {
        AbstractC1303Lo.A0I(this);
        this.A00.removeAllViews();
        AbstractC1303Lo.A0J(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0N(C2W c2w, C2U c2u) {
        String A0E;
        int i9;
        if (c2u == C2U.A04) {
            return;
        }
        boolean z8 = c2u == C2U.A05;
        C1327Mm c1327Mm = new C1327Mm(this.A02, this.A0B);
        if (z8) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C1327Mm A0E2 = c1327Mm.A0I(A0E).A0H(this.A01.A0D()).A0F(c2w.A04()).A0E(z8 ? EnumC1311Lw.REPORT_AD : EnumC1311Lw.HIDE_AD);
        if (z8) {
            i9 = -552389;
        } else {
            i9 = -13272859;
        }
        C1328Mn adHiddenView = A0E2.A0D(i9).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        AbstractC1303Lo.A0M(adHiddenView, -1);
        AbstractC1303Lo.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0O(C2W c2w, C2U c2u) {
        String A0H;
        boolean z8 = c2u == C2U.A05;
        C1636Yn c1636Yn = this.A02;
        InterfaceC1331Mq interfaceC1331Mq = this.A0B;
        if (z8) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        N6 n62 = new N6(c1636Yn, c2w, interfaceC1331Mq, A0H, z8 ? EnumC1311Lw.REPORT_AD : EnumC1311Lw.HIDE_AD);
        n62.setClickable(true);
        AbstractC1303Lo.A0M(n62, -1);
        int i9 = A03;
        n62.setPadding(i9 * 2, i9, i9 * 2, i9);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(n62, A0B(false));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final boolean A0P() {
        return false;
    }
}
