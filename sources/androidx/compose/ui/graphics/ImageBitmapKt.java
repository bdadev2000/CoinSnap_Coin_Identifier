package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;

/* loaded from: classes4.dex */
public final class ImageBitmapKt {
    public static AndroidImageBitmap a(int i2, int i3, int i4) {
        Rgb rgb = ColorSpaces.f15075c;
        AndroidImageBitmap_androidKt.b(i4);
        return new AndroidImageBitmap(Api26Bitmap.b(i2, i3, i4, true, rgb));
    }
}
