package w4;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f26736b;

    public j(e eVar) {
        super(eVar);
        this.f26736b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i10 = this.f26736b;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public final long d(long j3) {
        int i10 = this.f26736b;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j3 <= ((long) i10)) ? j3 : i10;
    }

    public final void g(long j3) {
        int i10 = this.f26736b;
        if (i10 != Integer.MIN_VALUE && j3 != -1) {
            this.f26736b = (int) (i10 - j3);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f26736b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (d(1L) == -1) {
            return -1;
        }
        int read = super.read();
        g(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f26736b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j3) {
        long d10 = d(j3);
        if (d10 == -1) {
            return 0L;
        }
        long skip = super.skip(d10);
        g(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int d10 = (int) d(i11);
        if (d10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, d10);
        g(read);
        return read;
    }
}
