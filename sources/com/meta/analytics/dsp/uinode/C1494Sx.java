package com.meta.analytics.dsp.uinode;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1494Sx extends PQ {
    public static byte[] A0k;
    public static String[] A0l = {"b5G1zrconZ3ixGT2ifmSYAvyf5qvuioM", "E7ePxMRKQj8Nsj11XAZX", "RYnvJIfy7H", "sKG7dsg9roBnaoP9H0Iom", "yy1EwMPcWWjeWCkN0IqWpK5f1Ty7r3W9", "FDFB", "dmJ0BH5on1aQmIo20RUb8HXj8gaX6ja3", "K5zlHDBh8uRMDNRgQaLPbhL7f5pOjpiq"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C1P A0D;
    public NJ A0E;
    public NK A0F;
    public U1 A0G;
    public C1381Oo A0H;
    public QM A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AbstractC07930h A0T;
    public final C1636Yn A0U;
    public final JA A0V;
    public final FullScreenAdToolbar A0W;
    public final InterfaceC1396Pd A0X;
    public final SF A0Y;
    public final SA A0Z;
    public final C9I A0a;
    public final AbstractC1413Pu A0b;
    public final AbstractC1411Ps A0c;
    public final AbstractC1380On A0d;
    public final O7 A0e;
    public final NX A0f;
    public final NQ A0g;
    public final C1285Kw A0h;
    public final KP A0i;
    public final Runnable A0j;

    public static String A0M(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0k, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A0Y() {
        A0k = new byte[]{-28, -19, -22, -28, -20, -32, -12, -16, -10, -13, -28, -26, -65, -67, -52, -86, -71, -49, -96, -67, -63, -65, -64, -52, -50, -45, -43, -38, -39, -60, -46, -54, -39, -51, -44, -55, Ascii.ETB, Ascii.NAK, 7, Ascii.DC4, 5, Ascii.SO, Ascii.VT, 5, Ascii.CR, 1, 8, Ascii.VT, Ascii.SO, Ascii.SYN, 7, Ascii.DC4, 7, 6, 1, -13, -8, -18, -7, 1, Ascii.SO};
    }

    static {
        A0Y();
        A0m = (int) (LD.A02 * 4.0f);
        A0n = (int) (LD.A02 * 8.0f);
        A0o = AbstractC08522p.A01(-1, 77);
        A0s = (int) (LD.A02 * 26.0f);
        A0t = (int) (LD.A02 * 12.0f);
        A0q = (int) (LD.A02 * 12.0f);
        A0r = (int) (LD.A02 * 44.0f);
        A0p = (int) (LD.A02 * 8.0f);
    }

    public C1494Sx(C1636Yn c1636Yn, J2 j22, FullScreenAdToolbar fullScreenAdToolbar, AbstractC1739b5 abstractC1739b5, C09416c c09416c, InterfaceC1324Mj interfaceC1324Mj, int i9, MC mc, JA ja, int i10, boolean z8, boolean z9, InterfaceC1396Pd interfaceC1396Pd) {
        super(c1636Yn, interfaceC1324Mj, j22, abstractC1739b5, i9, z8, z9, mc);
        C1P A00;
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0j = new PZ(this);
        this.A0L = false;
        this.A0S = false;
        this.A01 = 0.0f;
        A1 a12 = new A1(this);
        this.A0f = a12;
        O7 o72 = new O7() { // from class: com.facebook.ads.redexgen.X.9z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o82) {
                if (!((PQ) C1494Sx.this).A08.A07()) {
                    C1494Sx.this.A03();
                }
            }
        };
        this.A0e = o72;
        AbstractC1380On abstractC1380On = new AbstractC1380On() { // from class: com.facebook.ads.redexgen.X.9y
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            public final /* bridge */ /* synthetic */ void A03(AnonymousClass98 anonymousClass98) {
            }
        };
        this.A0d = abstractC1380On;
        NQ nq = new NQ() { // from class: com.facebook.ads.redexgen.X.9d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass93 anonymousClass93) {
                float f9;
                SA sa;
                InterfaceC1396Pd interfaceC1396Pd2;
                C1494Sx.this.A0g(anonymousClass93);
                f9 = C1494Sx.this.A01;
                sa = C1494Sx.this.A0Z;
                float duration = (f9 * sa.getDuration()) + anonymousClass93.A00();
                interfaceC1396Pd2 = C1494Sx.this.A0X;
                interfaceC1396Pd2.ABY(duration);
            }
        };
        this.A0g = nq;
        AbstractC1413Pu abstractC1413Pu = new AbstractC1413Pu() { // from class: com.facebook.ads.redexgen.X.9b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                InterfaceC1396Pd interfaceC1396Pd2;
                SA sa;
                SA sa2;
                interfaceC1396Pd2 = C1494Sx.this.A0X;
                sa = C1494Sx.this.A0Z;
                interfaceC1396Pd2.ABH(sa.getDuration());
                C1494Sx.A06(C1494Sx.this, 1.0f);
                sa2 = C1494Sx.this.A0Z;
                sa2.A0b(QM.A02, 28);
            }
        };
        this.A0b = abstractC1413Pu;
        C10059a c10059a = new C10059a(this);
        this.A0c = c10059a;
        this.A0W = fullScreenAdToolbar;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c1636Yn.getSystemService(A0M(24, 12, 53));
        this.A0T = C07940i.A01(c1636Yn, j22, abstractC1739b5.A12(), AbstractC1287Ky.A00(abstractC1739b5.A0x().A0F().A05()), new HashMap(), false, true, abstractC1739b5.A0y());
        this.A0U = c1636Yn;
        this.A0V = ja;
        this.A0h = new C1285Kw(c1636Yn, ja);
        this.A0i = new KP(c1636Yn);
        this.A0X = interfaceC1396Pd;
        if (i10 == 1) {
            A00 = super.A05.A0w().A01();
        } else {
            A00 = super.A05.A0w().A00();
        }
        this.A0D = A00;
        SA sa = new SA(c1636Yn);
        this.A0Z = sa;
        sa.getEventBus().A03(a12, o72, abstractC1380On, nq, abstractC1413Pu, c10059a);
        C9I c9i = new C9I(c1636Yn, j22, sa, abstractC1739b5.A12());
        this.A0a = c9i;
        A0V();
        sa.setVideoURI(c09416c.A0S(super.A05.A0x().A0D().A08()));
        A0S();
        A0P();
        A0O();
        OA.A00(c1636Yn, this, abstractC1739b5.A0x().A0D().A07());
        setupLayoutConfiguration(false);
        A0U();
        A0T();
        postDelayed(new C1495Sy(this), 1000L);
        if (C1225Ih.A1W(c1636Yn)) {
            c1636Yn.A0A().AGv(sa, super.A05.A12(), true);
        }
        if (C1225Ih.A1X(c1636Yn)) {
            this.A0Y = new SF(c1636Yn, j22, sa, super.A05.A12(), c9i, null);
        } else {
            this.A0Y = null;
        }
        A0Z(abstractC1739b5.A0x());
    }

    public static /* synthetic */ float A06(C1494Sx c1494Sx, float f9) {
        float f10 = c1494Sx.A01 + f9;
        c1494Sx.A01 = f10;
        return f10;
    }

    public static /* synthetic */ int A08(C1494Sx c1494Sx) {
        int i9 = c1494Sx.A02;
        c1494Sx.A02 = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int A0A(C1494Sx c1494Sx) {
        int i9 = c1494Sx.A07;
        c1494Sx.A07 = i9 + 1;
        return i9;
    }

    private void A0N() {
        int i9;
        AbstractC1303Lo.A0J(this.A0B);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0B = linearLayout;
        AbstractC1303Lo.A0R(linearLayout, this.A0U);
        if (this.A0J) {
            int i10 = this.A04;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "eARj3wLLoGbDJmJ7QaGG8";
            strArr2[2] = "iGp5YEz0aP";
            i9 = i10 / 4;
        } else {
            i9 = this.A04 / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i9);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0O() {
        this.A0i.A06(-1, A0o);
        KP kp = this.A0i;
        int i9 = A0t;
        kp.setPadding(i9, i9, i9, i9);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0s);
        layoutParams.addRule(12);
        addView(this.A0i, layoutParams);
    }

    private void A0P() {
        C1285Kw c1285Kw = this.A0h;
        int i9 = A0q;
        c1285Kw.setPadding(i9, i9, i9, i9);
        int i10 = A0r;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.setMargins(0, MB.A00, A0p, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0Z, videoViewParams);
        addView(this.A0h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q() {
        if (super.A05.A0l() && this.A0L) {
            this.A0L = false;
            A0i(A0M(36, 18, 114));
        }
    }

    private void A0R() {
        if (super.A05.A0l()) {
            boolean z8 = this.A0L;
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A0l[1] = "kkPn6UZbIf4yuCbsGSZ";
            if (z8) {
                this.A0L = false;
                Map<String, String> A05 = new C1349Ni().A03(null).A02(null).A05();
                A05.put(A0M(0, 12, 81), A0M(36, 18, 114));
                super.A07.A9W(super.A05.A12(), A05);
            }
        }
    }

    private void A0S() {
        postDelayed(new T0(this), C1225Ih.A0L(this.A0U));
    }

    private void A0T() {
        AbstractC1303Lo.A0J(this.A0A);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0A = linearLayout;
        linearLayout.setOrientation(1);
        AbstractC1303Lo.A0K(this.A0A);
        A0W();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0U() {
        View view = this.A0Z;
        if (super.A05.A0l()) {
            view.setOnClickListener(new ViewOnClickListenerC1394Pb(this));
        }
        AbstractC1303Lo.A0J(view);
        AbstractC1303Lo.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        TextView textView = new TextView(this.A0U);
        this.A0C = textView;
        AbstractC1303Lo.A0K(textView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A05(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i9 = A0n;
        layoutParams.setMargins(i9, i9 / 2, i9, A0s);
        View mMediaView = this.A0C;
        addView(mMediaView, layoutParams);
        View mMediaView2 = this.A0C;
        AbstractC1303Lo.A0K(mMediaView2);
        C1381Oo c1381Oo = new C1381Oo(this.A0U, super.A05, super.A07, super.A09, super.A0B, super.A08, getColors(), new T3(this));
        this.A0H = c1381Oo;
        AbstractC1303Lo.A0G(1001, c1381Oo);
        View mMediaView3 = this.A0H;
        addView(mMediaView3);
        A0X();
        A0N();
        if (C1225Ih.A0y(this.A0U)) {
            this.A0B.setOnClickListener(new PT(this));
            View mMediaView4 = this.A0W;
            if (mMediaView4 != null) {
                this.A0W.setCTAClickListener(new PU(this));
            }
        }
    }

    private void A0V() {
        this.A0Z.A0c(this.A0i);
        this.A0Z.A0c(this.A0h);
        if (!TextUtils.isEmpty(super.A05.A0x().A0D().A07())) {
            C7R c7r = new C7R(this.A0U);
            this.A0Z.A0c(c7r);
            c7r.setImage(super.A05.A0x().A0D().A07());
        }
        this.A0Z.A0c(new C7H(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            int i9 = this.A05;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            A0l[5] = "KzfN";
            layoutParams.setMargins(0, i9 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        this.A0A.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0X() {
        int i9;
        if (this.A0J) {
            i9 = this.A04 / 4;
        } else {
            int i10 = this.A04;
            String[] strArr = A0l;
            if (strArr[7].charAt(25) != strArr[0].charAt(25)) {
                throw new RuntimeException();
            }
            A0l[5] = "tQDw";
            i9 = i10 / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i9);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Z(C1G c1g) {
        double A00 = OI.A00(c1g);
        String A05 = c1g.A0E().A05();
        if (A05 == null || A05.trim().length() == 0) {
            AbstractC1303Lo.A0N(this.A0B, 8);
            if (C1225Ih.A0y(this.A0U)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(A05);
            if (C1225Ih.A0y(this.A0U)) {
                this.A0B.setClickable(true);
            }
        }
        if (A00 > 0.0d) {
            this.A03 = (int) (this.A06 / A00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(AnonymousClass93 anonymousClass93) {
        if (this.A0Z.getState() == RB.A02 && C1225Ih.A1D(this.A0U)) {
            postDelayed(new C1496Sz(this, anonymousClass93), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        U1 u12;
        AbstractC1303Lo.A0J(this.A0G);
        T2 t22 = new T2(this);
        if (this.A0U.A0D() == null) {
            this.A0U.A0E().A8e();
        }
        if (AbstractC1226Ii.A02(this.A0U) || this.A0U.A0D() == null) {
            u12 = new U1(this.A0U, t22);
        } else {
            C1636Yn c1636Yn = this.A0U;
            u12 = new U1(c1636Yn, c1636Yn.A0D(), t22);
        }
        this.A0G = u12;
        u12.setOnTouchListener(new PV(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0i(String str) {
        Map<String, String> A05 = new C1349Ni().A03(null).A02(null).A05();
        A05.put(A0M(0, 12, 81), str);
        this.A0V.A04(J9.A0J, A05);
        super.A09.A43(super.A05.A0L());
        super.A07.A9j(super.A05.A12(), A05);
        if (C1225Ih.A20(this.A0U)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1769bZ.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1769bZ.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1769bZ.A05, Boolean.TRUE.toString());
            super.A07.A9s(super.A05.A12(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0j(String str) {
        if (super.A05.A0u() > 0) {
            if (super.A05.A19() && this.A0M) {
                return;
            }
            this.A0M = true;
            A0i(str);
            return;
        }
        if (super.A05.A0k()) {
            A0Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0k(boolean z8) {
        this.A0K = z8;
        ObjectAnimator objectAnimator = null;
        if (!z8) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String A0M = A0M(60, 1, 101);
        if (z8) {
            C1381Oo c1381Oo = this.A0H;
            objectAnimator = ObjectAnimator.ofFloat(c1381Oo, A0M, c1381Oo.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i9 = this.A05;
        if (z8) {
            i9 /= 5;
        }
        fArr[1] = i9;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0M, fArr);
        ofFloat.setDuration(500L);
        SA sa = this.A0Z;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(sa, A0M, sa.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int[] iArr = new int[2];
        iArr[0] = this.A0Z.getHeight();
        int i10 = this.A05;
        if (z8) {
            i10 /= 5;
        }
        iArr[1] = i10;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new PX(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.addListener(new PY(this, z8));
        animatorSet.start();
    }

    private void A0l(boolean z8) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z8);
        AbstractC1303Lo.A0J(this.A0Z);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0T();
        }
        this.A0Z.setTranslationY(0.0f);
        addView(this.A0Z, 1, layoutParams);
        A0N();
        A0X();
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A0z() {
        A0R();
        if (C1225Ih.A1W(this.A0U)) {
            this.A0U.A0A().AGk(this.A0Z);
        }
        SF sf = this.A0Y;
        if (sf != null) {
            sf.A0C();
        }
        SA sa = this.A0Z;
        if (sa != null) {
            C09978r<AbstractC09988s, C09968q> eventBus = sa.getEventBus();
            AbstractC09988s[] abstractC09988sArr = new AbstractC09988s[6];
            abstractC09988sArr[0] = this.A0f;
            abstractC09988sArr[1] = this.A0e;
            abstractC09988sArr[2] = this.A0d;
            NQ nq = this.A0g;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            A0l[5] = "F6CS";
            abstractC09988sArr[3] = nq;
            abstractC09988sArr[4] = this.A0b;
            abstractC09988sArr[5] = this.A0c;
            eventBus.A04(abstractC09988sArr);
            AbstractC1303Lo.A0H(this.A0Z);
            this.A0Z.A0V();
        }
        this.A0a.A0i();
        AbstractC1303Lo.A0a(this.A0Z, this.A0i, this.A0h);
        super.A0B.A0V();
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A10() {
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A11() {
        this.A0Z.setVolume(super.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0Z.A0b(QM.A02, 20);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A12(boolean z8) {
        if (this.A0Z.A0i()) {
            return;
        }
        this.A0I = this.A0Z.getVideoStartReason();
        this.A0R = z8;
        this.A0Z.A0e(false, 13);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A13(boolean z8) {
        QM qm;
        if (this.A0Z.getState() == RB.A06 || (qm = this.A0I) == null) {
            return;
        }
        if (!this.A0R || z8) {
            this.A0Z.A0b(qm, 19);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A14() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A15() {
        return false;
    }

    public C1P getColors() {
        return this.A0D;
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
        super.onConfigurationChanged(configuration);
        A0l(A0m());
        setupLayoutConfiguration(A0m());
        A0W();
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

    private void setUpBrowserControls(U1 u12) {
        AbstractC1303Lo.A0J(this.A0E);
        NJ nj = new NJ(this.A0U, u12);
        this.A0E = nj;
        u12.setBrowserNavigationListener(nj.getBrowserNavigationListener());
        AbstractC1303Lo.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new T1(this));
        this.A0E.setOnTouchListener(new PW(this));
        this.A0A.addView(this.A0E, layoutParams);
        AbstractC1303Lo.A0J(this.A0F);
        this.A0F = new NK(this.A0U, null, R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z8) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z8;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0U.getSystemService(A0M(54, 6, 90));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        Integer num = (Integer) Display.class.getMethod(A0M(12, 12, 40), new Class[0]).invoke(defaultDisplay, new Object[0]);
                        point.y = num != null ? num.intValue() : 0;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
