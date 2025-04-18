package yb;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class b extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f28144b = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f28144b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f28144b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f28144b += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
