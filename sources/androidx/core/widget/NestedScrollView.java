package androidx.core.widget;

import L5.b;
import T.C0270g;
import T.C0289u;
import T.E;
import T.F;
import T.G;
import T.InterfaceC0287s;
import T.InterfaceC0291w;
import Z.e;
import Z.h;
import Z.i;
import Z.j;
import Z.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.fragment.app.FragmentTransaction;
import e1.f;
import java.util.ArrayList;
import java.util.Map;
import n1.C2475f;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0291w, InterfaceC0287s {

    /* renamed from: D, reason: collision with root package name */
    public static final float f4464D = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: E, reason: collision with root package name */
    public static final h f4465E = new h(0);

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f4466F = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0289u f4467A;

    /* renamed from: B, reason: collision with root package name */
    public float f4468B;

    /* renamed from: C, reason: collision with root package name */
    public final C0270g f4469C;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public long f4470c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4471d;

    /* renamed from: f, reason: collision with root package name */
    public final OverScroller f4472f;

    /* renamed from: g, reason: collision with root package name */
    public final EdgeEffect f4473g;

    /* renamed from: h, reason: collision with root package name */
    public final EdgeEffect f4474h;

    /* renamed from: i, reason: collision with root package name */
    public int f4475i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4476j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4477k;
    public View l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public VelocityTracker f4478n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4479o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4480p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4481q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4482r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4483s;

    /* renamed from: t, reason: collision with root package name */
    public int f4484t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f4485u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f4486v;

    /* renamed from: w, reason: collision with root package name */
    public int f4487w;

    /* renamed from: x, reason: collision with root package name */
    public int f4488x;

    /* renamed from: y, reason: collision with root package name */
    public k f4489y;

    /* renamed from: z, reason: collision with root package name */
    public final b f4490z;

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, L5.b] */
    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f4471d = new Rect();
        this.f4476j = true;
        this.f4477k = false;
        this.l = null;
        this.m = false;
        this.f4480p = true;
        this.f4484t = -1;
        this.f4485u = new int[2];
        this.f4486v = new int[2];
        this.f4469C = new C0270g(getContext(), new C2475f(this, 21));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f4473g = edgeEffect;
        if (i9 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f4474h = edgeEffect2;
        this.b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4472f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4481q = viewConfiguration.getScaledTouchSlop();
        this.f4482r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4483s = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4466F, com.tools.arruler.photomeasure.camera.ruler.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4490z = new Object();
        this.f4467A = new C0289u(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, f4465E);
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && l((View) parent, view2)) {
            return true;
        }
        return false;
    }

    @Override // T.InterfaceC0291w
    public final void a(View view, int i9, int i10, int i11, int i12, int[] iArr, int i13) {
        n(i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // T.InterfaceC0290v
    public final void b(View view, int i9, int i10, int i11, int i12, int i13) {
        n(i12, i13, null);
    }

    @Override // T.InterfaceC0290v
    public final boolean c(View view, View view2, int i9, int i10) {
        return (i9 & 2) != 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // T.InterfaceC0290v
    public final void d(View view, View view2, int i9, int i10) {
        b bVar = this.f4490z;
        if (i10 == 1) {
            bVar.b = i9;
        } else {
            bVar.f1822a = i9;
        }
        startNestedScroll(2, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !i(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f9, float f10, boolean z8) {
        return this.f4467A.a(f9, f10, z8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return this.f4467A.b(f9, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return this.f4467A.c(i9, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return this.f4467A.e(i9, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i9;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4473g;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i9 = getPaddingLeft();
            } else {
                i9 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i9, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f4474h;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (i.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft();
            }
            if (i.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i10 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // T.InterfaceC0290v
    public final void e(View view, int i9) {
        b bVar = this.f4490z;
        if (i9 == 1) {
            bVar.b = 0;
        } else {
            bVar.f1822a = 0;
        }
        stopNestedScroll(i9);
    }

    @Override // T.InterfaceC0290v
    public final void f(View view, int i9, int i10, int[] iArr, int i11) {
        dispatchNestedPreScroll(i9, i10, iArr, null, i11);
    }

    public final boolean g(int i9) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i9);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f4471d;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i9);
        } else {
            if (i9 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i9 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i9 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!m(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        b bVar = this.f4490z;
        return bVar.b | bVar.f1822a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f4468B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f4468B = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f4468B;
    }

    public final int h(Rect rect) {
        int i9;
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i9 = i12 - verticalFadingEdgeLength;
        } else {
            i9 = i12;
        }
        int i13 = rect.bottom;
        if (i13 > i9 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i9;
            }
            return Math.min(i11, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        }
        if (rect.top >= scrollY || i13 >= i9) {
            return 0;
        }
        if (rect.height() > height) {
            i10 = 0 - (i9 - rect.bottom);
        } else {
            i10 = 0 - (scrollY - rect.top);
        }
        return Math.max(i10, -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4467A.g(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f4471d.setEmpty();
        int i9 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode != 122) {
                                        if (keyCode != 123) {
                                            return false;
                                        }
                                        q(130);
                                        return false;
                                    }
                                    q(33);
                                    return false;
                                }
                                return k(130);
                            }
                            return k(33);
                        }
                        if (keyEvent.isShiftPressed()) {
                            i9 = 33;
                        }
                        q(i9);
                        return false;
                    }
                    if (keyEvent.isAltPressed()) {
                        return k(130);
                    }
                    return g(130);
                }
                if (keyEvent.isAltPressed()) {
                    return k(33);
                }
                return g(33);
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4467A.f2931d;
    }

    public final void j(int i9) {
        if (getChildCount() > 0) {
            this.f4472f.fling(getScrollX(), getScrollY(), 0, i9, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            startNestedScroll(2, 1);
            this.f4488x = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i9) {
        boolean z8;
        int childCount;
        if (i9 == 130) {
            z8 = true;
        } else {
            z8 = false;
        }
        int height = getHeight();
        Rect rect = this.f4471d;
        rect.top = 0;
        rect.bottom = height;
        if (z8 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i9, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i9, int i10) {
        Rect rect = this.f4471d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i9 >= getScrollY() && rect.top - i9 <= getScrollY() + i10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i9, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i9);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4467A.d(iArr, scrollY2, i9 - scrollY2, i10);
    }

    public final void o(MotionEvent motionEvent) {
        int i9;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4484t) {
            if (actionIndex == 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            this.f4475i = (int) motionEvent.getY(i9);
            this.f4484t = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.f4478n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4477k = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i9;
        int i10;
        float f9;
        boolean z8;
        float f10;
        float f11;
        long j7;
        float f12;
        int i11 = 20;
        if (motionEvent.getAction() == 8 && !this.m) {
            float f13 = 0.0f;
            if (MotionEventCompat.isFromSource(motionEvent, 2)) {
                i9 = 9;
                f9 = motionEvent.getAxisValue(9);
                i10 = (int) motionEvent.getX();
            } else if (MotionEventCompat.isFromSource(motionEvent, 4194304)) {
                f9 = motionEvent.getAxisValue(26);
                i10 = getWidth() / 2;
                i9 = 26;
            } else {
                i9 = 0;
                i10 = 0;
                f9 = 0.0f;
            }
            if (f9 != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * f9)), i10, 1, MotionEventCompat.isFromSource(motionEvent, FragmentTransaction.TRANSIT_FRAGMENT_CLOSE));
                if (i9 != 0) {
                    C0270g c0270g = this.f4469C;
                    c0270g.getClass();
                    int source = motionEvent.getSource();
                    int deviceId = motionEvent.getDeviceId();
                    int i12 = c0270g.f2895h;
                    int[] iArr = c0270g.f2897j;
                    if (i12 == source && c0270g.f2896i == deviceId && c0270g.f2894g == i9) {
                        z8 = false;
                    } else {
                        c0270g.f2890c.getClass();
                        Context context = c0270g.f2889a;
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                        iArr[0] = ViewConfigurationCompat.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i9, motionEvent.getSource());
                        iArr[1] = ViewConfigurationCompat.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i9, motionEvent.getSource());
                        c0270g.f2895h = source;
                        c0270g.f2896i = deviceId;
                        c0270g.f2894g = i9;
                        z8 = true;
                    }
                    if (iArr[0] == Integer.MAX_VALUE) {
                        VelocityTracker velocityTracker = c0270g.f2892e;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            c0270g.f2892e = null;
                        }
                    } else {
                        if (c0270g.f2892e == null) {
                            c0270g.f2892e = VelocityTracker.obtain();
                        }
                        VelocityTracker velocityTracker2 = c0270g.f2892e;
                        c0270g.f2891d.getClass();
                        Map map = F.f2858a;
                        velocityTracker2.addMovement(motionEvent);
                        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                            Map map2 = F.f2858a;
                            if (!map2.containsKey(velocityTracker2)) {
                                map2.put(velocityTracker2, new G());
                            }
                            G g9 = (G) map2.get(velocityTracker2);
                            g9.getClass();
                            long eventTime = motionEvent.getEventTime();
                            int i13 = g9.f2861d;
                            long[] jArr = g9.b;
                            if (i13 != 0 && eventTime - jArr[g9.f2862e] > 40) {
                                g9.f2861d = 0;
                                g9.f2860c = 0.0f;
                            }
                            int i14 = (g9.f2862e + 1) % 20;
                            g9.f2862e = i14;
                            int i15 = g9.f2861d;
                            if (i15 != 20) {
                                g9.f2861d = i15 + 1;
                            }
                            g9.f2859a[i14] = motionEvent.getAxisValue(26);
                            jArr[g9.f2862e] = eventTime;
                        }
                        int i16 = 1000;
                        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
                        G g10 = (G) F.f2858a.get(velocityTracker2);
                        if (g10 != null) {
                            int i17 = g10.f2861d;
                            if (i17 >= 2) {
                                int i18 = g10.f2862e;
                                int i19 = ((i18 + 20) - (i17 - 1)) % 20;
                                long[] jArr2 = g10.b;
                                long j9 = jArr2[i18];
                                while (true) {
                                    j7 = jArr2[i19];
                                    if (j9 - j7 <= 100) {
                                        break;
                                    }
                                    g10.f2861d--;
                                    i19 = (i19 + 1) % 20;
                                }
                                int i20 = g10.f2861d;
                                if (i20 >= 2) {
                                    float[] fArr = g10.f2859a;
                                    if (i20 == 2) {
                                        int i21 = (i19 + 1) % 20;
                                        long j10 = jArr2[i21];
                                        if (j7 != j10) {
                                            f13 = fArr[i21] / ((float) (j10 - j7));
                                        }
                                    } else {
                                        float f14 = 0.0f;
                                        int i22 = 0;
                                        int i23 = 0;
                                        while (true) {
                                            f12 = 1.0f;
                                            if (i22 >= g10.f2861d - 1) {
                                                break;
                                            }
                                            int i24 = i22 + i19;
                                            long j11 = jArr2[i24 % 20];
                                            int i25 = (i24 + 1) % i11;
                                            if (jArr2[i25] != j11) {
                                                i23++;
                                                if (f14 < f13) {
                                                    f12 = -1.0f;
                                                }
                                                float sqrt = f12 * ((float) Math.sqrt(Math.abs(f14) * 2.0f));
                                                float f15 = fArr[i25] / ((float) (jArr2[i25] - j11));
                                                f14 = (Math.abs(f15) * (f15 - sqrt)) + f14;
                                                if (i23 == 1) {
                                                    f14 *= 0.5f;
                                                }
                                            }
                                            i22++;
                                            i11 = 20;
                                            f13 = 0.0f;
                                        }
                                        if (f14 < f13) {
                                            f12 = -1.0f;
                                        }
                                        f13 = ((float) Math.sqrt(Math.abs(f14) * 2.0f)) * f12;
                                        i16 = 1000;
                                    }
                                }
                            }
                            float f16 = f13 * i16;
                            g10.f2860c = f16;
                            if (f16 < (-Math.abs(Float.MAX_VALUE))) {
                                g10.f2860c = -Math.abs(Float.MAX_VALUE);
                            } else if (g10.f2860c > Math.abs(Float.MAX_VALUE)) {
                                g10.f2860c = Math.abs(Float.MAX_VALUE);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            f10 = E.a(velocityTracker2, i9);
                        } else if (i9 == 0) {
                            f10 = velocityTracker2.getXVelocity();
                        } else if (i9 == 1) {
                            f10 = velocityTracker2.getYVelocity();
                        } else {
                            G g11 = (G) F.f2858a.get(velocityTracker2);
                            if (g11 != null && i9 == 26) {
                                f10 = g11.f2860c;
                            } else {
                                f10 = 0.0f;
                            }
                        }
                        C2475f c2475f = c0270g.b;
                        float f17 = f10 * (-((NestedScrollView) c2475f.f21833c).getVerticalScrollFactorCompat());
                        float signum = Math.signum(f17);
                        NestedScrollView nestedScrollView = (NestedScrollView) c2475f.f21833c;
                        if (z8 || (signum != Math.signum(c0270g.f2893f) && signum != 0.0f)) {
                            nestedScrollView.f4472f.abortAnimation();
                        }
                        if (Math.abs(f17) >= iArr[0]) {
                            float max = Math.max(-r4, Math.min(f17, iArr[1]));
                            if (max == 0.0f) {
                                f11 = 0.0f;
                            } else {
                                nestedScrollView.f4472f.abortAnimation();
                                nestedScrollView.j((int) max);
                                f11 = max;
                            }
                            c0270g.f2893f = f11;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action == 2 && this.m) {
            return true;
        }
        int i9 = action & 255;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 6) {
                            o(motionEvent);
                        }
                    }
                } else {
                    int i10 = this.f4484t;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.f4475i) > this.f4481q && (2 & getNestedScrollAxes()) == 0) {
                                this.m = true;
                                this.f4475i = y4;
                                if (this.f4478n == null) {
                                    this.f4478n = VelocityTracker.obtain();
                                }
                                this.f4478n.addMovement(motionEvent);
                                this.f4487w = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.m = false;
            this.f4484t = -1;
            VelocityTracker velocityTracker = this.f4478n;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4478n = null;
            }
            if (this.f4472f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else {
            int y6 = (int) motionEvent.getY();
            int x9 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y6 >= childAt.getTop() - scrollY && y6 < childAt.getBottom() - scrollY && x9 >= childAt.getLeft() && x9 < childAt.getRight()) {
                    this.f4475i = y6;
                    this.f4484t = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f4478n;
                    if (velocityTracker2 == null) {
                        this.f4478n = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4478n.addMovement(motionEvent);
                    this.f4472f.computeScrollOffset();
                    if (!v(motionEvent) && this.f4472f.isFinished()) {
                        z8 = false;
                    }
                    this.m = z8;
                    startNestedScroll(2, 0);
                }
            }
            if (!v(motionEvent) && this.f4472f.isFinished()) {
                z8 = false;
            }
            this.m = z8;
            VelocityTracker velocityTracker3 = this.f4478n;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4478n = null;
            }
        }
        return this.m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z8, i9, i10, i11, i12);
        int i14 = 0;
        this.f4476j = false;
        View view = this.l;
        if (view != null && l(view, this)) {
            View view2 = this.l;
            Rect rect = this.f4471d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h6 = h(rect);
            if (h6 != 0) {
                scrollBy(0, h6);
            }
        }
        this.l = null;
        if (!this.f4477k) {
            if (this.f4489y != null) {
                scrollTo(getScrollX(), this.f4489y.b);
                this.f4489y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4477k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f4479o && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z8) {
        if (!z8) {
            dispatchNestedFling(0.0f, f10, true);
            j((int) f10);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return this.f4467A.b(f9, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        dispatchNestedPreScroll(i9, i10, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        n(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        d(view, view2, i9, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i9, int i10, boolean z8, boolean z9) {
        super.scrollTo(i9, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i9, Rect rect) {
        View findNextFocusFromRect;
        if (i9 == 2) {
            i9 = 130;
        } else if (i9 == 1) {
            i9 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i9);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i9);
        }
        if (findNextFocusFromRect == null || (true ^ m(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i9, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f4489y = kVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, Z.k] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.b = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i12)) {
            Rect rect = this.f4471d;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h6 = h(rect);
            if (h6 != 0) {
                if (this.f4480p) {
                    u(0, h6, false);
                } else {
                    scrollBy(0, h6);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        return c(view, view2, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f4478n == null) {
            this.f4478n = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4487w = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f9 = 0.0f;
        obtain.offsetLocation(0.0f, this.f4487w);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4474h;
            EdgeEffect edgeEffect2 = this.f4473g;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                o(motionEvent);
                                this.f4475i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4484t));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f4475i = (int) motionEvent.getY(actionIndex);
                            this.f4484t = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.m && getChildCount() > 0 && this.f4472f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        this.f4484t = -1;
                        this.m = false;
                        VelocityTracker velocityTracker = this.f4478n;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f4478n = null;
                        }
                        stopNestedScroll(0);
                        this.f4473g.onRelease();
                        this.f4474h.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4484t);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f4484t + " in onTouchEvent");
                    } else {
                        int y4 = (int) motionEvent.getY(findPointerIndex);
                        int i9 = this.f4475i - y4;
                        float x9 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i9 / getHeight();
                        if (f.k(edgeEffect2) != 0.0f) {
                            float f10 = -f.o(edgeEffect2, -height, x9);
                            if (f.k(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                            f9 = f10;
                        } else if (f.k(edgeEffect) != 0.0f) {
                            float o3 = f.o(edgeEffect, height, 1.0f - x9);
                            if (f.k(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                            f9 = o3;
                        }
                        int round = Math.round(f9 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i10 = i9 - round;
                        if (!this.m && Math.abs(i10) > this.f4481q) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.m = true;
                            i10 = i10 > 0 ? i10 - this.f4481q : i10 + this.f4481q;
                        }
                        if (this.m) {
                            int s5 = s(i10, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f4475i = y4 - s5;
                            this.f4487w += s5;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f4478n;
                velocityTracker2.computeCurrentVelocity(1000, this.f4483s);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f4484t);
                if (Math.abs(yVelocity) >= this.f4482r) {
                    if (f.k(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (f.k(edgeEffect) != 0.0f) {
                        int i11 = -yVelocity;
                        if (t(edgeEffect, i11)) {
                            edgeEffect.onAbsorb(i11);
                        } else {
                            j(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f11 = i12;
                        if (!this.f4467A.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            j(i12);
                        }
                    }
                } else if (this.f4472f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4484t = -1;
                this.m = false;
                VelocityTracker velocityTracker3 = this.f4478n;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4478n = null;
                }
                stopNestedScroll(0);
                this.f4473g.onRelease();
                this.f4474h.onRelease();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.m && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4472f.isFinished()) {
                this.f4472f.abortAnimation();
                stopNestedScroll(1);
            }
            int y6 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4475i = y6;
            this.f4484t = pointerId;
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4478n;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i9, int i10, int i11, int i12) {
        boolean z8;
        boolean z9;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i13 = i11 + i9;
        if (i10 > 0 || i10 < 0) {
            i10 = 0;
            z8 = true;
        } else {
            z8 = false;
        }
        if (i13 <= i12) {
            if (i13 < 0) {
                i12 = 0;
            } else {
                i12 = i13;
                z9 = false;
                if (z9 && !this.f4467A.g(1)) {
                    this.f4472f.springBack(i10, i12, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i10, i12);
                if (z8 && !z9) {
                    return false;
                }
            }
        }
        z9 = true;
        if (z9) {
            this.f4472f.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i10, i12);
        return z8 ? true : true;
    }

    public final void q(int i9) {
        boolean z8;
        if (i9 == 130) {
            z8 = true;
        } else {
            z8 = false;
        }
        int height = getHeight();
        Rect rect = this.f4471d;
        if (z8) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        r(i9, i10, i11);
    }

    public final boolean r(int i9, int i10, int i11) {
        boolean z8;
        int i12;
        boolean z9;
        boolean z10;
        boolean z11;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        if (i9 == 33) {
            z8 = true;
        } else {
            z8 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                if (i10 < top && bottom < i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (view == null) {
                    view = view2;
                    z12 = z10;
                } else {
                    if ((z8 && top < view.getTop()) || (!z8 && bottom > view.getBottom())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12) {
                        if (z10) {
                            if (!z11) {
                            }
                            view = view2;
                        }
                    } else if (z10) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z11) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i10 >= scrollY && i11 <= i13) {
            z9 = false;
        } else {
            if (z8) {
                i12 = i10 - scrollY;
            } else {
                i12 = i11 - i13;
            }
            s(i12, 0, 1, true);
            z9 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i9);
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f4476j) {
            Rect rect = this.f4471d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h6 = h(rect);
            if (h6 != 0) {
                scrollBy(0, h6);
            }
        } else {
            this.l = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        boolean z9;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h6 = h(rect);
        if (h6 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (z8) {
                scrollBy(0, h6);
            } else {
                u(0, h6, false);
            }
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        VelocityTracker velocityTracker;
        if (z8 && (velocityTracker = this.f4478n) != null) {
            velocityTracker.recycle();
            this.f4478n = null;
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4476j = true;
        super.requestLayout();
    }

    public final int s(int i9, int i10, int i11, boolean z8) {
        int i12;
        int i13;
        boolean z9;
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        if (i11 == 1) {
            startNestedScroll(2, i11);
        }
        boolean c9 = this.f4467A.c(0, i9, this.f4486v, this.f4485u, i11);
        int[] iArr = this.f4486v;
        int[] iArr2 = this.f4485u;
        if (c9) {
            i12 = i9 - iArr[1];
            i13 = iArr2[1];
        } else {
            i12 = i9;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (p(i12, 0, scrollY, scrollRange) && !this.f4467A.g(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i12 - scrollY2, this.f4485u, i11, iArr);
        int i14 = i13 + iArr2[1];
        int i15 = i12 - iArr[1];
        int i16 = scrollY + i15;
        EdgeEffect edgeEffect = this.f4474h;
        EdgeEffect edgeEffect2 = this.f4473g;
        if (i16 < 0) {
            if (z9) {
                f.o(edgeEffect2, (-i15) / getHeight(), i10 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i16 > scrollRange && z9) {
            f.o(edgeEffect, i15 / getHeight(), 1.0f - (i10 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z11 = z10;
        } else {
            postInvalidateOnAnimation();
            z11 = false;
        }
        if (z11 && i11 == 0 && (velocityTracker = this.f4478n) != null) {
            velocityTracker.clear();
        }
        if (i11 == 1) {
            stopNestedScroll(i11);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i14;
    }

    @Override // android.view.View
    public final void scrollTo(int i9, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i9 >= 0) {
                if (width + i9 > width2) {
                    i9 = width2 - width;
                }
            } else {
                i9 = 0;
            }
            if (height < height2 && i10 >= 0) {
                if (height + i10 > height2) {
                    i10 = height2 - height;
                }
            } else {
                i10 = 0;
            }
            if (i9 != getScrollX() || i10 != getScrollY()) {
                super.scrollTo(i9, i10);
            }
        }
    }

    public void setFillViewport(boolean z8) {
        if (z8 != this.f4479o) {
            this.f4479o = z8;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z8) {
        C0289u c0289u = this.f4467A;
        if (c0289u.f2931d) {
            ViewCompat.stopNestedScroll(c0289u.f2930c);
        }
        c0289u.f2931d = z8;
    }

    public void setSmoothScrollingEnabled(boolean z8) {
        this.f4480p = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i9) {
        return this.f4467A.h(i9, 0);
    }

    @Override // T.r
    public final void stopNestedScroll(int i9) {
        this.f4467A.i(i9);
    }

    public final boolean t(EdgeEffect edgeEffect, int i9) {
        if (i9 > 0) {
            return true;
        }
        float k6 = f.k(edgeEffect) * getHeight();
        float abs = Math.abs(-i9) * 0.35f;
        float f9 = this.b * 0.015f;
        double log = Math.log(abs / f9);
        double d2 = f4464D;
        if (((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * f9)) < k6) {
            return true;
        }
        return false;
    }

    public final void u(int i9, int i10, boolean z8) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4470c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4472f.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z8) {
                startNestedScroll(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.f4488x = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4472f.isFinished()) {
                this.f4472f.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i9, i10);
        }
        this.f4470c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z8;
        EdgeEffect edgeEffect = this.f4473g;
        if (f.k(edgeEffect) != 0.0f) {
            f.o(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z8 = true;
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.f4474h;
        if (f.k(edgeEffect2) != 0.0f) {
            f.o(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z8;
    }

    @Override // T.r
    public final boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2, int i11) {
        return this.f4467A.c(i9, i10, iArr, iArr2, i11);
    }

    @Override // T.r
    public final boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr, int i13) {
        return this.f4467A.e(i9, i10, i11, i12, iArr, i13, null);
    }

    @Override // T.r
    public final boolean hasNestedScrollingParent(int i9) {
        return this.f4467A.g(i9);
    }

    @Override // T.r
    public final boolean startNestedScroll(int i9, int i10) {
        return this.f4467A.h(i9, i10);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // T.InterfaceC0287s
    public final void dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        this.f4467A.e(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9) {
        if (getChildCount() <= 0) {
            super.addView(view, i9);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i9, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(@Nullable j jVar) {
    }
}
