package h;

import com.google.common.primitives.Ints;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class l extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f30681a;

    /* renamed from: b, reason: collision with root package name */
    public int f30682b = Ints.MAX_POWER_OF_TWO;

    public l(InputStream inputStream) {
        this.f30681a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f30682b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30681a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f30681a.read();
        if (read == -1) {
            this.f30682b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        return this.f30681a.skip(j2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f30681a.read(bArr);
        if (read == -1) {
            this.f30682b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f30681a.read(bArr, i2, i3);
        if (read == -1) {
            this.f30682b = 0;
        }
        return read;
    }
}
