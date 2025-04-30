package com.meta.analytics.dsp.uinode;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C08703h extends ViewGroup {
    public static byte[] A0s;
    public static String[] A0t = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0u;
    public static final Interpolator A0v;
    public static final C08693g A0w;
    public static final Comparator<C3Z> A0x;
    public int A00;
    public C3E A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public InterfaceC08653c A0Y;
    public C08673e A0Z;
    public ClassLoader A0a;
    public ArrayList<View> A0b;
    public List<ViewPager.OnAdapterChangeListener> A0c;
    public List<InterfaceC08653c> A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public final Rect A0o;
    public final C3Z A0p;
    public final Runnable A0q;
    public final ArrayList<C3Z> A0r;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C3Z A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f9 = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i9 = -1;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z8 = true;
        C3Z c3z = null;
        int i10 = 0;
        while (i10 < this.A0r.size()) {
            C3Z c3z2 = this.A0r.get(i10);
            if (!z8 && c3z2.A02 != i9 + 1) {
                c3z2 = this.A0p;
                c3z2.A00 = f10 + f11 + f9;
                c3z2.A02 = i9 + 1;
                c3z2.A01 = this.A01.A00(c3z2.A02);
                i10--;
            }
            f10 = c3z2.A00;
            float f12 = c3z2.A01 + f10 + f9;
            if (!z8) {
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0t;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (scrollX < f10) {
                    return c3z;
                }
            }
            if (scrollX >= f12) {
                int size = this.A0r.size() - 1;
                String[] strArr3 = A0t;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0t[2] = "sbP3P6ChvdnfvWI";
                    if (i10 != size) {
                        z8 = false;
                        i9 = c3z2.A02;
                        f11 = c3z2.A01;
                        c3z = c3z2;
                        i10++;
                    }
                } else {
                    A0t[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i10 != size) {
                        z8 = false;
                        i9 = c3z2.A02;
                        f11 = c3z2.A01;
                        c3z = c3z2;
                        i10++;
                    }
                }
            }
            return c3z2;
        }
        return c3z;
    }

    public static String A08(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0s, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0s = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, Ascii.DC4, -62, 5, Ascii.SO, 3, Ascii.NAK, Ascii.NAK, -36, -62, -48, 0, 17, Ascii.ETB, Ascii.NAK, 34, -48, Ascii.EM, Ascii.DC4, -22, -48, -34, Ascii.SO, 48, 45, 32, 42, 35, 43, Ascii.US, 50, 39, 33, -34, Ascii.US, 34, Ascii.US, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, Ascii.NAK, Ascii.EM, 9, Ascii.ETB, Ascii.CAN, 9, 8, -60, 19, 10, 10, Ascii.ETB, 7, Ascii.SYN, 9, 9, Ascii.DC2, -60, Ascii.DC4, 5, Ascii.VT, 9, -60, Ascii.DLE, Ascii.CR, 17, Ascii.CR, Ascii.CAN, -60, -10, 10, 7, -62, 3, Ascii.DC2, Ascii.DC2, Ascii.SO, Ascii.VT, 5, 3, Ascii.SYN, Ascii.VT, 17, Ascii.DLE, -55, Ascii.NAK, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, 5, 10, 3, Ascii.DLE, 9, 7, 6, -62, Ascii.SYN, 10, 7, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -55, Ascii.NAK, -62, 5, 17, Ascii.DLE, Ascii.SYN, 7, Ascii.DLE, Ascii.SYN, Ascii.NAK, -62, Ascii.EM, Ascii.VT, Ascii.SYN, 10, 17, Ascii.ETB, Ascii.SYN, -62, 5, 3, Ascii.SO, Ascii.SO, Ascii.VT, Ascii.DLE, 9, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -59, Ascii.DLE, 17, Ascii.SYN, Ascii.VT, 8, Ascii.ESC, -26, 3, Ascii.SYN, 3, -11, 7, Ascii.SYN, -27, 10, 3, Ascii.DLE, 9, 7, 6, -61, -62, -25, Ascii.SUB, Ascii.DC2, 7, 5, Ascii.SYN, 7, 6, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, Ascii.VT, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, Ascii.DLE, Ascii.SYN, -36, -62, -19, 0, -4, Ascii.SO, -25, -8, -2, -4, 9, Ascii.EM, 42, 42, 39, 47, Ascii.VT, Ascii.ESC, 42, 39, 36, 36, -40, 44, 42, 33, Ascii.GS, Ascii.FS, -40, 44, 39, -40, Ascii.RS, 33, 38, Ascii.FS, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, -40, Ascii.SUB, Ascii.EM, 43, Ascii.GS, Ascii.FS, -40, 39, 38, -40, 38, 39, 38, -27, Ascii.ESC, 32, 33, 36, Ascii.FS, -40, Ascii.ESC, 45, 42, 42, Ascii.GS, 38, 44, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, Ascii.GS, Ascii.FS, -40, 46, 33, Ascii.GS, 47, -40, 76, 75, Ascii.RS, 65, 62, 77, 81, 66, 79, 32, 69, 62, 75, 68, 66, 65, 19, Ascii.DC2, -12, 5, Ascii.VT, 9, -9, 7, Ascii.SYN, 19, Ascii.DLE, Ascii.DLE, 9, 8, -60, 8, Ascii.CR, 8, -60, Ascii.DC2, 19, Ascii.CAN, -60, 7, 5, Ascii.DLE, Ascii.DLE, -60, Ascii.ETB, Ascii.EM, Ascii.DC4, 9, Ascii.SYN, 7, Ascii.DLE, 5, Ascii.ETB, Ascii.ETB, -60, Ascii.CR, 17, Ascii.DC4, Ascii.DLE, 9, 17, 9, Ascii.DC2, Ascii.CAN, 5, Ascii.CAN, Ascii.CR, 19, Ascii.DC2, 85, 83, 66, 79, 84, 71, 80, 83, 78, 49, 66, 72, 70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i9, int i10, int i11) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.A0j ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i12 = i9 - scrollX;
        int i13 = i10 - scrollY;
        if (i12 == 0 && i13 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i14 = clientWidth / 2;
        float A00 = i14 + (i14 * A00(Math.min(1.0f, (Math.abs(i12) * 1.0f) / clientWidth)));
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            float f9 = A00 / abs2;
            if (A0t[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "";
            strArr[5] = "";
            abs = Math.round(Math.abs(f9) * 1000.0f) * 4;
        } else {
            abs = (int) ((1.0f + (Math.abs(i12) / (this.A0M + (clientWidth * this.A01.A00(this.A00))))) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.A0j = false;
        this.A0X.startScroll(scrollX, scrollY, i12, i13, min);
        C3T.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C3Z A07;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        C08633a c08633a;
        int i11;
        int i12;
        setMeasuredDimension(getDefaultSize(0, i9), getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                this.A0h = true;
                A0f();
                this.A0h = false;
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8 && ((c08633a = (C08633a) childAt.getLayoutParams()) == null || !c08633a.A05)) {
                        float f9 = paddingLeft;
                        String[] strArr = A0t;
                        if (strArr[4].length() == strArr[5].length()) {
                            A0t[1] = "11cm9STM7FlxGR3";
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f9 * c08633a.A00), 1073741824), this.A0A);
                        }
                    }
                }
                return;
            }
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                C08633a c08633a2 = (C08633a) childAt2.getLayoutParams();
                if (A0t[1].length() == 12) {
                    break;
                }
                String[] strArr2 = A0t;
                strArr2[4] = "";
                strArr2[5] = "";
                if (c08633a2 != null && c08633a2.A05) {
                    int i15 = c08633a2.A04 & 7;
                    int i16 = c08633a2.A04 & 112;
                    int i17 = Integer.MIN_VALUE;
                    int i18 = Integer.MIN_VALUE;
                    boolean z8 = i16 == 48 || i16 == 80;
                    boolean z9 = i15 == 3 || i15 == 5;
                    if (z8) {
                        i17 = 1073741824;
                    } else if (z9) {
                        i18 = 1073741824;
                    }
                    if (c08633a2.width != -2) {
                        i17 = 1073741824;
                        i11 = c08633a2.width != -1 ? c08633a2.width : paddingLeft;
                    } else {
                        i11 = paddingLeft;
                    }
                    if (c08633a2.height != -2) {
                        i18 = 1073741824;
                        if (c08633a2.height != -1) {
                            i12 = c08633a2.height;
                            if (A0t[1].length() != 12) {
                                A0t[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i12 = measuredHeight;
                        }
                    } else {
                        i12 = measuredHeight;
                    }
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i11, i17), View.MeasureSpec.makeMeasureSpec(i12, i18));
                    if (z8) {
                        measuredHeight -= childAt2.getMeasuredHeight();
                    } else if (z9) {
                        paddingLeft -= childAt2.getMeasuredWidth();
                    }
                }
            }
            i13++;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3E c3e;
        if (this.A0f) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (c3e = this.A01) == null || c3e.A01() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean z8 = false;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.A0X.abortAnimation();
                this.A0m = false;
                A0f();
                float x9 = motionEvent.getX();
                this.A03 = x9;
                this.A05 = x9;
                float y4 = motionEvent.getY();
                this.A04 = y4;
                this.A06 = y4;
                this.A08 = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.A0i) {
                    VelocityTracker velocityTracker = this.A0U;
                    velocityTracker.computeCurrentVelocity(1000, this.A0J);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
                    this.A0m = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C3Z A03 = A03();
                    A0O(A01(A03.A02, ((scrollX / clientWidth) - A03.A00) / (A03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
                    z8 = A0U();
                    break;
                }
                break;
            case 2:
                if (!this.A0i) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (findPointerIndex == -1) {
                        z8 = A0U();
                        break;
                    } else {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x10 - this.A05);
                        float y6 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y6 - this.A06);
                        if (abs > this.A0R && abs > abs2) {
                            this.A0i = true;
                            A0T(true);
                            float f9 = this.A03;
                            this.A05 = x10 - f9 > 0.0f ? f9 + this.A0R : f9 - this.A0R;
                            this.A06 = y6;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.A0i) {
                    z8 = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                    break;
                }
                break;
            case 3:
                if (this.A0i) {
                    A0M(this.A00, true, 0, false);
                    z8 = A0U();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.A05 = motionEvent.getX(actionIndex);
                this.A08 = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                A0P(motionEvent);
                this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                break;
        }
        if (z8) {
            C3T.A07(this);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3g] */
    static {
        A0C();
        A0u = new int[]{R.attr.layout_gravity};
        A0x = new Comparator<C3Z>() { // from class: com.facebook.ads.redexgen.X.3V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C3Z c3z, C3Z c3z2) {
                return c3z.A02 - c3z2.A02;
            }
        };
        A0v = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3W
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f9) {
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            }
        };
        A0w = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(View view, View view2) {
                C08633a c08633a = (C08633a) view.getLayoutParams();
                C08633a c08633a2 = (C08633a) view2.getLayoutParams();
                if (c08633a.A05 != c08633a2.A05) {
                    return c08633a.A05 ? 1 : -1;
                }
                return c08633a.A02 - c08633a2.A02;
            }
        };
    }

    public C08703h(Context context) {
        super(context);
        this.A0r = new ArrayList<>();
        this.A0p = new C3Z();
        this.A0o = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0a = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0g = true;
        this.A0l = false;
        this.A0q = new Runnable() { // from class: com.facebook.ads.redexgen.X.3X
            @Override // java.lang.Runnable
            public final void run() {
                C08703h.this.setScrollState(0);
                C08703h.this.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f9) {
        return (float) Math.sin((f9 - 0.5f) * 0.47123894f);
    }

    private int A01(int i9, float f9, int i10, int i11) {
        if (Math.abs(i11) > this.A0H && Math.abs(i10) > this.A0K) {
            if (i10 <= 0) {
                i9++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i9 >= targetPage ? 0.4f : 0.6f;
            i9 = ((int) (f9 + truncator)) + i9;
        }
        int targetPage2 = this.A0r.size();
        if (targetPage2 > 0) {
            C3Z lastItem = this.A0r.get(0);
            ArrayList<C3Z> arrayList = this.A0r;
            int targetPage3 = arrayList.size();
            C3Z c3z = arrayList.get(targetPage3 - 1);
            int i12 = lastItem.A02;
            int targetPage4 = c3z.A02;
            return Math.max(i12, Math.min(i9, targetPage4));
        }
        return i9;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.meta.analytics.dsp.uinode.C3Z A04(int r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r3.A0r
            int r0 = r0.size()
            if (r2 >= r0) goto L19
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r3.A0r
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.3Z r1 = (com.meta.analytics.dsp.uinode.C3Z) r1
            int r0 = r1.A02
            if (r0 != r4) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.A04(int):com.facebook.ads.redexgen.X.3Z");
    }

    private final C3Z A05(int i9, int i10) {
        C3Z c3z = new C3Z();
        c3z.A02 = i9;
        c3z.A03 = this.A01.A04(this, i9);
        c3z.A01 = this.A01.A00(i9);
        if (i10 < 0 || i10 >= this.A0r.size()) {
            this.A0r.add(c3z);
        } else {
            this.A0r.add(i10, c3z);
        }
        return c3z;
    }

    private final C3Z A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.meta.analytics.dsp.uinode.C3Z A07(android.view.View r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r4.A0r
            int r0 = r0.size()
            if (r3 >= r0) goto L1f
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r4.A0r
            java.lang.Object r2 = r0.get(r3)
            com.facebook.ads.redexgen.X.3Z r2 = (com.meta.analytics.dsp.uinode.C3Z) r2
            com.facebook.ads.redexgen.X.3E r1 = r4.A01
            java.lang.Object r0 = r2.A03
            boolean r0 = r1.A08(r5, r0)
            if (r0 == 0) goto L1c
            return r2
        L1c:
            int r3 = r3 + 1
            goto L1
        L1f:
            r3 = 0
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C08703h.A0t
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L38
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C08703h.A0t
            java.lang.String r1 = "T6ty"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.A07(android.view.View):com.facebook.ads.redexgen.X.3Z");
    }

    private void A09() {
        this.A0i = false;
        this.A0k = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0t[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0A() {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L1d
            android.view.View r0 = r2.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            com.facebook.ads.redexgen.X.3a r0 = (com.meta.analytics.dsp.uinode.C08633a) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L1a
            r2.removeViewAt(r1)
            int r1 = r1 + (-1)
        L1a:
            int r1 = r1 + 1
            goto L1
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.A0A():void");
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0b;
            if (arrayList == null) {
                this.A0b = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.A0b.add(getChildAt(i9));
            }
            Collections.sort(this.A0b, A0w);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0v);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f9);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f9);
        this.A0C = (int) (2.0f * f9);
        this.A0E = (int) (16.0f * f9);
        C3T.A0B(this, new C1672Zz(this));
        if (C3T.A00(this) == 0) {
            C3T.A09(this, 1);
        }
        C3T.A0C(this, new C1673a0(this));
    }

    private void A0E(int i9) {
        List<InterfaceC08653c> list = this.A0d;
        if (list != null) {
            int i10 = list.size();
            for (int i11 = 0; i11 < i10; i11++) {
                this.A0d.get(i11);
            }
        }
    }

    private void A0F(int i9) {
        List<InterfaceC08653c> list = this.A0d;
        if (list != null) {
            int i10 = list.size();
            for (int i11 = 0; i11 < i10; i11++) {
                this.A0d.get(i11);
            }
        }
    }

    private final void A0G(int i9) {
        String hexString;
        C3Z c3z;
        C3Z c3z2;
        float f9;
        C3Z ii;
        float leftWidthNeeded;
        C3Z curItem = null;
        int i10 = this.A00;
        if (i10 != i9) {
            curItem = A04(i10);
            this.A00 = i9;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0m) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i11 = this.A0L;
        int pos = Math.max(0, this.A00 - i11);
        int startPos = this.A01.A01();
        int endPos = Math.min(startPos - 1, this.A00 + i11);
        if (startPos == this.A0G) {
            C3Z c3z3 = null;
            if (A0t[2].length() != 14) {
                A0t[1] = "Tot0RAE";
                int pageLimit = 0;
                while (true) {
                    int curIndex = this.A0r.size();
                    if (pageLimit >= curIndex) {
                        break;
                    }
                    C3Z c3z4 = this.A0r.get(pageLimit);
                    int i12 = c3z4.A02;
                    int curIndex2 = this.A00;
                    if (i12 >= curIndex2) {
                        int i13 = c3z4.A02;
                        int curIndex3 = this.A00;
                        if (i13 == curIndex3) {
                            c3z3 = c3z4;
                        }
                    } else {
                        pageLimit++;
                    }
                }
                if (c3z3 == null && startPos > 0) {
                    int N8 = this.A00;
                    if (A0t[1].length() != 12) {
                        A0t[2] = "0";
                        c3z3 = A05(N8, pageLimit);
                    } else {
                        String[] strArr = A0t;
                        strArr[4] = "";
                        strArr[5] = "";
                        c3z3 = A05(N8, pageLimit);
                    }
                }
                if (c3z3 != null) {
                    float f10 = 0.0f;
                    int i14 = pageLimit - 1;
                    if (i14 >= 0) {
                        C3Z c3z5 = this.A0r.get(i14);
                        String[] strArr2 = A0t;
                        String str = strArr2[3];
                        String str2 = strArr2[6];
                        int charAt = str.charAt(15);
                        int curIndex4 = str2.charAt(15);
                        if (charAt != curIndex4) {
                            A0t[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                            c3z2 = c3z5;
                        }
                    } else {
                        c3z2 = null;
                    }
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        f9 = 0.0f;
                    } else {
                        float f11 = 2.0f - c3z3.A01;
                        int curIndex5 = getPaddingLeft();
                        f9 = f11 + (curIndex5 / clientWidth);
                    }
                    int curIndex6 = this.A00;
                    for (int itemIndex = curIndex6 - 1; itemIndex >= 0; itemIndex--) {
                        if (f10 >= f9 && itemIndex < pos) {
                            if (c3z2 == null) {
                                break;
                            }
                            int curIndex7 = c3z2.A02;
                            if (itemIndex == curIndex7 && !c3z2.A04) {
                                this.A0r.remove(i14);
                                this.A01.A07(this, itemIndex, c3z2.A03);
                                i14--;
                                pageLimit--;
                                c3z2 = i14 >= 0 ? this.A0r.get(i14) : null;
                            }
                        } else if (c3z2 != null && itemIndex == c3z2.A02) {
                            f10 += c3z2.A01;
                            String[] strArr3 = A0t;
                            if (strArr3[7].charAt(10) == strArr3[0].charAt(10)) {
                                String[] strArr4 = A0t;
                                strArr4[4] = "";
                                strArr4[5] = "";
                                i14--;
                                c3z2 = i14 >= 0 ? this.A0r.get(i14) : null;
                            }
                        } else {
                            f10 += A05(itemIndex, i14 + 1).A01;
                            pageLimit++;
                            c3z2 = i14 >= 0 ? this.A0r.get(i14) : null;
                        }
                    }
                    float f12 = c3z3.A01;
                    int i15 = pageLimit + 1;
                    if (f12 < 2.0f) {
                        int curIndex8 = this.A0r.size();
                        if (i15 < curIndex8) {
                            ii = this.A0r.get(i15);
                        } else {
                            ii = null;
                        }
                        if (clientWidth <= 0) {
                            leftWidthNeeded = 0.0f;
                        } else {
                            int curIndex9 = getPaddingRight();
                            float f13 = curIndex9;
                            float rightWidthNeeded = clientWidth;
                            String[] strArr5 = A0t;
                            String str3 = strArr5[4];
                            String str4 = strArr5[5];
                            int length = str3.length();
                            int curIndex10 = str4.length();
                            if (length != curIndex10) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0t;
                            strArr6[4] = "";
                            strArr6[5] = "";
                            leftWidthNeeded = (f13 / rightWidthNeeded) + 2.0f;
                        }
                        int curIndex11 = this.A00;
                        for (int i16 = curIndex11 + 1; i16 < startPos; i16++) {
                            if (f12 >= leftWidthNeeded && i16 > endPos) {
                                if (ii == null) {
                                    break;
                                }
                                int curIndex12 = ii.A02;
                                if (i16 == curIndex12 && !ii.A04) {
                                    this.A0r.remove(i15);
                                    this.A01.A07(this, i16, ii.A03);
                                    int curIndex13 = this.A0r.size();
                                    if (i15 < curIndex13) {
                                        C3Z ii2 = this.A0r.get(i15);
                                        ii = ii2;
                                    } else {
                                        ii = null;
                                    }
                                }
                            } else {
                                if (ii != null) {
                                    int curIndex14 = ii.A02;
                                    if (i16 == curIndex14) {
                                        f12 += ii.A01;
                                        i15++;
                                        int curIndex15 = this.A0r.size();
                                        if (i15 < curIndex15) {
                                            C3Z ii3 = this.A0r.get(i15);
                                            ii = ii3;
                                        } else {
                                            ii = null;
                                        }
                                    }
                                }
                                C3Z A05 = A05(i16, i15);
                                i15++;
                                f12 += A05.A01;
                                int curIndex16 = this.A0r.size();
                                if (i15 < curIndex16) {
                                    C3Z ii4 = this.A0r.get(i15);
                                    ii = ii4;
                                } else {
                                    ii = null;
                                }
                            }
                        }
                    }
                    A0Q(c3z3, pageLimit, curItem);
                }
                int N9 = getChildCount();
                for (int i17 = 0; i17 < N9; i17++) {
                    View childAt = getChildAt(i17);
                    C08633a c08633a = (C08633a) childAt.getLayoutParams();
                    c08633a.A01 = i17;
                    if (!c08633a.A05 && c08633a.A00 == 0.0f) {
                        C3Z A07 = A07(childAt);
                        String[] strArr7 = A0t;
                        String str5 = strArr7[7];
                        String str6 = strArr7[0];
                        int charAt2 = str5.charAt(10);
                        int curIndex17 = str6.charAt(10);
                        if (charAt2 != curIndex17) {
                            if (A07 == null) {
                            }
                            c08633a.A00 = A07.A01;
                            int curIndex18 = A07.A02;
                            c08633a.A02 = curIndex18;
                        } else {
                            A0t[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                            if (A07 == null) {
                            }
                            c08633a.A00 = A07.A01;
                            int curIndex182 = A07.A02;
                            c08633a.A02 = curIndex182;
                        }
                    }
                }
                A0B();
                String[] strArr8 = A0t;
                String str7 = strArr8[4];
                String resName = strArr8[5];
                if (str7.length() != resName.length()) {
                    throw new RuntimeException();
                }
                String[] strArr9 = A0t;
                strArr9[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
                strArr9[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
                if (hasFocus()) {
                    View currentFocused = findFocus();
                    String[] strArr10 = A0t;
                    if (strArr10[3].charAt(15) == strArr10[6].charAt(15)) {
                        throw new RuntimeException();
                    }
                    String[] strArr11 = A0t;
                    strArr11[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                    strArr11[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                    if (currentFocused != null) {
                        c3z = A06(currentFocused);
                    } else {
                        c3z = null;
                    }
                    if (c3z == null || c3z.A02 != this.A00) {
                        for (int i18 = 0; i18 < getChildCount(); i18++) {
                            View childAt2 = getChildAt(i18);
                            C3Z A072 = A07(childAt2);
                            if (A072 != null && A072.A02 == this.A00 && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            try {
                Resources resources = getResources();
                int curIndex19 = getId();
                hexString = resources.getResourceName(curIndex19);
            } catch (Resources.NotFoundException unused) {
                int curIndex20 = getId();
                hexString = Integer.toHexString(curIndex20);
                if (A0t[2].length() != 14) {
                    A0t[2] = "3cJ8G";
                }
            }
            StringBuilder sb = new StringBuilder();
            String resName2 = A08(158, 142, 58);
            StringBuilder append = sb.append(resName2).append(this.A0G);
            String resName3 = A08(77, 9, 42);
            StringBuilder append2 = append.append(resName3).append(startPos);
            String resName4 = A08(18, 11, 72);
            StringBuilder append3 = append2.append(resName4).append(hexString);
            String resName5 = A08(4, 14, 58);
            StringBuilder append4 = append3.append(resName5).append(getClass());
            String resName6 = A08(29, 22, 86);
            throw new IllegalStateException(append4.append(resName6).append(this.A01.getClass()).toString());
        }
        throw new RuntimeException();
    }

    private void A0H(int i9, float f9, int i10) {
        List<InterfaceC08653c> list = this.A0d;
        if (list != null) {
            int i11 = list.size();
            for (int i12 = 0; i12 < i11; i12++) {
                this.A0d.get(i12);
            }
        }
    }

    private final void A0I(int childLeft, float f9, int i9) {
        int max;
        if (this.A0D > 0) {
            int hgrav = getScrollX();
            int width = getPaddingLeft();
            int paddingRight = getPaddingRight();
            if (A0t[1].length() != 12) {
                String[] strArr = A0t;
                strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
                strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
                int paddingLeft = getWidth();
                int scrollX = getChildCount();
                for (int childCount = 0; childCount < scrollX; childCount++) {
                    View childAt = getChildAt(childCount);
                    C08633a c08633a = (C08633a) childAt.getLayoutParams();
                    if (c08633a.A05) {
                        int paddingRight2 = c08633a.A04;
                        switch (paddingRight2 & 7) {
                            case 1:
                                int paddingRight3 = childAt.getMeasuredWidth();
                                max = Math.max((paddingLeft - paddingRight3) / 2, width);
                                break;
                            case 2:
                            case 4:
                            default:
                                max = width;
                                break;
                            case 3:
                                max = width;
                                int paddingRight4 = childAt.getWidth();
                                width += paddingRight4;
                                break;
                            case 5:
                                int paddingRight5 = childAt.getMeasuredWidth();
                                max = (paddingLeft - paddingRight) - paddingRight5;
                                int paddingRight6 = childAt.getMeasuredWidth();
                                paddingRight += paddingRight6;
                                break;
                        }
                        int paddingRight7 = childAt.getLeft();
                        int i10 = (max + hgrav) - paddingRight7;
                        if (i10 != 0) {
                            childAt.offsetLeftAndRight(i10);
                        }
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        A0H(childLeft, f9, i9);
        if (0 != 0) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((C08633a) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 121));
                }
            }
        }
        this.A0e = true;
    }

    private void A0K(int i9, int i10, int i11, int i12) {
        if (i10 > 0) {
            ArrayList<C3Z> arrayList = this.A0r;
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0t[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean isFinished = this.A0X.isFinished();
                if (A0t[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0t[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!isFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int paddingLeft = ((i9 - getPaddingLeft()) - getPaddingRight()) + i11;
                int widthWithMargin = getPaddingLeft();
                int i13 = i10 - widthWithMargin;
                int widthWithMargin2 = getPaddingRight();
                int i14 = (i13 - widthWithMargin2) + i12;
                int widthWithMargin3 = getScrollX();
                int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i14));
                int widthWithMargin4 = getScrollY();
                scrollTo(oldWidthWithMargin, widthWithMargin4);
                return;
            }
        }
        C3Z ii = A04(this.A00);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : 0.0f;
        int paddingLeft2 = (int) (((i9 - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft2, getScrollY());
        }
    }

    private final void A0L(int i9, boolean z8) {
        this.A0m = false;
        A0N(i9, z8, false);
    }

    private void A0M(int i9, boolean z8, int i10, boolean z9) {
        C3Z A04 = A04(i9);
        int i11 = 0;
        if (A04 != null) {
            i11 = (int) (getClientWidth() * Math.max(this.A02, Math.min(A04.A00, this.A07)));
        }
        int destX = A0t[2].length();
        if (destX == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z8) {
            A0J(i11, 0, i10);
            if (z9) {
                A0E(i9);
                return;
            }
            return;
        }
        if (z9) {
            A0E(i9);
        }
        A0R(false);
        scrollTo(i11, 0);
        A0Z(i11);
    }

    private final void A0N(int i9, boolean z8, boolean z9) {
        A0O(i9, z8, z9, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7 < r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0O(int r7, boolean r8, boolean r9, int r10) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto Lb
            int r0 = r0.A01()
            if (r0 > 0) goto Lf
        Lb:
            r6.setScrollingCacheEnabled(r3)
            return
        Lf:
            if (r9 != 0) goto L21
            int r0 = r6.A00
            if (r0 != r7) goto L21
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            int r0 = r0.size()
            if (r0 == 0) goto L21
            r6.setScrollingCacheEnabled(r3)
            return
        L21:
            r4 = 1
            if (r7 >= 0) goto L48
            r7 = 0
        L25:
            int r1 = r6.A0L
            int r5 = r6.A00
            int r0 = r5 + r1
            if (r7 > r0) goto L67
            int r5 = r5 - r1
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C08703h.A0t
            r0 = 7
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L59
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            int r0 = r0.A01()
            if (r7 < r0) goto L25
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            int r0 = r0.A01()
            int r7 = r0 + (-1)
            goto L25
        L59:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C08703h.A0t
            java.lang.String r1 = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF"
            r0 = 6
            r2[r0] = r1
            if (r7 >= r5) goto L7d
        L67:
            r1 = 0
        L68:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            int r0 = r0.size()
            if (r1 >= r0) goto L7d
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.3Z r0 = (com.meta.analytics.dsp.uinode.C3Z) r0
            r0.A04 = r4
            int r1 = r1 + 1
            goto L68
        L7d:
            int r0 = r6.A00
            if (r0 == r7) goto L82
            r3 = 1
        L82:
            boolean r0 = r6.A0g
            if (r0 == 0) goto L91
            r6.A00 = r7
            if (r3 == 0) goto L8d
            r6.A0E(r7)
        L8d:
            r6.requestLayout()
        L90:
            return
        L91:
            r6.A0G(r7)
            r6.A0M(r7, r8, r10, r3)
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.A0O(int, boolean, boolean, int):void");
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId == pointerIndex) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i9);
            String[] strArr = A0t;
            String str = strArr[4];
            String str2 = strArr[5];
            int pointerId2 = str.length();
            int pointerIndex2 = str2.length();
            if (pointerId2 != pointerIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[4] = "";
            strArr2[5] = "";
            int pointerIndex3 = motionEvent.getPointerId(i9);
            this.A08 = pointerIndex3;
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0051 */
    /* JADX WARN: Incorrect condition in loop: B:38:0x0095 */
    /* JADX WARN: Incorrect condition in loop: B:72:0x011f */
    /* JADX WARN: Incorrect condition in loop: B:86:0x015e */
    /* JADX WARN: Incorrect condition in loop: B:9:0x0024 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0Q(com.meta.analytics.dsp.uinode.C3Z r13, int r14, com.meta.analytics.dsp.uinode.C3Z r15) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.A0Q(com.facebook.ads.redexgen.X.3Z, int, com.facebook.ads.redexgen.X.3Z):void");
    }

    private void A0R(boolean z8) {
        boolean z9 = this.A0P == 2;
        if (z9) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            if (!needPopulate) {
                this.A0X.abortAnimation();
                if (A0t[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0t[1] = "La7";
                int scrollX = getScrollX();
                int oldX = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || oldX != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0m = false;
        for (int i9 = 0; i9 < this.A0r.size(); i9++) {
            C3Z c3z = this.A0r.get(i9);
            boolean needPopulate2 = c3z.A04;
            if (needPopulate2) {
                z9 = true;
                c3z.A04 = false;
            }
        }
        if (z9) {
            if (z8) {
                C3T.A0D(this, this.A0q);
            } else {
                this.A0q.run();
            }
        }
    }

    private void A0S(boolean z8) {
        int layerType;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (z8) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i9).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z8) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z8);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        int i9 = this.A00;
        if (i9 > 0) {
            A0L(i9 - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        C3E c3e = this.A01;
        if (c3e != null && this.A00 < c3e.A01() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        if (A0t[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
        strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
        return false;
    }

    private boolean A0X(float f9) {
        boolean z8 = false;
        float f10 = this.A05 - f9;
        this.A05 = f9;
        float scrollX = getScrollX() + f10;
        int clientWidth = getClientWidth();
        float f11 = clientWidth * this.A02;
        float deltaX = clientWidth;
        float deltaX2 = deltaX * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C3Z c3z = this.A0r.get(0);
        C3Z c3z2 = this.A0r.get(r1.size() - 1);
        if (c3z.A02 != 0) {
            rightAbsolute = false;
            float f12 = c3z.A00;
            if (A0t[1].length() == 12) {
                throw new RuntimeException();
            }
            A0t[1] = "a";
            f11 = f12 * clientWidth;
        }
        if (c3z2.A02 != this.A01.A01() - 1) {
            leftAbsolute = false;
            float deltaX3 = c3z2.A00;
            deltaX2 = deltaX3 * clientWidth;
        }
        if (scrollX < f11) {
            if (rightAbsolute) {
                this.A0V.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z8 = true;
            }
            scrollX = f11;
        } else if (scrollX > deltaX2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float abs = Math.abs(scrollX - deltaX2);
                float scrollX2 = clientWidth;
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    edgeEffect.onPull(abs / scrollX2);
                    z8 = true;
                } else {
                    A0t[1] = "TwKB2lBmR";
                    edgeEffect.onPull(abs / scrollX2);
                    z8 = true;
                }
            }
            scrollX = deltaX2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z8;
    }

    private final boolean A0Y(float f9, float f10) {
        if (f9 >= this.A0I || f10 <= 0.0f) {
            if (f9 > getWidth() - this.A0I) {
                if (A0t[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0t;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (f10 < 0.0f) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0Z(int i9) {
        int size = this.A0r.size();
        String A08 = A08(397, 53, 60);
        if (size == 0) {
            if (this.A0g) {
                return false;
            }
            this.A0e = false;
            A0I(0, 0.0f, 0);
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0t[2] = "c3ramapljB1reDSufYjA";
            if (this.A0e) {
                return false;
            }
            throw new IllegalStateException(A08);
        }
        C3Z A03 = A03();
        int clientWidth = getClientWidth();
        int i10 = this.A0M;
        int currentPage = clientWidth + i10;
        int i11 = A03.A02;
        float f9 = ((i9 / clientWidth) - A03.A00) / (A03.A01 + (i10 / clientWidth));
        this.A0e = false;
        A0I(i11, f9, (int) (currentPage * f9));
        if (this.A0e) {
            return true;
        }
        throw new IllegalStateException(A08);
    }

    private final boolean A0a(int i9) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            boolean z8 = false;
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == this) {
                    z8 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z8) {
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A08(0, 4, 21)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(300, 9, 47), A08(309, 72, 80) + sb.toString());
                findFocus = null;
            }
        }
        boolean z9 = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, findFocus, i9);
        if (nextFocused != null && nextFocused != findFocus) {
            if (i9 == 17) {
                z9 = (findFocus == null || A02(this.A0o, nextFocused).left < A02(this.A0o, findFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i9 == 66) {
                z9 = (findFocus == null || A02(this.A0o, nextFocused).left > A02(this.A0o, findFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i9 == 17 || i9 == 1) {
            z9 = A0V();
        } else if (i9 == 66 || i9 == 2) {
            z9 = A0W();
        }
        if (z9) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i9));
        }
        return z9;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0V();
                }
                return A0a(17);
            case 22:
                boolean hasModifiers = keyEvent.hasModifiers(2);
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0t[1] = "lC1XoLB2bpdljamdt6Vm";
                if (hasModifiers) {
                    return A0W();
                }
                return A0a(66);
            case 61:
                boolean handled2 = keyEvent.hasNoModifiers();
                if (handled2) {
                    return A0a(2);
                }
                boolean handled3 = keyEvent.hasModifiers(1);
                if (!handled3) {
                    return false;
                }
                return A0a(1);
            default:
                return false;
        }
    }

    public static boolean A0c(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z8, int i9, int i10, int i11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i12 = view.getScrollX();
            int count = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i10 + i12 >= childAt.getLeft() && i10 + i12 < childAt.getRight() && i11 + count >= childAt.getTop() && i11 + count < childAt.getBottom()) {
                    int left = (i10 + i12) - childAt.getLeft();
                    int i13 = i11 + count;
                    if (A0t[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0t;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0d(childAt, true, i9, left, i13 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z8 && view.canScrollHorizontally(-i9);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x002a */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0e() {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.3E r0 = r11.A01
            int r3 = r0.A01()
            r11.A0G = r3
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r11.A0r
            int r1 = r0.size()
            int r0 = r11.A0L
            int r0 = r0 * 2
            r5 = 1
            int r0 = r0 + r5
            r4 = 0
            if (r1 >= r0) goto L7b
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r11.A0r
            int r0 = r0.size()
            if (r0 >= r3) goto L7b
            r10 = 1
        L20:
            int r6 = r11.A00
            r9 = 0
            r2 = 0
        L24:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r11.A0r
            int r0 = r0.size()
            if (r2 >= r0) goto L7d
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r11.A0r
            java.lang.Object r8 = r0.get(r2)
            com.facebook.ads.redexgen.X.3Z r8 = (com.meta.analytics.dsp.uinode.C3Z) r8
            com.facebook.ads.redexgen.X.3E r1 = r11.A01
            java.lang.Object r0 = r8.A03
            int r7 = r1.A02(r0)
            r0 = -1
            if (r7 != r0) goto L41
        L3f:
            int r2 = r2 + r5
            goto L24
        L41:
            r0 = -2
            if (r7 != r0) goto L6c
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r11.A0r
            r0.remove(r2)
            int r2 = r2 + (-1)
            if (r9 != 0) goto L4e
            r9 = 1
        L4e:
            com.facebook.ads.redexgen.X.3E r7 = r11.A01
            int r1 = r8.A02
            java.lang.Object r0 = r8.A03
            r7.A07(r11, r1, r0)
            r10 = 1
            int r1 = r11.A00
            int r0 = r8.A02
            if (r1 != r0) goto L3f
            int r1 = r11.A00
            int r0 = r3 + (-1)
            int r0 = java.lang.Math.min(r1, r0)
            int r6 = java.lang.Math.max(r4, r0)
            r10 = 1
            goto L3f
        L6c:
            int r0 = r8.A02
            if (r0 == r7) goto L3f
            int r1 = r8.A02
            int r0 = r11.A00
            if (r1 != r0) goto L77
            r6 = r7
        L77:
            r8.A02 = r7
            r10 = 1
            goto L3f
        L7b:
            r10 = 0
            goto L20
        L7d:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r1 = r11.A0r
            java.util.Comparator<com.facebook.ads.redexgen.X.3Z> r0 = com.meta.analytics.dsp.uinode.C08703h.A0x
            java.util.Collections.sort(r1, r0)
            if (r10 == 0) goto Lbb
            int r3 = r11.getChildCount()
            r2 = 0
        L8b:
            if (r2 >= r3) goto La1
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.facebook.ads.redexgen.X.3a r1 = (com.meta.analytics.dsp.uinode.C08633a) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L9e
            r0 = 0
            r1.A00 = r0
        L9e:
            int r2 = r2 + 1
            goto L8b
        La1:
            r11.A0N(r6, r4, r5)
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C08703h.A0t
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto Lbc
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C08703h.A0t
            java.lang.String r1 = "iBz2AIJ6C"
            r0 = 2
            r2[r0] = r1
            r11.requestLayout()
        Lbb:
            return
        Lbc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.A0e():void");
    }

    public final void A0f() {
        A0G(this.A00);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0011 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
        /*
            r6 = this;
            int r5 = r7.size()
            int r4 = r6.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r4 == r0) goto L2f
            r3 = 0
        Ld:
            int r0 = r6.getChildCount()
            if (r3 >= r0) goto L2f
            android.view.View r2 = r6.getChildAt(r3)
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L2c
            com.facebook.ads.redexgen.X.3Z r0 = r6.A07(r2)
            if (r0 == 0) goto L2c
            int r1 = r0.A02
            int r0 = r6.A00
            if (r1 != r0) goto L2c
            r2.addFocusables(r7, r8, r9)
        L2c:
            int r3 = r3 + 1
            goto Ld
        L2f:
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r4 != r0) goto L39
            int r0 = r7.size()
            if (r5 != r0) goto L57
        L39:
            boolean r0 = r6.isFocusable()
            if (r0 != 0) goto L40
            return
        L40:
            r1 = r9 & 1
            r0 = 1
            if (r1 != r0) goto L52
            boolean r0 = r6.isInTouchMode()
            if (r0 == 0) goto L52
            boolean r0 = r6.isFocusableInTouchMode()
            if (r0 != 0) goto L52
            return
        L52:
            if (r7 == 0) goto L57
            r7.add(r6)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.addFocusables(java.util.ArrayList, int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C08633a c08633a = (C08633a) layoutParams;
        c08633a.A05 |= A0c(view);
        if (this.A0h) {
            if (c08633a == null || !c08633a.A05) {
                c08633a.A03 = true;
                if (A0t[2].length() == 14) {
                    throw new RuntimeException();
                }
                A0t[1] = "XL6oa3uLuKs2IOpHyjfCXdHiJnTalh";
                addViewInLayout(view, i9, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i9, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        return i9 < 0 ? scrollX > ((int) (((float) width) * this.A02)) : i9 > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C08633a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0j = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y4 = getScrollY();
            int x9 = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x9 || y4 != oldY) {
                scrollTo(x9, oldY);
                if (!A0Z(x9)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            C3T.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3Z A07;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int childCount2 = childAt.getVisibility();
            if (childCount2 == 0 && (A07 = A07(childAt)) != null) {
                int i10 = A07.A02;
                String[] strArr = A0t;
                String str = strArr[7];
                String str2 = strArr[0];
                int i11 = str.charAt(10);
                int childCount3 = str2.charAt(10);
                if (i11 != childCount3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0t;
                strArr2[4] = "";
                strArr2[5] = "";
                int childCount4 = this.A00;
                if (i10 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r3.A01() > 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r5 = r8.save();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r3 = getWidth();
        r8.rotate(270.0f);
        r1 = -r4;
        r8.translate(r1 + getPaddingTop(), r7.A02 * r3);
        r7.A0V.setSize(r4, r3);
        r0 = r7.A0V.draw(r8);
        r6 = false | r0;
        r8.restoreToCount(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r0 = r7.A0W.isFinished();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r3 = r8.save();
        r5 = getWidth();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r8.rotate(90.0f);
        r8.translate(-getPaddingTop(), (-(r7.A07 + 1.0f)) * r5);
        r7.A0W.setSize(r4, r5);
        r0 = r7.A0W.draw(r8);
        r6 = r6 | r0;
        r8.restoreToCount(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C08633a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C08633a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C3E getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        int result = this.A0F == 2 ? (i9 - 1) - i10 : i10;
        int index = ((C08633a) this.A0b.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0q);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0r.size() > 0 && this.A01 != null) {
            int lastPos = getScrollX();
            int firstPos = getWidth();
            float f10 = this.A0M / firstPos;
            int i9 = 0;
            C3Z c3z = this.A0r.get(0);
            float f11 = c3z.A00;
            int size = this.A0r.size();
            int i10 = this.A0r.get(size - 1).A02;
            loop0: for (int itemIndex = c3z.A02; itemIndex < i10; itemIndex++) {
                while (itemIndex > c3z.A02 && i9 < size) {
                    i9++;
                    C3Z c3z2 = this.A0r.get(i9);
                    String[] strArr = A0t;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int scrollX = str.charAt(10);
                    if (scrollX != str2.charAt(10)) {
                        break loop0;
                    }
                    A0t[2] = "Qpfq";
                    c3z = c3z2;
                }
                if (itemIndex == c3z.A02) {
                    f9 = (c3z.A00 + c3z.A01) * firstPos;
                    f11 = c3z.A00 + c3z.A01 + f10;
                } else {
                    float A00 = this.A01.A00(itemIndex);
                    f9 = (f11 + A00) * firstPos;
                    f11 += A00 + f10;
                }
                if (this.A0M + f9 > lastPos) {
                    Drawable drawable = this.A0S;
                    int round = Math.round(f9);
                    int i11 = this.A0Q;
                    int scrollX2 = Math.round(this.A0M + f9);
                    drawable.setBounds(round, i11, scrollX2, this.A09);
                    Drawable drawable2 = this.A0S;
                    String[] strArr2 = A0t;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int scrollX3 = str3.charAt(10);
                    if (scrollX3 != str4.charAt(10)) {
                        A0t[1] = "";
                        drawable2.draw(canvas);
                    } else {
                        String[] strArr3 = A0t;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable2.draw(canvas);
                    }
                }
                int i12 = lastPos + firstPos;
                int scrollX4 = A0t[1].length();
                if (scrollX4 == 12) {
                    throw new RuntimeException();
                }
                A0t[1] = "DrXdt";
                if (f9 > i12) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f9;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0t[2] = "iW5W";
            return false;
        }
        if (action != 0) {
            if (this.A0i) {
                return true;
            }
            if (this.A0k) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x9 = motionEvent.getX();
                this.A03 = x9;
                this.A05 = x9;
                float y4 = motionEvent.getY();
                this.A04 = y4;
                this.A06 = y4;
                this.A08 = motionEvent.getPointerId(0);
                this.A0k = false;
                this.A0j = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0i = false;
                    break;
                } else {
                    this.A0X.abortAnimation();
                    this.A0m = false;
                    A0f();
                    this.A0i = true;
                    A0T(true);
                    setScrollState(1);
                    break;
                }
                break;
            case 2:
                int i9 = this.A08;
                if (i9 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i9);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float f10 = x10 - this.A05;
                    float abs = Math.abs(f10);
                    float y6 = motionEvent.getY(findPointerIndex);
                    float y9 = Math.abs(y6 - this.A04);
                    if (f10 != 0.0f && !A0Y(this.A05, f10) && A0d(this, false, (int) f10, (int) x10, (int) y6)) {
                        this.A05 = x10;
                        this.A06 = y6;
                        this.A0k = true;
                        return false;
                    }
                    int i10 = this.A0R;
                    if (abs > i10 && 0.5f * abs > y9) {
                        this.A0i = true;
                        A0T(true);
                        setScrollState(1);
                        if (f10 <= 0.0f) {
                            f9 = this.A03 - this.A0R;
                        } else {
                            float f11 = this.A03;
                            int i11 = this.A0R;
                            String[] strArr2 = A0t;
                            if (strArr2[7].charAt(10) != strArr2[0].charAt(10)) {
                                f9 = f11 + i11;
                            } else {
                                String[] strArr3 = A0t;
                                strArr3[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                strArr3[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                f9 = f11 + i11;
                            }
                        }
                        this.A05 = f9;
                        this.A06 = y6;
                        setScrollingCacheEnabled(true);
                    } else if (y9 > i10) {
                        this.A0k = true;
                    }
                    if (this.A0i && A0X(x10)) {
                        C3T.A07(this);
                        break;
                    }
                }
                break;
            case 6:
                A0P(motionEvent);
                break;
        }
        VelocityTracker velocityTracker = this.A0U;
        if (A0t[2].length() != 14) {
            String[] strArr4 = A0t;
            strArr4[3] = "qZEBvpK5WM51NnTYZj9Wv9V85vPNkfCF";
            strArr4[6] = "8DoAZte0LwUXg2aXlHvSBWFBy3vUeqDy";
            if (velocityTracker == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            return this.A0i;
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        boolean z9;
        C3Z A07;
        int max;
        int count;
        int paddingLeft = getChildCount();
        int paddingRight = i11 - i9;
        int i13 = i12 - i10;
        int scrollX = getPaddingLeft();
        int decorCount = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int hgrav = getScrollX();
        int paddingBottom2 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 8;
            String[] strArr = A0t;
            String str = strArr[4];
            String str2 = strArr[5];
            int count2 = str.length();
            if (count2 == str2.length()) {
                A0t[1] = "";
                if (i14 < paddingLeft) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        C08633a c08633a = (C08633a) childAt.getLayoutParams();
                        if (c08633a.A05) {
                            int count3 = c08633a.A04 & 7;
                            int childTop = c08633a.A04 & 112;
                            switch (count3) {
                                case 1:
                                    max = Math.max((paddingRight - childAt.getMeasuredWidth()) / 2, scrollX);
                                    break;
                                case 2:
                                case 4:
                                default:
                                    max = scrollX;
                                    break;
                                case 3:
                                    max = scrollX;
                                    scrollX += childAt.getMeasuredWidth();
                                    break;
                                case 5:
                                    int i16 = paddingRight - childLeft;
                                    int measuredWidth = childAt.getMeasuredWidth();
                                    String[] strArr2 = A0t;
                                    String str3 = strArr2[7];
                                    String str4 = strArr2[0];
                                    int count4 = str3.charAt(10);
                                    if (count4 == str4.charAt(10)) {
                                        A0t[1] = "51Hkg";
                                        max = i16 - measuredWidth;
                                        childLeft += childAt.getMeasuredWidth();
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                            switch (childTop) {
                                case 16:
                                    count = Math.max((i13 - childAt.getMeasuredHeight()) / 2, decorCount);
                                    break;
                                case 48:
                                    count = decorCount;
                                    decorCount += childAt.getMeasuredHeight();
                                    break;
                                case 80:
                                    int count5 = i13 - paddingBottom;
                                    count = count5 - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                    break;
                                default:
                                    count = decorCount;
                                    break;
                            }
                            int i17 = max + hgrav;
                            int width = i17 + childAt.getMeasuredWidth();
                            childAt.layout(i17, count, width, childAt.getMeasuredHeight() + count);
                            paddingBottom2++;
                        } else {
                            continue;
                        }
                    }
                    i14++;
                } else {
                    int paddingRight2 = (paddingRight - scrollX) - childLeft;
                    int i18 = 0;
                    while (i18 < paddingLeft) {
                        View childAt2 = getChildAt(i18);
                        if (childAt2.getVisibility() != i15) {
                            C08633a c08633a2 = (C08633a) childAt2.getLayoutParams();
                            if (!c08633a2.A05 && (A07 = A07(childAt2)) != null) {
                                int childWidth = scrollX + ((int) (paddingRight2 * A07.A00));
                                if (c08633a2.A03) {
                                    c08633a2.A03 = false;
                                    int widthSpec = View.MeasureSpec.makeMeasureSpec((int) (paddingRight2 * c08633a2.A00), 1073741824);
                                    childAt2.measure(widthSpec, View.MeasureSpec.makeMeasureSpec((i13 - decorCount) - paddingBottom, 1073741824));
                                }
                                int heightSpec = childAt2.getMeasuredWidth();
                                int widthSpec2 = childAt2.getMeasuredHeight();
                                int i19 = decorCount;
                                childAt2.layout(childWidth, i19, heightSpec + childWidth, widthSpec2 + i19);
                            }
                        }
                        i18++;
                        i15 = 8;
                    }
                    this.A0Q = decorCount;
                    this.A09 = i13 - paddingBottom;
                    this.A0D = paddingBottom2;
                    if (this.A0g) {
                        int i20 = this.A00;
                        z9 = false;
                        String[] strArr3 = A0t;
                        if (strArr3[4].length() != strArr3[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0t;
                        strArr4[4] = "";
                        strArr4[5] = "";
                        A0M(i20, false, 0, false);
                    } else {
                        z9 = false;
                    }
                    this.A0g = z9;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i9, Rect rect) {
        int end;
        int i10;
        C3Z A07;
        int i11 = getChildCount();
        int count = i9 & 2;
        if (count != 0) {
            end = 0;
            i10 = 1;
        } else {
            end = i11 - 1;
            i10 = -1;
            i11 = -1;
        }
        while (end != i11) {
            View child = getChildAt(end);
            int index = A0t[2].length();
            if (index == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int count2 = child.getVisibility();
            if (count2 == 0 && (A07 = A07(child)) != null) {
                int index2 = A07.A02;
                int count3 = this.A00;
                if (index2 == count3 && child.requestFocus(i9, rect)) {
                    return true;
                }
            }
            end += i10;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0t;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0a = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        C3E c3e = this.A01;
        if (c3e != null) {
            Parcelable superState2 = c3e.A03();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            int i13 = this.A0M;
            A0K(i9, i11, i13, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0h) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0010 */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.ads.redexgen.X.3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAdapter(com.meta.analytics.dsp.uinode.C3E r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L33
            r0.A06(r3)
            r5 = 0
        La:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            int r0 = r0.size()
            if (r5 >= r0) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            java.lang.Object r0 = r0.get(r5)
            com.facebook.ads.redexgen.X.3Z r0 = (com.meta.analytics.dsp.uinode.C3Z) r0
            com.facebook.ads.redexgen.X.3E r2 = r6.A01
            int r1 = r0.A02
            java.lang.Object r0 = r0.A03
            r2.A07(r6, r1, r0)
            int r5 = r5 + 1
            goto La
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3Z> r0 = r6.A0r
            r0.clear()
            r6.A0A()
            r6.A00 = r4
            r6.scrollTo(r4, r4)
        L33:
            r6.A01 = r7
            r6.A0G = r4
            if (r7 == 0) goto L6a
            com.facebook.ads.redexgen.X.3e r0 = r6.A0Z
            if (r0 != 0) goto L44
            com.facebook.ads.redexgen.X.3e r0 = new com.facebook.ads.redexgen.X.3e
            r0.<init>()
            r6.A0Z = r0
        L44:
            com.facebook.ads.redexgen.X.3E r1 = r6.A01
            com.facebook.ads.redexgen.X.3e r0 = r6.A0Z
            r1.A06(r0)
            r6.A0m = r4
            boolean r2 = r6.A0g
            r1 = 1
            r6.A0g = r1
            com.facebook.ads.redexgen.X.3E r0 = r6.A01
            int r0 = r0.A01()
            r6.A0G = r0
            int r0 = r6.A0O
            if (r0 < 0) goto L92
            int r0 = r6.A0O
            r6.A0N(r0, r4, r1)
            r0 = -1
            r6.A0O = r0
            r6.A0T = r3
            r6.A0a = r3
        L6a:
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0c
            if (r0 == 0) goto L9c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9c
            r1 = 0
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0c
            int r0 = r0.size()
            if (r1 >= r0) goto L9c
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0c
            r0.get(r1)
            r2 = 381(0x17d, float:5.34E-43)
            r1 = 16
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r1 = A08(r2, r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L92:
            if (r2 != 0) goto L98
            r6.A0f()
            goto L6a
        L98:
            r6.requestLayout()
            goto L6a
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C08703h.setAdapter(com.facebook.ads.redexgen.X.3E):void");
    }

    public void setCurrentItem(int i9) {
        this.A0m = false;
        A0N(i9, !this.A0g, false);
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1) {
            Log.w(A08(300, 9, 47), A08(127, 31, 60) + i9 + A08(51, 26, 90) + 1);
            i9 = 1;
        }
        if (i9 != this.A0L) {
            this.A0L = i9;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC08653c interfaceC08653c) {
        this.A0Y = interfaceC08653c;
    }

    public void setPageMargin(int i9) {
        int width = this.A0M;
        this.A0M = i9;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i9, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i9) {
        setPageMarginDrawable(AbstractC08472k.A00(getContext(), i9));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i9) {
        if (this.A0P == i9) {
            return;
        }
        this.A0P = i9;
        if (0 != 0) {
            A0S(i9 != 0);
        }
        A0F(i9);
    }

    private void setScrollingCacheEnabled(boolean z8) {
        if (this.A0n != z8) {
            this.A0n = z8;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
