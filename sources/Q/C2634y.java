package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.Nullable;

/* renamed from: q.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2634y extends MultiAutoCompleteTextView {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f22742f = {R.attr.popupBackground};
    public final C2617p b;

    /* renamed from: c, reason: collision with root package name */
    public final W f22743c;

    /* renamed from: d, reason: collision with root package name */
    public final C2578A f22744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2634y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.autoCompleteTextViewStyle);
        P0.a(context);
        O0.a(this, getContext());
        l5.k i9 = l5.k.i(getContext(), attributeSet, f22742f, com.tools.arruler.photomeasure.camera.ruler.R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) i9.b).hasValue(0)) {
            setDropDownBackgroundDrawable(i9.e(0));
        }
        i9.j();
        C2617p c2617p = new C2617p(this);
        this.b = c2617p;
        c2617p.d(attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.autoCompleteTextViewStyle);
        W w2 = new W(this);
        this.f22743c = w2;
        w2.f(attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.autoCompleteTextViewStyle);
        w2.b();
        C2578A c2578a = new C2578A(this);
        this.f22744d = c2578a;
        c2578a.b(attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a6 = c2578a.a(keyListener);
            if (a6 != keyListener) {
                super.setKeyListener(a6);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.a();
        }
        W w2 = this.f22743c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            return c2617p.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            return c2617p.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22743c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22743c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.facebook.appevents.g.u(onCreateInputConnection, editorInfo, this);
        return this.f22744d.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.f(i9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f22743c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f22743c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i9) {
        setDropDownBackgroundDrawable(com.facebook.appevents.n.g(getContext(), i9));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f22744d.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f22744d.a(keyListener));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        W w2 = this.f22743c;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        W w2 = this.f22743c;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        W w2 = this.f22743c;
        if (w2 != null) {
            w2.g(context, i9);
        }
    }
}
