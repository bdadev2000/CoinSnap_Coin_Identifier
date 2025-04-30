package com.google.android.material.internal;

import B3.n;
import K.o;
import L3.d;
import M.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.i;
import p.C2535n;
import p.y;
import q.C2629v0;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements y {

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f14094I = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final boolean f14095A;

    /* renamed from: B, reason: collision with root package name */
    public final CheckedTextView f14096B;

    /* renamed from: C, reason: collision with root package name */
    public FrameLayout f14097C;

    /* renamed from: D, reason: collision with root package name */
    public C2535n f14098D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f14099E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f14100F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f14101G;

    /* renamed from: H, reason: collision with root package name */
    public final n f14102H;

    /* renamed from: x, reason: collision with root package name */
    public int f14103x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14104y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14105z;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14095A = true;
        n nVar = new n(this, 3);
        this.f14102H = nVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.tools.arruler.photomeasure.camera.ruler.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.design_menu_item_text);
        this.f14096B = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView, nVar);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f14097C == null) {
                this.f14097C = (FrameLayout) ((ViewStub) findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f14097C.removeAllViews();
            this.f14097C.addView(view);
        }
    }

    @Override // p.y
    public final void b(C2535n c2535n) {
        int i9;
        StateListDrawable stateListDrawable;
        this.f14098D = c2535n;
        int i10 = c2535n.b;
        if (i10 > 0) {
            setId(i10);
        }
        if (c2535n.isVisible()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        setVisibility(i9);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.tools.arruler.photomeasure.camera.ruler.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f14094I, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ViewCompat.setBackground(this, stateListDrawable);
        }
        setCheckable(c2535n.isCheckable());
        setChecked(c2535n.isChecked());
        setEnabled(c2535n.isEnabled());
        setTitle(c2535n.f22133g);
        setIcon(c2535n.getIcon());
        setActionView(c2535n.getActionView());
        setContentDescription(c2535n.f22143s);
        i.q(this, c2535n.f22144t);
        C2535n c2535n2 = this.f14098D;
        CharSequence charSequence = c2535n2.f22133g;
        CheckedTextView checkedTextView = this.f14096B;
        if (charSequence == null && c2535n2.getIcon() == null && this.f14098D.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f14097C;
            if (frameLayout != null) {
                C2629v0 c2629v0 = (C2629v0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c2629v0).width = -1;
                this.f14097C.setLayoutParams(c2629v0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f14097C;
        if (frameLayout2 != null) {
            C2629v0 c2629v02 = (C2629v0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c2629v02).width = -2;
            this.f14097C.setLayoutParams(c2629v02);
        }
    }

    @Override // p.y
    public C2535n getItemData() {
        return this.f14098D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        C2535n c2535n = this.f14098D;
        if (c2535n != null && c2535n.isCheckable() && this.f14098D.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f14094I);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z8) {
        refreshDrawableState();
        if (this.f14105z != z8) {
            this.f14105z = z8;
            this.f14102H.h(this.f14096B, 2048);
        }
    }

    public void setChecked(boolean z8) {
        int i9;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f14096B;
        checkedTextView.setChecked(z8);
        Typeface typeface = checkedTextView.getTypeface();
        if (z8 && this.f14095A) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        checkedTextView.setTypeface(typeface, i9);
    }

    public void setHorizontalPadding(int i9) {
        setPadding(i9, getPaddingTop(), i9, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f14100F) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f14099E);
            }
            int i9 = this.f14103x;
            drawable.setBounds(0, 0, i9, i9);
        } else if (this.f14104y) {
            if (this.f14101G == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = o.f1632a;
                Drawable a6 = K.i.a(resources, com.tools.arruler.photomeasure.camera.ruler.R.drawable.navigation_empty_icon, theme);
                this.f14101G = a6;
                if (a6 != null) {
                    int i10 = this.f14103x;
                    a6.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f14101G;
        }
        this.f14096B.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i9) {
        this.f14096B.setCompoundDrawablePadding(i9);
    }

    public void setIconSize(int i9) {
        this.f14103x = i9;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z8;
        this.f14099E = colorStateList;
        if (colorStateList != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f14100F = z8;
        C2535n c2535n = this.f14098D;
        if (c2535n != null) {
            setIcon(c2535n.getIcon());
        }
    }

    public void setMaxLines(int i9) {
        this.f14096B.setMaxLines(i9);
    }

    public void setNeedsEmptyIcon(boolean z8) {
        this.f14104y = z8;
    }

    public void setTextAppearance(int i9) {
        this.f14096B.setTextAppearance(i9);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f14096B.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f14096B.setText(charSequence);
    }
}
