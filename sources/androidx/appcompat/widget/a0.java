package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class a0 extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public final r f801b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f802c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q3.a(context);
        this.f803d = false;
        p3.a(getContext(), this);
        r rVar = new r(this);
        this.f801b = rVar;
        rVar.d(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f802c = b0Var;
        b0Var.b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f801b;
        if (rVar != null) {
            rVar.a();
        }
        b0 b0Var = this.f802c;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f801b;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f801b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        r3 r3Var;
        b0 b0Var = this.f802c;
        if (b0Var == null || (r3Var = b0Var.f807b) == null) {
            return null;
        }
        return (ColorStateList) r3Var.f1012d;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        r3 r3Var;
        b0 b0Var = this.f802c;
        if (b0Var == null || (r3Var = b0Var.f807b) == null) {
            return null;
        }
        return (PorterDuff.Mode) r3Var.f1013e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f802c.a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f801b;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f801b;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b0 b0Var = this.f802c;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        b0 b0Var = this.f802c;
        if (b0Var != null && drawable != null && !this.f803d) {
            b0Var.f808c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (b0Var != null) {
            b0Var.a();
            if (!this.f803d) {
                ImageView imageView = b0Var.a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(b0Var.f808c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f803d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f802c.c(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        b0 b0Var = this.f802c;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.f801b;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.f801b;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        b0 b0Var = this.f802c;
        if (b0Var != null) {
            if (b0Var.f807b == null) {
                b0Var.f807b = new r3();
            }
            r3 r3Var = b0Var.f807b;
            r3Var.f1012d = colorStateList;
            r3Var.f1011c = true;
            b0Var.a();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        b0 b0Var = this.f802c;
        if (b0Var != null) {
            if (b0Var.f807b == null) {
                b0Var.f807b = new r3();
            }
            r3 r3Var = b0Var.f807b;
            r3Var.f1013e = mode;
            r3Var.f1010b = true;
            b0Var.a();
        }
    }
}
