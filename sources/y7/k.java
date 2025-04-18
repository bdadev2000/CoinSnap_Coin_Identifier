package y7;

import java.io.EOFException;
import s7.r0;

/* loaded from: classes3.dex */
public final class k implements a0 {
    public final byte[] a = new byte[4096];

    @Override // y7.a0
    public final void a(int i10, n9.x xVar) {
        xVar.H(i10);
    }

    @Override // y7.a0
    public final int b(m9.i iVar, int i10, boolean z10) {
        byte[] bArr = this.a;
        int read = iVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // y7.a0
    public final void d(long j3, int i10, int i11, int i12, z zVar) {
    }

    @Override // y7.a0
    public final void f(r0 r0Var) {
    }
}
