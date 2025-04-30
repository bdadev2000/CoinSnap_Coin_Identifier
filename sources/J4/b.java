package J4;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b extends OutputStream {
    public long b;

    @Override // java.io.OutputStream
    public final void write(int i9) {
        this.b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) {
        int i11;
        if (i9 >= 0 && i9 <= bArr.length && i10 >= 0 && (i11 = i9 + i10) <= bArr.length && i11 >= 0) {
            this.b += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
