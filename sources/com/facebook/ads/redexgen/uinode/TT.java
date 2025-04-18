package com.facebook.ads.redexgen.uinode;

import android.R;
import android.animation.Animator;
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
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class TT extends OL {
    public static byte[] A0k;
    public static String[] A0l = {"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Handler A09;
    public View A0A;
    public InputMethodManager A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public RelativeLayout A0E;
    public TextView A0F;
    public AbstractC1173b5 A0G;
    public NJ A0H;
    public NK A0I;
    public U1 A0J;
    public ViewOnClickListenerC0942Tl A0K;
    public OP A0L;
    public C0815Oo A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Handler A0a;
    public final View A0b;
    public final AbstractC02270h A0c;
    public final JA A0d;
    public final O0 A0e;
    public final O1 A0f;
    public final KP A0g;
    public final Runnable A0h;
    public final Runnable A0i;
    public final Set<String> A0j;

    public static String A0J(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0k, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A0X() {
        A0k = new byte[]{125, 10, 5, 0, 10, 2, 54, Ascii.SUB, 6, Ascii.FS, Ascii.ESC, 10, Ascii.FF, Ascii.VT, 9, Ascii.CAN, 62, Ascii.CR, Ascii.ESC, 36, 9, 5, Ascii.VT, 4, Ascii.CAN, 108, 107, 117, 112, 113, 90, 104, 96, 113, 109, 106, 97, Ascii.CR, Ascii.VT, Ascii.GS, 10, Ascii.ESC, Ascii.DC4, 17, Ascii.ESC, 19, 39, Ascii.RS, 17, Ascii.DC4, Ascii.FF, Ascii.GS, 10, Ascii.GS, Ascii.FS, 102, 120, Byte.MAX_VALUE, 117, 126, 102, 2, Ascii.ESC, Ascii.FS, 42, Ascii.SYN, 1, Ascii.DC4, 42, Ascii.ETB, 0, 1, 1, Ascii.SUB, Ascii.ESC, Byte.MAX_VALUE, 102, 97, 87, Byte.MAX_VALUE, 109, 106, 87, 97, 102, 123, 124, 105, 100, 100, 87, 106, 125, 124, 124, 103, 102, 10};
    }

    static {
        A0X();
        A0p = (int) (LD.A02 * 26.0f);
        A0m = (int) (LD.A02 * 4.0f);
        A0r = (int) (LD.A02 * 8.0f);
        A0n = (int) (LD.A02 * 24.0f);
        A0o = AbstractC02862p.A01(-1, 77);
        A0q = (int) (LD.A02 * 12.0f);
    }

    public TT(OP op) {
        super(op, true);
        this.A0X = false;
        this.A02 = -1;
        this.A0Y = false;
        this.A03 = 0;
        this.A0N = false;
        this.A0U = false;
        this.A0W = false;
        this.A0V = false;
        this.A0Z = false;
        this.A0R = false;
        this.A0T = false;
        this.A0S = false;
        this.A0Q = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0i = new RunnableC0807Og(this);
        this.A0P = false;
        this.A0j = new HashSet();
        this.A0a = new Handler(Looper.getMainLooper());
        this.A0h = new Runnable() { // from class: com.facebook.ads.redexgen.X.Ob
            @Override // java.lang.Runnable
            public final void run() {
                TT.this.A16();
            }
        };
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0B = (InputMethodManager) op.A05().getSystemService(A0J(25, 12, 127));
        this.A0L = op;
        this.A0G = op.A04();
        this.A0d = new JA(op.A04().A12(), op.A06());
        KP A0A = this.A0L.A0A();
        this.A0g = A0A;
        if (A0A != null) {
            AbstractC0737Lo.A0K(A0A);
        }
        View A03 = this.A0L.A03();
        this.A0b = A03;
        this.A0c = C02280i.A01(op.A05(), op.A06(), op.A04().A12(), AbstractC0721Ky.A00(op.A04().A0x().A0F().A05()), new HashMap(), false, true, this.A0G.A0y());
        OA.A00(op.A05(), this, op.A04().A0x().A0D().A07());
        setupLayoutConfiguration(false);
        A0T();
        A0P();
        postDelayed(new TW(this), 1000L);
        A0W();
        TV tv = new TV(this);
        this.A0e = tv;
        SA sa2 = this.A0L.A02() instanceof SA ? (SA) this.A0L.A02() : null;
        this.A0f = new O1(op, this.A0G, sa2, this.A0L.A09(), tv, this.A0F, this.A0M, A0A, A03);
        if (sa2 != null && C0659Ih.A18(getAdContextWrapper())) {
            AbstractC0786Nl.A00(sa2.getVideoImplView(), C0659Ih.A19(getAdContextWrapper()), new ViewOnClickListenerC0808Oh(this));
        } else if (sa2 == null && this.A0A != null && C0659Ih.A16(getAdContextWrapper())) {
            AbstractC0786Nl.A00(this.A0A, C0659Ih.A17(getAdContextWrapper()), new ViewOnClickListenerC0809Oi(this));
        }
        this.A0E = null;
        this.A0K = null;
    }

    public TT(OP op, boolean z10) {
        this(op);
        this.A0X = z10;
        AbstractC1173b5 A04 = op.A04();
        this.A0Y = this.A0X && A04.A0o();
        if (this.A0X) {
            int A0E = A04.A0E();
            this.A02 = A0E;
            if (A0E == 0) {
                A16();
            } else if (A0E > 0 && A0E <= 10000) {
                this.A0a.postDelayed(this.A0h, A0E);
            }
            String A0U = A04.A0U();
            if (!TextUtils.isEmpty(A0U)) {
                for (String stringToCheck : A0U.split(A0J(0, 1, 39))) {
                    this.A0j.add(stringToCheck);
                }
            }
        }
    }

    public static /* synthetic */ int A03(TT tt) {
        int i10 = tt.A01;
        tt.A01 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A05(TT tt) {
        int i10 = tt.A08;
        tt.A08 = i10 + 1;
        return i10;
    }

    private void A0K() {
        AbstractC0737Lo.A0J(this.A0D);
        LinearLayout linearLayout = new LinearLayout(this.A0L.A05());
        this.A0D = linearLayout;
        AbstractC0737Lo.A0R(linearLayout, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0D.setLayoutParams(layoutParams);
        addView(this.A0D, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public void A16() {
        A0d(((C0583Ff) this.A0c).A0G().toString());
        A0g(true);
    }

    private void A0M() {
        ExecutorC0731Li.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.Oa
            @Override // java.lang.Runnable
            public final void run() {
                TT.this.A15();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A0l() && this.A0P) {
            this.A0P = false;
            A0e(A0J(37, 18, 2));
        }
    }

    private void A0O() {
        if (this.A0G.A0l() && this.A0P) {
            this.A0P = false;
            Map<String, String> A05 = new C0783Ni().A03(null).A02(null).A05();
            A05.put(A0J(1, 12, 19), A0J(37, 18, 2));
            getAdEventManager().A9W(this.A0G.A12(), A05);
        }
    }

    private void A0P() {
        AbstractC0737Lo.A0J(this.A0C);
        LinearLayout linearLayout = new LinearLayout(this.A0L.A05());
        this.A0C = linearLayout;
        linearLayout.setOrientation(1);
        AbstractC0737Lo.A0K(this.A0C);
        A0U();
        this.A0C.setBackgroundColor(-1);
        addView(this.A0C);
    }

    private void A0Q() {
        View view = this.A0b;
        if (view != null) {
            AbstractC0737Lo.A0J(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(OL.A08, OL.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(OL.A07, this.A07, OL.A07, OL.A07);
            addView(this.A0b, layoutParams);
        }
    }

    private void A0R() {
        KP kp = this.A0g;
        if (kp != null) {
            AbstractC0737Lo.A0J(kp);
            KP kp2 = this.A0g;
            int i10 = A0q;
            kp2.setPadding(i10, i10, i10, i10);
            this.A0g.A06(-1, A0o);
            this.A0g.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0p);
            layoutParams.addRule(12);
            addView(this.A0g, layoutParams);
        }
    }

    private void A0S() {
        MB A08 = this.A0L.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A0O || A08.A07()) ? false : true);
    }

    private void A0T() {
        this.A0A = this.A0L.A02();
        if (this.A0G.A0l()) {
            this.A0A.setOnClickListener(new ViewOnClickListenerC0810Oj(this));
        }
        AbstractC0737Lo.A0J(this.A0A);
        AbstractC0737Lo.A0K(this.A0A);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A0A, 1, layoutParams);
        TextView textView = new TextView(this.A0L.A05());
        this.A0F = textView;
        AbstractC0737Lo.A0K(textView);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(getColors().A05(true));
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i10 = A0r;
        layoutParams2.setMargins(i10, i10 / 2, i10, this.A0g == null ? i10 : A0p);
        addView(this.A0F, layoutParams2);
        AbstractC0737Lo.A0K(this.A0F);
        C0815Oo c0815Oo = new C0815Oo(this.A0L.A05(), this.A0L.A04(), this.A0L.A06(), this.A0L.A09(), this.A0L.A0B(), this.A0L.A07(), getColors(), new TU(this));
        this.A0M = c0815Oo;
        c0815Oo.setAutoClickTime(this.A0L.A04(), this.A0L.A08());
        AbstractC0737Lo.A0G(1001, this.A0M);
        addView(this.A0M);
        A0V();
        A0K();
        if (C0659Ih.A0y(this.A0L.A05())) {
            this.A0D.setOnClickListener(new ViewOnClickListenerC0811Ok(this));
            if (this.A0L.A08() != null) {
                this.A0L.A08().setCTAClickListener(new ViewOnClickListenerC0812Ol(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (A19()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0l;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            this.A0C.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        this.A0C.setTranslationY(0.0f);
        this.A0C.setLayoutParams(layoutParams);
    }

    private void A0V() {
        C1P A00;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0F.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0M.setLayoutParams(layoutParams);
        if (this.A0Y && this.A0K != null) {
            boolean z10 = this.A0N;
            if (A0l[5].charAt(10) == 'N') {
                throw new RuntimeException();
            }
            A0l[2] = "dOHlU7mObztTib9yLp7cTgFqT8sjFKca";
            RelativeLayout.LayoutParams installButtonLayoutParams = new RelativeLayout.LayoutParams(z10 ? -2 : -1, -2);
            installButtonLayoutParams.addRule(12);
            installButtonLayoutParams.addRule(14);
            int i10 = A0n;
            installButtonLayoutParams.setMargins(i10, 0, i10, i10);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                A00 = this.A0L.A04().A0w().A01();
            } else {
                A00 = this.A0L.A04().A0w().A00();
            }
            this.A0K.setUpButtonColors(A00);
            if (this.A0N) {
                this.A0K.setPadding(i10, 0, i10, 0);
            }
            this.A0K.setLayoutParams(installButtonLayoutParams);
        }
    }

    private void A0W() {
        A0R();
        A0Q();
        A0S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(String str) {
        U1 u12;
        C1P A00;
        C1P A002;
        if (this.A0Y) {
            AbstractC0737Lo.A0J(this.A0E);
            AbstractC0737Lo.A0J(this.A0K);
        }
        AbstractC0737Lo.A0J(this.A0J);
        TY ty = new TY(this);
        if (this.A0L.A05().A0D() == null) {
            this.A0L.A05().A0E().A8e();
        }
        if (!AbstractC0660Ii.A02(this.A0L.A05()) && this.A0L.A05().A0D() != null) {
            u12 = new U1(this.A0L.A05(), this.A0L.A05().A0D(), ty);
        } else {
            u12 = new U1(this.A0L.A05(), ty);
        }
        this.A0J = u12;
        if (this.A0X) {
            u12.setInterceptRedirectRequest(new NR() { // from class: com.facebook.ads.redexgen.X.Tb
                @Override // com.facebook.ads.redexgen.uinode.NR
                public final boolean A9D(String str2) {
                    return TT.this.A1A(str2);
                }
            });
        }
        if (this.A0G.A0n() && Build.VERSION.SDK_INT > 16) {
            this.A0J.addJavascriptInterface(new OC(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TT.this.A17(view);
                }
            }, this.A0J, new OB() { // from class: com.facebook.ads.redexgen.X.Ta
                @Override // com.facebook.ads.redexgen.uinode.OB
                public final void AB5() {
                    TT.this.A13();
                }
            }), OC.A01());
        }
        this.A0J.setOnTouchListener(new ViewOnTouchListenerC0804Od(this));
        setUpBrowserControls(this.A0J);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        if (this.A0Y || this.A0G.A0n()) {
            C1070Yn A05 = this.A0L.A05();
            String A0L = this.A0L.A04().A0L();
            if (this.A0L.A00() == 1) {
                A00 = this.A0L.A04().A0w().A01();
            } else {
                A00 = this.A0L.A04().A0w().A00();
            }
            ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl = new ViewOnClickListenerC0942Tl(A05, A0L, A00, this.A0L.A04().A0x().A0F().A06(), this.A0L.A06(), this.A0L.A09(), this.A0L.A0B(), this.A0L.A07(), this.A0L.A04().A0y());
            this.A0K = viewOnClickListenerC0942Tl;
            viewOnClickListenerC0942Tl.setCta(this.A0L.A04().A0x().A0F(), this.A0L.A04().A12(), new HashMap());
        }
        if (!this.A0Y || this.A0K == null) {
            this.A0C.addView(this.A0J, layoutParams);
        } else {
            this.A0E = new RelativeLayout(getContext());
            this.A0E.addView(this.A0J, new RelativeLayout.LayoutParams(-1, -1));
            AbstractC0737Lo.A0K(this.A0K);
            this.A0K.setRoundedCornersEnabled(A00());
            this.A0K.setViewShowsOverMedia(A0D());
            if (getContext().getResources().getConfiguration().orientation == 1) {
                A002 = this.A0L.A04().A0w().A01();
            } else {
                A002 = this.A0L.A04().A0w().A00();
            }
            this.A0K.setUpButtonColors(A002);
            if (this.A0N) {
                ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl2 = this.A0K;
                int i10 = A0n;
                viewOnClickListenerC0942Tl2.setPadding(i10, 0, i10, 0);
            }
            this.A0K.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TT.this.A18(view);
                }
            });
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0N ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            int i11 = A0n;
            layoutParams2.setMargins(i11, 0, i11, i11);
            this.A0E.addView(this.A0K, layoutParams2);
            this.A0C.addView(this.A0E, layoutParams);
        }
        this.A0J.loadUrl(str);
    }

    private void A0e(String str) {
        Map<String, String> A05 = new C0783Ni().A03(null).A02(null).A05();
        A05.put(A0J(1, 12, 19), str);
        this.A0d.A04(J9.A0J, A05);
        this.A0L.A09().A43(this.A0G.A0L());
        getAdEventManager().A9j(this.A0G.A12(), A05);
        if (C0659Ih.A20(this.A0L.A05())) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1203bZ.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1203bZ.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1203bZ.A05, Boolean.TRUE.toString());
            getAdEventManager().A9s(this.A0G.A12(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(String str) {
        if (this.A0G.A0u() > 0) {
            if (this.A0G.A19() && this.A0Q) {
                return;
            }
            this.A0Q = true;
            A0e(str);
            return;
        }
        if (this.A0G.A0k()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(boolean z10) {
        this.A0O = z10;
        if (this.A0X && z10) {
            this.A0a.removeCallbacks(this.A0h);
        }
        ObjectAnimator objectAnimator = null;
        if (!z10) {
            this.A09.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A08 = 0;
            this.A0R = false;
            this.A0S = false;
            this.A0T = false;
            this.A0Q = false;
        }
        postDelayed(new TX(this, z10), 250L);
        String A0J = A0J(97, 1, 9);
        if (z10) {
            C0815Oo c0815Oo = this.A0M;
            objectAnimator = ObjectAnimator.ofFloat(c0815Oo, A0J, c0815Oo.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0C;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        fArr[1] = i10;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0J, fArr);
        ofFloat.setDuration(500L);
        View view = this.A0A;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(view, A0J, view.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int[] iArr = new int[2];
        iArr[0] = this.A0A.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        iArr[1] = i11;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new C0805Oe(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            Animator[] animatorArr = {objectAnimator};
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[6] = "3HcTndNMKO02itZ1YB9OuMlfPHE";
            strArr2[1] = "rUq8gYLqYGWwvrPw2H7I5hxcdAd";
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.addListener(new C0806Of(this, z10));
        animatorSet.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        if (r6.getConfiguration().orientation == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if ((r7.A0A instanceof com.facebook.ads.redexgen.uinode.SA) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        r4 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (r6.getConfiguration().orientation == 2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0h(boolean r8) {
        /*
            r7 = this;
            r7.setupLayoutConfiguration(r8)
            android.view.View r0 = r7.A0A
            com.facebook.ads.redexgen.uinode.AbstractC0737Lo.A0J(r0)
            android.view.View r0 = r7.A0A
            if (r0 != 0) goto L17
            com.facebook.ads.redexgen.X.OP r0 = r7.A0L
            android.view.View r0 = r0.A02()
            r7.A0A = r0
            com.facebook.ads.redexgen.uinode.AbstractC0737Lo.A0K(r0)
        L17:
            boolean r4 = r7.A0O
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb5
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            java.lang.String r1 = "FZuJEB1DgE"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "ioAK5D"
            r0 = 4
            r2[r0] = r1
            r3 = -1
            if (r4 == 0) goto L60
            int r0 = r7.A05
            int r0 = r0 / 5
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r3, r0)
            r0 = 14
            r4.addRule(r0)
            r0 = 10
            r4.addRule(r0)
        L4d:
            android.view.View r1 = r7.A0A
            r0 = 0
            r1.setTranslationY(r0)
            android.view.View r1 = r7.A0A
            r0 = 1
            r7.addView(r1, r0, r4)
            r7.A0K()
            r7.A0V()
            return
        L60:
            r5 = -2
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r3, r5)
            com.facebook.ads.redexgen.X.Yn r0 = r7.getAdContextWrapper()
            boolean r0 = com.facebook.ads.redexgen.uinode.C0659Ih.A16(r0)
            if (r0 == 0) goto La2
            android.content.res.Resources r6 = r7.getResources()
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.TT.A0l
            r0 = 2
            r1 = r1[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 == r0) goto Lab
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            java.lang.String r1 = "pPe40HbQyCL07tY4s4c8j3Lf22g"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "FpZU0oL4KOaHbXLVjTxOhAl2PJv"
            r0 = 1
            r2[r0] = r1
            android.content.res.Configuration r0 = r6.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto La2
        L97:
            android.view.View r0 = r7.A0A
            boolean r0 = r0 instanceof com.facebook.ads.redexgen.uinode.SA
            if (r0 != 0) goto La2
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r5, r3)
        La2:
            r0 = 13
            r4.addRule(r0)
            r7.A0P()
            goto L4d
        Lab:
            android.content.res.Configuration r0 = r6.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto La2
            goto L97
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.TT.A0h(boolean):void");
    }

    private boolean A0i() {
        if (this.A0G.A0x().A0D().A0A()) {
            boolean z10 = this.A0V;
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[7] = "WvW0Ef6T7c";
            strArr2[4] = "9KXIlI";
            if (z10 && !this.A0Z && !this.A0W) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0v() {
        if (this.A0X) {
            this.A0a.removeCallbacks(this.A0h);
        }
        A0O();
        super.A0v();
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0w() {
        MB A08 = this.A0L.A08();
        if (A08 != null) {
            A08.setPageDetailsVisible((A19() || A08.A07()) ? false : true);
        }
        this.A0V = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0x() {
        if (this.A0L.A08() != null) {
            MB A08 = this.A0L.A08();
            String[] strArr = A0l;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            A08.setPageDetailsVisible(false);
        }
        this.A0V = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0y() {
        this.A0W = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final void A0z() {
        this.A0W = this.A0G.A0x().A0D().A03() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.facebook.ads.redexgen.uinode.OL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A10(com.facebook.ads.redexgen.uinode.C1G r6, java.lang.String r7, double r8, android.os.Bundle r10) {
        /*
            r5 = this;
            super.A10(r6, r7, r8, r10)
            com.facebook.ads.redexgen.X.1N r0 = r6.A0E()
            java.lang.String r1 = r0.A05()
            if (r1 == 0) goto L17
            java.lang.String r0 = r1.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L57
        L17:
            android.widget.LinearLayout r1 = r5.A0D
            r0 = 8
            com.facebook.ads.redexgen.uinode.AbstractC0737Lo.A0N(r1, r0)
            com.facebook.ads.redexgen.X.OP r0 = r5.A0L
            com.facebook.ads.redexgen.X.Yn r0 = r0.A05()
            boolean r0 = com.facebook.ads.redexgen.uinode.C0659Ih.A0y(r0)
            if (r0 == 0) goto L30
            android.widget.LinearLayout r1 = r5.A0D
            r0 = 0
            r1.setClickable(r0)
        L30:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3d
            int r0 = r5.A06
            double r1 = (double) r0
            double r1 = r1 / r8
            int r0 = (int) r1
            r5.A03 = r0
        L3d:
            boolean r3 = r5.A0N
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            r0 = 6
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L93
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L57:
            android.widget.TextView r0 = r5.A0F
            r0.setText(r1)
            com.facebook.ads.redexgen.X.OP r0 = r5.A0L
            com.facebook.ads.redexgen.X.Yn r0 = r0.A05()
            boolean r0 = com.facebook.ads.redexgen.uinode.C0659Ih.A0y(r0)
            if (r0 == 0) goto L30
            android.widget.LinearLayout r4 = r5.A0D
            r3 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            java.lang.String r1 = "Tti1ERh3982vMPWOgwyCGNbTUdK6PILe"
            r0 = 2
            r2[r0] = r1
            r4.setClickable(r3)
            goto L30
        L88:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            java.lang.String r1 = "fnWnWSkw0ES4UX172ZpEF9XfJQ6oKenC"
            r0 = 2
            r2[r0] = r1
            r4.setClickable(r3)
            goto L30
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.TT.A0l
            java.lang.String r1 = "7Lq3s7aOnX5NGbRVe2GBF9HLZ2EE6fpE"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto La1
            int r0 = r5.A04
        L9e:
            r5.A03 = r0
            return
        La1:
            int r0 = r5.A03
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.TT.A10(com.facebook.ads.redexgen.X.1G, java.lang.String, double, android.os.Bundle):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A11() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public final boolean A12(boolean z10) {
        if (A19()) {
            A0g(false);
            return true;
        }
        if (!A0i()) {
            return false;
        }
        this.A0f.A07(this);
        return true;
    }

    public final /* synthetic */ void A13() {
        this.A0L.A05().A0E().AAD();
    }

    public final /* synthetic */ void A14() {
        if (this.A0K != null) {
            this.A0L.A05().A0E().AAC();
            this.A0K.A09(A0J(61, 14, 15));
        }
    }

    public final /* synthetic */ void A15() {
        if (this.A0K != null) {
            this.A0L.A05().A0E().AAG();
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "tCgjPTcwsN2cZ99v";
            strArr2[0] = "Ilqrg";
            this.A0K.A09(A0J(75, 22, 114));
        }
    }

    public final /* synthetic */ void A17(View view) {
        A0M();
    }

    public final /* synthetic */ void A18(View view) {
        ExecutorC0731Li.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.OX
            @Override // java.lang.Runnable
            public final void run() {
                TT.this.A14();
            }
        });
    }

    public final boolean A19() {
        return this.A0O;
    }

    public final /* synthetic */ boolean A1A(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.A0j.isEmpty()) {
            return true;
        }
        Iterator<String> it = this.A0j.iterator();
        while (it.hasNext()) {
            boolean contains = str.contains(it.next());
            if (A0l[2].charAt(2) == 'l') {
                throw new RuntimeException();
            }
            A0l[5] = "Sf20Awxc2HRh1lAKHxXJmSVrTf5ojylw";
            if (!contains) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL
    public int getCloseButtonStyle() {
        if (A19()) {
            return 3;
        }
        if (this.A0W) {
            return 2;
        }
        if (this.A0G.A0x().A0D().A0A()) {
            return 1;
        }
        if (!this.A0V) {
            return super.getCloseButtonStyle();
        }
        if (A0l[5].charAt(10) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0l;
        strArr[6] = "NhzVRhgvHrOwM64xV2PIAOEbNcq";
        strArr[1] = "xEzMNY3CkayGfsMDFyAKLsf22gx";
        return 4;
    }

    @Override // com.facebook.ads.redexgen.uinode.OL, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0h(A19());
        A0W();
        setupLayoutConfiguration(A19());
        A0U();
    }

    private void setUpBrowserControls(U1 u12) {
        AbstractC0737Lo.A0J(this.A0H);
        NJ nj = new NJ(this.A0L.A05(), u12, true);
        this.A0H = nj;
        u12.setBrowserNavigationListener(nj.getBrowserNavigationListener());
        AbstractC0737Lo.A0K(this.A0H);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0H.setListener(new TZ(this));
        this.A0H.setOnTouchListener(new ViewOnTouchListenerC0803Oc(this));
        this.A0C.addView(this.A0H, layoutParams);
        AbstractC0737Lo.A0J(this.A0I);
        this.A0I = new NK(this.A0L.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A0C.addView(this.A0I, new LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0N = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0L.A08() == null ? 0 : this.A0L.A08().getToolbarHeight();
        this.A0O = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0J(55, 6, 107));
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
                        Integer num = (Integer) Display.class.getMethod(A0J(13, 12, 22), new Class[0]).invoke(defaultDisplay, new Object[0]);
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
