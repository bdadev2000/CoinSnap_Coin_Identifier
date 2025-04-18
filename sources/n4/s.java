package n4;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class s implements e4.f {
    @Override // e4.f
    public final int a(InputStream inputStream, h4.h hVar) {
        int c10 = new f1.g(inputStream).c();
        if (c10 == 0) {
            return -1;
        }
        return c10;
    }

    @Override // e4.f
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // e4.f
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // e4.f
    public final int d(ByteBuffer byteBuffer, h4.h hVar) {
        AtomicReference atomicReference = w4.b.a;
        return a(new w4.a(byteBuffer), hVar);
    }
}
