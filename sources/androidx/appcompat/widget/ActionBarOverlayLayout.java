package androidx.appcompat.widget;

import B3.c;
import L.e;
import L5.b;
import T.E0;
import T.G0;
import T.InterfaceC0290v;
import T.InterfaceC0291w;
import T.v0;
import T.w0;
import T.x0;
import T.y0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.n;
import com.tools.arruler.photomeasure.camera.ruler.R;
import k.C2411H;
import o.k;
import p.MenuC2533l;
import p.w;
import q.C2593d;
import q.C2595e;
import q.C2605j;
import q.InterfaceC2591c;
import q.InterfaceC2602h0;
import q.InterfaceC2604i0;
import q.RunnableC2589b;
import q.T0;
import q.Y0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2602h0, InterfaceC0290v, InterfaceC0291w {

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f4167E = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: F, reason: collision with root package name */
    public static final G0 f4168F;

    /* renamed from: G, reason: collision with root package name */
    public static final Rect f4169G;

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC2589b f4170A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC2589b f4171B;

    /* renamed from: C, reason: collision with root package name */
    public final b f4172C;

    /* renamed from: D, reason: collision with root package name */
    public final C2595e f4173D;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f4174c;

    /* renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f4175d;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f4176f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2604i0 f4177g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f4178h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4179i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4180j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4181k;
    public boolean l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f4182n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4183o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f4184p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f4185q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f4186r;

    /* renamed from: s, reason: collision with root package name */
    public G0 f4187s;

    /* renamed from: t, reason: collision with root package name */
    public G0 f4188t;

    /* renamed from: u, reason: collision with root package name */
    public G0 f4189u;

    /* renamed from: v, reason: collision with root package name */
    public G0 f4190v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC2591c f4191w;

    /* renamed from: x, reason: collision with root package name */
    public OverScroller f4192x;

    /* renamed from: y, reason: collision with root package name */
    public ViewPropertyAnimator f4193y;

    /* renamed from: z, reason: collision with root package name */
    public final c f4194z;

    static {
        y0 v0Var;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            v0Var = new x0();
        } else if (i9 >= 29) {
            v0Var = new w0();
        } else {
            v0Var = new v0();
        }
        v0Var.g(e.b(0, 1, 0, 1));
        f4168F = v0Var.b();
        f4169G = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, L5.b] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View, q.e] */
    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4174c = 0;
        this.f4183o = new Rect();
        this.f4184p = new Rect();
        this.f4185q = new Rect();
        this.f4186r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        G0 g02 = G0.b;
        this.f4187s = g02;
        this.f4188t = g02;
        this.f4189u = g02;
        this.f4190v = g02;
        this.f4194z = new c(this, 8);
        this.f4170A = new RunnableC2589b(this, 0);
        this.f4171B = new RunnableC2589b(this, 1);
        i(context);
        this.f4172C = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f4173D = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z8) {
        boolean z9;
        C2593d c2593d = (C2593d) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c2593d).leftMargin;
        int i10 = rect.left;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c2593d).leftMargin = i10;
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c2593d).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c2593d).topMargin = i12;
            z9 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) c2593d).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) c2593d).rightMargin = i14;
            z9 = true;
        }
        if (z8) {
            int i15 = ((ViewGroup.MarginLayoutParams) c2593d).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) c2593d).bottomMargin = i16;
                return true;
            }
        }
        return z9;
    }

    @Override // T.InterfaceC0291w
    public final void a(View view, int i9, int i10, int i11, int i12, int[] iArr, int i13) {
        b(view, i9, i10, i11, i12, i13);
    }

    @Override // T.InterfaceC0290v
    public final void b(View view, int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i9, i10, i11, i12);
        }
    }

    @Override // T.InterfaceC0290v
    public final boolean c(View view, View view2, int i9, int i10) {
        if (i10 == 0 && onStartNestedScroll(view, view2, i9)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2593d;
    }

    @Override // T.InterfaceC0290v
    public final void d(View view, View view2, int i9, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i9);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i9;
        super.draw(canvas);
        if (this.f4178h != null) {
            if (this.f4176f.getVisibility() == 0) {
                i9 = (int) (this.f4176f.getTranslationY() + this.f4176f.getBottom() + 0.5f);
            } else {
                i9 = 0;
            }
            this.f4178h.setBounds(0, i9, getWidth(), this.f4178h.getIntrinsicHeight() + i9);
            this.f4178h.draw(canvas);
        }
    }

    @Override // T.InterfaceC0290v
    public final void e(View view, int i9) {
        if (i9 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // T.InterfaceC0290v
    public final void f(View view, int i9, int i10, int[] iArr, int i11) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
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
        ActionBarContainer actionBarContainer = this.f4176f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        b bVar = this.f4172C;
        return bVar.b | bVar.f1822a;
    }

    public CharSequence getTitle() {
        k();
        return ((Y0) this.f4177g).f22611a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f4170A);
        removeCallbacks(this.f4171B);
        ViewPropertyAnimator viewPropertyAnimator = this.f4193y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4167E);
        boolean z8 = false;
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4178h = drawable;
        if (drawable == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        obtainStyledAttributes.recycle();
        this.f4192x = new OverScroller(context);
    }

    public final void j(int i9) {
        k();
        if (i9 != 2) {
            if (i9 != 5) {
                if (i9 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            } else {
                ((Y0) this.f4177g).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((Y0) this.f4177g).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        InterfaceC2604i0 wrapper;
        if (this.f4175d == null) {
            this.f4175d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4176f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC2604i0) {
                wrapper = (InterfaceC2604i0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f4177g = wrapper;
        }
    }

    public final void l(Menu menu, w wVar) {
        k();
        Y0 y02 = (Y0) this.f4177g;
        C2605j c2605j = y02.m;
        Toolbar toolbar = y02.f22611a;
        if (c2605j == null) {
            y02.m = new C2605j(toolbar.getContext());
        }
        C2605j c2605j2 = y02.m;
        c2605j2.f22663g = wVar;
        MenuC2533l menuC2533l = (MenuC2533l) menu;
        if (menuC2533l != null || toolbar.b != null) {
            toolbar.f();
            MenuC2533l menuC2533l2 = toolbar.b.f4198r;
            if (menuC2533l2 != menuC2533l) {
                if (menuC2533l2 != null) {
                    menuC2533l2.r(toolbar.f4289M);
                    menuC2533l2.r(toolbar.f4290N);
                }
                if (toolbar.f4290N == null) {
                    toolbar.f4290N = new T0(toolbar);
                }
                c2605j2.f22673s = true;
                if (menuC2533l != null) {
                    menuC2533l.b(c2605j2, toolbar.l);
                    menuC2533l.b(toolbar.f4290N, toolbar.l);
                } else {
                    c2605j2.c(toolbar.l, null);
                    toolbar.f4290N.c(toolbar.l, null);
                    c2605j2.f();
                    toolbar.f4290N.f();
                }
                toolbar.b.setPopupTheme(toolbar.m);
                toolbar.b.setPresenter(c2605j2);
                toolbar.f4289M = c2605j2;
                toolbar.u();
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        G0 h6 = G0.h(this, windowInsets);
        boolean g9 = g(this.f4176f, new Rect(h6.b(), h6.d(), h6.c(), h6.a()), false);
        Rect rect = this.f4183o;
        ViewCompat.computeSystemWindowInsets(this, h6, rect);
        int i9 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        E0 e02 = h6.f2863a;
        G0 l = e02.l(i9, i10, i11, i12);
        this.f4187s = l;
        boolean z8 = true;
        if (!this.f4188t.equals(l)) {
            this.f4188t = this.f4187s;
            g9 = true;
        }
        Rect rect2 = this.f4184p;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z8 = g9;
        }
        if (z8) {
            requestLayout();
        }
        return e02.a().f2863a.c().f2863a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C2593d c2593d = (C2593d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) c2593d).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) c2593d).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z8) {
        if (this.f4181k && z8) {
            this.f4192x.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f4192x.getFinalY() > this.f4176f.getHeight()) {
                h();
                this.f4171B.run();
            } else {
                h();
                this.f4170A.run();
            }
            this.l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        int i13 = this.m + i10;
        this.m = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        C2411H c2411h;
        k kVar;
        this.f4172C.f1822a = i9;
        this.m = getActionBarHideOffset();
        h();
        InterfaceC2591c interfaceC2591c = this.f4191w;
        if (interfaceC2591c != null && (kVar = (c2411h = (C2411H) interfaceC2591c).f21255u) != null) {
            kVar.a();
            c2411h.f21255u = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        if ((i9 & 2) != 0 && this.f4176f.getVisibility() == 0) {
            return this.f4181k;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f4181k && !this.l) {
            if (this.m <= this.f4176f.getHeight()) {
                h();
                postDelayed(this.f4170A, 600L);
            } else {
                h();
                postDelayed(this.f4171B, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i9) {
        boolean z8;
        boolean z9;
        super.onWindowSystemUiVisibilityChanged(i9);
        k();
        int i10 = this.f4182n ^ i9;
        this.f4182n = i9;
        if ((i9 & 4) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i9 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        InterfaceC2591c interfaceC2591c = this.f4191w;
        if (interfaceC2591c != null) {
            ((C2411H) interfaceC2591c).f21251q = !z9;
            if (!z8 && z9) {
                C2411H c2411h = (C2411H) interfaceC2591c;
                if (!c2411h.f21252r) {
                    c2411h.f21252r = true;
                    c2411h.D(true);
                }
            } else {
                C2411H c2411h2 = (C2411H) interfaceC2591c;
                if (c2411h2.f21252r) {
                    c2411h2.f21252r = false;
                    c2411h2.D(true);
                }
            }
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && this.f4191w != null) {
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
        this.f4174c = i9;
        InterfaceC2591c interfaceC2591c = this.f4191w;
        if (interfaceC2591c != null) {
            ((C2411H) interfaceC2591c).f21250p = i9;
        }
    }

    public void setActionBarHideOffset(int i9) {
        h();
        this.f4176f.setTranslationY(-Math.max(0, Math.min(i9, this.f4176f.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2591c interfaceC2591c) {
        this.f4191w = interfaceC2591c;
        if (getWindowToken() != null) {
            ((C2411H) this.f4191w).f21250p = this.f4174c;
            int i9 = this.f4182n;
            if (i9 != 0) {
                onWindowSystemUiVisibilityChanged(i9);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z8) {
        this.f4180j = z8;
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 != this.f4181k) {
            this.f4181k = z8;
            if (!z8) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i9) {
        k();
        Y0 y02 = (Y0) this.f4177g;
        y02.f22613d = i9 != 0 ? n.g(y02.f22611a.getContext(), i9) : null;
        y02.c();
    }

    public void setLogo(int i9) {
        Drawable drawable;
        k();
        Y0 y02 = (Y0) this.f4177g;
        if (i9 != 0) {
            drawable = n.g(y02.f22611a.getContext(), i9);
        } else {
            drawable = null;
        }
        y02.f22614e = drawable;
        y02.c();
    }

    public void setOverlayMode(boolean z8) {
        this.f4179i = z8;
    }

    public void setShowingForActionMode(boolean z8) {
    }

    public void setUiOptions(int i9) {
    }

    @Override // q.InterfaceC2602h0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((Y0) this.f4177g).f22620k = callback;
    }

    @Override // q.InterfaceC2602h0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        Y0 y02 = (Y0) this.f4177g;
        if (!y02.f22616g) {
            y02.f22617h = charSequence;
            if ((y02.b & 8) != 0) {
                Toolbar toolbar = y02.f22611a;
                toolbar.setTitle(charSequence);
                if (y02.f22616g) {
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
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        Y0 y02 = (Y0) this.f4177g;
        y02.f22613d = drawable;
        y02.c();
    }
}
