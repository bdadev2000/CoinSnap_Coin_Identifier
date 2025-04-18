package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class t extends CheckedTextView {

    /* renamed from: b, reason: collision with root package name */
    public final u f1026b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1027c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f1028d;

    /* renamed from: f, reason: collision with root package name */
    public z f1029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        q3.a(context);
        p3.a(getContext(), this);
        d1 d1Var = new d1(this);
        this.f1028d = d1Var;
        d1Var.f(attributeSet, R.attr.checkedTextViewStyle);
        d1Var.b();
        r rVar = new r(this);
        this.f1027c = rVar;
        rVar.d(attributeSet, R.attr.checkedTextViewStyle);
        u uVar = new u(this, 0);
        this.f1026b = uVar;
        uVar.c(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
    }

    @NonNull
    private z getEmojiTextViewHelper() {
        if (this.f1029f == null) {
            this.f1029f = new z(this);
        }
        return this.f1029f;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d1 d1Var = this.f1028d;
        if (d1Var != null) {
            d1Var.b();
        }
        r rVar = this.f1027c;
        if (rVar != null) {
            rVar.a();
        }
        u uVar = this.f1026b;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.g.L(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f1027c;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f1027c;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCheckMarkTintList() {
        u uVar = this.f1026b;
        if (uVar != null) {
            return uVar.f1041b;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        u uVar = this.f1026b;
        if (uVar != null) {
            return uVar.f1042c;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1028d.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1028d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.c.L(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f1027c;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f1027c;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        u uVar = this.f1026b;
        if (uVar != null) {
            if (uVar.f1045f) {
                uVar.f1045f = false;
            } else {
                uVar.f1045f = true;
                uVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1028d;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1028d;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.g.M(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.f1027c;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.f1027c;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        u uVar = this.f1026b;
        if (uVar != null) {
            uVar.f1041b = colorStateList;
            uVar.f1043d = true;
            uVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        u uVar = this.f1026b;
        if (uVar != null) {
            uVar.f1042c = mode;
            uVar.f1044e = true;
            uVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        d1 d1Var = this.f1028d;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        d1 d1Var = this.f1028d;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.f1028d;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(com.bumptech.glide.c.t(getContext(), i10));
    }
}
