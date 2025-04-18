package androidx.compose.ui.graphics;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class AndroidImageBitmap_androidKt {
    public static final Bitmap a(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).f14932a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config b(int i2) {
        return ImageBitmapConfig.a(i2, 0) ? Bitmap.Config.ARGB_8888 : ImageBitmapConfig.a(i2, 1) ? Bitmap.Config.ALPHA_8 : ImageBitmapConfig.a(i2, 2) ? Bitmap.Config.RGB_565 : ImageBitmapConfig.a(i2, 3) ? Bitmap.Config.RGBA_F16 : ImageBitmapConfig.a(i2, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
