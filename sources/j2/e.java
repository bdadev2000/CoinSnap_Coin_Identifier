package j2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f21017d;
    public InputStream b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f21018c;

    static {
        char[] cArr = n.f21025a;
        f21017d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i9) {
        this.b.mark(i9);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.b.read();
        } catch (IOException e4) {
            this.f21018c = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        try {
            return this.b.skip(j7);
        } catch (IOException e4) {
            this.f21018c = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.b.read(bArr);
        } catch (IOException e4) {
            this.f21018c = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        try {
            return this.b.read(bArr, i9, i10);
        } catch (IOException e4) {
            this.f21018c = e4;
            throw e4;
        }
    }
}
