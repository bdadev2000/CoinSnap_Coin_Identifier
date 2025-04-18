package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements q1, n0.x, n0.y {
    public static final int[] D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final e A;
    public final e B;
    public final ef.b C;

    /* renamed from: b, reason: collision with root package name */
    public int f691b;

    /* renamed from: c, reason: collision with root package name */
    public int f692c;

    /* renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f693d;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f694f;

    /* renamed from: g, reason: collision with root package name */
    public r1 f695g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f696h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f697i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f698j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f699k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f700l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f701m;

    /* renamed from: n, reason: collision with root package name */
    public int f702n;

    /* renamed from: o, reason: collision with root package name */
    public int f703o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f704p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f705q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f706r;

    /* renamed from: s, reason: collision with root package name */
    public n0.r2 f707s;

    /* renamed from: t, reason: collision with root package name */
    public n0.r2 f708t;
    public n0.r2 u;

    /* renamed from: v, reason: collision with root package name */
    public n0.r2 f709v;

    /* renamed from: w, reason: collision with root package name */
    public f f710w;

    /* renamed from: x, reason: collision with root package name */
    public OverScroller f711x;

    /* renamed from: y, reason: collision with root package name */
    public ViewPropertyAnimator f712y;

    /* renamed from: z, reason: collision with root package name */
    public final d f713z;

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = 0;
        this.f692c = 0;
        this.f704p = new Rect();
        this.f705q = new Rect();
        this.f706r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        n0.r2 r2Var = n0.r2.f22348b;
        this.f707s = r2Var;
        this.f708t = r2Var;
        this.u = r2Var;
        this.f709v = r2Var;
        this.f713z = new d(this, i10);
        this.A = new e(this, i10);
        this.B = new e(this, 1);
        j(context);
        this.C = new ef.b();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        g gVar = (g) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) gVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) gVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) gVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // n0.x
    public final void a(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // n0.x
    public final void b(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // n0.x
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    @Override // n0.y
    public final void d(View view, int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        e(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f696h != null && !this.f697i) {
            if (this.f694f.getVisibility() == 0) {
                i10 = (int) (this.f694f.getTranslationY() + this.f694f.getBottom() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f696h.setBounds(0, i10, getWidth(), this.f696h.getIntrinsicHeight() + i10);
            this.f696h.draw(canvas);
        }
    }

    @Override // n0.x
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // n0.x
    public final boolean f(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f694f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ef.b bVar = this.C;
        return bVar.f17350b | bVar.a;
    }

    public CharSequence getTitle() {
        l();
        return ((z3) this.f695g).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.f712y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean i() {
        boolean z10;
        l();
        ActionMenuView actionMenuView = ((z3) this.f695g).a.f772b;
        if (actionMenuView == null) {
            return false;
        }
        m mVar = actionMenuView.f717v;
        if (mVar != null && mVar.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final void j(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(D);
        boolean z11 = false;
        this.f691b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f696h = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f697i = z11;
        this.f711x = new OverScroller(context);
    }

    public final void k(int i10) {
        l();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            } else {
                ((z3) this.f695g).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((z3) this.f695g).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void l() {
        r1 wrapper;
        if (this.f693d == null) {
            this.f693d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f694f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof r1) {
                wrapper = (r1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f695g = wrapper;
        }
    }

    public final void m(k.o oVar, f.a aVar) {
        l();
        z3 z3Var = (z3) this.f695g;
        m mVar = z3Var.f1115m;
        Toolbar toolbar = z3Var.a;
        if (mVar == null) {
            z3Var.f1115m = new m(toolbar.getContext());
        }
        m mVar2 = z3Var.f1115m;
        mVar2.f920g = aVar;
        if (oVar != null || toolbar.f772b != null) {
            toolbar.e();
            k.o oVar2 = toolbar.f772b.f714r;
            if (oVar2 != oVar) {
                if (oVar2 != null) {
                    oVar2.r(toolbar.M);
                    oVar2.r(toolbar.N);
                }
                if (toolbar.N == null) {
                    toolbar.N = new v3(toolbar);
                }
                mVar2.f932s = true;
                if (oVar != null) {
                    oVar.b(mVar2, toolbar.f781l);
                    oVar.b(toolbar.N, toolbar.f781l);
                } else {
                    mVar2.i(toolbar.f781l, null);
                    toolbar.N.i(toolbar.f781l, null);
                    mVar2.d();
                    toolbar.N.d();
                }
                toolbar.f772b.setPopupTheme(toolbar.f782m);
                toolbar.f772b.setPresenter(mVar2);
                toolbar.M = mVar2;
                toolbar.s();
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l();
        n0.r2 h10 = n0.r2.h(this, windowInsets);
        boolean g10 = g(this.f694f, new Rect(h10.c(), h10.e(), h10.d(), h10.b()), false);
        Rect rect = this.f704p;
        ViewCompat.computeSystemWindowInsets(this, h10, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        n0.o2 o2Var = h10.a;
        n0.r2 l10 = o2Var.l(i10, i11, i12, i13);
        this.f707s = l10;
        boolean z10 = true;
        if (!this.f708t.equals(l10)) {
            this.f708t = this.f707s;
            g10 = true;
        }
        Rect rect2 = this.f705q;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = g10;
        }
        if (z10) {
            requestLayout();
        }
        return o2Var.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        l();
        measureChildWithMargins(this.f694f, i10, 0, i11, 0);
        g gVar = (g) this.f694f.getLayoutParams();
        int max = Math.max(0, this.f694f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
        int max2 = Math.max(0, this.f694f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f694f.getMeasuredState());
        if ((ViewCompat.getWindowSystemUiVisibility(this) & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f691b;
            if (this.f699k && this.f694f.getTabContainer() != null) {
                measuredHeight += this.f691b;
            }
        } else {
            measuredHeight = this.f694f.getVisibility() != 8 ? this.f694f.getMeasuredHeight() : 0;
        }
        Rect rect = this.f704p;
        Rect rect2 = this.f706r;
        rect2.set(rect);
        n0.r2 r2Var = this.f707s;
        this.u = r2Var;
        if (!this.f698j && !z10) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.u = r2Var.a.l(0, measuredHeight, 0, 0);
        } else {
            g0.f b3 = g0.f.b(r2Var.c(), this.u.e() + measuredHeight, this.u.d(), this.u.b() + 0);
            kc.c cVar = new kc.c(this.u);
            ((n0.i2) cVar.f20640c).g(b3);
            this.u = cVar.n();
        }
        g(this.f693d, rect2, true);
        if (!this.f709v.equals(this.u)) {
            n0.r2 r2Var2 = this.u;
            this.f709v = r2Var2;
            ViewCompat.dispatchApplyWindowInsets(this.f693d, r2Var2);
        }
        measureChildWithMargins(this.f693d, i10, 0, i11, 0);
        g gVar2 = (g) this.f693d.getLayoutParams();
        int max3 = Math.max(max, this.f693d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar2).leftMargin + ((ViewGroup.MarginLayoutParams) gVar2).rightMargin);
        int max4 = Math.max(max2, this.f693d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f693d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.f700l || !z10) {
            return false;
        }
        this.f711x.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f711x.getFinalY() > this.f694f.getHeight()) {
            z11 = true;
        }
        if (z11) {
            h();
            this.B.run();
        } else {
            h();
            this.A.run();
        }
        this.f701m = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f702n + i11;
        this.f702n = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        h.w0 w0Var;
        j.m mVar;
        this.C.a = i10;
        this.f702n = getActionBarHideOffset();
        h();
        f fVar = this.f710w;
        if (fVar != null && (mVar = (w0Var = (h.w0) fVar).f18695y) != null) {
            mVar.a();
            w0Var.f18695y = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f694f.getVisibility() == 0) {
            return this.f700l;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f700l && !this.f701m) {
            if (this.f702n <= this.f694f.getHeight()) {
                h();
                postDelayed(this.A, 600L);
            } else {
                h();
                postDelayed(this.B, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        l();
        int i11 = this.f703o ^ i10;
        this.f703o = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f fVar = this.f710w;
        if (fVar != null) {
            ((h.w0) fVar).u = !z11;
            if (!z10 && z11) {
                h.w0 w0Var = (h.w0) fVar;
                if (!w0Var.f18692v) {
                    w0Var.f18692v = true;
                    w0Var.K(true);
                }
            } else {
                h.w0 w0Var2 = (h.w0) fVar;
                if (w0Var2.f18692v) {
                    w0Var2.f18692v = false;
                    w0Var2.K(true);
                }
            }
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && this.f710w != null) {
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f692c = i10;
        f fVar = this.f710w;
        if (fVar != null) {
            ((h.w0) fVar).f18691t = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f694f.setTranslationY(-Math.max(0, Math.min(i10, this.f694f.getHeight())));
    }

    public void setActionBarVisibilityCallback(f fVar) {
        this.f710w = fVar;
        if (getWindowToken() != null) {
            ((h.w0) this.f710w).f18691t = this.f692c;
            int i10 = this.f703o;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f699k = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f700l) {
            this.f700l = z10;
            if (!z10) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        l();
        z3 z3Var = (z3) this.f695g;
        z3Var.f1106d = i10 != 0 ? com.bumptech.glide.c.t(z3Var.a.getContext(), i10) : null;
        z3Var.b();
    }

    public void setLogo(int i10) {
        Drawable drawable;
        l();
        z3 z3Var = (z3) this.f695g;
        if (i10 != 0) {
            drawable = com.bumptech.glide.c.t(z3Var.a.getContext(), i10);
        } else {
            drawable = null;
        }
        z3Var.f1107e = drawable;
        z3Var.b();
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f698j = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f697i = z11;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.q1
    public void setWindowCallback(Window.Callback callback) {
        l();
        ((z3) this.f695g).f1113k = callback;
    }

    @Override // androidx.appcompat.widget.q1
    public void setWindowTitle(CharSequence charSequence) {
        l();
        z3 z3Var = (z3) this.f695g;
        if (!z3Var.f1109g) {
            z3Var.f1110h = charSequence;
            if ((z3Var.f1104b & 8) != 0) {
                Toolbar toolbar = z3Var.a;
                toolbar.setTitle(charSequence);
                if (z3Var.f1109g) {
                    ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        l();
        z3 z3Var = (z3) this.f695g;
        z3Var.f1106d = drawable;
        z3Var.b();
    }
}
