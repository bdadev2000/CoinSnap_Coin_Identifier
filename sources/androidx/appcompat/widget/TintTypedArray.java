package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo
/* loaded from: classes2.dex */
public class TintTypedArray {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1236a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f1237b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1238c;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        @DoNotInline
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        public static int b(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f1236a = context;
        this.f1237b = typedArray;
    }

    public static TintTypedArray e(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public final ColorStateList a(int i2) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f1237b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(this.f1236a, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public final Drawable b(int i2) {
        int resourceId;
        TypedArray typedArray = this.f1237b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AppCompatResources.a(this.f1236a, resourceId);
    }

    public final Drawable c(int i2) {
        int resourceId;
        Drawable e;
        if (!this.f1237b.hasValue(i2) || (resourceId = this.f1237b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager a2 = AppCompatDrawableManager.a();
        Context context = this.f1236a;
        synchronized (a2) {
            e = a2.f971a.e(context, resourceId, true);
        }
        return e;
    }

    public final Typeface d(int i2, int i3, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f1237b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1238c == null) {
            this.f1238c = new TypedValue();
        }
        TypedValue typedValue = this.f1238c;
        ThreadLocal threadLocal = ResourcesCompat.f18503a;
        Context context = this.f1236a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.e(context, resourceId, typedValue, i3, fontCallback, true, false);
    }

    public final void f() {
        this.f1237b.recycle();
    }
}
