package v4;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class i extends InputStream {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f23619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f23620d;

    public i(k kVar, h hVar) {
        this.f23620d = kVar;
        this.b = kVar.n(hVar.f23618a + 4);
        this.f23619c = hVar.b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        if (bArr != null) {
            if ((i9 | i10) >= 0 && i10 <= bArr.length - i9) {
                int i11 = this.f23619c;
                if (i11 <= 0) {
                    return -1;
                }
                if (i10 > i11) {
                    i10 = i11;
                }
                int i12 = this.b;
                k kVar = this.f23620d;
                kVar.k(i12, bArr, i9, i10);
                this.b = kVar.n(this.b + i10);
                this.f23619c -= i10;
                return i10;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f23619c == 0) {
            return -1;
        }
        k kVar = this.f23620d;
        kVar.b.seek(this.b);
        int read = kVar.b.read();
        this.b = kVar.n(this.b + 1);
        this.f23619c--;
        return read;
    }
}
