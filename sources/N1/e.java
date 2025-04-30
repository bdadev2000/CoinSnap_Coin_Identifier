package N1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface e {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    ImageHeaderParser$ImageType b(InputStream inputStream);

    int c(InputStream inputStream, Q1.f fVar);

    int d(ByteBuffer byteBuffer, Q1.f fVar);
}
