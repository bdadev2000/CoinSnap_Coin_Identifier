package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public class f0 extends RadioButton implements t0.r {

    /* renamed from: b, reason: collision with root package name */
    public final u f863b;

    /* renamed from: c, reason: collision with root package name */
    public final r f864c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f865d;

    /* renamed from: f, reason: collision with root package name */
    public z f866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        q3.a(context);
        p3.a(getContext(), this);
        u uVar = new u(this, 1);
        this.f863b = uVar;
        uVar.c(attributeSet, R.attr.radioButtonStyle);
        r rVar = new r(this);
        this.f864c = rVar;
        rVar.d(attributeSet, R.attr.radioButtonStyle);
        d1 d1Var = new d1(this);
        this.f865d = d1Var;
        d1Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    @NonNull
    private z getEmojiTextViewHelper() {
        if (this.f866f == null) {
            this.f866f = new z(this);
        }
        return this.f866f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f864c;
        if (rVar != null) {
            rVar.a();
        }
        d1 d1Var = this.f865d;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        u uVar = this.f863b;
        if (uVar != null) {
            uVar.getClass();
        }
        return compoundPaddingLeft;
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f864c;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f864c;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Override // t0.r
    @Nullable
    public ColorStateList getSupportButtonTintList() {
        u uVar = this.f863b;
        if (uVar != null) {
            return uVar.f1041b;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportButtonTintMode() {
        u uVar = this.f863b;
        if (uVar != null) {
            return uVar.f1042c;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f865d.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f865d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f864c;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f864c;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        u uVar = this.f863b;
        if (uVar != null) {
            if (uVar.f1045f) {
                uVar.f1045f = false;
            } else {
                uVar.f1045f = true;
                uVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f865d;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f865d;
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
        r rVar = this.f864c;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.f864c;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // t0.r
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        u uVar = this.f863b;
        if (uVar != null) {
            uVar.f1041b = colorStateList;
            uVar.f1043d = true;
            uVar.a();
        }
    }

    @Override // t0.r
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        u uVar = this.f863b;
        if (uVar != null) {
            uVar.f1042c = mode;
            uVar.f1044e = true;
            uVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        d1 d1Var = this.f865d;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        d1 d1Var = this.f865d;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(com.bumptech.glide.c.t(getContext(), i10));
    }
}
