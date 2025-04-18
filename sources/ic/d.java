package ic;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class d extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f19535b;

    /* renamed from: c, reason: collision with root package name */
    public long f19536c;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f19536c = -1L;
        this.f19535b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f19535b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f19536c = this.f19535b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f19535b == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f19535b--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f19536c != -1) {
                ((FilterInputStream) this).in.reset();
                this.f19535b = this.f19536c;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j3) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j3, this.f19535b));
        this.f19535b -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j3 = this.f19535b;
        if (j3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j3));
        if (read != -1) {
            this.f19535b -= read;
        }
        return read;
    }
}
