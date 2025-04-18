package androidx.compose.ui.text.font;

import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
@VisibleForTesting
/* loaded from: classes4.dex */
public final class PlatformTypefacesApi28 implements PlatformTypefaces {
    public static android.graphics.Typeface c(String str, FontWeight fontWeight, int i2) {
        android.graphics.Typeface create;
        if (FontStyle.a(i2, 0) && a.g(fontWeight, FontWeight.f17269i) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        create = android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.f17274a, FontStyle.a(i2, 1));
        return create;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2) {
        return c(genericFontFamily.f17276c, fontWeight, i2);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface b(FontWeight fontWeight, int i2) {
        return c(null, fontWeight, i2);
    }
}
