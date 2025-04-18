package androidx.compose.ui.text.font;

import androidx.annotation.VisibleForTesting;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes4.dex */
public final class PlatformTypefacesApi implements PlatformTypefaces {
    public static android.graphics.Typeface c(String str, FontWeight fontWeight, int i2) {
        if (FontStyle.a(i2, 0) && a.g(fontWeight, FontWeight.f17269i) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int a2 = AndroidFontUtils_androidKt.a(fontWeight, i2);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(a2) : android.graphics.Typeface.create(str, a2);
    }

    public static android.graphics.Typeface d(String str, FontWeight fontWeight, int i2) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface c2 = c(str, fontWeight, i2);
        if (a.g(c2, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.a(fontWeight, i2))) || a.g(c2, c(null, fontWeight, i2))) {
            return null;
        }
        return c2;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2) {
        String str = genericFontFamily.f17276c;
        int i3 = fontWeight.f17274a / 100;
        if (i3 >= 0 && i3 < 2) {
            str = androidx.compose.foundation.text.input.a.j(str, "-thin");
        } else if (2 <= i3 && i3 < 4) {
            str = androidx.compose.foundation.text.input.a.j(str, "-light");
        } else if (i3 != 4) {
            if (i3 == 5) {
                str = androidx.compose.foundation.text.input.a.j(str, "-medium");
            } else if ((6 > i3 || i3 >= 8) && 8 <= i3 && i3 < 11) {
                str = androidx.compose.foundation.text.input.a.j(str, "-black");
            }
        }
        android.graphics.Typeface d = d(str, fontWeight, i2);
        return d == null ? c(genericFontFamily.f17276c, fontWeight, i2) : d;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface b(FontWeight fontWeight, int i2) {
        return c(null, fontWeight, i2);
    }
}
