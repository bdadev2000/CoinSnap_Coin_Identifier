package n4;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c0 extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f22405b;

    public c0(ByteBuffer byteBuffer) {
        this.f22405b = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f22405b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f22405b;
        if (j3 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j3);
        int min = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, min);
        return min;
    }
}
