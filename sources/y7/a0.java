package y7;

import s7.r0;

/* loaded from: classes3.dex */
public interface a0 {
    void a(int i10, n9.x xVar);

    int b(m9.i iVar, int i10, boolean z10);

    default int c(m9.i iVar, int i10, boolean z10) {
        return b(iVar, i10, z10);
    }

    void d(long j3, int i10, int i11, int i12, z zVar);

    default void e(int i10, n9.x xVar) {
        a(i10, xVar);
    }

    void f(r0 r0Var);
}
