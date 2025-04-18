package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class q extends AutoCompleteTextView {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1000f = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final r f1001b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f1002c;

    /* renamed from: d, reason: collision with root package name */
    public final d3.g f1003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.autoCompleteTextViewStyle);
        q3.a(context);
        p3.a(getContext(), this);
        i3 m10 = i3.m(getContext(), attributeSet, f1000f, com.plantcare.ai.identifier.plantid.R.attr.autoCompleteTextViewStyle);
        if (m10.l(0)) {
            setDropDownBackgroundDrawable(m10.e(0));
        }
        m10.o();
        r rVar = new r(this);
        this.f1001b = rVar;
        rVar.d(attributeSet, com.plantcare.ai.identifier.plantid.R.attr.autoCompleteTextViewStyle);
        d1 d1Var = new d1(this);
        this.f1002c = d1Var;
        d1Var.f(attributeSet, com.plantcare.ai.identifier.plantid.R.attr.autoCompleteTextViewStyle);
        d1Var.b();
        d3.g gVar = new d3.g(this);
        this.f1003d = gVar;
        gVar.v(attributeSet, com.plantcare.ai.identifier.plantid.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener s5 = gVar.s(keyListener);
            if (s5 != keyListener) {
                super.setKeyListener(s5);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f1001b;
        if (rVar != null) {
            rVar.a();
        }
        d1 d1Var = this.f1002c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.g.L(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f1001b;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f1001b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1002c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1002c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.c.L(this, editorInfo, onCreateInputConnection);
        return this.f1003d.A(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f1001b;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f1001b;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1002c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1002c;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.g.M(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(com.bumptech.glide.c.t(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((ka.e) ((e1.b) this.f1003d.f16813d).f17071d).t(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f1003d.s(keyListener));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.f1001b;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.f1001b;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        d1 d1Var = this.f1002c;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        d1 d1Var = this.f1002c;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.f1002c;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }
}
