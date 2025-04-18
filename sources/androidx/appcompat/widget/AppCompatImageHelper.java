package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

@RestrictTo
/* loaded from: classes2.dex */
public class AppCompatImageHelper {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f987a;

    /* renamed from: b, reason: collision with root package name */
    public TintInfo f988b;

    /* renamed from: c, reason: collision with root package name */
    public int f989c = 0;

    public AppCompatImageHelper(ImageView imageView) {
        this.f987a = imageView;
    }

    public final void a() {
        TintInfo tintInfo;
        ImageView imageView = this.f987a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableUtils.a(drawable);
        }
        if (drawable == null || (tintInfo = this.f988b) == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = this.f987a;
        Context context = imageView.getContext();
        int[] iArr = R.styleable.f314f;
        TintTypedArray e = TintTypedArray.e(context, attributeSet, iArr, i2);
        ViewCompat.z(imageView, imageView.getContext(), iArr, attributeSet, e.f1237b, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = e.f1237b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AppCompatResources.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                ImageViewCompat.a(imageView, e.a(2));
            }
            if (typedArray.hasValue(3)) {
                ImageViewCompat.b(imageView, DrawableUtils.c(typedArray.getInt(3, -1), null));
            }
            e.f();
        } catch (Throwable th) {
            e.f();
            throw th;
        }
    }

    public final void c(int i2) {
        ImageView imageView = this.f987a;
        if (i2 != 0) {
            Drawable a2 = AppCompatResources.a(imageView.getContext(), i2);
            if (a2 != null) {
                DrawableUtils.a(a2);
            }
            imageView.setImageDrawable(a2);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
