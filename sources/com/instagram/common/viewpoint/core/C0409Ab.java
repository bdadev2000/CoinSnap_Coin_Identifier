package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0409Ab extends U6 {
    public static byte[] A0W;
    public static String[] A0X = {"uwiFFMiPjkxeIpnCelDmRbiHk5Vwnfgt", "wLfFuslsjBH4uPGwj2Xycf6hIgRvR8Oe", "HvNwre", "LU1P5nNd", "IrSP0rhp", "3tH6XBAURu1AudBFEixfPGQY1Q", "mKjuxDaulnRYw", "yhw0zrPGEZfB7fyQoDKXN69L0o"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public C1O A00;
    public LH A01;
    public EnumC0815Qs A02;
    public C0715Mw A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final C1045Zs A0C;
    public final OE A0D;
    public final ViewOnClickListenerC0909Ui A0E;
    public final Q4 A0F;
    public final C0797Qa A0G;
    public final TC A0H;
    public final T7 A0I;
    public final C9S A0J;
    public final AbstractC0858Sj A0K;
    public final AbstractC0856Sh A0L;
    public final AbstractC0852Sd A0M;
    public final AbstractC0836Rn A0N;
    public final R9 A0O;
    public final R8 A0P;
    public final QG A0Q;
    public final C0742Nx A0R;
    public final N5 A0S;
    public final M9 A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A05(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0W = new byte[]{82, 94, 92, 31, 87, 80, 82, 84, 83, 94, 94, 90, 31, 80, 85, 66, 31, 88, 95, 69, 84, 67, 66, 69, 88, 69, 88, 80, 93, 31, 82, 93, 88, 82, 90, 84, 85, 54, 33, 51, 37, 54, 32, 33, 32, 27, 50, 45, 32, 33, 43, 105, 118, 123, 122, 112};
    }

    static {
        A0A();
        A0b = (int) (LP.A02 * 48.0f);
        A0Z = AbstractC02302p.A01(-1, 77);
        A0g = (int) (LP.A02 * 26.0f);
        A0h = (int) (LP.A02 * 12.0f);
        A0d = (int) (LP.A02 * 12.0f);
        A0e = (int) (LP.A02 * 44.0f);
        A0c = (int) (LP.A02 * 8.0f);
        A0f = (int) (LP.A02 * 16.0f);
        A0a = AbstractC02302p.A01(A0Z, 90);
        A0Y = (int) (LP.A02 * 4.0f);
    }

    public C0409Ab(C1045Zs c1045Zs, J7 j7, AbstractC1187cD abstractC1187cD, C03226f c03226f, N9 n9, int i2, MR mr, JF jf, int i3, int i4, int i5, boolean z2, int i6, boolean z3, boolean z4, boolean z5, Q4 q4) {
        super(c1045Zs, n9, j7, abstractC1187cD, i2, z4, z5, mr);
        C1O A00;
        this.A04 = false;
        this.A05 = false;
        this.A07 = false;
        this.A0O = new B5(this);
        this.A0N = new C0432Ay(this);
        this.A0M = new C0429Av(this);
        this.A0P = new C0412Ae(this);
        this.A0K = new C0411Ad(this);
        this.A0L = new C0410Ac(this);
        this.A0C = c1045Zs;
        this.A0R = new C0742Nx(this.A0C, jf);
        this.A0S = new N5(this.A0C);
        this.A0A = i6;
        this.A0V = z3;
        this.A09 = i3;
        this.A0B = i4;
        this.A0F = q4;
        this.A08 = i5;
        this.A0U = z2;
        this.A0G = new C0797Qa(this.A0C, j7, super.A05);
        if (i4 == 1) {
            A00 = super.A05.A1O().A01();
        } else {
            A00 = super.A05.A1O().A00();
        }
        this.A00 = A00;
        this.A0I = new T7(this.A0C);
        this.A0I.getEventBus().A03(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
        this.A0J = new C9S(c1045Zs, j7, this.A0I, abstractC1187cD.A1U());
        A09();
        this.A0I.setVideoURI(c03226f.A0S(super.A05.A1P().A0E().A08()));
        A08();
        LK A0A = super.A08.A0A(abstractC1187cD);
        this.A0C.A0G().A00(A0A.A01);
        this.A0D = A02();
        this.A0T = new M9(this.A0D, 400, 100, 0);
        this.A0T.A3u(true, false);
        this.A0Q = new QG(true);
        A0B();
        this.A0E = this.A0D.getCTAButton();
        if (A0A.A00) {
            this.A0I.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Pq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0409Ab.this.A17(view);
                }
            });
        }
        M3.A0G(1001, this.A0E);
        A07();
        A06();
        this.A0D.bringToFront();
        if (C0608Im.A1p(this.A0C)) {
            this.A0C.A0A().AHO(this.A0I, super.A05.A1U(), true);
        }
        if (C0608Im.A1q(this.A0C)) {
            this.A0H = new TC(this.A0C, j7, this.A0I, super.A05.A1U(), this.A0J, null);
        } else {
            this.A0H = null;
        }
    }

    private C0905Ue A02() {
        String A05;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (super.A05.A0c().equals(A05(37, 14, 3))) {
            A05 = EnumC0818Qv.A04.A03();
        } else {
            A05 = A05(0, 37, Opcodes.FNEG);
        }
        C0905Ue c0905Ue = new C0905Ue(this.A0C, A0b, super.A05.A1P().A0F().A00() == C1K.A05, getColors(), super.A05.A1P().A0G().A06(), A05, super.A07, super.A0A, super.A0C, super.A09, super.A05);
        c0905Ue.getCTAButton().getCtaActionHelper().A04(super.A05);
        c0905Ue.getCTAButton().setCreativeAsCtaLoggingHelper(super.A08);
        M3.A0G(1008, c0905Ue);
        c0905Ue.A0D(this.A0B);
        addView(c0905Ue, layoutParams);
        c0905Ue.setInfo(super.A05.A1P().A0F(), super.A05.A1P().A0G(), super.A05.A1U(), super.A05.A1S().A01(), null, null);
        return c0905Ue;
    }

    private void A06() {
        this.A0S.A06(-1, A0Z);
        this.A0S.setPadding(A0h, A0h, A0h, A0h);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0g);
        layoutParams.addRule(12);
        addView(this.A0S, layoutParams);
    }

    private void A07() {
        this.A0R.setPadding(A0d, A0d, A0d, A0d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0e, A0e);
        layoutParams.setMargins(0, MQ.A00, A0c, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0I, videoViewParams);
        addView(this.A0R, layoutParams);
    }

    private void A08() {
        postDelayed(new U3(this), C0608Im.A0N(this.A0C));
    }

    private void A09() {
        this.A0I.A0c(this.A0S);
        this.A0I.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A05.A1P().A0E().A07())) {
            C7V c7v = new C7V(this.A0C);
            this.A0I.A0c(c7v);
            c7v.setImage(super.A05.A1P().A0E().A07());
        }
        this.A0I.A0c(new C7L(this.A0C));
    }

    private final void A0B() {
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null) {
            if (this.A03 != null) {
                QG qg = this.A0Q;
                C0715Mw c0715Mw = this.A03;
                String[] strArr = A0X;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0X[1] = "yPUFQNIw4jpGFPLG5nXj9YsdQuCVJrWl";
                qg.A0I(c0715Mw);
            }
            C1O A01 = super.A05.A1O().A01();
            this.A0Q.A0I(new C0713Mu(this.A0D.getCTAButton(), 300, -1, A01.A09(true)));
            Drawable A08 = M3.A08(A0Z, A0a, A0Y);
            Drawable endDrawable = M3.A05(A01.A08(true), A0Y);
            this.A0Q.A0I(new C0716Mx(this.A0D.getCTAButton(), 300, A08, endDrawable));
            this.A0Q.A0I(new C0714Mv(expandableLayout, Opcodes.FCMPG, false));
            this.A0Q.A9r(this.A0I);
            this.A0Q.A0H(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C9O c9o) {
        if (this.A0I.getState() == EnumC0830Rh.A02 && C0608Im.A1U(this.A0C)) {
            postDelayed(new U2(this, c9o), 5000L);
        }
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public final void A0z() {
        super.A0z();
        if (this.A01 != null) {
            LH lh = this.A01;
            String[] strArr = A0X;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0X;
            strArr2[4] = "vVds5dTr";
            strArr2[3] = "mwltsewL";
            lh.A06();
        }
        if (C0608Im.A1p(this.A0C)) {
            this.A0C.A0A().AHC(this.A0I);
        }
        if (this.A0H != null) {
            this.A0H.A05();
        }
        if (this.A0I != null) {
            this.A0I.getEventBus().A04(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
            M3.A0H(this.A0I);
            this.A0I.A0V();
        }
        this.A0J.A0o();
        M3.A0b(this.A0I, this.A0S, this.A0R);
        super.A0C.A0V();
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public final void A11() {
        this.A0C.A0E().A4b();
        this.A04 = true;
        M3.A0T(this);
        M3.A0H(this.A0I);
        M3.A0b(this.A0I, this.A0S, this.A0R);
        Pair<QZ, View> A03 = this.A0G.A03(this.A0E);
        View view = (View) A03.second;
        M3.A0G(1101, view);
        switch (C0788Pr.A00[((QZ) A03.first).ordinal()]) {
            case 1:
                this.A0D.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, MQ.A00, 0, 0);
                layoutParams.addRule(2, this.A0D.getId());
                addView(view, layoutParams);
                break;
            case 2:
                M3.A0b(this.A0D);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(A0f, A0f, A0f, A0f);
                addView(view, layoutParams2);
                break;
        }
        if (this.A08 == 0 && this.A0U) {
            if (this.A0V) {
                this.A0F.AHI();
            }
            this.A01 = new LH(this.A0A, 100.0f, 100L, new Handler(Looper.getMainLooper()), new U1(this));
            this.A01.A07();
            return;
        }
        this.A05 = true;
        this.A0F.ADa(true);
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public final void A12() {
        this.A0I.setVolume(super.A05.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0I.A0b(EnumC0815Qs.A02, 20);
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public final void A13(boolean z2) {
        if (this.A01 != null) {
            this.A01.A06();
        }
        if (this.A0I.A0j()) {
            return;
        }
        this.A02 = this.A0I.getVideoStartReason();
        this.A06 = z2;
        this.A0I.A0e(false, 13);
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public final void A14(boolean z2) {
        if (this.A01 != null && !this.A01.A05()) {
            this.A01.A07();
        }
        if (this.A04 || this.A0I.getState() == EnumC0830Rh.A06 || this.A02 == null) {
            return;
        }
        if (!this.A06 || z2) {
            this.A0I.A0b(this.A02, 19);
        }
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public final boolean A15() {
        if (this.A08 != 2 && super.A05.A1P().A0Q() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public final boolean A16() {
        return this.A04;
    }

    public final /* synthetic */ void A17(View view) {
        this.A0E.A09(A05(51, 5, 88));
    }

    @Override // com.instagram.common.viewpoint.core.U6, com.instagram.common.viewpoint.core.LJ
    public final void ACa() {
        super.A0A.A4P(super.A05.A0Y());
    }

    public C1O getColors() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public Q3 getFullScreenAdStyle() {
        return new Q3(true, Q3.A06, super.A05.A1O().A01(), ViewOnClickListenerC0909Ui.A08(super.A05), super.A05.A1O().A01().A07(true), super.A05.A1P().A0E().A07());
    }

    @Override // com.instagram.common.viewpoint.core.U6
    public C0688Lv getTouchDataRecorder() {
        return super.A09;
    }

    @Override // com.instagram.common.viewpoint.core.U6, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1O A00;
        super.onConfigurationChanged(configuration);
        if (!this.A04) {
            if (configuration.orientation == 1) {
                A00 = super.A05.A1O().A01();
            } else {
                C1B A1O = super.A05.A1O();
                String[] strArr = A0X;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A0X[1] = "ZWQFADQdeKHmDIXasxpY6pydlWSUwrFV";
                A00 = A1O.A00();
            }
            this.A00 = A00;
            this.A0E.setViewShowsOverMedia(true);
            this.A0E.setUpButtonColors(this.A00);
            this.A0D.A0D(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null && z2 && this.A03 == null) {
            this.A03 = new C0715Mw(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A0Q.A0I(this.A03);
            this.A0Q.A0G();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            A14(false);
        } else {
            A13(false);
        }
    }
}
