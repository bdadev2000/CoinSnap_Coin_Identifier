package W1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class E extends MediaDataSource {
    public final /* synthetic */ ByteBuffer b;

    public E(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j7, byte[] bArr, int i9, int i10) {
        ByteBuffer byteBuffer = this.b;
        if (j7 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j7);
        int min = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i9, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
