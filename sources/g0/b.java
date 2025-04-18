package g0;

import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ BlendMode d(Object obj) {
        return (BlendMode) obj;
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder f(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ Font.Builder g(Resources resources, int i10) {
        return new Font.Builder(resources, i10);
    }

    public static /* synthetic */ Font.Builder i(ParcelFileDescriptor parcelFileDescriptor) {
        return new Font.Builder(parcelFileDescriptor);
    }

    public static /* synthetic */ FontFamily.Builder l(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ FontStyle m(int i10, int i11) {
        return new FontStyle(i10, i11);
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void y() {
    }
}
