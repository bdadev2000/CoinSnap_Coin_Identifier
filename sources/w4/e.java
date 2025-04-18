package w4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f26729d;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f26730b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f26731c;

    static {
        char[] cArr = m.a;
        f26729d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f26730b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26730b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f26730b.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f26730b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f26730b.read();
        } catch (IOException e2) {
            this.f26731c = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f26730b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j3) {
        try {
            return this.f26730b.skip(j3);
        } catch (IOException e2) {
            this.f26731c = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f26730b.read(bArr);
        } catch (IOException e2) {
            this.f26731c = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f26730b.read(bArr, i10, i11);
        } catch (IOException e2) {
            this.f26731c = e2;
            throw e2;
        }
    }
}
