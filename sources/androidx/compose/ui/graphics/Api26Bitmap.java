package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes4.dex */
public final class Api26Bitmap {
    @DoNotInline
    @NotNull
    public static final ColorSpace a(@NotNull Bitmap bitmap) {
        ColorSpace b2;
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (b2 = ColorSpaceVerificationHelper.b(colorSpace)) != null) {
            return b2;
        }
        float[] fArr = ColorSpaces.f15073a;
        return ColorSpaces.f15075c;
    }

    @DoNotInline
    @NotNull
    public static final Bitmap b(int i2, int i3, int i4, boolean z2, @NotNull ColorSpace colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, i2, i3, AndroidImageBitmap_androidKt.b(i4), z2, ColorSpaceVerificationHelper.a(colorSpace));
    }
}
