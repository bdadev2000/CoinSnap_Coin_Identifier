package n4;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class t extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f22439b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(e4.j.a);

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f22439b);
    }

    @Override // n4.e
    public final Bitmap c(h4.d dVar, Bitmap bitmap, int i10, int i11) {
        return y.b(dVar, bitmap, i10, i11);
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // e4.j
    public final int hashCode() {
        return 1572326941;
    }
}
