package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: q.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2579B extends RadioButton implements Z.s {
    public final C2622s b;

    /* renamed from: c, reason: collision with root package name */
    public final C2617p f22508c;

    /* renamed from: d, reason: collision with root package name */
    public final W f22509d;

    /* renamed from: f, reason: collision with root package name */
    public C2628v f22510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2579B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        P0.a(context);
        O0.a(this, getContext());
        C2622s c2622s = new C2622s(this);
        this.b = c2622s;
        c2622s.c(attributeSet, R.attr.radioButtonStyle);
        C2617p c2617p = new C2617p(this);
        this.f22508c = c2617p;
        c2617p.d(attributeSet, R.attr.radioButtonStyle);
        W w2 = new W(this);
        this.f22509d = w2;
        w2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    @NonNull
    private C2628v getEmojiTextViewHelper() {
        if (this.f22510f == null) {
            this.f22510f = new C2628v(this);
        }
        return this.f22510f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2617p c2617p = this.f22508c;
        if (c2617p != null) {
            c2617p.a();
        }
        W w2 = this.f22509d;
        if (w2 != null) {
            w2.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        C2617p c2617p = this.f22508c;
        if (c2617p != null) {
            return c2617p.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2617p c2617p = this.f22508c;
        if (c2617p != null) {
            return c2617p.c();
        }
        return null;
    }

    @Override // Z.s
    @Nullable
    public ColorStateList getSupportButtonTintList() {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            return c2622s.f22720a;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportButtonTintMode() {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            return c2622s.b;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22509d.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22509d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2617p c2617p = this.f22508c;
        if (c2617p != null) {
            c2617p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2617p c2617p = this.f22508c;
        if (c2617p != null) {
            c2617p.f(i9);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2622s c2622s = this.b;
        if (c2622s != null) {
            if (c2622s.f22723e) {
                c2622s.f22723e = false;
            } else {
                c2622s.f22723e = true;
                c2622s.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f22509d;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f22509d;
        if (w2 != null) {
            w2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C2617p c2617p = this.f22508c;
        if (c2617p != null) {
            c2617p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C2617p c2617p = this.f22508c;
        if (c2617p != null) {
            c2617p.i(mode);
        }
    }

    @Override // Z.s
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            c2622s.f22720a = colorStateList;
            c2622s.f22721c = true;
            c2622s.a();
        }
    }

    @Override // Z.s
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        C2622s c2622s = this.b;
        if (c2622s != null) {
            c2622s.b = mode;
            c2622s.f22722d = true;
            c2622s.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        W w2 = this.f22509d;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        W w2 = this.f22509d;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i9) {
        setButtonDrawable(com.facebook.appevents.n.g(getContext(), i9));
    }
}
