package com.google.android.material.internal;

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
import androidx.appcompat.widget.c2;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.c;
import ea.d;
import f0.i;
import h0.a;
import k.d0;
import k.q;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements d0 {
    public static final int[] I = {R.attr.state_checked};
    public final boolean A;
    public final CheckedTextView B;
    public FrameLayout C;
    public q D;
    public ColorStateList E;
    public boolean F;
    public Drawable G;
    public final v9.d H;

    /* renamed from: x, reason: collision with root package name */
    public int f11769x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11770y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11771z;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = true;
        v9.d dVar = new v9.d(this, 3);
        this.H = dVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.plantcare.ai.identifier.plantid.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.plantcare.ai.identifier.plantid.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.plantcare.ai.identifier.plantid.R.id.design_menu_item_text);
        this.B = checkedTextView;
        ViewCompat.setAccessibilityDelegate(checkedTextView, dVar);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.C == null) {
                this.C = (FrameLayout) ((ViewStub) findViewById(com.plantcare.ai.identifier.plantid.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.C.removeAllViews();
            this.C.addView(view);
        }
    }

    @Override // k.d0
    public final void c(q qVar) {
        int i10;
        StateListDrawable stateListDrawable;
        this.D = qVar;
        int i11 = qVar.a;
        if (i11 > 0) {
            setId(i11);
        }
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.plantcare.ai.identifier.plantid.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(I, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f20153e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f20165q);
        c.T(this, qVar.f20166r);
        q qVar2 = this.D;
        if (qVar2.f20153e != null || qVar2.getIcon() != null || this.D.getActionView() == null) {
            z10 = false;
        }
        CheckedTextView checkedTextView = this.B;
        if (z10) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.C;
            if (frameLayout != null) {
                c2 c2Var = (c2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c2Var).width = -1;
                this.C.setLayoutParams(c2Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.C;
        if (frameLayout2 != null) {
            c2 c2Var2 = (c2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c2Var2).width = -2;
            this.C.setLayoutParams(c2Var2);
        }
    }

    @Override // k.d0
    public q getItemData() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        q qVar = this.D;
        if (qVar != null && qVar.isCheckable() && this.D.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f11771z != z10) {
            this.f11771z = z10;
            this.H.h(this.B, 2048);
        }
    }

    public void setChecked(boolean z10) {
        int i10;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.B;
        checkedTextView.setChecked(z10);
        Typeface typeface = checkedTextView.getTypeface();
        if (z10 && this.A) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        checkedTextView.setTypeface(typeface, i10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.F) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.E);
            }
            int i10 = this.f11769x;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f11770y) {
            if (this.G == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = f0.q.a;
                Drawable a = i.a(resources, com.plantcare.ai.identifier.plantid.R.drawable.navigation_empty_icon, theme);
                this.G = a;
                if (a != null) {
                    int i11 = this.f11769x;
                    a.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.G;
        }
        this.B.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.B.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f11769x = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.E = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.F = z10;
        q qVar = this.D;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.B.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f11770y = z10;
    }

    public void setTextAppearance(int i10) {
        this.B.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.B.setText(charSequence);
    }
}
