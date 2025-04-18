package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03839a extends AbstractC0891Tq {
    public static byte[] A0T;
    public static String[] A0U = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public JE A01;
    public AbstractC0753Oi A02;
    public QC A03;
    public C0799Qc A04;
    public EnumC0815Qs A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final C5W A0G;
    public final QB A0H;
    public final TC A0I;
    public final T7 A0J;
    public final C9S A0K;
    public final AbstractC0858Sj A0L;
    public final AbstractC0856Sh A0M;
    public final AbstractC0852Sd A0N;
    public final AbstractC0836Rn A0O;
    public final R9 A0P;
    public final R8 A0Q;
    public final C0742Nx A0R;
    public final N5 A0S;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0T, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0T = new byte[]{23, Utf8.REPLACEMENT_BYTE, 41, 47, Utf8.REPLACEMENT_BYTE, 17};
    }

    static {
        A0B();
    }

    public C03839a(C1045Zs c1045Zs, N9 n9, J7 j7, AbstractC1187cD abstractC1187cD, C03226f c03226f, MR mr) {
        super(c1045Zs, n9, j7, abstractC1187cD, c03226f, mr);
        this.A0G = new C0878Td(this);
        this.A0P = new A3(this);
        this.A0O = new AbstractC0836Rn() { // from class: com.facebook.ads.redexgen.X.9i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(SZ sz) {
                C03839a.this.A0E = true;
                C03839a.this.A0V();
            }
        };
        this.A0N = new AbstractC0852Sd() { // from class: com.facebook.ads.redexgen.X.9g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9P c9p) {
            }
        };
        this.A0Q = new R8() { // from class: com.facebook.ads.redexgen.X.9f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9O c9o) {
                AbstractC0753Oi abstractC0753Oi;
                C03839a.this.A0L(c9o);
                C03839a.this.A0K(c9o);
                abstractC0753Oi = C03839a.this.A02;
                abstractC0753Oi.A0E(c9o);
            }
        };
        this.A0L = new AbstractC0858Sj() { // from class: com.facebook.ads.redexgen.X.9d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9R c9r) {
                T7 t7;
                C03839a c03839a = C03839a.this;
                t7 = C03839a.this.A0J;
                c03839a.A0J(c9r, t7.getState() != EnumC0830Rh.A06, false);
            }
        };
        this.A0M = new C03859c(this);
        boolean z2 = false;
        this.A0D = false;
        this.A0E = false;
        this.A0C = false;
        this.A0B = false;
        this.A09 = false;
        this.A00 = 0;
        this.A06 = false;
        this.A08 = false;
        this.A01 = JE.A0a;
        this.A0F = new Handler(Looper.getMainLooper());
        this.A0H = new C0877Tc(this);
        this.A0J = new T7(super.A03);
        this.A0J.setFunnelLoggingHandler(super.A05);
        this.A0J.getEventBus().A03(this.A0P, this.A0O, this.A0N, this.A0Q, this.A0L, this.A0M);
        this.A0A = abstractC1187cD.A1E();
        this.A0K = new C9S(super.A03, super.A04, this.A0J, super.A01.A1U());
        if (C0608Im.A1q(super.A03)) {
            this.A0I = new TC(super.A03, super.A04, this.A0J, super.A01.A1U(), this.A0K, null);
        } else {
            this.A0I = null;
        }
        this.A04 = new C0799Qc(super.A03, super.A09, super.A01.A0m(), mr);
        this.A0R = new C0742Nx(super.A03, super.A05);
        this.A0S = new N5(super.A03);
        if (this.A0A) {
            this.A0S.setVisibility(8);
        }
        A0A();
        this.A0J.setVideoURI(super.A02.A0S(super.A01.A1P().A0E().A08()));
        A08();
        int A03 = super.A01.A1P().A0E().A03();
        if (C0608Im.A2F(super.A03)) {
            this.A0B = A03 == 0;
        } else {
            this.A0B = A03 <= 0;
        }
        if (super.A01.A1P().A0O() && super.A01.A1P().A0E().A02() > 0) {
            z2 = true;
        }
        this.A07 = z2;
        M3.A0M(this, super.A01.A1O().A01().A07(true));
        if (C0608Im.A29(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private int A00(int i2, int i3, int i4) {
        int i5 = 0;
        if (this.A0A) {
            int completedVideoCycleDuration = this.A00;
            i5 = i4 * completedVideoCycleDuration;
        }
        int completedVideoCycleDuration2 = i2 / 1000;
        return (i3 - i5) - completedVideoCycleDuration2;
    }

    private AbstractC0753Oi A02(int i2) {
        C0756Ol A0K = new C0756Ol(super.A03, super.A04, super.A08, super.A01, this.A0J, super.A0A, super.A06).A0F(super.A07.getToolbarHeight()).A0J(super.A07).A0E(i2).A0G(this.A0R).A0K(this.A0S);
        if (super.A01.A1P().A0O() && C0608Im.A1T(super.A03) && super.A01.A1P().A0I() != null) {
            A0K.A0I(getPackageInstallListener());
        }
        return AbstractC0754Oj.A00(A0K.A0M(), null, true);
    }

    private void A07() {
        this.A0J.postDelayed(new C0876Tb(this), C0608Im.A0M(super.A03));
    }

    private void A08() {
        this.A0J.postDelayed(new C0881Tg(this), C0608Im.A0N(super.A03));
    }

    private void A09() {
        this.A0B = true;
        super.A07.A06();
        if (this.A02 != null) {
            this.A02.A0y();
        }
    }

    private void A0A() {
        this.A0J.A0c(this.A0S);
        this.A0J.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A01.A1P().A0E().A07())) {
            C7V c7v = new C7V(super.A03);
            this.A0J.A0c(c7v);
            c7v.setImage(super.A01.A1P().A0E().A07());
        }
        C7G c7g = new C7G(super.A03, true, super.A05);
        this.A0J.A0c(c7g);
        this.A0J.A0c(new OY(c7g, R5.A02, true));
        this.A0J.A0c(new C7L(super.A03));
    }

    private void A0C(JE je) {
        new JF(super.A01.A1U(), super.A03.A09()).A04(je, null);
        super.A08.A4P(super.A09.A6F());
        this.A04.A05();
        if (this.A02 instanceof BX) {
            ((BX) this.A02).A17();
        }
        this.A0F.postDelayed(new Q9(this), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(JE je) {
        if (!this.A06) {
            this.A08 = true;
            this.A01 = je;
        } else {
            A0C(je);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(C9R c9r, boolean z2, boolean z3) {
        if (this.A03 != null) {
            this.A03.AFf();
            return;
        }
        if (this.A0C) {
            return;
        }
        if (!z2 && this.A07 && this.A0A) {
            this.A00++;
            this.A0J.A0b(EnumC0815Qs.A02, 20);
            return;
        }
        if (!this.A0B) {
            A09();
        }
        this.A0C = true;
        if (this.A02 != null) {
            this.A02.A0D(c9r);
        }
        super.A07.setToolbarActionMessage(A06(0, 0, 98));
        A0N(z2, z3);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C9O c9o) {
        if (this.A0J.getState() == EnumC0830Rh.A02 && C0608Im.A1U(super.A03)) {
            this.A0J.postDelayed(new C0880Tf(this, c9o), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(C9O c9o) {
        float f2;
        int A00 = c9o.A00();
        if (this.A07) {
            int totalSecondsForReward = super.A01.A1P().A0E().A02();
            int currentPosMs = super.A01.A1P().A0E().A04();
            int A002 = A00(A00, totalSecondsForReward, currentPosMs);
            if (!ViewOnClickListenerC0909Ui.A08(super.A01)) {
                boolean A1F = super.A01.A1F();
                String A06 = A06(0, 0, 98);
                if (A1F || super.A01.A1D()) {
                    super.A07.setToolbarActionMessage(A06);
                } else if (A002 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A1T().A02().replace(A06(0, 6, 50), String.valueOf(A002)));
                } else {
                    super.A07.setToolbarActionMessage(A06);
                }
            }
            if (A002 <= 0) {
                A0N(false, false);
            }
        }
        boolean z2 = this.A0A;
        if (A0U[3].charAt(17) != 'M') {
            String[] strArr = A0U;
            strArr[7] = "uMQCRWrhYQnYLwhLQAgpxQMv5WWv5BZx";
            strArr[2] = "9L1nBY5kYCpH57KFfLoLkWPFyXHXe8tQ";
            if (!z2) {
                int A03 = super.A01.A1P().A0E().A03();
                String[] strArr2 = A0U;
                String str = strArr2[0];
                String str2 = strArr2[1];
                int length = str.length();
                int currentPosMs2 = str2.length();
                if (length != currentPosMs2) {
                    String[] strArr3 = A0U;
                    strArr3[7] = "qF0wWRoQYNHbRw7kiC8WRpThpP8Fmr54";
                    strArr3[2] = "3pcRB14MY6MyksHgyK5pJeiIhpnbS9OL";
                    int currentPosMs3 = this.A0J.getDuration();
                    f2 = Math.min(A03 * 1000.0f, currentPosMs3);
                }
            } else {
                int currentPosMs4 = super.A01.A1P().A0E().A03();
                f2 = currentPosMs4 * 1000.0f;
            }
            float f3 = A00;
            if (this.A0A) {
                float unskippableSeconds = this.A0J.getDuration() * this.A00;
                f3 += unskippableSeconds;
            }
            float f4 = f3 / f2;
            if (!super.A01.A1D()) {
                super.A07.setProgress(100.0f * f4);
            } else {
                int i2 = 0;
                float totalCurrentPosMs = f2 - f3;
                if (totalCurrentPosMs > 0.0f) {
                    int currentPosMs5 = (int) (f2 - f3);
                    i2 = currentPosMs5 / 1000;
                }
                super.A07.A08(100.0f * f4, i2);
            }
            if (f4 >= 1.0f && !this.A0B) {
                A09();
                MQ mq = super.A07;
                int currentPosMs6 = getCloseButtonStyle();
                mq.setToolbarActionMode(currentPosMs6);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str) {
        int i2 = 0;
        int i3 = 0;
        if (this.A0J != null) {
            i2 = this.A0J.getCurrentPositionInMillis();
            i3 = this.A0J.getDuration();
            this.A0J.A0Z(3);
        }
        super.A03.A0E().A3L(str);
        if (C0608Im.A1V(super.A03)) {
            A0J(new C9R(i2, i3), false, true);
        } else {
            super.A08.A4P(super.A09.A7M());
            super.A08.A4P(super.A09.A7I());
        }
    }

    private synchronized void A0N(boolean z2, boolean z3) {
        if (this.A03 != null) {
            this.A07 = false;
            return;
        }
        if (this.A07 && !z2 && !z3) {
            super.A08.A4P(super.A09.A6F());
            this.A04.A05();
            this.A07 = false;
            if (this.A02 != null) {
                this.A02.A0w();
            }
            return;
        }
        this.A07 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq
    public final void A0W() {
        M3.A0L(this.A02);
        this.A0J.setVisibility(4);
        if (!super.A01.A1C()) {
            A0a();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq
    public final void A0Y(C5Q c5q) {
        c5q.A0A(this.A0G);
        int orientation = c5q.A05().getResources().getConfiguration().orientation;
        this.A02 = A02(orientation);
        addView(this.A02, AbstractC0891Tq.A0E);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        M3.A0H(this.A02);
        M3.A0H(super.A07);
        if (super.A01.A1C() && (this.A02 instanceof BX)) {
            ((BX) this.A02).setVideoAdViewListener(this.A0H);
        }
        setUpFullscreenMode(this.A02 != null && this.A02.A11());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq
    public final boolean A0Z() {
        if (this.A02 != null) {
            boolean A12 = this.A02.A12(this.A07);
            String[] strArr = A0U;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0U[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (A12) {
                return true;
            }
        }
        return false;
    }

    public final void A0a() {
        this.A0J.setVisibility(0);
        M3.A0L(super.A07);
        this.A0J.setVolume(super.A01.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0J.A0b(EnumC0815Qs.A02, 20);
        if (this.A02 != null) {
            boolean z2 = this.A07;
            if (A0U[6].length() == 22) {
                throw new RuntimeException();
            }
            A0U[3] = "XEZroGEyqnXPxT1Op21Zo9PGFXXX4LGG";
            if (z2) {
                this.A02.A0x();
            }
        }
        if (this.A02 != null && !this.A0B) {
            this.A02.A0z();
        }
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ACz(boolean z2) {
        this.A06 = false;
        if (this.A0J.getVisibility() != 0 || this.A0J.A0j()) {
            return;
        }
        this.A05 = this.A0J.getVideoStartReason();
        this.A09 = z2;
        this.A0J.A0e(false, 13);
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ADN(boolean z2) {
        this.A06 = true;
        if (this.A08) {
            this.A08 = false;
            A0C(this.A01);
        }
        if (this.A0J.getVisibility() != 0 || this.A0J.A0k() || this.A0C || this.A0J.getState() == EnumC0830Rh.A06 || this.A05 == null) {
            return;
        }
        if (!this.A09 || z2) {
            this.A0J.A0b(this.A05, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A02 != null) {
            return this.A02.getCloseButtonStyle();
        }
        return 0;
    }

    private LZ getPackageInstallListener() {
        return new C0879Te(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq, com.instagram.common.viewpoint.core.MS
    public final void onDestroy() {
        super.onDestroy();
        if (C0608Im.A1p(super.A03)) {
            super.A03.A0A().AHC(this.A0J);
        }
        if (this.A02 != null) {
            this.A02.A0v();
        }
        if (this.A0J != null) {
            if (!this.A0C) {
                this.A0J.A0a(EnumC0810Qn.A05);
            }
            this.A0J.getEventBus().A04(this.A0P, this.A0O, this.A0N, this.A0Q, this.A0L, this.A0M);
            this.A0J.A0V();
        }
        if (this.A0I != null) {
            this.A0I.A05();
        }
        C9S c9s = this.A0K;
        if (A0U[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0U[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c9s.A0o();
        this.A0F.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(C0799Qc c0799Qc) {
        this.A04 = c0799Qc;
    }

    public void setVideoLeadingPlayableAdListener(QC qc) {
        this.A03 = qc;
    }
}
