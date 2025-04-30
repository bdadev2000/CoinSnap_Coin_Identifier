package V1;

import android.app.Person;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ Person d(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source i(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable k(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable l(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ Drawable m(ImageDecoder.Source source, d dVar) {
        return ImageDecoder.decodeDrawable(source, dVar);
    }

    public static /* bridge */ /* synthetic */ void w(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean x(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }
}
