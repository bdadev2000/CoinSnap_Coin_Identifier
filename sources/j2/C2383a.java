package j2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2383a extends InputStream {
    public final ByteBuffer b;

    /* renamed from: c, reason: collision with root package name */
    public int f21013c = -1;

    public C2383a(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i9) {
        this.f21013c = this.b.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i9 = this.f21013c;
        if (i9 != -1) {
            this.b.position(i9);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        ByteBuffer byteBuffer = this.b;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j7, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        ByteBuffer byteBuffer = this.b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i9, min);
        return min;
    }
}
