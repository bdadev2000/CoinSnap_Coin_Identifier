package j2;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class k extends FilterInputStream {
    public int b;

    public k(e eVar) {
        super(eVar);
        this.b = Integer.MIN_VALUE;
    }

    public final long a(long j7) {
        int i9 = this.b;
        if (i9 == 0) {
            return -1L;
        }
        if (i9 != Integer.MIN_VALUE && j7 > i9) {
            return i9;
        }
        return j7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i9 = this.b;
        if (i9 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i9, super.available());
    }

    public final void b(long j7) {
        int i9 = this.b;
        if (i9 != Integer.MIN_VALUE && j7 != -1) {
            this.b = (int) (i9 - j7);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i9) {
        super.mark(i9);
        this.b = i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) {
        long a6 = a(j7);
        if (a6 == -1) {
            return 0L;
        }
        long skip = super.skip(a6);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        int a6 = (int) a(i10);
        if (a6 == -1) {
            return -1;
        }
        int read = super.read(bArr, i9, a6);
        b(read);
        return read;
    }
}
