package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class T4 extends PQ {
    public static byte[] A0W;
    public static String[] A0X = {"zF", "YuhgBsbCJ4GENG72FYuTSQ3UxVCmrs0t", "RSfzcHToFNO8jc1tX2m0S0AZ0vbf9kKl", TtmlNode.TAG_P, "lGjhRdALEILVIUsiuWCm6MXJK2R8L6Co", "wXQvDYR5huLQKlTsBS5mG0rN7ygrQvR2", "AYgBJnzxyMi9rrwHO3oB8yOhTSWVLxNu", "3k2Jytm7iEKA6X2jmmGhgFSNDYaf4AHR"};
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
    public C1P A00;
    public L9 A01;
    public QM A02;
    public KI A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final C1636Yn A0C;
    public final AbstractC1355No A0D;
    public final ViewOnClickListenerC1508Tl A0E;
    public final InterfaceC1396Pd A0F;
    public final Q5 A0G;
    public final SF A0H;
    public final SA A0I;
    public final C9I A0J;
    public final AbstractC1413Pu A0K;
    public final AbstractC1411Ps A0L;
    public final AbstractC1380On A0M;
    public final O7 A0N;
    public final NX A0O;
    public final NQ A0P;
    public final LX A0Q;
    public final C1285Kw A0R;
    public final KP A0S;
    public final KA A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A08(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0W = new byte[]{-55, -43, -45, -108, -52, -57, -55, -53, -56, -43, -43, -47, -108, -57, -54, -39, -108, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, -108, -55, -46, -49, -55, -47, -53, -54, Ascii.ESC, Ascii.SO, 32, 10, Ascii.ESC, Ascii.CR, Ascii.SO, Ascii.CR, 8, Ascii.US, Ascii.DC2, Ascii.CR, Ascii.SO, Ascii.CAN};
    }

    static {
        A0D();
        A0b = (int) (LD.A02 * 48.0f);
        int A01 = AbstractC08522p.A01(-1, 77);
        A0Z = A01;
        A0g = (int) (LD.A02 * 26.0f);
        A0h = (int) (LD.A02 * 12.0f);
        A0d = (int) (LD.A02 * 12.0f);
        A0e = (int) (LD.A02 * 44.0f);
        A0c = (int) (LD.A02 * 8.0f);
        A0f = (int) (LD.A02 * 16.0f);
        A0a = AbstractC08522p.A01(A01, 90);
        A0Y = (int) (LD.A02 * 4.0f);
    }

    public T4(C1636Yn c1636Yn, J2 j22, AbstractC1739b5 abstractC1739b5, C09416c c09416c, InterfaceC1324Mj interfaceC1324Mj, int i9, MC mc, JA ja, int i10, int i11, int i12, boolean z8, int i13, boolean z9, boolean z10, boolean z11, InterfaceC1396Pd interfaceC1396Pd) {
        super(c1636Yn, interfaceC1324Mj, j22, abstractC1739b5, i9, z10, z11, mc);
        C1P A00;
        this.A04 = false;
        this.A05 = false;
        this.A07 = false;
        AV av = new AV(this);
        this.A0O = av;
        AO ao = new AO(this);
        this.A0N = ao;
        A9 a9 = new A9(this);
        this.A0M = a9;
        A4 a42 = new A4(this);
        this.A0P = a42;
        A3 a32 = new A3(this);
        this.A0K = a32;
        A2 a22 = new A2(this);
        this.A0L = a22;
        this.A0C = c1636Yn;
        this.A0R = new C1285Kw(c1636Yn, ja);
        this.A0S = new KP(c1636Yn);
        this.A0A = i13;
        this.A0V = z9;
        this.A09 = i10;
        this.A0B = i11;
        this.A0F = interfaceC1396Pd;
        this.A08 = i12;
        this.A0U = z8;
        this.A0G = new Q5(c1636Yn, j22, super.A05);
        if (i11 == 1) {
            A00 = super.A05.A0w().A01();
        } else {
            A00 = super.A05.A0w().A00();
        }
        this.A00 = A00;
        SA sa = new SA(c1636Yn);
        this.A0I = sa;
        sa.getEventBus().A03(av, ao, a9, a42, a32, a22);
        C9I c9i = new C9I(c1636Yn, j22, sa, abstractC1739b5.A12());
        this.A0J = c9i;
        A0C();
        sa.setVideoURI(c09416c.A0S(super.A05.A0x().A0D().A08()));
        A0B();
        C1504Th A05 = A05();
        this.A0D = A05;
        KA ka = new KA(A05, 400, 100, 0);
        this.A0T = ka;
        ka.A3Y(true, false);
        this.A0Q = new LX(true);
        A0E();
        ViewOnClickListenerC1508Tl cTAButton = A05.getCTAButton();
        this.A0E = cTAButton;
        AbstractC1303Lo.A0G(1001, cTAButton);
        A0A();
        A09();
        A05.bringToFront();
        if (C1225Ih.A1W(c1636Yn)) {
            c1636Yn.A0A().AGv(sa, super.A05.A12(), true);
        }
        if (C1225Ih.A1X(c1636Yn)) {
            this.A0H = new SF(c1636Yn, j22, sa, super.A05.A12(), c9i, null);
        } else {
            this.A0H = null;
        }
    }

    private C1504Th A05() {
        String A08;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (super.A05.A0P().equals(A08(37, 14, 125))) {
            A08 = QP.A04.A02();
        } else {
            A08 = A08(0, 37, 58);
        }
        C1504Th c1504Th = new C1504Th(this.A0C, A0b, super.A05.A0x().A0E().A00() == C1L.A05, getColors(), super.A05.A0x().A0F().A06(), A08, super.A07, super.A09, super.A0B, super.A08, super.A05.A0y());
        AbstractC1303Lo.A0G(1008, c1504Th);
        c1504Th.A0A(this.A0B);
        addView(c1504Th, layoutParams);
        c1504Th.setInfo(super.A05.A0x().A0E(), super.A05.A0x().A0F(), super.A05.A12(), super.A05.A10().A01(), null);
        return c1504Th;
    }

    private void A09() {
        this.A0S.A06(-1, A0Z);
        KP kp = this.A0S;
        int i9 = A0h;
        kp.setPadding(i9, i9, i9, i9);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0g);
        layoutParams.addRule(12);
        addView(this.A0S, layoutParams);
    }

    private void A0A() {
        C1285Kw c1285Kw = this.A0R;
        int i9 = A0d;
        c1285Kw.setPadding(i9, i9, i9, i9);
        int i10 = A0e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.setMargins(0, MB.A00, A0c, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0I, videoViewParams);
        addView(this.A0R, layoutParams);
    }

    private void A0B() {
        postDelayed(new T7(this), C1225Ih.A0L(this.A0C));
    }

    private void A0C() {
        this.A0I.A0c(this.A0S);
        this.A0I.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A05.A0x().A0D().A07())) {
            C7R c7r = new C7R(this.A0C);
            this.A0I.A0c(c7r);
            c7r.setImage(super.A05.A0x().A0D().A07());
        }
        this.A0I.A0c(new C7H(this.A0C));
    }

    private final void A0E() {
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null) {
            KI ki = this.A03;
            if (ki != null) {
                this.A0Q.A0I(ki);
            }
            C1P A01 = super.A05.A0w().A01();
            this.A0Q.A0I(new KC(this.A0D.getCTAButton(), 300, -1, A01.A09(true)));
            int i9 = A0Z;
            int i10 = A0a;
            int i11 = A0Y;
            Drawable A08 = AbstractC1303Lo.A08(i9, i10, i11);
            Drawable endDrawable = AbstractC1303Lo.A05(A01.A08(true), i11);
            this.A0Q.A0I(new KM(this.A0D.getCTAButton(), 300, A08, endDrawable));
            this.A0Q.A0I(new KF(expandableLayout, 150, false));
            this.A0Q.A9R(this.A0I);
            this.A0Q.A0H(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(AnonymousClass93 anonymousClass93) {
        if (this.A0I.getState() == RB.A02 && C1225Ih.A1D(this.A0C)) {
            postDelayed(new T6(this, anonymousClass93), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A0z() {
        L9 l9 = this.A01;
        if (l9 != null) {
            l9.A06();
        }
        if (C1225Ih.A1W(this.A0C)) {
            this.A0C.A0A().AGk(this.A0I);
        }
        SF sf = this.A0H;
        if (sf != null) {
            sf.A0C();
        }
        SA sa = this.A0I;
        if (sa != null) {
            sa.getEventBus().A04(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
            AbstractC1303Lo.A0H(this.A0I);
            this.A0I.A0V();
        }
        this.A0J.A0i();
        View[] viewArr = new View[3];
        viewArr[0] = this.A0I;
        KP kp = this.A0S;
        String[] strArr = A0X;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A0X[2] = "4e1dr9g4n9kT22ZIdoKy0n8REVoGbgbF";
        viewArr[1] = kp;
        viewArr[2] = this.A0R;
        AbstractC1303Lo.A0a(viewArr);
        super.A0B.A0V();
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A10() {
        this.A0C.A0E().A4F();
        this.A04 = true;
        AbstractC1303Lo.A0T(this);
        AbstractC1303Lo.A0H(this.A0I);
        AbstractC1303Lo.A0a(this.A0I, this.A0S, this.A0R);
        Pair<Q4, View> A03 = this.A0G.A03(this.A0E);
        View view = (View) A03.second;
        AbstractC1303Lo.A0G(1101, view);
        switch (PR.A00[((Q4) A03.first).ordinal()]) {
            case 1:
                this.A0D.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, MB.A00, 0, 0);
                layoutParams.addRule(2, this.A0D.getId());
                addView(view, layoutParams);
                break;
            case 2:
                AbstractC1303Lo.A0a(this.A0D);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                int i9 = A0f;
                layoutParams2.setMargins(i9, i9, i9, i9);
                addView(view, layoutParams2);
                break;
        }
        if (this.A08 == 0 && this.A0U) {
            if (this.A0V) {
                this.A0F.AGq();
            }
            L9 l9 = new L9(this.A0A, 100.0f, 100L, new Handler(Looper.getMainLooper()), new T5(this));
            this.A01 = l9;
            l9.A07();
            return;
        }
        this.A05 = true;
        this.A0F.AD7(true);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A11() {
        this.A0I.setVolume(super.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0I.A0b(QM.A02, 20);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A12(boolean z8) {
        L9 l9 = this.A01;
        if (l9 != null) {
            l9.A06();
        }
        if (this.A0I.A0i()) {
            return;
        }
        this.A02 = this.A0I.getVideoStartReason();
        this.A06 = z8;
        this.A0I.A0e(false, 13);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A13(boolean z8) {
        QM qm;
        L9 l9 = this.A01;
        if (l9 != null && !l9.A05()) {
            L9 l92 = this.A01;
            if (A0X[5].charAt(17) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[7] = "pObqmm4LdTsqTcUgL7kozPbufRCkwYZC";
            strArr[6] = "5szeP9lNqMFVM0rzjOQcuK8NUDwg7u3G";
            l92.A07();
        }
        if (this.A04 || this.A0I.getState() == RB.A06 || (qm = this.A02) == null) {
            return;
        }
        if (!this.A06 || z8) {
            this.A0I.A0b(qm, 19);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A14() {
        if (this.A08 != 2 && super.A05.A0x().A0O() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A15() {
        return this.A04;
    }

    public C1P getColors() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public C1395Pc getFullScreenAdStyle() {
        return new C1395Pc(true, C1395Pc.A06, super.A05.A0w().A01(), ViewOnClickListenerC1508Tl.A08(super.A05), super.A05.A0w().A01().A07(true), super.A05.A0x().A0D().A07());
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public C1295Lg getTouchDataRecorder() {
        return super.A08;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1P A00;
        super.onConfigurationChanged(configuration);
        if (!this.A04) {
            if (configuration.orientation == 1) {
                A00 = super.A05.A0w().A01();
            } else {
                C1C A0w = super.A05.A0w();
                if (A0X[4].charAt(4) != 'R') {
                    throw new RuntimeException();
                }
                A0X[1] = "uYIsd2DhsQ91Wp0xmXJ9348eeMLtSRMf";
                A00 = A0w.A00();
            }
            this.A00 = A00;
            this.A0E.setViewShowsOverMedia(true);
            this.A0E.setUpButtonColors(this.A00);
            this.A0D.A0A(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null && z8 && this.A03 == null) {
            KI ki = new KI(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A03 = ki;
            this.A0Q.A0I(ki);
            this.A0Q.A0G();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            A13(false);
        } else {
            A12(false);
        }
    }
}
