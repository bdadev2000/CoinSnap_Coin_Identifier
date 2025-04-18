package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final r mBackgroundTintHelper;
    private boolean mHasLevel;
    private final b0 mImageHelper;

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.a();
        }
        b0 b0Var = this.mImageHelper;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        r3 r3Var;
        b0 b0Var = this.mImageHelper;
        if (b0Var == null || (r3Var = b0Var.f807b) == null) {
            return null;
        }
        return (ColorStateList) r3Var.f1012d;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        r3 r3Var;
        b0 b0Var = this.mImageHelper;
        if (b0Var == null || (r3Var = b0Var.f807b) == null) {
            return null;
        }
        return (PorterDuff.Mode) r3Var.f1013e;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if ((!(this.mImageHelper.a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b0 b0Var = this.mImageHelper;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        b0 b0Var = this.mImageHelper;
        if (b0Var != null && drawable != null && !this.mHasLevel) {
            b0Var.f808c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        b0 b0Var2 = this.mImageHelper;
        if (b0Var2 != null) {
            b0Var2.a();
            if (!this.mHasLevel) {
                b0 b0Var3 = this.mImageHelper;
                ImageView imageView = b0Var3.a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(b0Var3.f808c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        b0 b0Var = this.mImageHelper;
        if (b0Var != null) {
            b0Var.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        b0 b0Var = this.mImageHelper;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.mBackgroundTintHelper;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        b0 b0Var = this.mImageHelper;
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
        b0 b0Var = this.mImageHelper;
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

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q3.a(context);
        this.mHasLevel = false;
        p3.a(getContext(), this);
        r rVar = new r(this);
        this.mBackgroundTintHelper = rVar;
        rVar.d(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.mImageHelper = b0Var;
        b0Var.b(attributeSet, i10);
    }
}
