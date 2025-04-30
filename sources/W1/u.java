package W1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j2.AbstractC2384b;
import j2.C2383a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import m0.C2454c;
import m0.C2458g;

/* loaded from: classes.dex */
public final class u implements N1.e {
    @Override // N1.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // N1.e
    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // N1.e
    public final int c(InputStream inputStream, Q1.f fVar) {
        C2458g c2458g = new C2458g(inputStream);
        C2454c c9 = c2458g.c("Orientation");
        int i9 = 1;
        if (c9 != null) {
            try {
                i9 = c9.e(c2458g.f21700f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i9 == 0) {
            return -1;
        }
        return i9;
    }

    @Override // N1.e
    public final int d(ByteBuffer byteBuffer, Q1.f fVar) {
        AtomicReference atomicReference = AbstractC2384b.f21014a;
        return c(new C2383a(byteBuffer), fVar);
    }
}
