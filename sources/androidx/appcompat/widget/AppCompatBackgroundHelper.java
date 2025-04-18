package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
class AppCompatBackgroundHelper {

    /* renamed from: a, reason: collision with root package name */
    public final View f937a;
    public TintInfo d;
    public TintInfo e;

    /* renamed from: f, reason: collision with root package name */
    public TintInfo f940f;

    /* renamed from: c, reason: collision with root package name */
    public int f939c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatDrawableManager f938b = AppCompatDrawableManager.a();

    public AppCompatBackgroundHelper(View view) {
        this.f937a = view;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, androidx.appcompat.widget.TintInfo] */
    public final void a() {
        View view = this.f937a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f940f == null) {
                    this.f940f = new Object();
                }
                TintInfo tintInfo = this.f940f;
                tintInfo.f1233a = null;
                tintInfo.d = false;
                tintInfo.f1234b = null;
                tintInfo.f1235c = false;
                ColorStateList i2 = ViewCompat.i(view);
                if (i2 != null) {
                    tintInfo.d = true;
                    tintInfo.f1233a = i2;
                }
                PorterDuff.Mode j2 = ViewCompat.j(view);
                if (j2 != null) {
                    tintInfo.f1235c = true;
                    tintInfo.f1234b = j2;
                }
                if (tintInfo.d || tintInfo.f1235c) {
                    AppCompatDrawableManager.e(background, tintInfo, view.getDrawableState());
                    return;
                }
            }
            TintInfo tintInfo2 = this.e;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.e(background, tintInfo2, view.getDrawableState());
                return;
            }
            TintInfo tintInfo3 = this.d;
            if (tintInfo3 != null) {
                AppCompatDrawableManager.e(background, tintInfo3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.f1233a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.f1234b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList g2;
        View view = this.f937a;
        Context context = view.getContext();
        int[] iArr = R.styleable.A;
        TintTypedArray e = TintTypedArray.e(context, attributeSet, iArr, i2);
        TypedArray typedArray = e.f1237b;
        View view2 = this.f937a;
        ViewCompat.z(view2, view2.getContext(), iArr, attributeSet, e.f1237b, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f939c = typedArray.getResourceId(0, -1);
                AppCompatDrawableManager appCompatDrawableManager = this.f938b;
                Context context2 = view.getContext();
                int i3 = this.f939c;
                synchronized (appCompatDrawableManager) {
                    g2 = appCompatDrawableManager.f971a.g(i3, context2);
                }
                if (g2 != null) {
                    g(g2);
                }
            }
            if (typedArray.hasValue(1)) {
                ViewCompat.D(view, e.a(1));
            }
            if (typedArray.hasValue(2)) {
                ViewCompat.E(view, DrawableUtils.c(typedArray.getInt(2, -1), null));
            }
            e.f();
        } catch (Throwable th) {
            e.f();
            throw th;
        }
    }

    public final void e() {
        this.f939c = -1;
        g(null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateList;
        this.f939c = i2;
        AppCompatDrawableManager appCompatDrawableManager = this.f938b;
        if (appCompatDrawableManager != null) {
            Context context = this.f937a.getContext();
            synchronized (appCompatDrawableManager) {
                colorStateList = appCompatDrawableManager.f971a.g(i2, context);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.TintInfo] */
    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new Object();
            }
            TintInfo tintInfo = this.d;
            tintInfo.f1233a = colorStateList;
            tintInfo.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.TintInfo] */
    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new Object();
        }
        TintInfo tintInfo = this.e;
        tintInfo.f1233a = colorStateList;
        tintInfo.d = true;
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.widget.TintInfo] */
    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new Object();
        }
        TintInfo tintInfo = this.e;
        tintInfo.f1234b = mode;
        tintInfo.f1235c = true;
        a();
    }
}
