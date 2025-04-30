package androidx.appcompat.widget;

import B3.k;
import B3.m;
import T.C0284o;
import T.InterfaceC0278k;
import T.InterfaceC0286q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Z;
import b0.AbstractC0547b;
import com.bumptech.glide.f;
import com.facebook.appevents.n;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j.AbstractC2379a;
import java.util.ArrayList;
import java.util.Iterator;
import k.C2426o;
import o.i;
import p.C2535n;
import p.MenuC2533l;
import q.C2605j;
import q.C2630w;
import q.InterfaceC2604i0;
import q.L0;
import q.R0;
import q.S0;
import q.T0;
import q.U0;
import q.V0;
import q.W0;
import q.X0;
import q.Y0;
import q.g1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0278k {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f4277A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4278B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f4279C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4280D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4281E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f4282F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f4283G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f4284H;

    /* renamed from: I, reason: collision with root package name */
    public final C0284o f4285I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f4286J;

    /* renamed from: K, reason: collision with root package name */
    public final C2426o f4287K;

    /* renamed from: L, reason: collision with root package name */
    public Y0 f4288L;

    /* renamed from: M, reason: collision with root package name */
    public C2605j f4289M;

    /* renamed from: N, reason: collision with root package name */
    public T0 f4290N;
    public boolean O;

    /* renamed from: P, reason: collision with root package name */
    public OnBackInvokedCallback f4291P;

    /* renamed from: Q, reason: collision with root package name */
    public OnBackInvokedDispatcher f4292Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4293R;

    /* renamed from: S, reason: collision with root package name */
    public final k f4294S;
    public ActionMenuView b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f4295c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatTextView f4296d;

    /* renamed from: f, reason: collision with root package name */
    public C2630w f4297f;

    /* renamed from: g, reason: collision with root package name */
    public AppCompatImageView f4298g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f4299h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f4300i;

    /* renamed from: j, reason: collision with root package name */
    public C2630w f4301j;

    /* renamed from: k, reason: collision with root package name */
    public View f4302k;
    public Context l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f4303n;

    /* renamed from: o, reason: collision with root package name */
    public int f4304o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4305p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4306q;

    /* renamed from: r, reason: collision with root package name */
    public int f4307r;

    /* renamed from: s, reason: collision with root package name */
    public int f4308s;

    /* renamed from: t, reason: collision with root package name */
    public int f4309t;

    /* renamed from: u, reason: collision with root package name */
    public int f4310u;

    /* renamed from: v, reason: collision with root package name */
    public L0 f4311v;

    /* renamed from: w, reason: collision with root package name */
    public int f4312w;

    /* renamed from: x, reason: collision with root package name */
    public int f4313x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4314y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f4315z;

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i9 = 0; i9 < menu.size(); i9++) {
            arrayList.add(menu.getItem(i9));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, q.U0] */
    public static U0 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.b = 0;
        marginLayoutParams.f22596a = 8388627;
        return marginLayoutParams;
    }

    public static U0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z8 = layoutParams instanceof U0;
        if (z8) {
            U0 u02 = (U0) layoutParams;
            U0 u03 = new U0(u02);
            u03.b = 0;
            u03.b = u02.b;
            return u03;
        }
        if (z8) {
            U0 u04 = new U0((U0) layoutParams);
            u04.b = 0;
            return u04;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            U0 u05 = new U0(marginLayoutParams);
            u05.b = 0;
            ((ViewGroup.MarginLayoutParams) u05).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) u05).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) u05).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) u05).bottomMargin = marginLayoutParams.bottomMargin;
            return u05;
        }
        U0 u06 = new U0(layoutParams);
        u06.b = 0;
        return u06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i9) {
        boolean z8;
        if (getLayoutDirection() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, getLayoutDirection());
        arrayList.clear();
        if (z8) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                U0 u02 = (U0) childAt.getLayoutParams();
                if (u02.b == 0 && t(childAt)) {
                    int i11 = u02.f22596a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            U0 u03 = (U0) childAt2.getLayoutParams();
            if (u03.b == 0 && t(childAt2)) {
                int i13 = u03.f22596a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // T.InterfaceC0278k
    public final void addMenuProvider(InterfaceC0286q interfaceC0286q) {
        C0284o c0284o = this.f4285I;
        c0284o.b.add(interfaceC0286q);
        c0284o.f2915a.run();
    }

    public final void b(View view, boolean z8) {
        U0 u02;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            u02 = h();
        } else if (!checkLayoutParams(layoutParams)) {
            u02 = i(layoutParams);
        } else {
            u02 = (U0) layoutParams;
        }
        u02.b = 1;
        if (z8 && this.f4302k != null) {
            view.setLayoutParams(u02);
            this.f4283G.add(view);
        } else {
            addView(view, u02);
        }
    }

    public final void c() {
        if (this.f4301j == null) {
            C2630w c2630w = new C2630w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f4301j = c2630w;
            c2630w.setImageDrawable(this.f4299h);
            this.f4301j.setContentDescription(this.f4300i);
            U0 h6 = h();
            h6.f22596a = (this.f4305p & 112) | 8388611;
            h6.b = 2;
            this.f4301j.setLayoutParams(h6);
            this.f4301j.setOnClickListener(new m(this, 5));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof U0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q.L0, java.lang.Object] */
    public final void d() {
        if (this.f4311v == null) {
            ?? obj = new Object();
            obj.f22566a = 0;
            obj.b = 0;
            obj.f22567c = Integer.MIN_VALUE;
            obj.f22568d = Integer.MIN_VALUE;
            obj.f22569e = 0;
            obj.f22570f = 0;
            obj.f22571g = false;
            obj.f22572h = false;
            this.f4311v = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView.f4198r == null) {
            MenuC2533l menuC2533l = (MenuC2533l) actionMenuView.getMenu();
            if (this.f4290N == null) {
                this.f4290N = new T0(this);
            }
            this.b.setExpandedActionViewsExclusive(true);
            menuC2533l.b(this.f4290N, this.l);
            u();
        }
    }

    public final void f() {
        if (this.b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.b = actionMenuView;
            actionMenuView.setPopupTheme(this.m);
            this.b.setOnMenuItemClickListener(this.f4287K);
            ActionMenuView actionMenuView2 = this.b;
            f fVar = new f(this, 14);
            actionMenuView2.f4203w = null;
            actionMenuView2.f4204x = fVar;
            U0 h6 = h();
            h6.f22596a = (this.f4305p & 112) | 8388613;
            this.b.setLayoutParams(h6);
            b(this.b, false);
        }
    }

    public final void g() {
        if (this.f4297f == null) {
            this.f4297f = new C2630w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            U0 h6 = h();
            h6.f22596a = (this.f4305p & 112) | 8388611;
            this.f4297f.setLayoutParams(h6);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        C2630w c2630w = this.f4301j;
        if (c2630w != null) {
            return c2630w.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        C2630w c2630w = this.f4301j;
        if (c2630w != null) {
            return c2630w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        L0 l02 = this.f4311v;
        if (l02 != null) {
            if (l02.f22571g) {
                return l02.f22566a;
            }
            return l02.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i9 = this.f4313x;
        if (i9 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i9;
    }

    public int getContentInsetLeft() {
        L0 l02 = this.f4311v;
        if (l02 != null) {
            return l02.f22566a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        L0 l02 = this.f4311v;
        if (l02 != null) {
            return l02.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        L0 l02 = this.f4311v;
        if (l02 != null) {
            if (l02.f22571g) {
                return l02.b;
            }
            return l02.f22566a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i9 = this.f4312w;
        if (i9 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i9;
    }

    public int getCurrentContentInsetEnd() {
        MenuC2533l menuC2533l;
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView != null && (menuC2533l = actionMenuView.f4198r) != null && menuC2533l.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f4313x, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f4312w, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f4298g;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f4298g;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.b.getMenu();
    }

    @Nullable
    public View getNavButtonView() {
        return this.f4297f;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        C2630w c2630w = this.f4297f;
        if (c2630w != null) {
            return c2630w.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        C2630w c2630w = this.f4297f;
        if (c2630w != null) {
            return c2630w.getDrawable();
        }
        return null;
    }

    public C2605j getOuterActionMenuPresenter() {
        return this.f4289M;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        e();
        return this.b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.l;
    }

    public int getPopupTheme() {
        return this.m;
    }

    public CharSequence getSubtitle() {
        return this.f4277A;
    }

    @Nullable
    public final TextView getSubtitleTextView() {
        return this.f4296d;
    }

    public CharSequence getTitle() {
        return this.f4315z;
    }

    public int getTitleMarginBottom() {
        return this.f4310u;
    }

    public int getTitleMarginEnd() {
        return this.f4308s;
    }

    public int getTitleMarginStart() {
        return this.f4307r;
    }

    public int getTitleMarginTop() {
        return this.f4309t;
    }

    @Nullable
    public final TextView getTitleTextView() {
        return this.f4295c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q.Y0, java.lang.Object] */
    public InterfaceC2604i0 getWrapper() {
        boolean z8;
        Drawable drawable;
        if (this.f4288L == null) {
            ?? obj = new Object();
            obj.f22621n = 0;
            obj.f22611a = this;
            obj.f22617h = getTitle();
            obj.f22618i = getSubtitle();
            if (obj.f22617h != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            obj.f22616g = z8;
            obj.f22615f = getNavigationIcon();
            String str = null;
            l5.k i9 = l5.k.i(getContext(), null, AbstractC2379a.f20942a, R.attr.actionBarStyle, 0);
            obj.f22622o = i9.e(15);
            TypedArray typedArray = (TypedArray) i9.b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f22616g = true;
                obj.f22617h = text;
                if ((obj.b & 8) != 0) {
                    Toolbar toolbar = obj.f22611a;
                    toolbar.setTitle(text);
                    if (obj.f22616g) {
                        ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f22618i = text2;
                if ((obj.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable e4 = i9.e(20);
            if (e4 != null) {
                obj.f22614e = e4;
                obj.c();
            }
            Drawable e9 = i9.e(17);
            if (e9 != null) {
                obj.f22613d = e9;
                obj.c();
            }
            if (obj.f22615f == null && (drawable = obj.f22622o) != null) {
                obj.f22615f = drawable;
                int i10 = obj.b & 4;
                Toolbar toolbar2 = obj.f22611a;
                if (i10 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f22612c;
                if (view != null && (obj.b & 16) != 0) {
                    removeView(view);
                }
                obj.f22612c = inflate;
                if (inflate != null && (obj.b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f4311v.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f4303n = resourceId2;
                AppCompatTextView appCompatTextView = this.f4295c;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f4304o = resourceId3;
                AppCompatTextView appCompatTextView2 = this.f4296d;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            i9.j();
            if (R.string.abc_action_bar_up_description != obj.f22621n) {
                obj.f22621n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i11 = obj.f22621n;
                    if (i11 != 0) {
                        str = getContext().getString(i11);
                    }
                    obj.f22619j = str;
                    obj.b();
                }
            }
            obj.f22619j = getNavigationContentDescription();
            setNavigationOnClickListener(new X0(obj));
            this.f4288L = obj;
        }
        return this.f4288L;
    }

    public final int j(View view, int i9) {
        int i10;
        U0 u02 = (U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i9 > 0) {
            i10 = (measuredHeight - i9) / 2;
        } else {
            i10 = 0;
        }
        int i11 = u02.f22596a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f4314y & 112;
        }
        if (i11 != 48) {
            if (i11 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) u02).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) u02).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) u02).bottomMargin) - i10;
        }
        return getPaddingTop() - i10;
    }

    public void m(int i9) {
        getMenuInflater().inflate(i9, getMenu());
    }

    public final void n() {
        Iterator it = this.f4286J.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f4285I.b.iterator();
        while (it2.hasNext()) {
            ((Z) ((InterfaceC0286q) it2.next())).f4692a.dispatchCreateOptionsMenu(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4286J = currentMenuItems2;
    }

    public final boolean o(View view) {
        if (view.getParent() != this && !this.f4283G.contains(view)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4294S);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4281E = false;
        }
        if (!this.f4281E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4281E = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4281E = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0291 A[LOOP:0: B:40:0x028f->B:41:0x0291, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ad A[LOOP:1: B:44:0x02ab->B:45:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cd A[LOOP:2: B:48:0x02cb->B:49:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031b A[LOOP:3: B:57:0x0319->B:58:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        char c9;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z8 = g1.f22657a;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            c10 = 1;
            c9 = 0;
        } else {
            c9 = 1;
            c10 = 0;
        }
        if (t(this.f4297f)) {
            s(this.f4297f, i9, 0, i10, this.f4306q);
            i11 = k(this.f4297f) + this.f4297f.getMeasuredWidth();
            i12 = Math.max(0, l(this.f4297f) + this.f4297f.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.f4297f.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (t(this.f4301j)) {
            s(this.f4301j, i9, 0, i10, this.f4306q);
            i11 = k(this.f4301j) + this.f4301j.getMeasuredWidth();
            i12 = Math.max(i12, l(this.f4301j) + this.f4301j.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f4301j.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        int[] iArr = this.f4284H;
        iArr[c10] = max2;
        if (t(this.b)) {
            s(this.b, i9, max, i10, this.f4306q);
            i14 = k(this.b) + this.b.getMeasuredWidth();
            i12 = Math.max(i12, l(this.b) + this.b.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.b.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c9] = Math.max(0, currentContentInsetEnd - i14);
        if (t(this.f4302k)) {
            max3 += r(this.f4302k, i9, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.f4302k) + this.f4302k.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f4302k.getMeasuredState());
        }
        if (t(this.f4298g)) {
            max3 += r(this.f4298g, i9, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.f4298g) + this.f4298g.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f4298g.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((U0) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                max3 += r(childAt, i9, max3, i10, 0, iArr);
                i12 = Math.max(i12, l(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
            }
        }
        int i20 = this.f4309t + this.f4310u;
        int i21 = this.f4307r + this.f4308s;
        if (t(this.f4295c)) {
            r(this.f4295c, i9, max3 + i21, i10, i20, iArr);
            int k6 = k(this.f4295c) + this.f4295c.getMeasuredWidth();
            i15 = l(this.f4295c) + this.f4295c.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i13, this.f4295c.getMeasuredState());
            i17 = k6;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (t(this.f4296d)) {
            i17 = Math.max(i17, r(this.f4296d, i9, max3 + i21, i10, i15 + i20, iArr));
            i15 = l(this.f4296d) + this.f4296d.getMeasuredHeight() + i15;
            i16 = View.combineMeasuredStates(i16, this.f4296d.getMeasuredState());
        }
        int max4 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i17, getSuggestedMinimumWidth()), i9, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.O) {
            int childCount2 = getChildCount();
            for (int i22 = 0; i22 < childCount2; i22++) {
                View childAt2 = getChildAt(i22);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuC2533l menuC2533l;
        MenuItem findItem;
        if (!(parcelable instanceof W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        W0 w02 = (W0) parcelable;
        super.onRestoreInstanceState(w02.b);
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView != null) {
            menuC2533l = actionMenuView.f4198r;
        } else {
            menuC2533l = null;
        }
        int i9 = w02.f22607d;
        if (i9 != 0 && this.f4290N != null && menuC2533l != null && (findItem = menuC2533l.findItem(i9)) != null) {
            findItem.expandActionView();
        }
        if (w02.f22608f) {
            k kVar = this.f4294S;
            removeCallbacks(kVar);
            post(kVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        d();
        L0 l02 = this.f4311v;
        boolean z8 = true;
        if (i9 != 1) {
            z8 = false;
        }
        if (z8 != l02.f22571g) {
            l02.f22571g = z8;
            if (l02.f22572h) {
                if (z8) {
                    int i10 = l02.f22568d;
                    if (i10 == Integer.MIN_VALUE) {
                        i10 = l02.f22569e;
                    }
                    l02.f22566a = i10;
                    int i11 = l02.f22567c;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = l02.f22570f;
                    }
                    l02.b = i11;
                    return;
                }
                int i12 = l02.f22567c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = l02.f22569e;
                }
                l02.f22566a = i12;
                int i13 = l02.f22568d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = l02.f22570f;
                }
                l02.b = i13;
                return;
            }
            l02.f22566a = l02.f22569e;
            l02.b = l02.f22570f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.W0, android.os.Parcelable, b0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        C2605j c2605j;
        C2535n c2535n;
        ?? abstractC0547b = new AbstractC0547b(super.onSaveInstanceState());
        T0 t02 = this.f4290N;
        if (t02 != null && (c2535n = t02.f22594c) != null) {
            abstractC0547b.f22607d = c2535n.b;
        }
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView != null && (c2605j = actionMenuView.f4202v) != null && c2605j.k()) {
            z8 = true;
        } else {
            z8 = false;
        }
        abstractC0547b.f22608f = z8;
        return abstractC0547b;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4280D = false;
        }
        if (!this.f4280D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4280D = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4280D = false;
        }
        return true;
    }

    public final int p(View view, int i9, int i10, int[] iArr) {
        U0 u02 = (U0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) u02).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i9;
        iArr[0] = Math.max(0, -i11);
        int j7 = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j7, max + measuredWidth, view.getMeasuredHeight() + j7);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) u02).rightMargin + max;
    }

    public final int q(View view, int i9, int i10, int[] iArr) {
        U0 u02 = (U0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) u02).rightMargin - iArr[1];
        int max = i9 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int j7 = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j7, max, view.getMeasuredHeight() + j7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) u02).leftMargin);
    }

    public final int r(View view, int i9, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // T.InterfaceC0278k
    public final void removeMenuProvider(InterfaceC0286q interfaceC0286q) {
        this.f4285I.b(interfaceC0286q);
    }

    public final void s(View view, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z8) {
        if (this.f4293R != z8) {
            this.f4293R = z8;
            u();
        }
    }

    public void setCollapseContentDescription(@StringRes int i9) {
        setCollapseContentDescription(i9 != 0 ? getContext().getText(i9) : null);
    }

    public void setCollapseIcon(int i9) {
        setCollapseIcon(n.g(getContext(), i9));
    }

    public void setCollapsible(boolean z8) {
        this.O = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i9) {
        if (i9 < 0) {
            i9 = Integer.MIN_VALUE;
        }
        if (i9 != this.f4313x) {
            this.f4313x = i9;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i9) {
        if (i9 < 0) {
            i9 = Integer.MIN_VALUE;
        }
        if (i9 != this.f4312w) {
            this.f4312w = i9;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i9) {
        setLogo(n.g(getContext(), i9));
    }

    public void setLogoDescription(@StringRes int i9) {
        setLogoDescription(getContext().getText(i9));
    }

    public void setNavigationContentDescription(@StringRes int i9) {
        setNavigationContentDescription(i9 != 0 ? getContext().getText(i9) : null);
    }

    public void setNavigationIcon(int i9) {
        setNavigationIcon(n.g(getContext(), i9));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f4297f.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        e();
        this.b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i9) {
        if (this.m != i9) {
            this.m = i9;
            if (i9 == 0) {
                this.l = getContext();
            } else {
                this.l = new ContextThemeWrapper(getContext(), i9);
            }
        }
    }

    public void setSubtitle(@StringRes int i9) {
        setSubtitle(getContext().getText(i9));
    }

    public void setSubtitleTextColor(int i9) {
        setSubtitleTextColor(ColorStateList.valueOf(i9));
    }

    public void setTitle(@StringRes int i9) {
        setTitle(getContext().getText(i9));
    }

    public void setTitleMarginBottom(int i9) {
        this.f4310u = i9;
        requestLayout();
    }

    public void setTitleMarginEnd(int i9) {
        this.f4308s = i9;
        requestLayout();
    }

    public void setTitleMarginStart(int i9) {
        this.f4307r = i9;
        requestLayout();
    }

    public void setTitleMarginTop(int i9) {
        this.f4309t = i9;
        requestLayout();
    }

    public void setTitleTextColor(int i9) {
        setTitleTextColor(ColorStateList.valueOf(i9));
    }

    public final boolean t(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void u() {
        boolean z8;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a6 = S0.a(this);
            T0 t02 = this.f4290N;
            if (t02 != null && t02.f22594c != null && a6 != null && isAttachedToWindow() && this.f4293R) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 && this.f4292Q == null) {
                if (this.f4291P == null) {
                    this.f4291P = S0.b(new R0(this, 0));
                }
                S0.c(a6, this.f4291P);
                this.f4292Q = a6;
                return;
            }
            if (!z8 && (onBackInvokedDispatcher = this.f4292Q) != null) {
                S0.d(onBackInvokedDispatcher, this.f4291P);
                this.f4292Q = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f4314y = 8388627;
        this.f4282F = new ArrayList();
        this.f4283G = new ArrayList();
        this.f4284H = new int[2];
        this.f4285I = new C0284o(new R0(this, 1));
        this.f4286J = new ArrayList();
        this.f4287K = new C2426o(this, 5);
        this.f4294S = new k(this, 22);
        Context context2 = getContext();
        int[] iArr = AbstractC2379a.f20962x;
        l5.k i10 = l5.k.i(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, (TypedArray) i10.b, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) i10.b;
        this.f4303n = typedArray.getResourceId(28, 0);
        this.f4304o = typedArray.getResourceId(19, 0);
        this.f4314y = typedArray.getInteger(0, 8388627);
        this.f4305p = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4310u = dimensionPixelOffset;
        this.f4309t = dimensionPixelOffset;
        this.f4308s = dimensionPixelOffset;
        this.f4307r = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4307r = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4308s = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4309t = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4310u = dimensionPixelOffset5;
        }
        this.f4306q = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        L0 l02 = this.f4311v;
        l02.f22572h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            l02.f22569e = dimensionPixelSize;
            l02.f22566a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            l02.f22570f = dimensionPixelSize2;
            l02.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            l02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4312w = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4313x = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4299h = i10.e(4);
        this.f4300i = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.l = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable e4 = i10.e(16);
        if (e4 != null) {
            setNavigationIcon(e4);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable e9 = i10.e(11);
        if (e9 != null) {
            setLogo(e9);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(i10.d(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(i10.d(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        i10.j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, q.U0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f22596a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2379a.b);
        marginLayoutParams.f22596a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C2630w c2630w = this.f4301j;
        if (c2630w != null) {
            c2630w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4301j.setImageDrawable(drawable);
        } else {
            C2630w c2630w = this.f4301j;
            if (c2630w != null) {
                c2630w.setImageDrawable(this.f4299h);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4298g == null) {
                this.f4298g = new AppCompatImageView(getContext());
            }
            if (!o(this.f4298g)) {
                b(this.f4298g, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f4298g;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f4298g);
                this.f4283G.remove(this.f4298g);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f4298g;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4298g == null) {
            this.f4298g = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f4298g;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C2630w c2630w = this.f4297f;
        if (c2630w != null) {
            c2630w.setContentDescription(charSequence);
            com.facebook.appevents.i.q(this.f4297f, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f4297f)) {
                b(this.f4297f, true);
            }
        } else {
            C2630w c2630w = this.f4297f;
            if (c2630w != null && o(c2630w)) {
                removeView(this.f4297f);
                this.f4283G.remove(this.f4297f);
            }
        }
        C2630w c2630w2 = this.f4297f;
        if (c2630w2 != null) {
            c2630w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4296d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f4296d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4296d.setEllipsize(TextUtils.TruncateAt.END);
                int i9 = this.f4304o;
                if (i9 != 0) {
                    this.f4296d.setTextAppearance(context, i9);
                }
                ColorStateList colorStateList = this.f4279C;
                if (colorStateList != null) {
                    this.f4296d.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4296d)) {
                b(this.f4296d, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f4296d;
            if (appCompatTextView2 != null && o(appCompatTextView2)) {
                removeView(this.f4296d);
                this.f4283G.remove(this.f4296d);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f4296d;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f4277A = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f4279C = colorStateList;
        AppCompatTextView appCompatTextView = this.f4296d;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4295c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f4295c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4295c.setEllipsize(TextUtils.TruncateAt.END);
                int i9 = this.f4303n;
                if (i9 != 0) {
                    this.f4295c.setTextAppearance(context, i9);
                }
                ColorStateList colorStateList = this.f4278B;
                if (colorStateList != null) {
                    this.f4295c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4295c)) {
                b(this.f4295c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f4295c;
            if (appCompatTextView2 != null && o(appCompatTextView2)) {
                removeView(this.f4295c);
                this.f4283G.remove(this.f4295c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f4295c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f4315z = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f4278B = colorStateList;
        AppCompatTextView appCompatTextView = this.f4295c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(V0 v02) {
    }
}
