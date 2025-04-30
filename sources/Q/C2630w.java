package q;

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

/* renamed from: q.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2630w extends ImageButton {
    public final C2617p b;

    /* renamed from: c, reason: collision with root package name */
    public final C2632x f22738c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2630w(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        P0.a(context);
        this.f22739d = false;
        O0.a(this, getContext());
        C2617p c2617p = new C2617p(this);
        this.b = c2617p;
        c2617p.d(attributeSet, i9);
        C2632x c2632x = new C2632x(this);
        this.f22738c = c2632x;
        c2632x.b(attributeSet, i9);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.a();
        }
        C2632x c2632x = this.f22738c;
        if (c2632x != null) {
            c2632x.a();
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
    public ColorStateList getSupportImageTintList() {
        com.facebook.A a6;
        C2632x c2632x = this.f22738c;
        if (c2632x == null || (a6 = c2632x.b) == null) {
            return null;
        }
        return (ColorStateList) a6.f13377c;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        com.facebook.A a6;
        C2632x c2632x = this.f22738c;
        if (c2632x == null || (a6 = c2632x.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) a6.f13378d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f22738c.f22740a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2632x c2632x = this.f22738c;
        if (c2632x != null) {
            c2632x.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        C2632x c2632x = this.f22738c;
        if (c2632x != null && drawable != null && !this.f22739d) {
            c2632x.f22741c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c2632x != null) {
            c2632x.a();
            if (!this.f22739d) {
                ImageView imageView = c2632x.f22740a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c2632x.f22741c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i9) {
        super.setImageLevel(i9);
        this.f22739d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        C2632x c2632x = this.f22738c;
        ImageView imageView = c2632x.f22740a;
        if (i9 != 0) {
            Drawable g9 = com.facebook.appevents.n.g(imageView.getContext(), i9);
            if (g9 != null) {
                AbstractC2610l0.a(g9);
            }
            imageView.setImageDrawable(g9);
        } else {
            imageView.setImageDrawable(null);
        }
        c2632x.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        C2632x c2632x = this.f22738c;
        if (c2632x != null) {
            c2632x.a();
        }
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

    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.A, java.lang.Object] */
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        C2632x c2632x = this.f22738c;
        if (c2632x != null) {
            if (c2632x.b == null) {
                c2632x.b = new Object();
            }
            com.facebook.A a6 = c2632x.b;
            a6.f13377c = colorStateList;
            a6.b = true;
            c2632x.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.A, java.lang.Object] */
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        C2632x c2632x = this.f22738c;
        if (c2632x != null) {
            if (c2632x.b == null) {
                c2632x.b = new Object();
            }
            com.facebook.A a6 = c2632x.b;
            a6.f13378d = mode;
            a6.f13376a = true;
            c2632x.a();
        }
    }
}
