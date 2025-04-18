package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements k.n, k.e0 {
    public final int A;
    public final int B;
    public p C;

    /* renamed from: r, reason: collision with root package name */
    public k.o f714r;

    /* renamed from: s, reason: collision with root package name */
    public Context f715s;

    /* renamed from: t, reason: collision with root package name */
    public int f716t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public m f717v;

    /* renamed from: w, reason: collision with root package name */
    public k.b0 f718w;

    /* renamed from: x, reason: collision with root package name */
    public k.m f719x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f720y;

    /* renamed from: z, reason: collision with root package name */
    public int f721z;

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A = (int) (56.0f * f10);
        this.B = (int) (f10 * 4.0f);
        this.f715s = context;
        this.f716t = 0;
    }

    public static o l(ViewGroup.LayoutParams layoutParams) {
        o oVar;
        if (layoutParams != null) {
            if (layoutParams instanceof o) {
                oVar = new o((o) layoutParams);
            } else {
                oVar = new o(layoutParams);
            }
            if (((LinearLayout.LayoutParams) oVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) oVar).gravity = 16;
            }
            return oVar;
        }
        o oVar2 = new o();
        ((LinearLayout.LayoutParams) oVar2).gravity = 16;
        return oVar2;
    }

    @Override // k.n
    public final boolean a(k.q qVar) {
        return this.f714r.q(qVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o;
    }

    @Override // k.e0
    public final void d(k.o oVar) {
        this.f714r = oVar;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = new o();
        ((LinearLayout.LayoutParams) oVar).gravity = 16;
        return oVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public Menu getMenu() {
        if (this.f714r == null) {
            Context context = getContext();
            k.o oVar = new k.o(context);
            this.f714r = oVar;
            oVar.f20128e = new f.a(this, 2);
            m mVar = new m(context);
            this.f717v = mVar;
            mVar.f927n = true;
            mVar.f928o = true;
            k.b0 b0Var = this.f718w;
            if (b0Var == null) {
                b0Var = new ka.e();
            }
            mVar.f920g = b0Var;
            this.f714r.b(mVar, this.f715s);
            m mVar2 = this.f717v;
            mVar2.f923j = this;
            this.f714r = mVar2.f918d;
        }
        return this.f714r;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        m mVar = this.f717v;
        l lVar = mVar.f924k;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (mVar.f926m) {
            return mVar.f925l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f716t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final c2 generateDefaultLayoutParams() {
        o oVar = new o();
        ((LinearLayout.LayoutParams) oVar).gravity = 16;
        return oVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: i */
    public final c2 generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ c2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public final boolean m(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof n)) {
            z10 = false | ((n) childAt).a();
        }
        if (i10 > 0 && (childAt2 instanceof n)) {
            return z10 | ((n) childAt2).b();
        }
        return z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m mVar = this.f717v;
        if (mVar != null) {
            mVar.d();
            if (this.f717v.k()) {
                this.f717v.j();
                this.f717v.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f717v;
        if (mVar != null) {
            mVar.j();
            h hVar = mVar.f934v;
            if (hVar != null && hVar.b()) {
                hVar.f20050j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        if (!this.f720y) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean a = f4.a(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                o oVar = (o) childAt.getLayoutParams();
                if (oVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) oVar).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) oVar).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) oVar).leftMargin) + ((LinearLayout.LayoutParams) oVar).rightMargin;
                    m(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        if (i24 > 0) {
            i14 = paddingRight / i24;
        } else {
            i14 = 0;
        }
        int i25 = 0;
        int max = Math.max(0, i14);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            while (i25 < childCount) {
                View childAt3 = getChildAt(i25);
                o oVar2 = (o) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !oVar2.a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) oVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) oVar2).leftMargin) + max);
                }
                i25++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i25 < childCount) {
            View childAt4 = getChildAt(i25);
            o oVar3 = (o) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !oVar3.a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) oVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = a4.j.a(measuredWidth4, ((LinearLayout.LayoutParams) oVar3).rightMargin, max, i28);
            }
            i25++;
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        ?? r42;
        boolean z15;
        int i18;
        int i19;
        int i20;
        ActionMenuItemView actionMenuItemView;
        boolean z16;
        int i21;
        boolean z17;
        k.o oVar;
        boolean z18 = this.f720y;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f720y = z10;
        if (z18 != z10) {
            this.f721z = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f720y && (oVar = this.f714r) != null && size != this.f721z) {
            this.f721z = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f720y && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int i22 = size2 - paddingRight;
            int i23 = this.A;
            int i24 = i22 / i23;
            int i25 = i22 % i23;
            if (i24 == 0) {
                setMeasuredDimension(i22, 0);
                return;
            }
            int i26 = (i25 / i24) + i23;
            int childCount2 = getChildCount();
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            boolean z19 = false;
            int i31 = 0;
            long j3 = 0;
            while (true) {
                i12 = this.B;
                if (i30 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i30);
                int i32 = size3;
                int i33 = i22;
                if (childAt.getVisibility() == 8) {
                    i19 = mode;
                    i20 = paddingBottom;
                } else {
                    boolean z20 = childAt instanceof ActionMenuItemView;
                    int i34 = i28 + 1;
                    if (z20) {
                        childAt.setPadding(i12, 0, i12, 0);
                    }
                    o oVar2 = (o) childAt.getLayoutParams();
                    oVar2.f967f = false;
                    oVar2.f964c = 0;
                    oVar2.f963b = 0;
                    oVar2.f965d = false;
                    ((LinearLayout.LayoutParams) oVar2).leftMargin = 0;
                    ((LinearLayout.LayoutParams) oVar2).rightMargin = 0;
                    if (z20 && ((ActionMenuItemView) childAt).d()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    oVar2.f966e = z15;
                    if (oVar2.a) {
                        i18 = 1;
                    } else {
                        i18 = i24;
                    }
                    o oVar3 = (o) childAt.getLayoutParams();
                    i19 = mode;
                    i20 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z20) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.d()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i18 > 0 && (!z16 || i18 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i21 = measuredWidth / i26;
                        if (measuredWidth % i26 != 0) {
                            i21++;
                        }
                        if (z16 && i21 < 2) {
                            i21 = 2;
                        }
                    } else {
                        i21 = 0;
                    }
                    if (!oVar3.a && z16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    oVar3.f965d = z17;
                    oVar3.f963b = i21;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i21, 1073741824), makeMeasureSpec);
                    i29 = Math.max(i29, i21);
                    if (oVar2.f965d) {
                        i31++;
                    }
                    if (oVar2.a) {
                        z19 = true;
                    }
                    i24 -= i21;
                    i27 = Math.max(i27, childAt.getMeasuredHeight());
                    if (i21 == 1) {
                        j3 |= 1 << i30;
                    }
                    i28 = i34;
                }
                i30++;
                size3 = i32;
                i22 = i33;
                paddingBottom = i20;
                mode = i19;
            }
            int i35 = mode;
            int i36 = i22;
            int i37 = size3;
            if (z19 && i28 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z21 = false;
            while (i31 > 0 && i24 > 0) {
                int i38 = Integer.MAX_VALUE;
                int i39 = 0;
                int i40 = 0;
                long j10 = 0;
                while (i40 < childCount2) {
                    o oVar4 = (o) getChildAt(i40).getLayoutParams();
                    boolean z22 = z21;
                    if (oVar4.f965d) {
                        int i41 = oVar4.f963b;
                        if (i41 < i38) {
                            j10 = 1 << i40;
                            i38 = i41;
                            i39 = 1;
                        } else if (i41 == i38) {
                            j10 |= 1 << i40;
                            i39++;
                        }
                    }
                    i40++;
                    z21 = z22;
                }
                z12 = z21;
                j3 |= j10;
                if (i39 > i24) {
                    break;
                }
                int i42 = i38 + 1;
                int i43 = 0;
                while (i43 < childCount2) {
                    View childAt2 = getChildAt(i43);
                    o oVar5 = (o) childAt2.getLayoutParams();
                    int i44 = i27;
                    int i45 = childMeasureSpec;
                    int i46 = childCount2;
                    long j11 = 1 << i43;
                    if ((j10 & j11) == 0) {
                        if (oVar5.f963b == i42) {
                            j3 |= j11;
                        }
                    } else {
                        if (z11 && oVar5.f966e) {
                            r42 = 1;
                            r42 = 1;
                            if (i24 == 1) {
                                childAt2.setPadding(i12 + i26, 0, i12, 0);
                            }
                        } else {
                            r42 = 1;
                        }
                        oVar5.f963b += r42;
                        oVar5.f967f = r42;
                        i24--;
                    }
                    i43++;
                    childMeasureSpec = i45;
                    i27 = i44;
                    childCount2 = i46;
                }
                z21 = true;
            }
            z12 = z21;
            int i47 = i27;
            int i48 = childMeasureSpec;
            int i49 = childCount2;
            if (!z19 && i28 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i24 > 0 && j3 != 0 && (i24 < i28 - 1 || z13 || i29 > 1)) {
                float bitCount = Long.bitCount(j3);
                if (!z13) {
                    if ((j3 & 1) != 0 && !((o) getChildAt(0).getLayoutParams()).f966e) {
                        bitCount -= 0.5f;
                    }
                    int i50 = i49 - 1;
                    if ((j3 & (1 << i50)) != 0 && !((o) getChildAt(i50).getLayoutParams()).f966e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i17 = (int) ((i24 * i26) / bitCount);
                } else {
                    i17 = 0;
                }
                boolean z23 = z12;
                i13 = i49;
                for (int i51 = 0; i51 < i13; i51++) {
                    if ((j3 & (1 << i51)) != 0) {
                        View childAt3 = getChildAt(i51);
                        o oVar6 = (o) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            oVar6.f964c = i17;
                            oVar6.f967f = true;
                            if (i51 == 0 && !oVar6.f966e) {
                                ((LinearLayout.LayoutParams) oVar6).leftMargin = (-i17) / 2;
                            }
                            z23 = true;
                        } else {
                            if (oVar6.a) {
                                oVar6.f964c = i17;
                                oVar6.f967f = true;
                                ((LinearLayout.LayoutParams) oVar6).rightMargin = (-i17) / 2;
                                z23 = true;
                            } else {
                                if (i51 != 0) {
                                    ((LinearLayout.LayoutParams) oVar6).leftMargin = i17 / 2;
                                }
                                if (i51 != i13 - 1) {
                                    ((LinearLayout.LayoutParams) oVar6).rightMargin = i17 / 2;
                                }
                            }
                        }
                    }
                }
                z14 = z23;
            } else {
                i13 = i49;
                z14 = z12;
            }
            if (z14) {
                int i52 = 0;
                while (i52 < i13) {
                    View childAt4 = getChildAt(i52);
                    o oVar7 = (o) childAt4.getLayoutParams();
                    if (!oVar7.f967f) {
                        i16 = i48;
                    } else {
                        i16 = i48;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((oVar7.f963b * i26) + oVar7.f964c, 1073741824), i16);
                    }
                    i52++;
                    i48 = i16;
                }
            }
            if (i35 != 1073741824) {
                i15 = i36;
                i14 = i47;
            } else {
                i14 = i37;
                i15 = i36;
            }
            setMeasuredDimension(i15, i14);
            return;
        }
        for (int i53 = 0; i53 < childCount; i53++) {
            o oVar8 = (o) getChildAt(i53).getLayoutParams();
            ((LinearLayout.LayoutParams) oVar8).rightMargin = 0;
            ((LinearLayout.LayoutParams) oVar8).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f717v.f932s = z10;
    }

    public void setOnMenuItemClickListener(p pVar) {
        this.C = pVar;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        m mVar = this.f717v;
        l lVar = mVar.f924k;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
        } else {
            mVar.f926m = true;
            mVar.f925l = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.u = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f716t != i10) {
            this.f716t = i10;
            if (i10 == 0) {
                this.f715s = getContext();
            } else {
                this.f715s = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(m mVar) {
        this.f717v = mVar;
        mVar.f923j = this;
        this.f714r = mVar.f918d;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }
}
