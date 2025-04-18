package m9;

import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class n extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final l f21686b;

    /* renamed from: c, reason: collision with root package name */
    public final p f21687c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21689f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21690g = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f21688d = new byte[1];

    public n(v0 v0Var, p pVar) {
        this.f21686b = v0Var;
        this.f21687c = pVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f21690g) {
            this.f21686b.close();
            this.f21690g = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f21688d;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        v8.u0.m(!this.f21690g);
        boolean z10 = this.f21689f;
        l lVar = this.f21686b;
        if (!z10) {
            lVar.a(this.f21687c);
            this.f21689f = true;
        }
        int read = lVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
