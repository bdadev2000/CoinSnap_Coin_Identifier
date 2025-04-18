package v8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class m0 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f26211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f26212c;

    public m0(p0 p0Var, int i10) {
        this.f26212c = p0Var;
        this.f26211b = i10;
    }

    @Override // v8.z0
    public final int d(r4.c cVar, w7.i iVar, int i10) {
        p0 p0Var = this.f26212c;
        if (p0Var.p()) {
            return -3;
        }
        int i11 = this.f26211b;
        p0Var.j(i11);
        int s5 = p0Var.u[i11].s(cVar, iVar, i10, p0Var.M);
        if (s5 == -3) {
            p0Var.k(i11);
        }
        return s5;
    }

    @Override // v8.z0
    public final boolean isReady() {
        p0 p0Var = this.f26212c;
        if (!p0Var.p() && p0Var.u[this.f26211b].p(p0Var.M)) {
            return true;
        }
        return false;
    }

    @Override // v8.z0
    public final void maybeThrowError() {
        p0 p0Var = this.f26212c;
        y0 y0Var = p0Var.u[this.f26211b];
        x7.n nVar = y0Var.f26328h;
        if (nVar != null && nVar.getState() == 1) {
            x7.m error = y0Var.f26328h.getError();
            error.getClass();
            throw error;
        }
        int i10 = p0Var.f26226f.i(p0Var.D);
        m9.n0 n0Var = p0Var.f26233m;
        IOException iOException = n0Var.f21695d;
        if (iOException == null) {
            m9.j0 j0Var = n0Var.f21694c;
            if (j0Var != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = j0Var.f21674b;
                }
                IOException iOException2 = j0Var.f21678g;
                if (iOException2 != null && j0Var.f21679h > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // v8.z0
    public final int skipData(long j3) {
        p0 p0Var = this.f26212c;
        if (p0Var.p()) {
            return 0;
        }
        int i10 = this.f26211b;
        p0Var.j(i10);
        y0 y0Var = p0Var.u[i10];
        int o10 = y0Var.o(j3, p0Var.M);
        y0Var.v(o10);
        if (o10 == 0) {
            p0Var.k(i10);
            return o10;
        }
        return o10;
    }
}
