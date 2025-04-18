package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import ef.b;
import java.util.ArrayList;
import n0.i;
import n0.u;
import n0.w;
import n0.y;
import t0.e;
import t0.h;
import t0.j;
import t0.k;
import v3.c;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements y, u {
    public static final float E = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final h F = new h();
    public static final int[] G = {R.attr.fillViewport};
    public final w A;
    public float B;
    public j C;
    public final i D;

    /* renamed from: b, reason: collision with root package name */
    public final float f1288b;

    /* renamed from: c, reason: collision with root package name */
    public long f1289c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1290d;

    /* renamed from: f, reason: collision with root package name */
    public OverScroller f1291f;

    /* renamed from: g, reason: collision with root package name */
    public final EdgeEffect f1292g;

    /* renamed from: h, reason: collision with root package name */
    public final EdgeEffect f1293h;

    /* renamed from: i, reason: collision with root package name */
    public int f1294i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1295j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1296k;

    /* renamed from: l, reason: collision with root package name */
    public View f1297l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1298m;

    /* renamed from: n, reason: collision with root package name */
    public VelocityTracker f1299n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1300o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1301p;

    /* renamed from: q, reason: collision with root package name */
    public int f1302q;

    /* renamed from: r, reason: collision with root package name */
    public int f1303r;

    /* renamed from: s, reason: collision with root package name */
    public int f1304s;

    /* renamed from: t, reason: collision with root package name */
    public int f1305t;
    public final int[] u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f1306v;

    /* renamed from: w, reason: collision with root package name */
    public int f1307w;

    /* renamed from: x, reason: collision with root package name */
    public int f1308x;

    /* renamed from: y, reason: collision with root package name */
    public k f1309y;

    /* renamed from: z, reason: collision with root package name */
    public final b f1310z;

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f1290d = new Rect();
        this.f1295j = true;
        this.f1296k = false;
        this.f1297l = null;
        this.f1298m = false;
        this.f1301p = true;
        this.f1305t = -1;
        this.u = new int[2];
        this.f1306v = new int[2];
        this.D = new i(getContext(), new c(this, 6));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1292g = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1293h = edgeEffect2;
        this.f1288b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1291f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1302q = viewConfiguration.getScaledTouchSlop();
        this.f1303r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1304s = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G, com.plantcare.ai.identifier.plantid.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1310z = new b();
        this.A = new w(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, F);
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

    @Override // n0.x
    public final void a(int i10, View view) {
        b bVar = this.f1310z;
        if (i10 == 1) {
            bVar.f17350b = 0;
        } else {
            bVar.a = 0;
        }
        stopNestedScroll(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // n0.x
    public final void b(View view, View view2, int i10, int i11) {
        b bVar = this.f1310z;
        if (i11 == 1) {
            bVar.f17350b = i10;
        } else {
            bVar.a = i10;
        }
        startNestedScroll(2, i11);
    }

    @Override // n0.x
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 233
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

    @Override // n0.y
    public final void d(View view, int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        n(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.A.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.A.b(f10, f11);
    }

    @Override // n0.t
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.A.c(i10, i11, iArr, iArr2, i12);
    }

    @Override // n0.u
    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.A.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1292g;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (t0.i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (t0.i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1293h;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (t0.i.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (t0.i.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // n0.x
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        n(i13, i14, null);
    }

    @Override // n0.x
    public final boolean f(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final boolean g(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f1290d;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
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
        b bVar = this.f1310z;
        return bVar.f17350b | bVar.a;
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
        if (this.B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.B;
    }

    public final int h(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        }
        if (rect.height() > height) {
            i11 = 0 - (i10 - rect.bottom);
        } else {
            i11 = 0 - (scrollY - rect.top);
        }
        return Math.max(i11, -getScrollY());
    }

    @Override // n0.t
    public final boolean hasNestedScrollingParent(int i10) {
        return this.A.f(i10) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f1290d
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L33
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L62
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L61
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L61
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L4c
            r6 = 0
        L4c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r3)
            if (r6 == 0) goto L5f
            if (r6 == r5) goto L5f
            boolean r6 = r6.requestFocus(r3)
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            return r1
        L61:
            return r2
        L62:
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc7
            int r0 = r6.getKeyCode()
            r1 = 19
            r4 = 33
            if (r0 == r1) goto Lb8
            r1 = 20
            if (r0 == r1) goto La8
            r1 = 62
            if (r0 == r1) goto L9d
            r6 = 92
            if (r0 == r6) goto L98
            r6 = 93
            if (r0 == r6) goto L93
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L8f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L8b
            goto Lc7
        L8b:
            r5.q(r3)
            goto Lc7
        L8f:
            r5.q(r4)
            goto Lc7
        L93:
            boolean r2 = r5.k(r3)
            goto Lc7
        L98:
            boolean r2 = r5.k(r4)
            goto Lc7
        L9d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto La4
            r3 = r4
        La4:
            r5.q(r3)
            goto Lc7
        La8:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto Lb3
            boolean r2 = r5.k(r3)
            goto Lc7
        Lb3:
            boolean r2 = r5.g(r3)
            goto Lc7
        Lb8:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto Lc3
            boolean r2 = r5.k(r4)
            goto Lc7
        Lc3:
            boolean r2 = r5.g(r4)
        Lc7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.i(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A.f22361d;
    }

    public final void j(int i10) {
        if (getChildCount() > 0) {
            this.f1291f.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            startNestedScroll(2, 1);
            this.f1308x = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f1290d;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i10, int i11) {
        Rect rect = this.f1290d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1305t) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f1294i = (int) motionEvent.getY(i10);
            this.f1305t = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1299n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1296k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r30) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f1295j = false;
        View view = this.f1297l;
        if (view != null && l(view, this)) {
            View view2 = this.f1297l;
            Rect rect = this.f1290d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h10 = h(rect);
            if (h10 != 0) {
                scrollBy(0, h10);
            }
        }
        this.f1297l = null;
        if (!this.f1296k) {
            if (this.f1309y != null) {
                scrollTo(getScrollX(), this.f1309y.f25165b);
                this.f1309y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1296k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1300o && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!z10) {
            dispatchNestedFling(0.0f, f11, true);
            j((int) f11);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        b(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || (true ^ m(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f1309y = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f25165b = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        j jVar = this.C;
        if (jVar != null) {
            h.c cVar = (h.c) jVar;
            h.h.c(this, (View) cVar.f18523c, (View) cVar.f18524d);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i13)) {
            Rect rect = this.f1290d;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h10 = h(rect);
            if (h10 != 0) {
                if (this.f1301p) {
                    u(0, h10, false);
                } else {
                    scrollBy(0, h10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i14 = i11 + 0;
        int i15 = i12 + i10;
        int i16 = i13 + 0;
        if (i14 > 0 || i14 < 0) {
            i14 = 0;
            z10 = true;
        } else {
            z10 = false;
        }
        if (i15 > i16) {
            i15 = i16;
        } else if (i15 < 0) {
            i15 = 0;
        } else {
            z11 = false;
            if (z11 && !hasNestedScrollingParent(1)) {
                this.f1291f.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i14, i15, z10, z11);
            if (z10 && !z11) {
                return false;
            }
        }
        z11 = true;
        if (z11) {
            this.f1291f.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i14, i15, z10, z11);
        return z10 ? true : true;
    }

    public final void q(int i10) {
        boolean z10;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f1290d;
        if (z10) {
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
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        r(i10, i11, i12);
    }

    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 >= scrollY && i12 <= i14) {
            z11 = false;
        } else {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            s(i13, 0, 1, true);
            z11 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1295j) {
            Rect rect = this.f1290d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h10 = h(rect);
            if (h10 != 0) {
                scrollBy(0, h10);
            }
        } else {
            this.f1297l = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h10 = h(rect);
        if (h10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, h10);
            } else {
                u(0, h10, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f1299n) != null) {
            velocityTracker.recycle();
            this.f1299n = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1295j = true;
        super.requestLayout();
    }

    public final int s(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            startNestedScroll(2, i12);
        }
        boolean dispatchNestedPreScroll = dispatchNestedPreScroll(0, i10, this.f1306v, this.u, i12);
        int[] iArr = this.f1306v;
        int[] iArr2 = this.u;
        if (dispatchNestedPreScroll) {
            i13 = i10 - iArr[1];
            i14 = iArr2[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || getScrollRange() <= 0)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && !z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (p(i13, 0, scrollY, scrollRange) && !hasNestedScrollingParent(i12)) {
            z13 = true;
        } else {
            z13 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i13 - scrollY2, this.u, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f1293h;
        EdgeEffect edgeEffect2 = this.f1292g;
        if (i17 < 0) {
            if (z12) {
                com.bumptech.glide.e.L(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            com.bumptech.glide.e.L(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z14 = z13;
        } else {
            postInvalidateOnAnimation();
            z14 = false;
        }
        if (z14 && i12 == 0 && (velocityTracker = this.f1299n) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            stopNestedScroll(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i10 >= 0) {
                if (width + i10 > width2) {
                    i10 = width2 - width;
                }
            } else {
                i10 = 0;
            }
            if (height < height2 && i11 >= 0) {
                if (height + i11 > height2) {
                    i11 = height2 - height;
                }
            } else {
                i11 = 0;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1300o) {
            this.f1300o = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        w wVar = this.A;
        if (wVar.f22361d) {
            ViewCompat.stopNestedScroll(wVar.f22360c);
        }
        wVar.f22361d = z10;
    }

    public void setOnScrollChangeListener(@Nullable j jVar) {
        this.C = jVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1301p = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // n0.t
    public final boolean startNestedScroll(int i10, int i11) {
        return this.A.g(i10, i11);
    }

    @Override // n0.t
    public final void stopNestedScroll(int i10) {
        this.A.h(i10);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float y4 = com.bumptech.glide.e.y(edgeEffect) * getHeight();
        float abs = Math.abs(-i10) * 0.35f;
        float f10 = this.f1288b * 0.015f;
        double log = Math.log(abs / f10);
        double d10 = E;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f10)) < y4) {
            return true;
        }
        return false;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1289c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1291f.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z10) {
                startNestedScroll(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.f1308x = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1291f.isFinished()) {
                this.f1291f.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i10, i11);
        }
        this.f1289c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1292g;
        if (com.bumptech.glide.e.y(edgeEffect) != 0.0f) {
            com.bumptech.glide.e.L(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f1293h;
        if (com.bumptech.glide.e.y(edgeEffect2) != 0.0f) {
            com.bumptech.glide.e.L(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // n0.t
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return this.A.e(i10, i11, i12, i13, iArr, i14, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.A.e(i10, i11, i12, i13, iArr, 0, null);
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
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
