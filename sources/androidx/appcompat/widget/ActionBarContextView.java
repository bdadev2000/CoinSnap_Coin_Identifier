package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.AbsActionBarView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.google.common.primitives.Ints;

@RestrictTo
/* loaded from: classes3.dex */
public class ActionBarContextView extends AbsActionBarView {

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f833j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f834k;

    /* renamed from: l, reason: collision with root package name */
    public View f835l;

    /* renamed from: m, reason: collision with root package name */
    public View f836m;

    /* renamed from: n, reason: collision with root package name */
    public View f837n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f838o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f839p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f840q;

    /* renamed from: r, reason: collision with root package name */
    public final int f841r;

    /* renamed from: s, reason: collision with root package name */
    public final int f842s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f843t;

    /* renamed from: u, reason: collision with root package name */
    public final int f844u;

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.d, com.cooldev.gba.emulator.gameboy.R.attr.actionModeStyle, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        setBackground(tintTypedArray.b(0));
        this.f841r = obtainStyledAttributes.getResourceId(5, 0);
        this.f842s = obtainStyledAttributes.getResourceId(4, 0);
        this.f816f = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f844u = obtainStyledAttributes.getResourceId(2, com.cooldev.gba.emulator.gameboy.R.layout.abc_action_mode_close_item_material);
        tintTypedArray.f();
    }

    public final void e(final ActionMode actionMode) {
        View view = this.f835l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f844u, (ViewGroup) this, false);
            this.f835l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f835l);
        }
        View findViewById = this.f835l.findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_mode_close_button);
        this.f836m = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ActionMode.this.a();
            }
        });
        MenuBuilder c2 = actionMode.c();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f();
            ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = actionMenuPresenter.f882v;
            if (actionButtonSubmenu != null && actionButtonSubmenu.b()) {
                actionButtonSubmenu.f788j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.d = actionMenuPresenter2;
        actionMenuPresenter2.f874n = true;
        actionMenuPresenter2.f875o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.addMenuPresenter(this.d, this.f814b);
        ActionMenuPresenter actionMenuPresenter3 = this.d;
        MenuView menuView = actionMenuPresenter3.f681i;
        if (menuView == null) {
            MenuView menuView2 = (MenuView) actionMenuPresenter3.d.inflate(actionMenuPresenter3.f679g, (ViewGroup) this, false);
            actionMenuPresenter3.f681i = menuView2;
            menuView2.initialize(actionMenuPresenter3.f677c);
            actionMenuPresenter3.updateMenuView(true);
        }
        MenuView menuView3 = actionMenuPresenter3.f681i;
        if (menuView != menuView3) {
            ((ActionMenuView) menuView3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) menuView3;
        this.f815c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f815c, layoutParams);
    }

    public final void f() {
        if (this.f838o == null) {
            LayoutInflater.from(getContext()).inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f838o = linearLayout;
            this.f839p = (TextView) linearLayout.findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_bar_title);
            this.f840q = (TextView) this.f838o.findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_bar_subtitle);
            int i2 = this.f841r;
            if (i2 != 0) {
                this.f839p.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f842s;
            if (i3 != 0) {
                this.f840q.setTextAppearance(getContext(), i3);
            }
        }
        this.f839p.setText(this.f833j);
        this.f840q.setText(this.f834k);
        boolean z2 = !TextUtils.isEmpty(this.f833j);
        boolean z3 = !TextUtils.isEmpty(this.f834k);
        this.f840q.setVisibility(z3 ? 0 : 8);
        this.f838o.setVisibility((z2 || z3) ? 0 : 8);
        if (this.f838o.getParent() == null) {
            addView(this.f838o);
        }
    }

    public final void g() {
        removeAllViews();
        this.f837n = null;
        this.f815c = null;
        this.d = null;
        View view = this.f836m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f817g != null ? this.f813a.f821b : getVisibility();
    }

    public int getContentHeight() {
        return this.f816f;
    }

    public CharSequence getSubtitle() {
        return this.f834k;
    }

    public CharSequence getTitle() {
        return this.f833j;
    }

    public final ViewPropertyAnimatorCompat h(int i2, long j2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f817g;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.b();
        }
        AbsActionBarView.VisibilityAnimListener visibilityAnimListener = this.f813a;
        if (i2 != 0) {
            ViewPropertyAnimatorCompat a2 = ViewCompat.a(this);
            a2.a(0.0f);
            a2.c(j2);
            AbsActionBarView.this.f817g = a2;
            visibilityAnimListener.f821b = i2;
            a2.d(visibilityAnimListener);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat a3 = ViewCompat.a(this);
        a3.a(1.0f);
        a3.c(j2);
        AbsActionBarView.this.f817g = a3;
        visibilityAnimListener.f821b = i2;
        a3.d(visibilityAnimListener);
        return a3;
    }

    public final boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.h();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f();
            ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = this.d.f882v;
            if (actionButtonSubmenu == null || !actionButtonSubmenu.b()) {
                return;
            }
            actionButtonSubmenu.f788j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3 = ViewUtils.f1295a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f835l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f835l.getLayoutParams();
            int i6 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z4 ? paddingRight - i6 : paddingRight + i6;
            int d = i8 + AbsActionBarView.d(i8, paddingTop, paddingTop2, this.f835l, z4);
            paddingRight = z4 ? d - i7 : d + i7;
        }
        LinearLayout linearLayout = this.f838o;
        if (linearLayout != null && this.f837n == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbsActionBarView.d(paddingRight, paddingTop, paddingTop2, this.f838o, z4);
        }
        View view2 = this.f837n;
        if (view2 != null) {
            AbsActionBarView.d(paddingRight, paddingTop, paddingTop2, view2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f815c;
        if (actionMenuView != null) {
            AbsActionBarView.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int i4 = Ints.MAX_POWER_OF_TWO;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int i5 = this.f816f;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        View view = this.f835l;
        if (view != null) {
            int c2 = AbsActionBarView.c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f835l.getLayoutParams();
            paddingLeft = c2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f815c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbsActionBarView.c(this.f815c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f838o;
        if (linearLayout != null && this.f837n == null) {
            if (this.f843t) {
                this.f838o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f838o.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f838o.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = AbsActionBarView.c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f837n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            if (i9 == -2) {
                i4 = Integer.MIN_VALUE;
            }
            if (i9 >= 0) {
                i6 = Math.min(i9, i6);
            }
            this.f837n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
        }
        if (this.f816f > 0) {
            setMeasuredDimension(size, i5);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i2) {
        this.f816f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f837n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f837n = view;
        if (view != null && (linearLayout = this.f838o) != null) {
            removeView(linearLayout);
            this.f838o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f834k = charSequence;
        f();
    }

    public void setTitle(CharSequence charSequence) {
        this.f833j = charSequence;
        f();
        ViewCompat.C(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f843t) {
            requestLayout();
        }
        this.f843t = z2;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
