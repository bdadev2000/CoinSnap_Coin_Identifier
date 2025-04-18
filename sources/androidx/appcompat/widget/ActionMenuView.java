package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {

    /* renamed from: a, reason: collision with root package name */
    public MenuBuilder f894a;

    /* renamed from: b, reason: collision with root package name */
    public Context f895b;

    /* renamed from: c, reason: collision with root package name */
    public int f896c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public ActionMenuPresenter f897f;

    /* renamed from: g, reason: collision with root package name */
    public MenuPresenter.Callback f898g;

    /* renamed from: h, reason: collision with root package name */
    public MenuBuilder.Callback f899h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f900i;

    /* renamed from: j, reason: collision with root package name */
    public int f901j;

    /* renamed from: k, reason: collision with root package name */
    public final int f902k;

    /* renamed from: l, reason: collision with root package name */
    public final int f903l;

    /* renamed from: m, reason: collision with root package name */
    public OnMenuItemClickListener f904m;

    @RestrictTo
    /* loaded from: classes.dex */
    public interface ActionMenuChildView {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean a(MenuBuilder menuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f905a;

        /* renamed from: b, reason: collision with root package name */
        public int f906b;

        /* renamed from: c, reason: collision with root package name */
        public int f907c;
        public boolean d;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f908f;
    }

    /* loaded from: classes.dex */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.f904m;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.f899h;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f902k = (int) (56.0f * f2);
        this.f903l = (int) (f2 * 4.0f);
        this.f895b = context;
        this.f896c = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.ActionMenuView$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    public static LayoutParams d() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f905a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.widget.ActionMenuView$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    public static LayoutParams e(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return d();
        }
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams3 = (LayoutParams) layoutParams;
            ?? layoutParams4 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) layoutParams3);
            layoutParams4.f905a = layoutParams3.f905a;
            layoutParams2 = layoutParams4;
        } else {
            layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public final boolean b(MenuItemImpl menuItemImpl) {
        return this.f894a.performItemAction(menuItemImpl, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean f(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z2 = ((ActionMenuChildView) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z2 : z2 | ((ActionMenuChildView) childAt2).b();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Menu getMenu() {
        if (this.f894a == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.f894a = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f897f = actionMenuPresenter;
            actionMenuPresenter.f874n = true;
            actionMenuPresenter.f875o = true;
            MenuPresenter.Callback callback = this.f898g;
            MenuPresenter.Callback callback2 = callback;
            if (callback == null) {
                callback2 = new Object();
            }
            actionMenuPresenter.f678f = callback2;
            this.f894a.addMenuPresenter(actionMenuPresenter, this.f895b);
            ActionMenuPresenter actionMenuPresenter2 = this.f897f;
            actionMenuPresenter2.f681i = this;
            this.f894a = actionMenuPresenter2.f677c;
        }
        return this.f894a;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f897f;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.f871k;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (actionMenuPresenter.f873m) {
            return actionMenuPresenter.f872l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f896c;
    }

    @RestrictTo
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void initialize(MenuBuilder menuBuilder) {
        this.f894a = menuBuilder;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f897f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f897f.g()) {
                this.f897f.f();
                this.f897f.h();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f897f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f();
            ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = actionMenuPresenter.f882v;
            if (actionButtonSubmenu == null || !actionButtonSubmenu.b()) {
                return;
            }
            actionButtonSubmenu.f788j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.f900i) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = ViewUtils.f1295a;
        boolean z4 = getLayoutDirection() == 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f905a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    f(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f905a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f905a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r1;
        int i11;
        int i12;
        int i13;
        MenuBuilder menuBuilder;
        boolean z3 = this.f900i;
        boolean z4 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f900i = z4;
        if (z3 != z4) {
            this.f901j = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f900i && (menuBuilder = this.f894a) != null && size != this.f901j) {
            this.f901j = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f900i || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i14).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f902k;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z5 = false;
        int i23 = 0;
        int i24 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f903l;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i25 = size3;
            if (childAt.getVisibility() == 8) {
                i11 = i15;
                i12 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i26 = i20 + 1;
                if (z6) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f908f = false;
                layoutParams2.f907c = 0;
                layoutParams2.f906b = 0;
                layoutParams2.d = false;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.e = z6 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i27 = layoutParams2.f905a ? 1 : i17;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                i11 = i15;
                i12 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i27 <= 0 || (z7 && i27 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z7 && i13 < 2) {
                        i13 = 2;
                    }
                }
                layoutParams3.d = !layoutParams3.f905a && z7;
                layoutParams3.f906b = i13;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, Ints.MAX_POWER_OF_TWO), makeMeasureSpec);
                i21 = Math.max(i21, i13);
                if (layoutParams2.d) {
                    i23++;
                }
                if (layoutParams2.f905a) {
                    z5 = true;
                }
                i17 -= i13;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (i13 == 1) {
                    j2 |= 1 << i22;
                }
                i20 = i26;
            }
            i22++;
            size3 = i25;
            paddingBottom = i12;
            i15 = i11;
        }
        int i28 = i15;
        int i29 = size3;
        int i30 = i24;
        boolean z8 = z5 && i20 == 2;
        boolean z9 = false;
        while (i23 > 0 && i17 > 0) {
            int i31 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i32 = 0;
            int i33 = 0;
            long j3 = 0;
            while (i33 < childCount2) {
                int i34 = i30;
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i33).getLayoutParams();
                boolean z10 = z9;
                if (layoutParams4.d) {
                    int i35 = layoutParams4.f906b;
                    if (i35 < i31) {
                        j3 = 1 << i33;
                        i31 = i35;
                        i32 = 1;
                    } else if (i35 == i31) {
                        i32++;
                        j3 |= 1 << i33;
                    }
                }
                i33++;
                z9 = z10;
                i30 = i34;
            }
            i6 = i30;
            z2 = z9;
            j2 |= j3;
            if (i32 > i17) {
                i5 = mode;
                break;
            }
            int i36 = i31 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                int i38 = mode;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j4 = 1 << i37;
                if ((j3 & j4) != 0) {
                    if (z8 && layoutParams5.e) {
                        r1 = 1;
                        r1 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i4 + i19, 0, i4, 0);
                        }
                    } else {
                        r1 = 1;
                    }
                    layoutParams5.f906b += r1;
                    layoutParams5.f908f = r1;
                    i17--;
                } else if (layoutParams5.f906b == i36) {
                    j2 |= j4;
                }
                i37++;
                childMeasureSpec = i39;
                mode = i38;
                childCount2 = i40;
            }
            i30 = i6;
            z9 = true;
        }
        i5 = mode;
        i6 = i30;
        z2 = z9;
        int i41 = childMeasureSpec;
        int i42 = childCount2;
        boolean z11 = !z5 && i20 == 1;
        if (i17 <= 0 || j2 == 0 || (i17 >= i20 - 1 && !z11 && i21 <= 1)) {
            i7 = i42;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z11) {
                if ((j2 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i43 = i42 - 1;
                if ((j2 & (1 << i43)) != 0 && !((LayoutParams) getChildAt(i43).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i44 = bitCount > 0.0f ? (int) ((i17 * i19) / bitCount) : 0;
            i7 = i42;
            for (int i45 = 0; i45 < i7; i45++) {
                if ((j2 & (1 << i45)) != 0) {
                    View childAt3 = getChildAt(i45);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.f907c = i44;
                        layoutParams6.f908f = true;
                        if (i45 == 0 && !layoutParams6.e) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i44) / 2;
                        }
                        z2 = true;
                    } else if (layoutParams6.f905a) {
                        layoutParams6.f907c = i44;
                        layoutParams6.f908f = true;
                        ((LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i44) / 2;
                        z2 = true;
                    } else {
                        if (i45 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = i44 / 2;
                        }
                        if (i45 != i7 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams6).rightMargin = i44 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i46 = 0;
            while (i46 < i7) {
                View childAt4 = getChildAt(i46);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f908f) {
                    i10 = i41;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f906b * i19) + layoutParams7.f907c, Ints.MAX_POWER_OF_TWO), i10);
                } else {
                    i10 = i41;
                }
                i46++;
                i41 = i10;
            }
        }
        if (i5 != 1073741824) {
            i9 = i28;
            i8 = i6;
        } else {
            i8 = i29;
            i9 = i28;
        }
        setMeasuredDimension(i9, i8);
    }

    @RestrictTo
    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f897f.f879s = z2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f904m = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f897f;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.f871k;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f873m = true;
            actionMenuPresenter.f872l = drawable;
        }
    }

    @RestrictTo
    public void setOverflowReserved(boolean z2) {
        this.d = z2;
    }

    public void setPopupTheme(@StyleRes int i2) {
        if (this.f896c != i2) {
            this.f896c = i2;
            if (i2 == 0) {
                this.f895b = getContext();
            } else {
                this.f895b = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    @RestrictTo
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f897f = actionMenuPresenter;
        actionMenuPresenter.f681i = this;
        this.f894a = actionMenuPresenter.f677c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.LinearLayoutCompat$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
