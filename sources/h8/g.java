package h8;

import java.io.EOFException;
import n9.x;
import s7.x1;
import v8.u0;
import y7.m;

/* loaded from: classes3.dex */
public final class g {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public long f18892b;

    /* renamed from: c, reason: collision with root package name */
    public int f18893c;

    /* renamed from: d, reason: collision with root package name */
    public int f18894d;

    /* renamed from: e, reason: collision with root package name */
    public int f18895e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f18896f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final x f18897g = new x(255);

    public final boolean a(m mVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.f18892b = 0L;
        this.f18893c = 0;
        this.f18894d = 0;
        this.f18895e = 0;
        x xVar = this.f18897g;
        xVar.D(27);
        try {
            z11 = mVar.peekFully(xVar.a, 0, 27, z10);
        } catch (EOFException e2) {
            if (z10) {
                z11 = false;
            } else {
                throw e2;
            }
        }
        if (!z11 || xVar.w() != 1332176723) {
            return false;
        }
        if (xVar.v() != 0) {
            if (z10) {
                return false;
            }
            throw x1.c("unsupported bit stream revision");
        }
        this.a = xVar.v();
        this.f18892b = xVar.j();
        xVar.l();
        xVar.l();
        xVar.l();
        int v10 = xVar.v();
        this.f18893c = v10;
        this.f18894d = v10 + 27;
        xVar.D(v10);
        try {
            z12 = mVar.peekFully(xVar.a, 0, this.f18893c, z10);
        } catch (EOFException e10) {
            if (z10) {
                z12 = false;
            } else {
                throw e10;
            }
        }
        if (!z12) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18893c; i10++) {
            int v11 = xVar.v();
            this.f18896f[i10] = v11;
            this.f18895e += v11;
        }
        return true;
    }

    public final boolean b(m mVar, long j3) {
        boolean z10;
        boolean z11;
        if (mVar.getPosition() == mVar.getPeekPosition()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        x xVar = this.f18897g;
        xVar.D(4);
        while (true) {
            if (j3 != -1 && mVar.getPosition() + 4 >= j3) {
                break;
            }
            try {
                z11 = mVar.peekFully(xVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            xVar.G(0);
            if (xVar.w() == 1332176723) {
                mVar.resetPeekPosition();
                return true;
            }
            mVar.skipFully(1);
        }
        do {
            if (j3 != -1 && mVar.getPosition() >= j3) {
                break;
            }
        } while (mVar.skip(1) != -1);
        return false;
    }
}
