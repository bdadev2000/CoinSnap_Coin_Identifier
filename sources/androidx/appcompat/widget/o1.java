package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class o1 extends ToggleButton {

    /* renamed from: b, reason: collision with root package name */
    public final r f970b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f971c;

    /* renamed from: d, reason: collision with root package name */
    public z f972d;

    public o1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        p3.a(getContext(), this);
        r rVar = new r(this);
        this.f970b = rVar;
        rVar.d(attributeSet, R.attr.buttonStyleToggle);
        d1 d1Var = new d1(this);
        this.f971c = d1Var;
        d1Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    @NonNull
    private z getEmojiTextViewHelper() {
        if (this.f972d == null) {
            this.f972d = new z(this);
        }
        return this.f972d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f970b;
        if (rVar != null) {
            rVar.a();
        }
        d1 d1Var = this.f971c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f970b;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f970b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f971c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f971c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f970b;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f970b;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f971c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f971c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.f970b;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.f970b;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        d1 d1Var = this.f971c;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        d1 d1Var = this.f971c;
        d1Var.m(mode);
        d1Var.b();
    }
}
