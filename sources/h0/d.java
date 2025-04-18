package h0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* loaded from: classes.dex */
public abstract class d {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        d2.a.D();
        return d2.a.k(drawable, drawable2);
    }

    public static Icon b(Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }
}
