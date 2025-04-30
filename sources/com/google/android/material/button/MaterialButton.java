package com.google.android.material.button;

import C3.a;
import C3.b;
import C3.c;
import I.h;
import L3.k;
import R3.j;
import R3.v;
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
import androidx.core.view.ViewCompat;
import b0.AbstractC0547b;
import com.facebook.appevents.n;
import com.mbridge.msdk.foundation.entity.o;
import j5.C2400c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w3.AbstractC2861a;
import z2.i;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, v {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f13967q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f13968r = {R.attr.state_checked};
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f13969c;

    /* renamed from: d, reason: collision with root package name */
    public a f13970d;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f13971f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f13972g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f13973h;

    /* renamed from: i, reason: collision with root package name */
    public String f13974i;

    /* renamed from: j, reason: collision with root package name */
    public int f13975j;

    /* renamed from: k, reason: collision with root package name */
    public int f13976k;
    public int l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13977n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13978o;

    /* renamed from: p, reason: collision with root package name */
    public int f13979p;

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(W3.a.a(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.materialButtonStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Button), attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.materialButtonStyle);
        this.f13969c = new LinkedHashSet();
        this.f13977n = false;
        this.f13978o = false;
        Context context2 = getContext();
        TypedArray f9 = k.f(context2, attributeSet, AbstractC2861a.f23670j, com.tools.arruler.photomeasure.camera.ruler.R.attr.materialButtonStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.m = f9.getDimensionPixelSize(12, 0);
        int i9 = f9.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f13971f = k.g(i9, mode);
        this.f13972g = android.support.v4.media.session.a.p(getContext(), f9, 14);
        this.f13973h = android.support.v4.media.session.a.r(getContext(), f9, 10);
        this.f13979p = f9.getInteger(11, 1);
        this.f13975j = f9.getDimensionPixelSize(13, 0);
        c cVar = new c(this, R3.k.b(context2, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.materialButtonStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Button).a());
        this.b = cVar;
        cVar.f538c = f9.getDimensionPixelOffset(1, 0);
        cVar.f539d = f9.getDimensionPixelOffset(2, 0);
        cVar.f540e = f9.getDimensionPixelOffset(3, 0);
        cVar.f541f = f9.getDimensionPixelOffset(4, 0);
        if (f9.hasValue(8)) {
            int dimensionPixelSize = f9.getDimensionPixelSize(8, -1);
            cVar.f542g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            j e4 = cVar.b.e();
            e4.f2685e = new R3.a(f10);
            e4.f2686f = new R3.a(f10);
            e4.f2687g = new R3.a(f10);
            e4.f2688h = new R3.a(f10);
            cVar.c(e4.a());
            cVar.f549p = true;
        }
        cVar.f543h = f9.getDimensionPixelSize(20, 0);
        cVar.f544i = k.g(f9.getInt(7, -1), mode);
        cVar.f545j = android.support.v4.media.session.a.p(getContext(), f9, 6);
        cVar.f546k = android.support.v4.media.session.a.p(getContext(), f9, 19);
        cVar.l = android.support.v4.media.session.a.p(getContext(), f9, 16);
        cVar.f550q = f9.getBoolean(5, false);
        cVar.f553t = f9.getDimensionPixelSize(9, 0);
        cVar.f551r = f9.getBoolean(21, true);
        int paddingStart = ViewCompat.getPaddingStart(this);
        int paddingTop = getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this);
        int paddingBottom = getPaddingBottom();
        if (f9.hasValue(0)) {
            cVar.f548o = true;
            setSupportBackgroundTintList(cVar.f545j);
            setSupportBackgroundTintMode(cVar.f544i);
        } else {
            cVar.e();
        }
        ViewCompat.setPaddingRelative(this, paddingStart + cVar.f538c, paddingTop + cVar.f540e, paddingEnd + cVar.f539d, paddingBottom + cVar.f541f);
        f9.recycle();
        setCompoundDrawablePadding(this.m);
        d(this.f13973h != null);
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
        float f9 = 0.0f;
        for (int i9 = 0; i9 < lineCount; i9++) {
            f9 = Math.max(f9, getLayout().getLineWidth(i9));
        }
        return (int) Math.ceil(f9);
    }

    public final boolean a() {
        c cVar = this.b;
        if (cVar != null && cVar.f550q) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        c cVar = this.b;
        if (cVar != null && !cVar.f548o) {
            return true;
        }
        return false;
    }

    public final void c() {
        int i9 = this.f13979p;
        boolean z8 = true;
        if (i9 != 1 && i9 != 2) {
            z8 = false;
        }
        if (z8) {
            setCompoundDrawablesRelative(this.f13973h, null, null, null);
            return;
        }
        if (i9 != 3 && i9 != 4) {
            if (i9 == 16 || i9 == 32) {
                setCompoundDrawablesRelative(null, this.f13973h, null, null);
                return;
            }
            return;
        }
        setCompoundDrawablesRelative(null, null, this.f13973h, null);
    }

    public final void d(boolean z8) {
        Drawable drawable = this.f13973h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f13973h = mutate;
            M.a.h(mutate, this.f13972g);
            PorterDuff.Mode mode = this.f13971f;
            if (mode != null) {
                M.a.i(this.f13973h, mode);
            }
            int i9 = this.f13975j;
            if (i9 == 0) {
                i9 = this.f13973h.getIntrinsicWidth();
            }
            int i10 = this.f13975j;
            if (i10 == 0) {
                i10 = this.f13973h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f13973h;
            int i11 = this.f13976k;
            int i12 = this.l;
            drawable2.setBounds(i11, i12, i9 + i11, i10 + i12);
            this.f13973h.setVisible(true, z8);
        }
        if (z8) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i13 = this.f13979p;
        if (((i13 == 1 || i13 == 2) && drawable3 != this.f13973h) || (((i13 == 3 || i13 == 4) && drawable5 != this.f13973h) || ((i13 == 16 || i13 == 32) && drawable4 != this.f13973h))) {
            c();
        }
    }

    public final void e(int i9, int i10) {
        boolean z8;
        boolean z9;
        if (this.f13973h != null && getLayout() != null) {
            int i11 = this.f13979p;
            boolean z10 = true;
            if (i11 != 1 && i11 != 2) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8 && i11 != 3 && i11 != 4) {
                if (i11 == 16 || i11 == 32) {
                    this.f13976k = 0;
                    if (i11 == 16) {
                        this.l = 0;
                        d(false);
                        return;
                    }
                    int i12 = this.f13975j;
                    if (i12 == 0) {
                        i12 = this.f13973h.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i12) - this.m) - getPaddingBottom()) / 2);
                    if (this.l != max) {
                        this.l = max;
                        d(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.l = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i13 = this.f13979p;
            if (i13 != 1 && i13 != 3 && ((i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i14 = this.f13975j;
                if (i14 == 0) {
                    i14 = this.f13973h.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i9 - getTextLayoutWidth()) - ViewCompat.getPaddingEnd(this)) - i14) - this.m) - ViewCompat.getPaddingStart(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f13979p != 4) {
                    z10 = false;
                }
                if (z9 != z10) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f13976k != textLayoutWidth) {
                    this.f13976k = textLayoutWidth;
                    d(false);
                    return;
                }
                return;
            }
            this.f13976k = 0;
            d(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f13974i)) {
            return this.f13974i;
        }
        if (a()) {
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
        if (b()) {
            return this.b.f542g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f13973h;
    }

    public int getIconGravity() {
        return this.f13979p;
    }

    public int getIconPadding() {
        return this.m;
    }

    public int getIconSize() {
        return this.f13975j;
    }

    public ColorStateList getIconTint() {
        return this.f13972g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f13971f;
    }

    public int getInsetBottom() {
        return this.b.f541f;
    }

    public int getInsetTop() {
        return this.b.f540e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (b()) {
            return this.b.l;
        }
        return null;
    }

    @NonNull
    public R3.k getShapeAppearanceModel() {
        if (b()) {
            return this.b.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.b.f546k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.b.f543h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.b.f545j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.b.f544i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f13977n;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            i.q(this, this.b.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f13967q);
        }
        if (this.f13977n) {
            View.mergeDrawableStates(onCreateDrawableState, f13968r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f13977n);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f13977n);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.b);
        setChecked(bVar.f536d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, C3.b, b0.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? abstractC0547b = new AbstractC0547b(super.onSaveInstanceState());
        abstractC0547b.f536d = this.f13977n;
        return abstractC0547b;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.b.f551r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f13973h != null) {
            if (this.f13973h.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@Nullable String str) {
        this.f13974i = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        if (b()) {
            c cVar = this.b;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i9);
                return;
            }
            return;
        }
        super.setBackgroundColor(i9);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.b;
                cVar.f548o = true;
                ColorStateList colorStateList = cVar.f545j;
                MaterialButton materialButton = cVar.f537a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(cVar.f544i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i9) {
        Drawable drawable;
        if (i9 != 0) {
            drawable = n.g(getContext(), i9);
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

    public void setCheckable(boolean z8) {
        if (b()) {
            this.b.f550q = z8;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (a() && isEnabled() && this.f13977n != z8) {
            this.f13977n = z8;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z9 = this.f13977n;
                if (!materialButtonToggleGroup.f13984h) {
                    materialButtonToggleGroup.b(getId(), z9);
                }
            }
            if (this.f13978o) {
                return;
            }
            this.f13978o = true;
            Iterator it = this.f13969c.iterator();
            if (!it.hasNext()) {
                this.f13978o = false;
            } else {
                o.v(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i9) {
        if (b()) {
            c cVar = this.b;
            if (!cVar.f549p || cVar.f542g != i9) {
                cVar.f542g = i9;
                cVar.f549p = true;
                float f9 = i9;
                j e4 = cVar.b.e();
                e4.f2685e = new R3.a(f9);
                e4.f2686f = new R3.a(f9);
                e4.f2687g = new R3.a(f9);
                e4.f2688h = new R3.a(f9);
                cVar.c(e4.a());
            }
        }
    }

    public void setCornerRadiusResource(int i9) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i9));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f9) {
        super.setElevation(f9);
        if (b()) {
            this.b.b(false).j(f9);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f13973h != drawable) {
            this.f13973h = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i9) {
        if (this.f13979p != i9) {
            this.f13979p = i9;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i9) {
        if (this.m != i9) {
            this.m = i9;
            setCompoundDrawablePadding(i9);
        }
    }

    public void setIconResource(int i9) {
        Drawable drawable;
        if (i9 != 0) {
            drawable = n.g(getContext(), i9);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i9) {
        if (i9 >= 0) {
            if (this.f13975j != i9) {
                this.f13975j = i9;
                d(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f13972g != colorStateList) {
            this.f13972g = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f13971f != mode) {
            this.f13971f = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i9) {
        setIconTint(h.getColorStateList(getContext(), i9));
    }

    public void setInsetBottom(int i9) {
        c cVar = this.b;
        cVar.d(cVar.f540e, i9);
    }

    public void setInsetTop(int i9) {
        c cVar = this.b;
        cVar.d(i9, cVar.f541f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable a aVar) {
        this.f13970d = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        a aVar = this.f13970d;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((C2400c) aVar).f21107c).invalidate();
        }
        super.setPressed(z8);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.b;
            if (cVar.l != colorStateList) {
                cVar.l = colorStateList;
                MaterialButton materialButton = cVar.f537a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(P3.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i9) {
        if (b()) {
            setRippleColor(h.getColorStateList(getContext(), i9));
        }
    }

    @Override // R3.v
    public void setShapeAppearanceModel(@NonNull R3.k kVar) {
        if (b()) {
            this.b.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z8) {
        if (b()) {
            c cVar = this.b;
            cVar.f547n = z8;
            cVar.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.b;
            if (cVar.f546k != colorStateList) {
                cVar.f546k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i9) {
        if (b()) {
            setStrokeColor(h.getColorStateList(getContext(), i9));
        }
    }

    public void setStrokeWidth(int i9) {
        if (b()) {
            c cVar = this.b;
            if (cVar.f543h != i9) {
                cVar.f543h = i9;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i9) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i9));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.b;
            if (cVar.f545j != colorStateList) {
                cVar.f545j = colorStateList;
                if (cVar.b(false) != null) {
                    M.a.h(cVar.b(false), cVar.f545j);
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
        if (b()) {
            c cVar = this.b;
            if (cVar.f544i != mode) {
                cVar.f544i = mode;
                if (cVar.b(false) != null && cVar.f544i != null) {
                    M.a.i(cVar.b(false), cVar.f544i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i9) {
        super.setTextAlignment(i9);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z8) {
        this.b.f551r = z8;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f13977n);
    }
}
