package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final a f672b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f673c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f674d;

    /* renamed from: f, reason: collision with root package name */
    public m f675f;

    /* renamed from: g, reason: collision with root package name */
    public int f676g;

    /* renamed from: h, reason: collision with root package name */
    public n0.r1 f677h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f678i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f679j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f680k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f681l;

    /* renamed from: m, reason: collision with root package name */
    public View f682m;

    /* renamed from: n, reason: collision with root package name */
    public View f683n;

    /* renamed from: o, reason: collision with root package name */
    public View f684o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f685p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f686q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f687r;

    /* renamed from: s, reason: collision with root package name */
    public final int f688s;

    /* renamed from: t, reason: collision with root package name */
    public final int f689t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public final int f690v;

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f672b = new a(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f673c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f673c = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f17881d, R.attr.actionModeStyle, 0);
        i3 i3Var = new i3(context, obtainStyledAttributes);
        ViewCompat.setBackground(this, i3Var.e(0));
        this.f688s = i3Var.i(5, 0);
        this.f689t = i3Var.i(4, 0);
        this.f676g = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f690v = i3Var.i(2, R.layout.abc_action_mode_close_item_material);
        i3Var.o();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int j(View view, boolean z10, int i10, int i11, int i12) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(j.c cVar) {
        View view = this.f682m;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f690v, (ViewGroup) this, false);
            this.f682m = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f682m);
        }
        View findViewById = this.f682m.findViewById(R.id.action_mode_close_button);
        this.f683n = findViewById;
        findViewById.setOnClickListener(new c(this, cVar));
        k.o c10 = cVar.c();
        m mVar = this.f675f;
        if (mVar != null) {
            mVar.j();
            h hVar = mVar.f934v;
            if (hVar != null && hVar.b()) {
                hVar.f20050j.dismiss();
            }
        }
        m mVar2 = new m(getContext());
        this.f675f = mVar2;
        mVar2.f927n = true;
        mVar2.f928o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c10.b(this.f675f, this.f673c);
        m mVar3 = this.f675f;
        k.e0 e0Var = mVar3.f923j;
        if (e0Var == null) {
            k.e0 e0Var2 = (k.e0) mVar3.f919f.inflate(mVar3.f921h, (ViewGroup) this, false);
            mVar3.f923j = e0Var2;
            e0Var2.d(mVar3.f918d);
            mVar3.d();
        }
        k.e0 e0Var3 = mVar3.f923j;
        if (e0Var != e0Var3) {
            ((ActionMenuView) e0Var3).setPresenter(mVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) e0Var3;
        this.f674d = actionMenuView;
        ViewCompat.setBackground(actionMenuView, null);
        addView(this.f674d, layoutParams);
    }

    public final void d() {
        int i10;
        if (this.f685p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f685p = linearLayout;
            this.f686q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f687r = (TextView) this.f685p.findViewById(R.id.action_bar_subtitle);
            int i11 = this.f688s;
            if (i11 != 0) {
                this.f686q.setTextAppearance(getContext(), i11);
            }
            int i12 = this.f689t;
            if (i12 != 0) {
                this.f687r.setTextAppearance(getContext(), i12);
            }
        }
        this.f686q.setText(this.f680k);
        this.f687r.setText(this.f681l);
        boolean z10 = !TextUtils.isEmpty(this.f680k);
        boolean z11 = !TextUtils.isEmpty(this.f681l);
        TextView textView = this.f687r;
        int i13 = 0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.f685p;
        if (!z10 && !z11) {
            i13 = 8;
        }
        linearLayout2.setVisibility(i13);
        if (this.f685p.getParent() == null) {
            addView(this.f685p);
        }
    }

    public final void e() {
        removeAllViews();
        this.f684o = null;
        this.f674d = null;
        this.f675f = null;
        View view = this.f683n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, g.a.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        m mVar = this.f675f;
        if (mVar != null) {
            mVar.f931r = new j.a(mVar.f917c).a();
            k.o oVar = mVar.f918d;
            if (oVar != null) {
                oVar.p(true);
            }
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
        if (this.f677h != null) {
            return this.f672b.f799b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f676g;
    }

    public CharSequence getSubtitle() {
        return this.f681l;
    }

    public CharSequence getTitle() {
        return this.f680k;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f679j = false;
        }
        if (!this.f679j) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f679j = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f679j = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f678i = false;
        }
        if (!this.f678i) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f678i = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f678i = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            n0.r1 r1Var = this.f677h;
            if (r1Var != null) {
                r1Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final n0.r1 l(int i10, long j3) {
        n0.r1 r1Var = this.f677h;
        if (r1Var != null) {
            r1Var.b();
        }
        a aVar = this.f672b;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            n0.r1 animate = ViewCompat.animate(this);
            animate.a(1.0f);
            animate.c(j3);
            ((ActionBarContextView) aVar.f800c).f677h = animate;
            aVar.f799b = i10;
            animate.d(aVar);
            return animate;
        }
        n0.r1 animate2 = ViewCompat.animate(this);
        animate2.a(0.0f);
        animate2.c(j3);
        ((ActionBarContextView) aVar.f800c).f677h = animate2;
        aVar.f799b = i10;
        animate2.d(aVar);
        return animate2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f675f;
        if (mVar != null) {
            mVar.j();
            h hVar = this.f675f.f934v;
            if (hVar != null && hVar.b()) {
                hVar.f20050j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean a = f4.a(this);
        if (a) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f682m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f682m.getLayoutParams();
            if (a) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (a) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            if (a) {
                i16 = paddingLeft - i14;
            } else {
                i16 = paddingLeft + i14;
            }
            int j3 = j(this.f682m, a, i16, paddingTop, paddingTop2) + i16;
            if (a) {
                i17 = j3 - i15;
            } else {
                i17 = j3 + i15;
            }
            paddingLeft = i17;
        }
        LinearLayout linearLayout = this.f685p;
        if (linearLayout != null && this.f684o == null && linearLayout.getVisibility() != 8) {
            paddingLeft += j(this.f685p, a, paddingLeft, paddingTop, paddingTop2);
        }
        View view2 = this.f684o;
        if (view2 != null) {
            j(view2, a, paddingLeft, paddingTop, paddingTop2);
        }
        if (a) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f674d;
        if (actionMenuView != null) {
            j(actionMenuView, !a, paddingRight, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f676g;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
                View view = this.f682m;
                if (view != null) {
                    int f10 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f682m.getLayoutParams();
                    paddingLeft = f10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f674d;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f674d, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f685p;
                if (linearLayout != null && this.f684o == null) {
                    if (this.u) {
                        this.f685p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f685p.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f685p;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f684o;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.f684o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f676g <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    public void setContentHeight(int i10) {
        this.f676g = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f684o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f684o = view;
        if (view != null && (linearLayout = this.f685p) != null) {
            removeView(linearLayout);
            this.f685p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f681l = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f680k = charSequence;
        d();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.u) {
            requestLayout();
        }
        this.u = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
