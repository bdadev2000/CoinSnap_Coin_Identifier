package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.util.ListUtilsKt;

/* loaded from: classes4.dex */
public final class PlatformTypefaces_androidKt {
    public static final android.graphics.Typeface a(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        ThreadLocal threadLocal = TypefaceCompatApi26.f17283a;
        if (typeface == null) {
            return null;
        }
        if (settings.f17262a.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = TypefaceCompatApi26.f17283a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(ListUtilsKt.a(settings.f17262a, null, new TypefaceCompatApi26$toAndroidString$1(AndroidDensity_androidKt.a(context)), 31));
        return paint.getTypeface();
    }
}
