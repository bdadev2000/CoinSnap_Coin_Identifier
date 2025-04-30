package androidx.appcompat.widget;

import B3.m;
import T.C0275i0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import com.facebook.appevents.n;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g8.u;
import j.AbstractC2379a;
import o.b;
import p.MenuC2533l;
import p.z;
import q.C2597f;
import q.C2605j;
import q.g1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final u b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4150c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f4151d;

    /* renamed from: f, reason: collision with root package name */
    public C2605j f4152f;

    /* renamed from: g, reason: collision with root package name */
    public int f4153g;

    /* renamed from: h, reason: collision with root package name */
    public C0275i0 f4154h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4155i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4156j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4157k;
    public CharSequence l;
    public View m;

    /* renamed from: n, reason: collision with root package name */
    public View f4158n;

    /* renamed from: o, reason: collision with root package name */
    public View f4159o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f4160p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f4161q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f4162r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4163s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4164t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4165u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4166v;

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.b = new u(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f4150c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f4150c = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20944d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = n.g(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.f4163s = obtainStyledAttributes.getResourceId(5, 0);
        this.f4164t = obtainStyledAttributes.getResourceId(4, 0);
        this.f4153g = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4166v = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE), i10);
        return Math.max(0, i9 - view.getMeasuredWidth());
    }

    public static int g(View view, boolean z8, int i9, int i10, int i11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z8) {
            view.layout(i9 - measuredWidth, i12, i9, measuredHeight + i12);
        } else {
            view.layout(i9, i12, i9 + measuredWidth, measuredHeight + i12);
        }
        if (z8) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(b bVar) {
        View view = this.m;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4166v, (ViewGroup) this, false);
            this.m = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.m);
        }
        View findViewById = this.m.findViewById(R.id.action_mode_close_button);
        this.f4158n = findViewById;
        findViewById.setOnClickListener(new m(bVar, 4));
        MenuC2533l d2 = bVar.d();
        C2605j c2605j = this.f4152f;
        if (c2605j != null) {
            c2605j.g();
            C2597f c2597f = c2605j.f22676v;
            if (c2597f != null && c2597f.b()) {
                c2597f.f22166j.dismiss();
            }
        }
        C2605j c2605j2 = new C2605j(getContext());
        this.f4152f = c2605j2;
        c2605j2.f22668n = true;
        c2605j2.f22669o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d2.b(this.f4152f, this.f4150c);
        C2605j c2605j3 = this.f4152f;
        z zVar = c2605j3.f22666j;
        if (zVar == null) {
            z zVar2 = (z) c2605j3.f22662f.inflate(c2605j3.f22664h, (ViewGroup) this, false);
            c2605j3.f22666j = zVar2;
            zVar2.c(c2605j3.f22661d);
            c2605j3.f();
        }
        z zVar3 = c2605j3.f22666j;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c2605j3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f4151d = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f4151d, layoutParams);
    }

    public final void d() {
        int i9;
        if (this.f4160p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4160p = linearLayout;
            this.f4161q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4162r = (TextView) this.f4160p.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f4163s;
            if (i10 != 0) {
                this.f4161q.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f4164t;
            if (i11 != 0) {
                this.f4162r.setTextAppearance(getContext(), i11);
            }
        }
        this.f4161q.setText(this.f4157k);
        this.f4162r.setText(this.l);
        boolean z8 = !TextUtils.isEmpty(this.f4157k);
        boolean z9 = !TextUtils.isEmpty(this.l);
        TextView textView = this.f4162r;
        int i12 = 8;
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        textView.setVisibility(i9);
        LinearLayout linearLayout2 = this.f4160p;
        if (z8 || z9) {
            i12 = 0;
        }
        linearLayout2.setVisibility(i12);
        if (this.f4160p.getParent() == null) {
            addView(this.f4160p);
        }
    }

    public final void e() {
        removeAllViews();
        this.f4159o = null;
        this.f4151d = null;
        this.f4152f = null;
        View view = this.f4158n;
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
        if (this.f4154h != null) {
            return this.b.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f4153g;
    }

    public CharSequence getSubtitle() {
        return this.l;
    }

    public CharSequence getTitle() {
        return this.f4157k;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i9) {
        if (i9 != getVisibility()) {
            C0275i0 c0275i0 = this.f4154h;
            if (c0275i0 != null) {
                c0275i0.b();
            }
            super.setVisibility(i9);
        }
    }

    public final C0275i0 i(int i9, long j7) {
        C0275i0 c0275i0 = this.f4154h;
        if (c0275i0 != null) {
            c0275i0.b();
        }
        u uVar = this.b;
        if (i9 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0275i0 animate = ViewCompat.animate(this);
            animate.a(1.0f);
            animate.c(j7);
            ((ActionBarContextView) uVar.f20536c).f4154h = animate;
            uVar.b = i9;
            animate.d(uVar);
            return animate;
        }
        C0275i0 animate2 = ViewCompat.animate(this);
        animate2.a(0.0f);
        animate2.c(j7);
        ((ActionBarContextView) uVar.f20536c).f4154h = animate2;
        uVar.b = i9;
        animate2.d(uVar);
        return animate2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i9;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC2379a.f20942a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C2605j c2605j = this.f4152f;
        if (c2605j != null) {
            Configuration configuration2 = c2605j.f22660c.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
                if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                    if (i10 >= 360) {
                        i9 = 3;
                    } else {
                        i9 = 2;
                    }
                } else {
                    i9 = 4;
                }
            } else {
                i9 = 5;
            }
            c2605j.f22672r = i9;
            MenuC2533l menuC2533l = c2605j.f22661d;
            if (menuC2533l != null) {
                menuC2533l.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2605j c2605j = this.f4152f;
        if (c2605j != null) {
            c2605j.g();
            C2597f c2597f = this.f4152f.f22676v;
            if (c2597f != null && c2597f.b()) {
                c2597f.f22166j.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4156j = false;
        }
        if (!this.f4156j) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4156j = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4156j = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        boolean z9;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = g1.f22657a;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            paddingLeft = (i11 - i9) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            if (z9) {
                i13 = marginLayoutParams.rightMargin;
            } else {
                i13 = marginLayoutParams.leftMargin;
            }
            if (z9) {
                i14 = marginLayoutParams.leftMargin;
            } else {
                i14 = marginLayoutParams.rightMargin;
            }
            if (z9) {
                i15 = paddingLeft - i13;
            } else {
                i15 = paddingLeft + i13;
            }
            int g9 = g(this.m, z9, i15, paddingTop, paddingTop2) + i15;
            if (z9) {
                i16 = g9 - i14;
            } else {
                i16 = g9 + i14;
            }
            paddingLeft = i16;
        }
        LinearLayout linearLayout = this.f4160p;
        if (linearLayout != null && this.f4159o == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.f4160p, z9, paddingLeft, paddingTop, paddingTop2);
        }
        View view2 = this.f4159o;
        if (view2 != null) {
            g(view2, z9, paddingLeft, paddingTop, paddingTop2);
        }
        if (z9) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i11 - i9) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f4151d;
        if (actionMenuView != null) {
            g(actionMenuView, !z9, paddingRight, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean z8;
        int i12;
        int i13 = 1073741824;
        if (View.MeasureSpec.getMode(i9) == 1073741824) {
            if (View.MeasureSpec.getMode(i10) != 0) {
                int size = View.MeasureSpec.getSize(i9);
                int i14 = this.f4153g;
                if (i14 <= 0) {
                    i14 = View.MeasureSpec.getSize(i10);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i15 = i14 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
                View view = this.m;
                if (view != null) {
                    int f9 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
                    paddingLeft = f9 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f4151d;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f4151d, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f4160p;
                if (linearLayout != null && this.f4159o == null) {
                    if (this.f4165u) {
                        this.f4160p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f4160p.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f4160p;
                        if (z8) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        linearLayout2.setVisibility(i12);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f4159o;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i16 = layoutParams.width;
                    if (i16 != -2) {
                        i11 = 1073741824;
                    } else {
                        i11 = Integer.MIN_VALUE;
                    }
                    if (i16 >= 0) {
                        paddingLeft = Math.min(i16, paddingLeft);
                    }
                    int i17 = layoutParams.height;
                    if (i17 == -2) {
                        i13 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        i15 = Math.min(i17, i15);
                    }
                    this.f4159o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i15, i13));
                }
                if (this.f4153g <= 0) {
                    int childCount = getChildCount();
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i18) {
                            i18 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i18);
                    return;
                }
                setMeasuredDimension(size, i14);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4155i = false;
        }
        if (!this.f4155i) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4155i = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4155i = false;
        }
        return true;
    }

    public void setContentHeight(int i9) {
        this.f4153g = i9;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4159o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4159o = view;
        if (view != null && (linearLayout = this.f4160p) != null) {
            removeView(linearLayout);
            this.f4160p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.l = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4157k = charSequence;
        d();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setTitleOptional(boolean z8) {
        if (z8 != this.f4165u) {
            requestLayout();
        }
        this.f4165u = z8;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
