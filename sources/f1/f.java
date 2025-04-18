package f1;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f17550b.mark(Integer.MAX_VALUE);
    }

    public final void g(long j3) {
        int i10 = this.f17552d;
        if (i10 > j3) {
            this.f17552d = 0;
            this.f17550b.reset();
        } else {
            j3 -= i10;
        }
        d((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f17550b.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
