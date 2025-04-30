package W1;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class v extends AbstractC0321e {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(N1.f.f2087a);

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // W1.AbstractC0321e
    public final Bitmap c(Q1.a aVar, Bitmap bitmap, int i9, int i10) {
        return A.b(aVar, bitmap, i9, i10);
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        return obj instanceof v;
    }

    @Override // N1.f
    public final int hashCode() {
        return 1572326941;
    }
}
