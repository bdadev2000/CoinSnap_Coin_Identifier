package lb;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class i extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f21310b;

    /* renamed from: c, reason: collision with root package name */
    public int f21311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f21312d;

    public i(k kVar, h hVar) {
        this.f21312d = kVar;
        this.f21310b = kVar.u(hVar.a + 4);
        this.f21311c = hVar.f21309b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f21311c;
                if (i12 <= 0) {
                    return -1;
                }
                if (i11 > i12) {
                    i11 = i12;
                }
                int i13 = this.f21310b;
                k kVar = this.f21312d;
                kVar.r(i13, i10, i11, bArr);
                this.f21310b = kVar.u(this.f21310b + i11);
                this.f21311c -= i11;
                return i11;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f21311c == 0) {
            return -1;
        }
        k kVar = this.f21312d;
        kVar.f21314b.seek(this.f21310b);
        int read = kVar.f21314b.read();
        this.f21310b = kVar.u(this.f21310b + 1);
        this.f21311c--;
        return read;
    }
}
