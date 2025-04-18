package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0705Mm extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0E;
    public boolean A00;
    public final C1192cI A01;
    public final C1045Zs A02;
    public final J7 A03;
    public final JF A04;
    public final C0688Lv A05;
    public final VO A06;
    public final AbstractC0699Mg A07;
    public final AbstractC0832Rj A08;
    public final C0833Rk A09;
    public final String A0A;
    public final WeakReference<InterfaceC0704Ml> A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C0705Mm(C1045Zs c1045Zs, J7 j7, C03226f c03226f, WeakReference<InterfaceC0704Ml> weakReference, int i2, int i3, int i4, int i5, C1192cI c1192cI, String str) {
        super(c1045Zs);
        this.A05 = new C0688Lv();
        this.A02 = c1045Zs;
        this.A03 = j7;
        this.A01 = c1192cI;
        this.A0B = weakReference;
        this.A0A = str;
        AbstractC1187cD A0C2 = this.A01.A0C();
        if (A0C2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        M3.A0M(this, -1);
        this.A04 = new JF(this.A01.A6r(), this.A03);
        this.A08 = A06();
        this.A09 = A07(i2, i5, i3, i4);
        LinearLayout linearLayout = new LinearLayout(c1045Zs);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A07 = A04(c03226f);
        if (this.A07 != null) {
            linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A06 = A02(A0C2);
        linearLayout.addView(this.A06, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = (byte) ((copyOfRange[i5] - i4) - 99);
            if (A0D[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0D[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i5] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0C = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0E = (int) (LP.A02 * 40.0f);
    }

    private VO A02(AbstractC1187cD abstractC1187cD) {
        C1O A00;
        C1F A1P = abstractC1187cD.A1P();
        C0449Br c0449Br = new C0449Br(this);
        if (getOrientation() == 1) {
            A00 = abstractC1187cD.A1O().A01();
        } else {
            C1B A1O = abstractC1187cD.A1O();
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0D[7] = "bY8FFe1Y";
            A00 = A1O.A00();
        }
        VO vo = new VO(this.A02, A0E, A00, A1P.A0G().A06(), A09(32, 31, 110), this.A03, c0449Br, this.A09, this.A05, abstractC1187cD.A1Q());
        vo.setInfo(A1P.A0F(), A1P.A0G(), this.A01.A6r(), abstractC1187cD.A1S().A01(), null, null);
        if (C0608Im.A1G(this.A02)) {
            vo.A0C();
        }
        return vo;
    }

    private AbstractC0699Mg A04(C03226f c03226f) {
        ViewOnClickListenerC0702Mj viewOnClickListenerC0702Mj = new ViewOnClickListenerC0702Mj(this);
        String A0b = this.A01.A0b();
        if (A0H(c03226f, this.A01) && A0b != null) {
            VJ vj = new VJ(this.A02, this.A03, c03226f, this.A04, viewOnClickListenerC0702Mj);
            String A6r = this.A01.A6r();
            String videoUrl = this.A01.A0E() != null ? this.A01.A0E().getUrl() : null;
            VJ videoView = vj.A0F(A6r, A0b, videoUrl, this.A01.A0O(), this.A01.A0N());
            if (C0608Im.A1K(this.A02)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        JU A0E2 = this.A01.A0E();
        if (A0E2 == null) {
            return null;
        }
        VM A0F = new VM(this.A02, viewOnClickListenerC0702Mj).A0F(A0E2.getUrl());
        if (C0608Im.A1I(this.A02)) {
            setViewAsCTA(A0F);
        }
        return A0F;
    }

    private VI A06() {
        return new VI(this);
    }

    private C0833Rk A07(int i2, int i3, int i4, int i5) {
        C0833Rk c0833Rk = new C0833Rk(this, i2, i3, true, new WeakReference(this.A08), this.A02);
        c0833Rk.A0W(i4);
        c0833Rk.A0X(i5);
        return c0833Rk;
    }

    private void A0C() {
        String A0J = this.A01.A0J();
        if (!TextUtils.isEmpty(A0J)) {
            L2 l2 = new L2();
            C1045Zs c1045Zs = this.A02;
            Uri A00 = L5.A00(A0J);
            String adChoicesLinkUrl = this.A01.A6r();
            L2.A0M(l2, c1045Zs, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A04.A04(JE.A0A, null);
        if (!C2T.A00(this.A02.A01()).A0O(this.A02, false)) {
            A0C();
            return;
        }
        NE A01 = NF.A01(this.A02, this.A03, this.A01.A6r(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        M3.A0T(this);
        addView(A01, new FrameLayout.LayoutParams(-1, -1));
        A01.A0K();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A09.A0U();
        } else {
            this.A09.A0V();
        }
    }

    public static boolean A0H(C03226f c03226f, C1192cI c1192cI) {
        String A0b = c1192cI.A0b();
        if (TextUtils.isEmpty(A0b) || Build.VERSION.SDK_INT < 14) {
            return false;
        }
        String videoUrl = c03226f.A0S(A0b);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A07 != null) {
            this.A07.A0A();
        }
        if (this.A09 != null) {
            this.A09.A0V();
        }
        M3.A0J(this);
    }

    public final void A0J() {
        if (this.A07 != null) {
            AbstractC0699Mg abstractC0699Mg = this.A07;
            if (A0D[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC0699Mg.A0B();
        }
    }

    private int getOrientation() {
        Activity activity = this.A02.A0D();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C0833Rk getViewabilityChecker() {
        return this.A09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A05.A06(this.A02, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new ViewOnClickListenerC0703Mk(this));
    }
}
