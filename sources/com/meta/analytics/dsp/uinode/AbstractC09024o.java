package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09024o {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C4C A01;
    public AnonymousClass51 A02;
    public C1119Eb A03;
    public C5B A04;
    public C5B A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass59 A0G;
    public final AnonymousClass59 A0H;

    public static String A07(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, Ascii.RS, 48, -35, Ascii.SI, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, Ascii.RS, 48, -35, 45, Ascii.RS, 47, 34, 43, 49, -35, Ascii.US, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, Ascii.RS, -35, 47, 34, Ascii.RS, 41, -35, 32, 37, 38, 41, 33, -21, -35, Ascii.DC2, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, Ascii.SO, -70, 7, 9, Ascii.DLE, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, Ascii.FF, 9, 7, -70, 8, 9, 8, -57, -1, Ascii.DC2, 3, Ascii.CR, Ascii.SO, 3, 8, 1, -70, 3, 8, -2, -1, Ascii.DC2, -44};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract int A1d(int i9, C09094w c09094w, AnonymousClass53 anonymousClass53);

    public abstract int A1e(int i9, C09094w c09094w, AnonymousClass53 anonymousClass53);

    public abstract int A1f(AnonymousClass53 anonymousClass53);

    public abstract int A1g(AnonymousClass53 anonymousClass53);

    public abstract int A1h(AnonymousClass53 anonymousClass53);

    public abstract int A1i(AnonymousClass53 anonymousClass53);

    public abstract int A1j(AnonymousClass53 anonymousClass53);

    public abstract int A1k(AnonymousClass53 anonymousClass53);

    public abstract Parcelable A1l();

    public abstract View A1n(View view, int i9, C09094w c09094w, AnonymousClass53 anonymousClass53);

    public abstract C09034p A1o();

    public abstract void A1p(int i9);

    public abstract void A1q(int i9, int i10, AnonymousClass53 anonymousClass53, InterfaceC09004m interfaceC09004m);

    public abstract void A1r(int i9, InterfaceC09004m interfaceC09004m);

    public abstract void A1s(Parcelable parcelable);

    public abstract void A1u(C09094w c09094w, AnonymousClass53 anonymousClass53);

    public abstract void A1x(C1119Eb c1119Eb, AnonymousClass53 anonymousClass53, int i9);

    public abstract boolean A1z();

    public abstract boolean A20();

    public abstract boolean A21();

    public abstract boolean A22();

    static {
        A08();
    }

    public AbstractC09024o() {
        C1654Zg c1654Zg = new C1654Zg(this);
        this.A0G = c1654Zg;
        C1653Zf c1653Zf = new C1653Zf(this);
        this.A0H = c1653Zf;
        this.A04 = new C5B(c1654Zg);
        this.A05 = new C5B(c1653Zf);
        this.A09 = false;
        this.A07 = false;
        this.A06 = false;
        this.A0F = true;
        this.A0E = true;
    }

    public static int A00(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        switch (mode) {
            case Integer.MIN_VALUE:
                int mode2 = Math.max(i10, i11);
                return Math.min(size, mode2);
            case 1073741824:
                return size;
            default:
                int mode3 = Math.max(i10, i11);
                return mode3;
        }
    }

    public static int A01(int i9, int i10, int i11, int i12, boolean z8) {
        int max = Math.max(0, i9 - i11);
        int i13 = 0;
        int resultMode = 0;
        if (z8) {
            if (i12 >= 0) {
                i13 = i12;
                String[] strArr = A0J;
                String str = strArr[5];
                String str2 = strArr[1];
                int resultSize = str.length();
                int size = str2.length();
                if (resultSize != size) {
                    throw new RuntimeException();
                }
                A0J[6] = "ru0BYCJI67FO4KgBABZqajada";
                resultMode = 1073741824;
            } else if (i12 == -1) {
                switch (i10) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i13 = max;
                        resultMode = i10;
                        break;
                    case 0:
                        i13 = 0;
                        int resultSize2 = A0J[3].length();
                        if (resultSize2 == 28) {
                            resultMode = 0;
                            break;
                        } else {
                            A0J[7] = "Nw";
                            resultMode = 0;
                            break;
                        }
                }
            } else if (i12 == -2) {
                i13 = 0;
                resultMode = 0;
            }
        } else if (i12 >= 0) {
            i13 = i12;
            resultMode = 1073741824;
        } else if (i12 == -1) {
            i13 = max;
            resultMode = i10;
        } else if (i12 == -2) {
            i13 = max;
            resultMode = (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        int size2 = View.MeasureSpec.makeMeasureSpec(i13, resultMode);
        return size2;
    }

    private final int A02(View view) {
        return ((C09034p) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C09034p) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C09034p) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C09034p) view.getLayoutParams()).A03.top;
    }

    private final int A06(C09094w c09094w, AnonymousClass53 anonymousClass53) {
        return 0;
    }

    private final void A09(int i9) {
        A0C(i9, A0t(i9));
    }

    private final void A0A(int i9) {
        View child = A0t(i9);
        if (child != null) {
            this.A01.A0D(i9);
        }
    }

    private final void A0B(int i9, int i10) {
        View view = A0t(i9);
        if (view != null) {
            A09(i9);
            A0E(view, i10);
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 79) + i9 + this.A03.toString());
    }

    private void A0C(int i9, View view) {
        this.A01.A0C(i9);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i9) {
        A0F(view, i9, (C09034p) view.getLayoutParams());
    }

    private final void A0F(View view, int i9, C09034p c09034p) {
        AnonymousClass56 A0F = C1119Eb.A0F(view);
        if (A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            C5E c5e = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c5e.A0A(A0F);
        }
        this.A01.A0H(view, i9, c09034p, A0F.A0a());
    }

    private void A0G(View view, int i9, boolean z8) {
        AnonymousClass56 A0F = C1119Eb.A0F(view);
        if (z8 || A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            this.A03.A0t.A0A(A0F);
        }
        C09034p c09034p = (C09034p) view.getLayoutParams();
        if (A0F.A0g() || A0F.A0b()) {
            if (A0F.A0b()) {
                A0F.A0S();
            } else {
                A0F.A0O();
            }
            this.A01.A0H(view, i9, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C1119Eb c1119Eb = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == c1119Eb) {
                int currentIndex = this.A01.A07(view);
                if (i9 == -1) {
                    i9 = this.A01.A05();
                }
                if (currentIndex != -1) {
                    if (currentIndex != i9) {
                        this.A03.A06.A0B(currentIndex, i9);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1H());
                }
            } else {
                this.A01.A0I(view, i9, false);
                c09034p.A01 = true;
                AnonymousClass51 anonymousClass51 = this.A02;
                if (anonymousClass51 != null && anonymousClass51.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c09034p.A02) {
            A0F.A0H.invalidate();
            c09034p.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        C1119Eb.A0o(view, rect);
    }

    private void A0J(C09094w c09094w, int i9, View view) {
        AnonymousClass56 A0F = C1119Eb.A0F(view);
        if (A0F.A0f()) {
            return;
        }
        if (A0F.A0Z() && !A0F.A0a() && !this.A03.A04.A0A()) {
            A0A(i9);
            c09094w.A0X(A0F);
        } else {
            A09(i9);
            c09094w.A0S(view);
            this.A03.A0t.A0C(A0F);
        }
    }

    private final void A0K(C09094w c09094w, AnonymousClass53 anonymousClass53, AccessibilityEvent accessibilityEvent) {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb == null || accessibilityEvent == null) {
            return;
        }
        boolean z8 = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!c1119Eb.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z8 = false;
        }
        accessibilityEvent.setScrollable(z8);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0E());
    }

    private final void A0L(C09094w c09094w, AnonymousClass53 anonymousClass53, C08813s c08813s) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c08813s.A0N(FragmentTransaction.TRANSIT_EXIT_MASK);
            c08813s.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c08813s.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c08813s.A0R(true);
        }
        C08783p collectionInfo = C08783p.A00(A0r(c09094w, anonymousClass53), A0q(c09094w, anonymousClass53), A0P(c09094w, anonymousClass53), A06(c09094w, anonymousClass53));
        c08813s.A0P(collectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AnonymousClass51 anonymousClass51) {
        if (this.A02 == anonymousClass51) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AnonymousClass51 anonymousClass51 = this.A02;
        return anonymousClass51 != null && anonymousClass51.A0F();
    }

    public static boolean A0O(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i9 != i11) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i9;
            case 0:
                return true;
            case 1073741824:
                return size == i9;
            default:
                return false;
        }
    }

    private final boolean A0P(C09094w c09094w, AnonymousClass53 anonymousClass53) {
        return false;
    }

    private final boolean A0Q(C09094w c09094w, AnonymousClass53 anonymousClass53, int i9, Bundle bundle) {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb == null) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        switch (i9) {
            case 4096:
                if (c1119Eb.canScrollVertically(1)) {
                    i10 = (A0X() - A0g()) - A0d();
                }
                if (this.A03.canScrollHorizontally(1)) {
                    i11 = (A0h() - A0e()) - A0f();
                    break;
                }
                break;
            case FragmentTransaction.TRANSIT_EXIT_MASK /* 8192 */:
                if (c1119Eb.canScrollVertically(-1)) {
                    i10 = -((A0X() - A0g()) - A0d());
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    i11 = -((A0h() - A0e()) - A0f());
                    break;
                }
                break;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        C1119Eb c1119Eb2 = this.A03;
        if (A0J[7].length() == 8) {
            throw new RuntimeException();
        }
        A0J[7] = "6TTpYbQ6a4";
        c1119Eb2.scrollBy(i11, i10);
        return true;
    }

    private final boolean A0R(C09094w c09094w, AnonymousClass53 anonymousClass53, View view, int i9, Bundle bundle) {
        return false;
    }

    private boolean A0S(C1119Eb c1119Eb, int i9, int i10) {
        View focusedChild = c1119Eb.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i9 >= parentTop2 || rect.right - i9 <= parentBottom || rect.top - i10 >= parentLeft2 || rect.bottom - i10 <= parentRight) {
            return false;
        }
        if (A0J[3].length() == 28) {
            throw new RuntimeException();
        }
        A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        return true;
    }

    @Deprecated
    private final boolean A0T(C1119Eb c1119Eb, View view, View view2) {
        return A0N() || c1119Eb.A1q();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childTop = rect.width() + childBottom;
        int parentLeft = rect.height();
        int childLeft = Math.min(0, childBottom - offScreenRight);
        int parentBottom = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childTop - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(childLeft, childTop - dy);
            }
        } else {
            parentTop = childLeft != 0 ? childLeft : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentBottom == 0) {
            parentBottom = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentBottom;
        if (A0J[0].charAt(31) == 'p') {
            throw new RuntimeException();
        }
        A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C4C c4c = this.A01;
        if (c4c != null) {
            return c4c.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        C1119Eb c1119Eb = this.A03;
        AbstractC08904c a6 = c1119Eb != null ? c1119Eb.getAdapter() : null;
        if (a6 != null) {
            return a6.A0E();
        }
        return 0;
    }

    public final int A0a() {
        return C3T.A01(this.A03);
    }

    public final int A0b() {
        return C3T.A02(this.A03);
    }

    public final int A0c() {
        return C3T.A03(this.A03);
    }

    public final int A0d() {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            return c1119Eb.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            return c1119Eb.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            return c1119Eb.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            return c1119Eb.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C09034p) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C09034p) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C09034p) view.getLayoutParams()).A00();
    }

    public int A0q(C09094w c09094w, AnonymousClass53 anonymousClass53) {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb == null || c1119Eb.A04 == null || !A20()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public int A0r(C09094w c09094w, AnonymousClass53 anonymousClass53) {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb == null || c1119Eb.A04 == null || !A21()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View A0s() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Eb r0 = r6.A03
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            android.view.View r3 = r0.getFocusedChild()
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC09024o.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC09024o.A0J
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L4c
            com.facebook.ads.redexgen.X.4C r4 = r6.A01
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC09024o.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC09024o.A0J
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
        L4c:
            return r5
        L4d:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC09024o.A0J
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
            goto L4c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC09024o.A0s():android.view.View");
    }

    public final View A0t(int i9) {
        C4C c4c = this.A01;
        if (c4c != null) {
            return c4c.A09(i9);
        }
        return null;
    }

    public final View A0u(View view, int i9) {
        return null;
    }

    public C09034p A0v(Context context, AttributeSet attributeSet) {
        return new C09034p(context, attributeSet);
    }

    public C09034p A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C09034p) {
            return new C09034p((C09034p) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C09034p((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C09034p(layoutParams);
    }

    public final void A0x() {
        AnonymousClass51 anonymousClass51 = this.A02;
        if (anonymousClass51 != null) {
            anonymousClass51.A09();
        }
    }

    public final void A0y() {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            c1119Eb.requestLayout();
        }
    }

    public final void A0z(int i9) {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            c1119Eb.A1T(i9);
        }
    }

    public final void A10(int i9) {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            c1119Eb.A1U(i9);
        }
    }

    public final void A11(int i9, int i10) {
        this.A0C = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        this.A0D = mode;
        if (mode == 0 && !C1119Eb.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.A0B = mode2;
        if (mode2 == 0 && !C1119Eb.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i9, int i10) {
        int A0W = A0W();
        if (A0W == 0) {
            this.A03.A1a(i9, i10);
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < A0W; i13++) {
            View A0t = A0t(i13);
            Rect rect = this.A03.A0p;
            A0H(A0t, rect);
            int count = rect.left;
            if (count < i11) {
                i11 = rect.left;
            }
            int count2 = rect.right;
            if (count2 > maxY) {
                maxY = rect.right;
            }
            int count3 = rect.top;
            if (count3 < i12) {
                i12 = rect.top;
            }
            int count4 = rect.bottom;
            if (count4 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i11, i12, maxY, maxX);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int minX = str.length();
        int count5 = str2.length();
        if (minX == count5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, i9, i10);
    }

    public final void A13(int i9, int i10) {
        this.A03.setMeasuredDimension(i9, i10);
    }

    public final void A14(int i9, C09094w c09094w) {
        View view = A0t(i9);
        A0A(i9);
        c09094w.A0T(view);
    }

    public void A15(Rect rect, int i9, int i10) {
        int usedHeight = rect.width() + A0e() + A0f();
        int height = rect.height();
        int usedWidth = A0g();
        int i11 = height + usedWidth;
        int usedWidth2 = A0d();
        int width = i11 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i9, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i10, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i9) {
        A0G(view, i9, true);
    }

    public final void A19(View view, int i9) {
        A0G(view, i9, false);
    }

    public final void A1A(View view, int i9, int i10) {
        C09034p c09034p = (C09034p) view.getLayoutParams();
        Rect A1D = this.A03.A1D(view);
        int i11 = i9 + A1D.left + A1D.right;
        int i12 = i10 + A1D.top + A1D.bottom;
        int A01 = A01(A0h(), A0i(), A0e() + A0f() + c09034p.leftMargin + c09034p.rightMargin + i11, c09034p.width, A20());
        int A0X = A0X();
        int A0Y = A0Y();
        int widthSpec = A0g();
        int A012 = A01(A0X, A0Y, widthSpec + A0d() + c09034p.topMargin + c09034p.bottomMargin + i12, c09034p.height, A21());
        if (A1W(view, A01, A012, c09034p)) {
            view.measure(A01, A012);
        }
    }

    public final void A1B(View view, int i9, int i10, int i11, int i12) {
        C09034p c09034p = (C09034p) view.getLayoutParams();
        Rect rect = c09034p.A03;
        view.layout(rect.left + i9 + c09034p.leftMargin, rect.top + i10 + c09034p.topMargin, (i11 - rect.right) - c09034p.rightMargin, (i12 - rect.bottom) - c09034p.bottomMargin);
    }

    public final void A1C(View view, C08813s c08813s) {
        AnonymousClass56 A0F = C1119Eb.A0F(view);
        if (A0F != null && !A0F.A0a() && !this.A01.A0K(A0F.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c08813s);
        }
    }

    public final void A1D(View view, C09094w c09094w) {
        A0D(view);
        c09094w.A0T(view);
    }

    public final void A1E(View view, boolean z8, Rect rect) {
        Matrix matrix;
        if (z8) {
            Rect rect2 = ((C09034p) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int floor = (int) Math.floor(rectF.left);
            int floor2 = (int) Math.floor(rectF.top);
            float f9 = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(floor, floor2, (int) Math.ceil(f9), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C08813s c08813s) {
        A0L(this.A03.A0r, this.A03.A0s, c08813s);
    }

    public final void A1G(C09094w c09094w) {
        int A0E = c09094w.A0E();
        for (int i9 = A0E - 1; i9 >= 0; i9--) {
            View A0F = c09094w.A0F(i9);
            AnonymousClass56 A0F2 = C1119Eb.A0F(A0F);
            if (!A0F2.A0f()) {
                A0F2.A0X(false);
                if (A0F2.A0c()) {
                    this.A03.removeDetachedView(A0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(A0F2);
                }
                A0F2.A0X(true);
                c09094w.A0R(A0F);
            }
        }
        c09094w.A0L();
        if (A0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C09094w c09094w) {
        int childCount = A0W();
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            A0J(c09094w, i9, A0t(i9));
        }
    }

    public final void A1I(C09094w c09094w) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            if (!C1119Eb.A0F(A0t(A0W)).A0f()) {
                A14(A0W, c09094w);
            }
        }
    }

    public void A1J(C09094w c09094w, AnonymousClass53 anonymousClass53, int i9, int i10) {
        this.A03.A1a(i9, i10);
    }

    public void A1K(C09094w c09094w, AnonymousClass53 anonymousClass53, View view, C08813s c08813s) {
        int A0p = A21() ? A0p(view) : 0;
        int A0p2 = A20() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        C08793q itemInfo = C08793q.A00(A0p, 1, A0p2, 1, false, false);
        c08813s.A0Q(itemInfo);
    }

    public final void A1L(AnonymousClass51 anonymousClass51) {
        AnonymousClass51 anonymousClass512 = this.A02;
        if (anonymousClass512 != null && anonymousClass51 != anonymousClass512 && anonymousClass512.A0F()) {
            this.A02.A09();
        }
        this.A02 = anonymousClass51;
        anonymousClass51.A0D(this.A03, this);
    }

    public void A1M(C1119Eb c1119Eb) {
    }

    public final void A1N(C1119Eb c1119Eb) {
        this.A07 = true;
    }

    public final void A1O(C1119Eb c1119Eb) {
        A11(View.MeasureSpec.makeMeasureSpec(c1119Eb.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c1119Eb.getHeight(), 1073741824));
    }

    public final void A1P(C1119Eb c1119Eb) {
        if (c1119Eb == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = c1119Eb;
            this.A01 = c1119Eb.A01;
            this.A0C = c1119Eb.getWidth();
            this.A0A = c1119Eb.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public final void A1Q(C1119Eb c1119Eb, C09094w c09094w) {
        this.A07 = false;
        A1w(c1119Eb, c09094w);
    }

    public final void A1R(boolean z8) {
        this.A06 = z8;
    }

    public final boolean A1S() {
        int A0W = A0W();
        for (int i9 = 0; i9 < A0W; i9++) {
            ViewGroup.LayoutParams layoutParams = A0t(i9).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1T() {
        C1119Eb c1119Eb = this.A03;
        return c1119Eb != null && c1119Eb.A0B;
    }

    public final boolean A1U() {
        return this.A0E;
    }

    public final boolean A1V(int i9, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i9, bundle);
    }

    public final boolean A1W(View view, int i9, int i10, C09034p c09034p) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i9, c09034p.width) && A0O(view.getHeight(), i10, c09034p.height)) ? false : true;
    }

    public final boolean A1X(View view, int i9, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i9, bundle);
    }

    public boolean A1Y(C09034p c09034p) {
        return c09034p != null;
    }

    public final boolean A1Z(C1119Eb c1119Eb, View view, Rect rect, boolean z8) {
        return A1a(c1119Eb, view, rect, z8, false);
    }

    public final boolean A1a(C1119Eb c1119Eb, View view, Rect rect, boolean z8, boolean z9) {
        int[] scrollAmount = A0U(view, rect);
        int i9 = scrollAmount[0];
        int i10 = scrollAmount[1];
        if ((z9 && !A0S(c1119Eb, i9, i10)) || (i9 == 0 && i10 == 0)) {
            return false;
        }
        if (z8) {
            c1119Eb.scrollBy(i9, i10);
        } else {
            c1119Eb.A1c(i9, i10);
        }
        return true;
    }

    public final boolean A1b(C1119Eb c1119Eb, AnonymousClass53 anonymousClass53, View view, View view2) {
        return A0T(c1119Eb, view, view2);
    }

    public final boolean A1c(C1119Eb c1119Eb, ArrayList<View> views, int i9, int i10) {
        return false;
    }

    public View A1m(int i9) {
        int A0W = A0W();
        for (int i10 = 0; i10 < A0W; i10++) {
            View child = A0t(i10);
            AnonymousClass56 A0F = C1119Eb.A0F(child);
            if (A0F != null) {
                int childCount = A0F.A0I();
                if (childCount == i9 && !A0F.A0f() && (this.A03.A0s.A07() || !A0F.A0a())) {
                    return child;
                }
            }
        }
        return null;
    }

    public void A1t(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1v(AnonymousClass53 anonymousClass53) {
    }

    public void A1w(C1119Eb c1119Eb, C09094w c09094w) {
    }

    public void A1y(String str) {
        C1119Eb c1119Eb = this.A03;
        if (c1119Eb != null) {
            c1119Eb.A1l(str);
        }
    }
}
