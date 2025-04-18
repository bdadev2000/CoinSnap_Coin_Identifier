package w4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final long f26727b;

    /* renamed from: c, reason: collision with root package name */
    public int f26728c;

    public d(InputStream inputStream, long j3) {
        super(inputStream);
        this.f26727b = j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f26727b - this.f26728c, ((FilterInputStream) this).in.available());
    }

    public final void d(int i10) {
        if (i10 >= 0) {
            this.f26728c += i10;
            return;
        }
        long j3 = this.f26728c;
        long j10 = this.f26727b;
        if (j10 - j3 <= 0) {
            return;
        }
        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Failed to read all expected data, expected: ", j10, ", but read: ");
        o10.append(this.f26728c);
        throw new IOException(o10.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        d(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        d(read);
        return read;
    }
}
