package v8;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o implements m9.l {
    public final m9.l a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26215b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f26216c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26217d;

    /* renamed from: e, reason: collision with root package name */
    public int f26218e;

    public o(m9.v0 v0Var, int i10, l0 l0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.a = v0Var;
        this.f26215b = i10;
        this.f26216c = l0Var;
        this.f26217d = new byte[1];
        this.f26218e = i10;
    }

    @Override // m9.l
    public final long a(m9.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // m9.l
    public final void c(m9.w0 w0Var) {
        w0Var.getClass();
        this.a.c(w0Var);
    }

    @Override // m9.l
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // m9.l
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // m9.l
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f26218e;
        m9.l lVar = this.a;
        if (i12 == 0) {
            byte[] bArr2 = this.f26217d;
            boolean z10 = false;
            if (lVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    int i15 = 0;
                    while (i14 > 0) {
                        int read = lVar.read(bArr3, i15, i14);
                        if (read == -1) {
                            break;
                        }
                        i15 += read;
                        i14 -= read;
                    }
                    while (i13 > 0) {
                        int i16 = i13 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i13 = i16;
                    }
                    if (i13 > 0) {
                        n9.x xVar = new n9.x(bArr3, i13);
                        l0 l0Var = this.f26216c;
                        if (!l0Var.f26209o) {
                            max = l0Var.f26206l;
                        } else {
                            max = Math.max(l0Var.f26210p.g(true), l0Var.f26206l);
                        }
                        int i17 = xVar.f22600c - xVar.f22599b;
                        y0 y0Var = l0Var.f26208n;
                        y0Var.getClass();
                        y0Var.a(i17, xVar);
                        y0Var.d(max, 1, i17, 0, null);
                        l0Var.f26209o = true;
                    }
                }
                z10 = true;
            }
            if (!z10) {
                return -1;
            }
            this.f26218e = this.f26215b;
        }
        int read2 = lVar.read(bArr, i10, Math.min(this.f26218e, i11));
        if (read2 != -1) {
            this.f26218e -= read2;
        }
        return read2;
    }
}
