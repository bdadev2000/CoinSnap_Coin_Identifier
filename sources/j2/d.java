package j2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public int f21016c;

    public d(InputStream inputStream, long j7) {
        super(inputStream);
        this.b = j7;
    }

    public final void a(int i9) {
        if (i9 >= 0) {
            this.f21016c += i9;
            return;
        }
        long j7 = this.f21016c;
        long j9 = this.b;
        if (j9 - j7 <= 0) {
            return;
        }
        StringBuilder a6 = AbstractC2933a.a("Failed to read all expected data, expected: ", j9, ", but read: ");
        a6.append(this.f21016c);
        throw new IOException(a6.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.b - this.f21016c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i9, int i10) {
        int read;
        read = super.read(bArr, i9, i10);
        a(read);
        return read;
    }
}
