package ki;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f20955c;

    public c(j0 j0Var, a0 a0Var) {
        this.f20954b = j0Var;
        this.f20955c = a0Var;
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        mi.a.c(source.f20994c, 0L, j3);
        while (true) {
            long j10 = 0;
            if (j3 > 0) {
                f0 f0Var = source.f20993b;
                Intrinsics.checkNotNull(f0Var);
                while (true) {
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += f0Var.f20980c - f0Var.f20979b;
                    if (j10 >= j3) {
                        j10 = j3;
                        break;
                    } else {
                        f0Var = f0Var.f20983f;
                        Intrinsics.checkNotNull(f0Var);
                    }
                }
                i0 i0Var = this.f20955c;
                e eVar = this.f20954b;
                eVar.h();
                try {
                    i0Var.a(source, j10);
                    Unit unit = Unit.INSTANCE;
                    if (!eVar.i()) {
                        j3 -= j10;
                    } else {
                        throw eVar.j(null);
                    }
                } catch (IOException e2) {
                    if (!eVar.i()) {
                        throw e2;
                    }
                    throw eVar.j(e2);
                } finally {
                    eVar.i();
                }
            } else {
                return;
            }
        }
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i0 i0Var = this.f20955c;
        e eVar = this.f20954b;
        eVar.h();
        try {
            i0Var.close();
            Unit unit = Unit.INSTANCE;
            if (!eVar.i()) {
            } else {
                throw eVar.j(null);
            }
        } catch (IOException e2) {
            if (!eVar.i()) {
                throw e2;
            }
            throw eVar.j(e2);
        } finally {
            eVar.i();
        }
    }

    @Override // ki.i0, java.io.Flushable
    public final void flush() {
        i0 i0Var = this.f20955c;
        e eVar = this.f20954b;
        eVar.h();
        try {
            i0Var.flush();
            Unit unit = Unit.INSTANCE;
            if (!eVar.i()) {
            } else {
                throw eVar.j(null);
            }
        } catch (IOException e2) {
            if (!eVar.i()) {
                throw e2;
            }
            throw eVar.j(e2);
        } finally {
            eVar.i();
        }
    }

    @Override // ki.i0
    public final m0 timeout() {
        return this.f20954b;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f20955c + ')';
    }
}
