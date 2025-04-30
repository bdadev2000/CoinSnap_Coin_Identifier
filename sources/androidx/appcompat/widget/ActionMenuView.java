package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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
import com.bumptech.glide.f;
import p.C2535n;
import p.InterfaceC2531j;
import p.InterfaceC2532k;
import p.MenuC2533l;
import p.w;
import p.z;
import q.C2597f;
import q.C2603i;
import q.C2605j;
import q.C2611m;
import q.C2629v0;
import q.InterfaceC2607k;
import q.InterfaceC2613n;
import q.g1;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC2532k, z {

    /* renamed from: A, reason: collision with root package name */
    public final int f4195A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4196B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC2613n f4197C;

    /* renamed from: r, reason: collision with root package name */
    public MenuC2533l f4198r;

    /* renamed from: s, reason: collision with root package name */
    public Context f4199s;

    /* renamed from: t, reason: collision with root package name */
    public int f4200t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4201u;

    /* renamed from: v, reason: collision with root package name */
    public C2605j f4202v;

    /* renamed from: w, reason: collision with root package name */
    public w f4203w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC2531j f4204x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4205y;

    /* renamed from: z, reason: collision with root package name */
    public int f4206z;

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f4195A = (int) (56.0f * f9);
        this.f4196B = (int) (f9 * 4.0f);
        this.f4199s = context;
        this.f4200t = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.m, android.widget.LinearLayout$LayoutParams] */
    public static C2611m j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f22687a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [q.m, android.widget.LinearLayout$LayoutParams] */
    public static C2611m k(ViewGroup.LayoutParams layoutParams) {
        C2611m c2611m;
        if (layoutParams != null) {
            if (layoutParams instanceof C2611m) {
                C2611m c2611m2 = (C2611m) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c2611m2);
                layoutParams2.f22687a = c2611m2.f22687a;
                c2611m = layoutParams2;
            } else {
                c2611m = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c2611m).gravity <= 0) {
                ((LinearLayout.LayoutParams) c2611m).gravity = 16;
            }
            return c2611m;
        }
        return j();
    }

    @Override // p.InterfaceC2532k
    public final boolean a(C2535n c2535n) {
        return this.f4198r.q(c2535n, null, 0);
    }

    @Override // p.z
    public final void c(MenuC2533l menuC2533l) {
        this.f4198r = menuC2533l;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2611m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2629v0 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.v0, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final C2629v0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Menu getMenu() {
        if (this.f4198r == null) {
            Context context = getContext();
            MenuC2533l menuC2533l = new MenuC2533l(context);
            this.f4198r = menuC2533l;
            menuC2533l.f22105g = new f(this, 13);
            C2605j c2605j = new C2605j(context);
            this.f4202v = c2605j;
            c2605j.f22668n = true;
            c2605j.f22669o = true;
            w wVar = this.f4203w;
            w wVar2 = wVar;
            if (wVar == null) {
                wVar2 = new Object();
            }
            c2605j.f22663g = wVar2;
            this.f4198r.b(c2605j, this.f4199s);
            C2605j c2605j2 = this.f4202v;
            c2605j2.f22666j = this;
            this.f4198r = c2605j2.f22661d;
        }
        return this.f4198r;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        C2605j c2605j = this.f4202v;
        C2603i c2603i = c2605j.f22667k;
        if (c2603i != null) {
            return c2603i.getDrawable();
        }
        if (c2605j.m) {
            return c2605j.l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4200t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2629v0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i9) {
        boolean z8 = false;
        if (i9 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i9 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i9);
        if (i9 < getChildCount() && (childAt instanceof InterfaceC2607k)) {
            z8 = ((InterfaceC2607k) childAt).a();
        }
        if (i9 > 0 && (childAt2 instanceof InterfaceC2607k)) {
            return z8 | ((InterfaceC2607k) childAt2).c();
        }
        return z8;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2605j c2605j = this.f4202v;
        if (c2605j != null) {
            c2605j.f();
            if (this.f4202v.k()) {
                this.f4202v.g();
                this.f4202v.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2605j c2605j = this.f4202v;
        if (c2605j != null) {
            c2605j.g();
            C2597f c2597f = c2605j.f22676v;
            if (c2597f != null && c2597f.b()) {
                c2597f.f22166j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        boolean z9;
        int i13;
        int width;
        int i14;
        if (!this.f4205y) {
            super.onLayout(z8, i9, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i11 - i9;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = g1.f22657a;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                C2611m c2611m = (C2611m) childAt.getLayoutParams();
                if (c2611m.f22687a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z9) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) c2611m).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2611m).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2611m).leftMargin) + ((LinearLayout.LayoutParams) c2611m).rightMargin;
                    l(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        if (i23 > 0) {
            i13 = paddingRight / i23;
        } else {
            i13 = 0;
        }
        int max = Math.max(0, i13);
        if (z9) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                C2611m c2611m2 = (C2611m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2611m2.f22687a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) c2611m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2611m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            C2611m c2611m3 = (C2611m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2611m3.f22687a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) c2611m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c2611m3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z8;
        int i11;
        boolean z9;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ?? r12;
        boolean z12;
        int i19;
        int i20;
        int i21;
        ActionMenuItemView actionMenuItemView;
        boolean z13;
        int i22;
        boolean z14;
        MenuC2533l menuC2533l;
        boolean z15 = this.f4205y;
        if (View.MeasureSpec.getMode(i9) == 1073741824) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f4205y = z8;
        if (z15 != z8) {
            this.f4206z = 0;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (this.f4205y && (menuC2533l = this.f4198r) != null && size != this.f4206z) {
            this.f4206z = size;
            menuC2533l.p(true);
        }
        int childCount = getChildCount();
        if (this.f4205y && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i9);
            int size3 = View.MeasureSpec.getSize(i10);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
            int i23 = size2 - paddingRight;
            int i24 = this.f4195A;
            int i25 = i23 / i24;
            int i26 = i23 % i24;
            if (i25 == 0) {
                setMeasuredDimension(i23, 0);
                return;
            }
            int i27 = (i26 / i25) + i24;
            int childCount2 = getChildCount();
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            boolean z16 = false;
            int i31 = 0;
            int i32 = 0;
            long j7 = 0;
            while (true) {
                i11 = this.f4196B;
                if (i30 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i30);
                int i33 = size3;
                if (childAt.getVisibility() == 8) {
                    i20 = i23;
                    i21 = paddingBottom;
                } else {
                    boolean z17 = childAt instanceof ActionMenuItemView;
                    int i34 = i28 + 1;
                    if (z17) {
                        childAt.setPadding(i11, 0, i11, 0);
                    }
                    C2611m c2611m = (C2611m) childAt.getLayoutParams();
                    c2611m.f22691f = false;
                    c2611m.f22688c = 0;
                    c2611m.b = 0;
                    c2611m.f22689d = false;
                    ((LinearLayout.LayoutParams) c2611m).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c2611m).rightMargin = 0;
                    if (z17 && (!TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c2611m.f22690e = z12;
                    if (c2611m.f22687a) {
                        i19 = 1;
                    } else {
                        i19 = i25;
                    }
                    C2611m c2611m2 = (C2611m) childAt.getLayoutParams();
                    i20 = i23;
                    i21 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z17) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && (!TextUtils.isEmpty(actionMenuItemView.getText()))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i19 > 0 && (!z13 || i19 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i27, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i22 = measuredWidth / i27;
                        if (measuredWidth % i27 != 0) {
                            i22++;
                        }
                        if (z13 && i22 < 2) {
                            i22 = 2;
                        }
                    } else {
                        i22 = 0;
                    }
                    if (!c2611m2.f22687a && z13) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c2611m2.f22689d = z14;
                    c2611m2.b = i22;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i27, 1073741824), makeMeasureSpec);
                    i29 = Math.max(i29, i22);
                    if (c2611m.f22689d) {
                        i31++;
                    }
                    if (c2611m.f22687a) {
                        z16 = true;
                    }
                    i25 -= i22;
                    i32 = Math.max(i32, childAt.getMeasuredHeight());
                    if (i22 == 1) {
                        j7 |= 1 << i30;
                    }
                    i28 = i34;
                }
                i30++;
                size3 = i33;
                paddingBottom = i21;
                i23 = i20;
            }
            int i35 = i23;
            int i36 = size3;
            int i37 = i32;
            if (z16 && i28 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z18 = false;
            while (i31 > 0 && i25 > 0) {
                int i38 = Integer.MAX_VALUE;
                int i39 = 0;
                int i40 = 0;
                long j9 = 0;
                while (i40 < childCount2) {
                    int i41 = i37;
                    C2611m c2611m3 = (C2611m) getChildAt(i40).getLayoutParams();
                    boolean z19 = z18;
                    if (c2611m3.f22689d) {
                        int i42 = c2611m3.b;
                        if (i42 < i38) {
                            j9 = 1 << i40;
                            i38 = i42;
                            i39 = 1;
                        } else if (i42 == i38) {
                            i39++;
                            j9 |= 1 << i40;
                        }
                    }
                    i40++;
                    z18 = z19;
                    i37 = i41;
                }
                i13 = i37;
                z10 = z18;
                j7 |= j9;
                if (i39 > i25) {
                    i12 = mode;
                    break;
                }
                int i43 = i38 + 1;
                int i44 = 0;
                while (i44 < childCount2) {
                    View childAt2 = getChildAt(i44);
                    C2611m c2611m4 = (C2611m) childAt2.getLayoutParams();
                    int i45 = mode;
                    int i46 = childMeasureSpec;
                    int i47 = childCount2;
                    long j10 = 1 << i44;
                    if ((j9 & j10) == 0) {
                        if (c2611m4.b == i43) {
                            j7 |= j10;
                        }
                    } else {
                        if (z9 && c2611m4.f22690e) {
                            r12 = 1;
                            r12 = 1;
                            if (i25 == 1) {
                                childAt2.setPadding(i11 + i27, 0, i11, 0);
                            }
                        } else {
                            r12 = 1;
                        }
                        c2611m4.b += r12;
                        c2611m4.f22691f = r12;
                        i25--;
                    }
                    i44++;
                    childMeasureSpec = i46;
                    mode = i45;
                    childCount2 = i47;
                }
                i37 = i13;
                z18 = true;
            }
            i12 = mode;
            i13 = i37;
            z10 = z18;
            int i48 = childMeasureSpec;
            int i49 = childCount2;
            if (!z16 && i28 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i25 <= 0 || j7 == 0 || (i25 >= i28 - 1 && !z11 && i29 <= 1)) {
                i14 = i49;
            } else {
                float bitCount = Long.bitCount(j7);
                if (!z11) {
                    if ((j7 & 1) != 0 && !((C2611m) getChildAt(0).getLayoutParams()).f22690e) {
                        bitCount -= 0.5f;
                    }
                    int i50 = i49 - 1;
                    if ((j7 & (1 << i50)) != 0 && !((C2611m) getChildAt(i50).getLayoutParams()).f22690e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i18 = (int) ((i25 * i27) / bitCount);
                } else {
                    i18 = 0;
                }
                i14 = i49;
                for (int i51 = 0; i51 < i14; i51++) {
                    if ((j7 & (1 << i51)) != 0) {
                        View childAt3 = getChildAt(i51);
                        C2611m c2611m5 = (C2611m) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c2611m5.f22688c = i18;
                            c2611m5.f22691f = true;
                            if (i51 == 0 && !c2611m5.f22690e) {
                                ((LinearLayout.LayoutParams) c2611m5).leftMargin = (-i18) / 2;
                            }
                            z10 = true;
                        } else if (c2611m5.f22687a) {
                            c2611m5.f22688c = i18;
                            c2611m5.f22691f = true;
                            ((LinearLayout.LayoutParams) c2611m5).rightMargin = (-i18) / 2;
                            z10 = true;
                        } else {
                            if (i51 != 0) {
                                ((LinearLayout.LayoutParams) c2611m5).leftMargin = i18 / 2;
                            }
                            if (i51 != i14 - 1) {
                                ((LinearLayout.LayoutParams) c2611m5).rightMargin = i18 / 2;
                            }
                        }
                    }
                }
            }
            if (z10) {
                int i52 = 0;
                while (i52 < i14) {
                    View childAt4 = getChildAt(i52);
                    C2611m c2611m6 = (C2611m) childAt4.getLayoutParams();
                    if (!c2611m6.f22691f) {
                        i17 = i48;
                    } else {
                        i17 = i48;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2611m6.b * i27) + c2611m6.f22688c, 1073741824), i17);
                    }
                    i52++;
                    i48 = i17;
                }
            }
            if (i12 != 1073741824) {
                i16 = i35;
                i15 = i13;
            } else {
                i15 = i36;
                i16 = i35;
            }
            setMeasuredDimension(i16, i15);
            return;
        }
        for (int i53 = 0; i53 < childCount; i53++) {
            C2611m c2611m7 = (C2611m) getChildAt(i53).getLayoutParams();
            ((LinearLayout.LayoutParams) c2611m7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c2611m7).leftMargin = 0;
        }
        super.onMeasure(i9, i10);
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f4202v.f22673s = z8;
    }

    public void setOnMenuItemClickListener(InterfaceC2613n interfaceC2613n) {
        this.f4197C = interfaceC2613n;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        C2605j c2605j = this.f4202v;
        C2603i c2603i = c2605j.f22667k;
        if (c2603i != null) {
            c2603i.setImageDrawable(drawable);
        } else {
            c2605j.m = true;
            c2605j.l = drawable;
        }
    }

    public void setOverflowReserved(boolean z8) {
        this.f4201u = z8;
    }

    public void setPopupTheme(int i9) {
        if (this.f4200t != i9) {
            this.f4200t = i9;
            if (i9 == 0) {
                this.f4199s = getContext();
            } else {
                this.f4199s = new ContextThemeWrapper(getContext(), i9);
            }
        }
    }

    public void setPresenter(C2605j c2605j) {
        this.f4202v = c2605j;
        c2605j.f22666j = this;
        this.f4198r = c2605j.f22661d;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
