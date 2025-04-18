package androidx.appcompat.widget;

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
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements n0.m {
    public CharSequence A;
    public ColorStateList B;
    public ColorStateList C;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final ArrayList G;
    public final int[] H;
    public final n0.q I;
    public ArrayList J;
    public final fb.c K;
    public z3 L;
    public m M;
    public v3 N;
    public boolean O;
    public OnBackInvokedCallback P;
    public OnBackInvokedDispatcher Q;
    public boolean R;
    public final androidx.activity.i S;

    /* renamed from: b, reason: collision with root package name */
    public ActionMenuView f772b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f773c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatTextView f774d;

    /* renamed from: f, reason: collision with root package name */
    public a0 f775f;

    /* renamed from: g, reason: collision with root package name */
    public AppCompatImageView f776g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f777h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f778i;

    /* renamed from: j, reason: collision with root package name */
    public a0 f779j;

    /* renamed from: k, reason: collision with root package name */
    public View f780k;

    /* renamed from: l, reason: collision with root package name */
    public Context f781l;

    /* renamed from: m, reason: collision with root package name */
    public int f782m;

    /* renamed from: n, reason: collision with root package name */
    public int f783n;

    /* renamed from: o, reason: collision with root package name */
    public int f784o;

    /* renamed from: p, reason: collision with root package name */
    public final int f785p;

    /* renamed from: q, reason: collision with root package name */
    public final int f786q;

    /* renamed from: r, reason: collision with root package name */
    public int f787r;

    /* renamed from: s, reason: collision with root package name */
    public int f788s;

    /* renamed from: t, reason: collision with root package name */
    public int f789t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public u2 f790v;

    /* renamed from: w, reason: collision with root package name */
    public int f791w;

    /* renamed from: x, reason: collision with root package name */
    public int f792x;

    /* renamed from: y, reason: collision with root package name */
    public final int f793y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f794z;

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static w3 g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof w3) {
            return new w3((w3) layoutParams);
        }
        if (layoutParams instanceof h.a) {
            return new w3((h.a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new w3((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new w3(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.k(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                w3 w3Var = (w3) childAt.getLayoutParams();
                if (w3Var.f1075b == 0 && r(childAt)) {
                    int i12 = w3Var.a;
                    int layoutDirection = ViewCompat.getLayoutDirection(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
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
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            w3 w3Var2 = (w3) childAt2.getLayoutParams();
            if (w3Var2.f1075b == 0 && r(childAt2)) {
                int i14 = w3Var2.a;
                int layoutDirection2 = ViewCompat.getLayoutDirection(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // n0.m
    public final void addMenuProvider(n0.s sVar) {
        n0.q qVar = this.I;
        qVar.f22341b.add(sVar);
        qVar.a.run();
    }

    public final void b(View view, boolean z10) {
        w3 w3Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            w3Var = new w3();
        } else if (!checkLayoutParams(layoutParams)) {
            w3Var = g(layoutParams);
        } else {
            w3Var = (w3) layoutParams;
        }
        w3Var.f1075b = 1;
        if (z10 && this.f780k != null) {
            view.setLayoutParams(w3Var);
            this.G.add(view);
        } else {
            addView(view, w3Var);
        }
    }

    public final void c() {
        if (this.f779j == null) {
            a0 a0Var = new a0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f779j = a0Var;
            a0Var.setImageDrawable(this.f777h);
            this.f779j.setContentDescription(this.f778i);
            w3 w3Var = new w3();
            w3Var.a = (this.f785p & 112) | 8388611;
            w3Var.f1075b = 2;
            this.f779j.setLayoutParams(w3Var);
            this.f779j.setOnClickListener(new h.b(this, 1));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof w3);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f772b;
        if (actionMenuView.f714r == null) {
            k.o oVar = (k.o) actionMenuView.getMenu();
            if (this.N == null) {
                this.N = new v3(this);
            }
            this.f772b.setExpandedActionViewsExclusive(true);
            oVar.b(this.N, this.f781l);
            s();
        }
    }

    public final void e() {
        if (this.f772b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f772b = actionMenuView;
            actionMenuView.setPopupTheme(this.f782m);
            this.f772b.setOnMenuItemClickListener(this.K);
            ActionMenuView actionMenuView2 = this.f772b;
            kc.c cVar = new kc.c(this, 4);
            actionMenuView2.f718w = null;
            actionMenuView2.f719x = cVar;
            w3 w3Var = new w3();
            w3Var.a = (this.f785p & 112) | 8388613;
            this.f772b.setLayoutParams(w3Var);
            b(this.f772b, false);
        }
    }

    public final void f() {
        if (this.f775f == null) {
            this.f775f = new a0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            w3 w3Var = new w3();
            w3Var.a = (this.f785p & 112) | 8388611;
            this.f775f.setLayoutParams(w3Var);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new w3();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        a0 a0Var = this.f779j;
        if (a0Var != null) {
            return a0Var.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        a0 a0Var = this.f779j;
        if (a0Var != null) {
            return a0Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        u2 u2Var = this.f790v;
        if (u2Var != null) {
            if (u2Var.f1055g) {
                return u2Var.a;
            }
            return u2Var.f1050b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f792x;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        u2 u2Var = this.f790v;
        if (u2Var != null) {
            return u2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        u2 u2Var = this.f790v;
        if (u2Var != null) {
            return u2Var.f1050b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        u2 u2Var = this.f790v;
        if (u2Var != null) {
            if (u2Var.f1055g) {
                return u2Var.f1050b;
            }
            return u2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f791w;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        k.o oVar;
        ActionMenuView actionMenuView = this.f772b;
        if (actionMenuView != null && (oVar = actionMenuView.f714r) != null && oVar.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.f792x, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f791w, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f776g;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f776g;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f772b.getMenu();
    }

    @Nullable
    public View getNavButtonView() {
        return this.f775f;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        a0 a0Var = this.f775f;
        if (a0Var != null) {
            return a0Var.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        a0 a0Var = this.f775f;
        if (a0Var != null) {
            return a0Var.getDrawable();
        }
        return null;
    }

    public m getOuterActionMenuPresenter() {
        return this.M;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        d();
        return this.f772b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f781l;
    }

    public int getPopupTheme() {
        return this.f782m;
    }

    public CharSequence getSubtitle() {
        return this.A;
    }

    @Nullable
    public final TextView getSubtitleTextView() {
        return this.f774d;
    }

    public CharSequence getTitle() {
        return this.f794z;
    }

    public int getTitleMarginBottom() {
        return this.u;
    }

    public int getTitleMarginEnd() {
        return this.f788s;
    }

    public int getTitleMarginStart() {
        return this.f787r;
    }

    public int getTitleMarginTop() {
        return this.f789t;
    }

    @Nullable
    final TextView getTitleTextView() {
        return this.f773c;
    }

    public r1 getWrapper() {
        if (this.L == null) {
            this.L = new z3(this);
        }
        return this.L;
    }

    public final int h(int i10, View view) {
        int i11;
        w3 w3Var = (w3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = w3Var.a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f793y & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) w3Var).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) w3Var).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) w3Var).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.I.f22341b.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.q0) ((n0.s) it2.next())).a.dispatchCreateOptionsMenu(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.J = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.G.contains(view);
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        w3 w3Var = (w3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) w3Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) w3Var).rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        w3 w3Var = (w3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) w3Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) w3Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0290 A[LOOP:0: B:40:0x028e->B:41:0x0290, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ac A[LOOP:1: B:44:0x02aa->B:45:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cc A[LOOP:2: B:48:0x02ca->B:49:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031a A[LOOP:3: B:57:0x0318->B:58:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        k.o oVar;
        MenuItem findItem;
        if (!(parcelable instanceof y3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y3 y3Var = (y3) parcelable;
        super.onRestoreInstanceState(y3Var.f26666b);
        ActionMenuView actionMenuView = this.f772b;
        if (actionMenuView != null) {
            oVar = actionMenuView.f714r;
        } else {
            oVar = null;
        }
        int i10 = y3Var.f1099d;
        if (i10 != 0 && this.N != null && oVar != null && (findItem = oVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (y3Var.f1100f) {
            androidx.activity.i iVar = this.S;
            removeCallbacks(iVar);
            post(iVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f790v == null) {
            this.f790v = new u2();
        }
        u2 u2Var = this.f790v;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != u2Var.f1055g) {
            u2Var.f1055g = z10;
            if (u2Var.f1056h) {
                if (z10) {
                    int i11 = u2Var.f1052d;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = u2Var.f1053e;
                    }
                    u2Var.a = i11;
                    int i12 = u2Var.f1051c;
                    if (i12 == Integer.MIN_VALUE) {
                        i12 = u2Var.f1054f;
                    }
                    u2Var.f1050b = i12;
                    return;
                }
                int i13 = u2Var.f1051c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = u2Var.f1053e;
                }
                u2Var.a = i13;
                int i14 = u2Var.f1052d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = u2Var.f1054f;
                }
                u2Var.f1050b = i14;
                return;
            }
            u2Var.a = u2Var.f1053e;
            u2Var.f1050b = u2Var.f1054f;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        k.q qVar;
        y3 y3Var = new y3(super.onSaveInstanceState());
        v3 v3Var = this.N;
        if (v3Var != null && (qVar = v3Var.f1064c) != null) {
            y3Var.f1099d = qVar.a;
        }
        ActionMenuView actionMenuView = this.f772b;
        boolean z11 = false;
        if (actionMenuView != null) {
            m mVar = actionMenuView.f717v;
            if (mVar != null && mVar.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        y3Var.f1100f = z11;
        return y3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.D = false;
        }
        if (!this.D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // n0.m
    public final void removeMenuProvider(n0.s sVar) {
        this.I.b(sVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = u3.a(this);
            v3 v3Var = this.N;
            int i10 = 1;
            boolean z11 = false;
            if (v3Var != null && v3Var.f1064c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && a != null && ViewCompat.isAttachedToWindow(this) && this.R) {
                z11 = true;
            }
            if (z11 && this.Q == null) {
                if (this.P == null) {
                    this.P = u3.b(new t3(this, i10));
                }
                u3.c(a, this.P);
                this.Q = a;
                return;
            }
            if (!z11 && (onBackInvokedDispatcher = this.Q) != null) {
                u3.d(onBackInvokedDispatcher, this.P);
                this.Q = null;
            }
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            s();
        }
    }

    public void setCollapseContentDescription(@StringRes int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(com.bumptech.glide.c.t(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.O = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f792x) {
            this.f792x = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f791w) {
            this.f791w = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(com.bumptech.glide.c.t(getContext(), i10));
    }

    public void setLogoDescription(@StringRes int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(@StringRes int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(com.bumptech.glide.c.t(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f775f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(x3 x3Var) {
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        d();
        this.f772b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f782m != i10) {
            this.f782m = i10;
            if (i10 == 0) {
                this.f781l = getContext();
            } else {
                this.f781l = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(@StringRes int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(@StringRes int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.u = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f788s = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f787r = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f789t = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f793y = 8388627;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new int[2];
        this.I = new n0.q(new t3(this, 0));
        this.J = new ArrayList();
        this.K = new fb.c(this, 4);
        this.S = new androidx.activity.i(this, 3);
        Context context2 = getContext();
        int[] iArr = g.a.f17900x;
        i3 m10 = i3.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        Object obj = m10.f874b;
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, (TypedArray) obj, R.attr.toolbarStyle, 0);
        this.f783n = m10.i(28, 0);
        this.f784o = m10.i(19, 0);
        this.f793y = ((TypedArray) obj).getInteger(0, 8388627);
        this.f785p = ((TypedArray) obj).getInteger(2, 48);
        int c10 = m10.c(22, 0);
        c10 = m10.l(27) ? m10.c(27, c10) : c10;
        this.u = c10;
        this.f789t = c10;
        this.f788s = c10;
        this.f787r = c10;
        int c11 = m10.c(25, -1);
        if (c11 >= 0) {
            this.f787r = c11;
        }
        int c12 = m10.c(24, -1);
        if (c12 >= 0) {
            this.f788s = c12;
        }
        int c13 = m10.c(26, -1);
        if (c13 >= 0) {
            this.f789t = c13;
        }
        int c14 = m10.c(23, -1);
        if (c14 >= 0) {
            this.u = c14;
        }
        this.f786q = m10.d(13, -1);
        int c15 = m10.c(9, Integer.MIN_VALUE);
        int c16 = m10.c(5, Integer.MIN_VALUE);
        int d10 = m10.d(7, 0);
        int d11 = m10.d(8, 0);
        if (this.f790v == null) {
            this.f790v = new u2();
        }
        u2 u2Var = this.f790v;
        u2Var.f1056h = false;
        if (d10 != Integer.MIN_VALUE) {
            u2Var.f1053e = d10;
            u2Var.a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            u2Var.f1054f = d11;
            u2Var.f1050b = d11;
        }
        if (c15 != Integer.MIN_VALUE || c16 != Integer.MIN_VALUE) {
            u2Var.a(c15, c16);
        }
        this.f791w = m10.c(10, Integer.MIN_VALUE);
        this.f792x = m10.c(6, Integer.MIN_VALUE);
        this.f777h = m10.e(4);
        this.f778i = m10.k(3);
        CharSequence k10 = m10.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.f781l = getContext();
        setPopupTheme(m10.i(17, 0));
        Drawable e2 = m10.e(16);
        if (e2 != null) {
            setNavigationIcon(e2);
        }
        CharSequence k12 = m10.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e10 = m10.e(11);
        if (e10 != null) {
            setLogo(e10);
        }
        CharSequence k13 = m10.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m10.l(29)) {
            setTitleTextColor(m10.b(29));
        }
        if (m10.l(20)) {
            setSubtitleTextColor(m10.b(20));
        }
        if (m10.l(14)) {
            k(m10.i(14, 0));
        }
        m10.o();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new w3(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        a0 a0Var = this.f779j;
        if (a0Var != null) {
            a0Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            c();
            this.f779j.setImageDrawable(drawable);
        } else {
            a0 a0Var = this.f779j;
            if (a0Var != null) {
                a0Var.setImageDrawable(this.f777h);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f776g == null) {
                this.f776g = new AppCompatImageView(getContext());
            }
            if (!m(this.f776g)) {
                b(this.f776g, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f776g;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f776g);
                this.G.remove(this.f776g);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f776g;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f776g == null) {
            this.f776g = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f776g;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        a0 a0Var = this.f775f;
        if (a0Var != null) {
            a0Var.setContentDescription(charSequence);
            com.bumptech.glide.c.T(this.f775f, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f775f)) {
                b(this.f775f, true);
            }
        } else {
            a0 a0Var = this.f775f;
            if (a0Var != null && m(a0Var)) {
                removeView(this.f775f);
                this.G.remove(this.f775f);
            }
        }
        a0 a0Var2 = this.f775f;
        if (a0Var2 != null) {
            a0Var2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f774d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f774d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f774d.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f784o;
                if (i10 != 0) {
                    this.f774d.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.f774d.setTextColor(colorStateList);
                }
            }
            if (!m(this.f774d)) {
                b(this.f774d, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f774d;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f774d);
                this.G.remove(this.f774d);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f774d;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.C = colorStateList;
        AppCompatTextView appCompatTextView = this.f774d;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f773c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f773c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f773c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f783n;
                if (i10 != 0) {
                    this.f773c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f773c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f773c)) {
                b(this.f773c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f773c;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f773c);
                this.G.remove(this.f773c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f773c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f794z = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.B = colorStateList;
        AppCompatTextView appCompatTextView = this.f773c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
