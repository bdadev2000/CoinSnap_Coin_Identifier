package W1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i extends AbstractC0321e {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(N1.f.f2087a);

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // W1.AbstractC0321e
    public final Bitmap c(Q1.a aVar, Bitmap bitmap, int i9, int i10) {
        Paint paint = A.f3560a;
        if (bitmap.getWidth() <= i9 && bitmap.getHeight() <= i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return A.b(aVar, bitmap, i9, i10);
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // N1.f
    public final int hashCode() {
        return -670243078;
    }
}
