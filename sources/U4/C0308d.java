package U4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: U4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0308d extends FilterInputStream {
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f3297c;

    public C0308d(InputStream inputStream) {
        super(inputStream);
        this.f3297c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i9) {
        ((FilterInputStream) this).in.mark(i9);
        this.f3297c = this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.b--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f3297c != -1) {
                ((FilterInputStream) this).in.reset();
                this.b = this.f3297c;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j7, this.b));
        this.b -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        long j7 = this.b;
        if (j7 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i9, (int) Math.min(i10, j7));
        if (read != -1) {
            this.b -= read;
        }
        return read;
    }
}
