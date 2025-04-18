package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.cooldev.gba.emulator.gameboy.R;
import com.google.android.gms.common.api.Api;

@SuppressLint({"UnknownNullness"})
@RestrictTo
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {
    public static final int[] D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final WindowInsetsCompat E;
    public static final Rect F;
    public final Runnable A;
    public final NestedScrollingParentHelper B;
    public final NoSystemUiLayoutFlagView C;

    /* renamed from: a, reason: collision with root package name */
    public int f846a;

    /* renamed from: b, reason: collision with root package name */
    public int f847b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f848c;
    public ActionBarContainer d;

    /* renamed from: f, reason: collision with root package name */
    public DecorToolbar f849f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f850g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f851h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f852i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f853j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f854k;

    /* renamed from: l, reason: collision with root package name */
    public int f855l;

    /* renamed from: m, reason: collision with root package name */
    public int f856m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f857n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f858o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f859p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f860q;

    /* renamed from: r, reason: collision with root package name */
    public WindowInsetsCompat f861r;

    /* renamed from: s, reason: collision with root package name */
    public WindowInsetsCompat f862s;

    /* renamed from: t, reason: collision with root package name */
    public WindowInsetsCompat f863t;

    /* renamed from: u, reason: collision with root package name */
    public WindowInsetsCompat f864u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarVisibilityCallback f865v;
    public OverScroller w;
    public ViewPropertyAnimator x;

    /* renamed from: y, reason: collision with root package name */
    public final AnimatorListenerAdapter f866y;

    /* renamed from: z, reason: collision with root package name */
    public final Runnable f867z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.x = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f866y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.x = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.f866y);
        }
    }

    /* loaded from: classes2.dex */
    public interface ActionBarVisibilityCallback {
        void a();

        void b();

        void c(boolean z2);

        void d();

        void e();

        void onWindowVisibilityChanged(int i2);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    }

    /* loaded from: classes2.dex */
    public static final class NoSystemUiLayoutFlagView extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder();
        builder.b(Insets.b(0, 1, 0, 1));
        E = builder.a();
        F = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.core.view.NestedScrollingParentHelper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView, android.view.View] */
    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f847b = 0;
        this.f857n = new Rect();
        this.f858o = new Rect();
        this.f859p = new Rect();
        this.f860q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f18788b;
        this.f861r = windowInsetsCompat;
        this.f862s = windowInsetsCompat;
        this.f863t = windowInsetsCompat;
        this.f864u = windowInsetsCompat;
        this.f866y = new AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.x = null;
                actionBarOverlayLayout.f854k = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.x = null;
                actionBarOverlayLayout.f854k = false;
            }
        };
        this.f867z = new AnonymousClass2();
        this.A = new AnonymousClass3();
        l(context);
        this.B = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.C = view;
        addView(view);
    }

    public static boolean j(FrameLayout frameLayout, Rect rect, boolean z2) {
        boolean z3;
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean a() {
        m();
        return this.f849f.a();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void b(MenuBuilder menuBuilder, MenuPresenter.Callback callback) {
        m();
        this.f849f.b(menuBuilder, callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean c() {
        m();
        return this.f849f.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean d() {
        m();
        return this.f849f.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f850g != null) {
            if (this.d.getVisibility() == 0) {
                i2 = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i2 = 0;
            }
            this.f850g.setBounds(0, i2, getWidth(), this.f850g.getIntrinsicHeight() + i2);
            this.f850g.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean e() {
        m();
        return this.f849f.e();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void f() {
        m();
        this.f849f.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean g() {
        m();
        return this.f849f.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.B;
        return nestedScrollingParentHelper.f18724b | nestedScrollingParentHelper.f18723a;
    }

    public CharSequence getTitle() {
        m();
        return this.f849f.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void h(int i2) {
        m();
        if (i2 == 2) {
            this.f849f.l();
        } else if (i2 == 5) {
            this.f849f.t();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void i() {
        m();
        this.f849f.n();
    }

    public final void k() {
        removeCallbacks(this.f867z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(D);
        this.f846a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f850g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.w = new OverScroller(context);
    }

    public final void m() {
        DecorToolbar wrapper;
        if (this.f848c == null) {
            this.f848c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof DecorToolbar) {
                wrapper = (DecorToolbar) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f849f = wrapper;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r6.m()
            androidx.core.view.WindowInsetsCompat r7 = androidx.core.view.WindowInsetsCompat.s(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.i()
            int r2 = r7.k()
            int r3 = r7.j()
            int r4 = r7.h()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.d
            r2 = 0
            boolean r0 = j(r1, r0, r2)
            android.graphics.Rect r1 = r6.f857n
            androidx.core.view.ViewCompat.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            androidx.core.view.WindowInsetsCompat r2 = r7.m(r2, r3, r4, r5)
            r6.f861r = r2
            androidx.core.view.WindowInsetsCompat r3 = r6.f862s
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L43
            androidx.core.view.WindowInsetsCompat r0 = r6.f861r
            r6.f862s = r0
            r0 = 1
        L43:
            android.graphics.Rect r2 = r6.f858o
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L4f
            r2.set(r1)
            goto L51
        L4f:
            if (r0 == 0) goto L54
        L51:
            r6.requestLayout()
        L54:
            androidx.core.view.WindowInsetsCompat r7 = r7.a()
            androidx.core.view.WindowInsetsCompat r7 = r7.c()
            androidx.core.view.WindowInsetsCompat r7 = r7.b()
            android.view.WindowInsets r7 = r7.r()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        ViewCompat.y(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f853j || !z2) {
            return false;
        }
        this.w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (this.w.getFinalY() > this.d.getHeight()) {
            k();
            ((AnonymousClass3) this.A).run();
        } else {
            k();
            ((AnonymousClass2) this.f867z).run();
        }
        this.f854k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        onNestedScroll(view, i2, i3, i4, i5, i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.f18723a = i2;
        this.f855l = getActionBarHideOffset();
        k();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f865v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.e();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        m();
        int i3 = this.f856m ^ i2;
        this.f856m = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f865v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.c(!z3);
            if (z2 || !z3) {
                this.f865v.a();
            } else {
                this.f865v.d();
            }
        }
        if ((i3 & 256) == 0 || this.f865v == null) {
            return;
        }
        ViewCompat.y(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f847b = i2;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f865v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i2);
        }
    }

    public void setActionBarHideOffset(int i2) {
        k();
        this.d.setTranslationY(-Math.max(0, Math.min(i2, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.f865v = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.f865v.onWindowVisibilityChanged(this.f847b);
            int i2 = this.f856m;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                ViewCompat.y(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f852i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f853j) {
            this.f853j = z2;
            if (z2) {
                return;
            }
            k();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        m();
        this.f849f.setIcon(i2);
    }

    public void setLogo(int i2) {
        m();
        this.f849f.q(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f851h = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f849f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f849f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.f853j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f853j && !this.f854k) {
            if (this.f855l <= this.d.getHeight()) {
                k();
                postDelayed(this.f867z, 600L);
            } else {
                k();
                postDelayed(this.A, 600L);
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f865v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.b();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f855l + i3;
        this.f855l = i6;
        setActionBarHideOffset(i6);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f849f.setIcon(drawable);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }
}
