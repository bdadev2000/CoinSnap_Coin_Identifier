package androidx.compose.ui.graphics.painter;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.unit.IntSizeKt;

/* loaded from: classes4.dex */
public final class BitmapPainterKt {
    public static BitmapPainter a(AndroidImageBitmap androidImageBitmap, int i2) {
        Bitmap bitmap = androidImageBitmap.f14932a;
        BitmapPainter bitmapPainter = new BitmapPainter(androidImageBitmap, 0L, IntSizeKt.a(bitmap.getWidth(), bitmap.getHeight()));
        bitmapPainter.d = i2;
        return bitmapPainter;
    }
}
