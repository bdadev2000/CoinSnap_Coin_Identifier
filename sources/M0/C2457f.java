package m0;

import java.io.InputStream;

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2457f extends C2453b {
    public C2457f(byte[] bArr) {
        super(bArr);
        this.b.mark(Integer.MAX_VALUE);
    }

    public final void b(long j7) {
        int i9 = this.f21659d;
        if (i9 > j7) {
            this.f21659d = 0;
            this.b.reset();
        } else {
            j7 -= i9;
        }
        a((int) j7);
    }

    public C2457f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.b.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
