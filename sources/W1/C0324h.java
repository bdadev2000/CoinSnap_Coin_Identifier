package W1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* renamed from: W1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324h extends AbstractC0321e {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(N1.f.f2087a);

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // W1.AbstractC0321e
    public final Bitmap c(Q1.a aVar, Bitmap bitmap, int i9, int i10) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = A.f3560a;
        if (bitmap.getWidth() != i9 || bitmap.getHeight() != i10) {
            Matrix matrix = new Matrix();
            float f9 = 0.0f;
            if (bitmap.getWidth() * i10 > bitmap.getHeight() * i9) {
                width = i10 / bitmap.getHeight();
                f9 = (i9 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i9 / bitmap.getWidth();
                height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f9 + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap k6 = aVar.k(i9, i10, config);
            k6.setHasAlpha(bitmap.hasAlpha());
            A.a(bitmap, k6, matrix);
            return k6;
        }
        return bitmap;
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        return obj instanceof C0324h;
    }

    @Override // N1.f
    public final int hashCode() {
        return -599754482;
    }
}
