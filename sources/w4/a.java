package w4;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f26724b;

    /* renamed from: c, reason: collision with root package name */
    public int f26725c = -1;

    public a(ByteBuffer byteBuffer) {
        this.f26724b = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f26724b.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f26725c = this.f26724b.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f26724b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & UByte.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i10 = this.f26725c;
        if (i10 != -1) {
            this.f26724b.position(i10);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j3) {
        ByteBuffer byteBuffer = this.f26724b;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j3, available());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f26724b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i11, available());
        byteBuffer.get(bArr, i10, min);
        return min;
    }
}
