package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i3 {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f874b;

    /* renamed from: c, reason: collision with root package name */
    public Object f875c;

    public i3(Context context, TypedArray typedArray) {
        this.a = context;
        this.f874b = typedArray;
    }

    public static i3 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new i3(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void n() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public final boolean a(int i10, boolean z10) {
        return ((TypedArray) this.f874b).getBoolean(i10, z10);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        Object obj = this.f874b;
        if (((TypedArray) obj).hasValue(i10) && (resourceId = ((TypedArray) obj).getResourceId(i10, 0)) != 0 && (colorStateList = d0.h.getColorStateList((Context) this.a, resourceId)) != null) {
            return colorStateList;
        }
        return ((TypedArray) obj).getColorStateList(i10);
    }

    public final int c(int i10, int i11) {
        return ((TypedArray) this.f874b).getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return ((TypedArray) this.f874b).getDimensionPixelSize(i10, i11);
    }

    public final Drawable e(int i10) {
        int resourceId;
        Object obj = this.f874b;
        if (((TypedArray) obj).hasValue(i10) && (resourceId = ((TypedArray) obj).getResourceId(i10, 0)) != 0) {
            return com.bumptech.glide.c.t((Context) this.a, resourceId);
        }
        return ((TypedArray) obj).getDrawable(i10);
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f874b).hasValue(i10) && (resourceId = ((TypedArray) this.f874b).getResourceId(i10, 0)) != 0) {
            w a = w.a();
            Context context = (Context) this.a;
            synchronized (a) {
                f10 = a.a.f(context, resourceId, true);
            }
            return f10;
        }
        return null;
    }

    public final Typeface g(int i10, int i11, w0 w0Var) {
        int resourceId = ((TypedArray) this.f874b).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f875c) == null) {
            this.f875c = new TypedValue();
        }
        Context context = (Context) this.a;
        TypedValue typedValue = (TypedValue) this.f875c;
        ThreadLocal threadLocal = f0.q.a;
        if (context.isRestricted()) {
            return null;
        }
        return f0.q.a(context, resourceId, typedValue, i11, w0Var, true, false);
    }

    public final int h(int i10, int i11) {
        return ((TypedArray) this.f874b).getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return ((TypedArray) this.f874b).getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return ((TypedArray) this.f874b).getString(i10);
    }

    public final CharSequence k(int i10) {
        return ((TypedArray) this.f874b).getText(i10);
    }

    public final boolean l(int i10) {
        return ((TypedArray) this.f874b).hasValue(i10);
    }

    public final void o() {
        ((TypedArray) this.f874b).recycle();
    }

    public i3() {
        this.a = null;
        this.f874b = null;
        this.f875c = null;
        n();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f874b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f875c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }
}
