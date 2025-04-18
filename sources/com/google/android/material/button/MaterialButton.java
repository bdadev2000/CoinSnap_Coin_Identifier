package com.google.android.material.button;

import a4.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import com.bumptech.glide.d;
import d0.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ka.l;
import ka.x;
import v8.u0;
import w9.a;
import w9.b;
import w9.c;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, x {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f11598q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f11599r = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public final c f11600b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f11601c;

    /* renamed from: d, reason: collision with root package name */
    public a f11602d;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f11603f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f11604g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f11605h;

    /* renamed from: i, reason: collision with root package name */
    public String f11606i;

    /* renamed from: j, reason: collision with root package name */
    public int f11607j;

    /* renamed from: k, reason: collision with root package name */
    public int f11608k;

    /* renamed from: l, reason: collision with root package name */
    public int f11609l;

    /* renamed from: m, reason: collision with root package name */
    public int f11610m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11611n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11612o;

    /* renamed from: p, reason: collision with root package name */
    public int f11613p;

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    public final boolean a() {
        c cVar = this.f11600b;
        if (cVar != null && !cVar.f26945o) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10 = this.f11613p;
        boolean z12 = false;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            setCompoundDrawablesRelative(this.f11605h, null, null, null);
            return;
        }
        if (i10 != 3 && i10 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            setCompoundDrawablesRelative(null, null, this.f11605h, null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z12 = true;
        }
        if (z12) {
            setCompoundDrawablesRelative(null, this.f11605h, null, null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = this.f11605h;
        boolean z14 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f11605h = mutate;
            h0.a.h(mutate, this.f11604g);
            PorterDuff.Mode mode = this.f11603f;
            if (mode != null) {
                h0.a.i(this.f11605h, mode);
            }
            int i10 = this.f11607j;
            if (i10 == 0) {
                i10 = this.f11605h.getIntrinsicWidth();
            }
            int i11 = this.f11607j;
            if (i11 == 0) {
                i11 = this.f11605h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11605h;
            int i12 = this.f11608k;
            int i13 = this.f11609l;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f11605h.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i14 = this.f11613p;
        if (i14 != 1 && i14 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 || drawable3 == this.f11605h) {
            if (i14 != 3 && i14 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12 || drawable5 == this.f11605h) {
                if (i14 != 16 && i14 != 32) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13 || drawable4 == this.f11605h) {
                    z14 = false;
                }
            }
        }
        if (z14) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f11605h != null && getLayout() != null) {
            int i12 = this.f11613p;
            boolean z13 = true;
            if (i12 != 1 && i12 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (i12 != 3 && i12 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    if (i12 != 16 && i12 != 32) {
                        z13 = false;
                    }
                    if (z13) {
                        this.f11608k = 0;
                        if (i12 == 16) {
                            this.f11609l = 0;
                            c(false);
                            return;
                        }
                        int i13 = this.f11607j;
                        if (i13 == 0) {
                            i13 = this.f11605h.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f11610m) - getPaddingBottom()) / 2);
                        if (this.f11609l != max) {
                            this.f11609l = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f11609l = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f11613p;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.f11607j;
                if (i15 == 0) {
                    i15 = this.f11605h.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - i15) - this.f11610m) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f11613p != 4) {
                    z13 = false;
                }
                if (z11 != z13) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f11608k != textLayoutWidth) {
                    this.f11608k = textLayoutWidth;
                    c(false);
                    return;
                }
                return;
            }
            this.f11608k = 0;
            c(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        boolean z10;
        Class cls;
        if (!TextUtils.isEmpty(this.f11606i)) {
            return this.f11606i;
        }
        c cVar = this.f11600b;
        if (cVar != null && cVar.f26947q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f11600b.f26937g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f11605h;
    }

    public int getIconGravity() {
        return this.f11613p;
    }

    public int getIconPadding() {
        return this.f11610m;
    }

    public int getIconSize() {
        return this.f11607j;
    }

    public ColorStateList getIconTint() {
        return this.f11604g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11603f;
    }

    public int getInsetBottom() {
        return this.f11600b.f26936f;
    }

    public int getInsetTop() {
        return this.f11600b.f26935e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f11600b.f26942l;
        }
        return null;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        if (a()) {
            return this.f11600b.f26932b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f11600b.f26941k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f11600b.f26938h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f11600b.f26940j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f11600b.f26939i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11611n;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            u0.l0(this, this.f11600b.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        c cVar = this.f11600b;
        if (cVar != null && cVar.f26947q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f11598q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11599r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f11600b;
        if (cVar != null && cVar.f26947q) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f26666b);
        setChecked(bVar.f26931d);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f26931d = this.f11611n;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f11600b.f26948r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f11605h != null) {
            if (this.f11605h.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@Nullable String str) {
        this.f11606i = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (a()) {
            c cVar = this.f11600b;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.f11600b;
                cVar.f26945o = true;
                ColorStateList colorStateList = cVar.f26940j;
                MaterialButton materialButton = cVar.a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(cVar.f26939i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = com.bumptech.glide.c.t(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f11600b.f26947q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        boolean z11;
        c cVar = this.f11600b;
        if (cVar != null && cVar.f26947q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && isEnabled() && this.f11611n != z10) {
            this.f11611n = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z12 = this.f11611n;
                if (!materialButtonToggleGroup.f11620h) {
                    materialButtonToggleGroup.b(getId(), z12);
                }
            }
            if (this.f11612o) {
                return;
            }
            this.f11612o = true;
            Iterator it = this.f11601c.iterator();
            if (!it.hasNext()) {
                this.f11612o = false;
            } else {
                j.t(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            c cVar = this.f11600b;
            if (!cVar.f26946p || cVar.f26937g != i10) {
                cVar.f26937g = i10;
                cVar.f26946p = true;
                l lVar = cVar.f26932b;
                float f10 = i10;
                lVar.getClass();
                h7.l lVar2 = new h7.l(lVar);
                lVar2.f18829e = new ka.a(f10);
                lVar2.f18830f = new ka.a(f10);
                lVar2.f18831g = new ka.a(f10);
                lVar2.f18832h = new ka.a(f10);
                cVar.c(new l(lVar2));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f11600b.b(false).j(f10);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f11605h != drawable) {
            this.f11605h = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f11613p != i10) {
            this.f11613p = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f11610m != i10) {
            this.f11610m = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = com.bumptech.glide.c.t(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f11607j != i10) {
                this.f11607j = i10;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f11604g != colorStateList) {
            this.f11604g = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11603f != mode) {
            this.f11603f = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(h.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        c cVar = this.f11600b;
        cVar.d(cVar.f26935e, i10);
    }

    public void setInsetTop(int i10) {
        c cVar = this.f11600b;
        cVar.d(i10, cVar.f26936f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable a aVar) {
        this.f11602d = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f11602d;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((fb.c) aVar).f17773c).invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f11600b;
            if (cVar.f26942l != colorStateList) {
                cVar.f26942l = colorStateList;
                MaterialButton materialButton = cVar.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ia.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(h.getColorStateList(getContext(), i10));
        }
    }

    @Override // ka.x
    public void setShapeAppearanceModel(@NonNull l lVar) {
        if (a()) {
            this.f11600b.c(lVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            c cVar = this.f11600b;
            cVar.f26944n = z10;
            cVar.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f11600b;
            if (cVar.f26941k != colorStateList) {
                cVar.f26941k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(h.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            c cVar = this.f11600b;
            if (cVar.f26938h != i10) {
                cVar.f26938h = i10;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f11600b;
            if (cVar.f26940j != colorStateList) {
                cVar.f26940j = colorStateList;
                if (cVar.b(false) != null) {
                    h0.a.h(cVar.b(false), cVar.f26940j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.f11600b;
            if (cVar.f26939i != mode) {
                cVar.f26939i = mode;
                if (cVar.b(false) != null && cVar.f26939i != null) {
                    h0.a.i(cVar.b(false), cVar.f26939i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f11600b.f26948r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11611n);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(p6.a.z(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.materialButtonStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Button), attributeSet, com.plantcare.ai.identifier.plantid.R.attr.materialButtonStyle);
        this.f11601c = new LinkedHashSet();
        this.f11611n = false;
        this.f11612o = false;
        Context context2 = getContext();
        TypedArray s5 = d.s(context2, attributeSet, r9.a.f24028j, com.plantcare.ai.identifier.plantid.R.attr.materialButtonStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f11610m = s5.getDimensionPixelSize(12, 0);
        this.f11603f = u0.W(s5.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f11604g = u0.z(getContext(), s5, 14);
        this.f11605h = u0.B(getContext(), s5, 10);
        this.f11613p = s5.getInteger(11, 1);
        this.f11607j = s5.getDimensionPixelSize(13, 0);
        c cVar = new c(this, new l(l.b(context2, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.materialButtonStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Button)));
        this.f11600b = cVar;
        cVar.f26933c = s5.getDimensionPixelOffset(1, 0);
        cVar.f26934d = s5.getDimensionPixelOffset(2, 0);
        cVar.f26935e = s5.getDimensionPixelOffset(3, 0);
        cVar.f26936f = s5.getDimensionPixelOffset(4, 0);
        if (s5.hasValue(8)) {
            int dimensionPixelSize = s5.getDimensionPixelSize(8, -1);
            cVar.f26937g = dimensionPixelSize;
            l lVar = cVar.f26932b;
            float f10 = dimensionPixelSize;
            lVar.getClass();
            h7.l lVar2 = new h7.l(lVar);
            lVar2.f18829e = new ka.a(f10);
            lVar2.f18830f = new ka.a(f10);
            lVar2.f18831g = new ka.a(f10);
            lVar2.f18832h = new ka.a(f10);
            cVar.c(new l(lVar2));
            cVar.f26946p = true;
        }
        cVar.f26938h = s5.getDimensionPixelSize(20, 0);
        cVar.f26939i = u0.W(s5.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        cVar.f26940j = u0.z(getContext(), s5, 6);
        cVar.f26941k = u0.z(getContext(), s5, 19);
        cVar.f26942l = u0.z(getContext(), s5, 16);
        cVar.f26947q = s5.getBoolean(5, false);
        cVar.f26950t = s5.getDimensionPixelSize(9, 0);
        cVar.f26948r = s5.getBoolean(21, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (s5.hasValue(0)) {
            cVar.f26945o = true;
            setSupportBackgroundTintList(cVar.f26940j);
            setSupportBackgroundTintMode(cVar.f26939i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f26933c, paddingTop + cVar.f26935e, paddingEnd + cVar.f26934d, paddingBottom + cVar.f26936f);
        s5.recycle();
        setCompoundDrawablePadding(this.f11610m);
        c(this.f11605h != null);
    }
}
