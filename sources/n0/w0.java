package n0;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public abstract /* synthetic */ class w0 {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source d(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable f(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ View.OnUnhandledKeyEventListener i(Object obj) {
        return (View.OnUnhandledKeyEventListener) obj;
    }

    public static /* bridge */ /* synthetic */ void w(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean x(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
