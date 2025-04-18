package i4;

import g4.g0;
import g4.r;
import java.util.ArrayDeque;
import k4.w;

/* loaded from: classes.dex */
public final class e extends w4.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19143d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f19144e;

    public e(long j3) {
        super(j3);
    }

    @Override // w4.i
    public final int b(Object obj) {
        switch (this.f19143d) {
            case 0:
                g0 g0Var = (g0) obj;
                if (g0Var == null) {
                    return 1;
                }
                return g0Var.getSize();
            default:
                return 1;
        }
    }

    @Override // w4.i
    public final void c(Object obj, Object obj2) {
        switch (this.f19143d) {
            case 0:
                g0 g0Var = (g0) obj2;
                f fVar = (f) this.f19144e;
                if (fVar != null && g0Var != null) {
                    ((r) fVar).f18149e.d(g0Var, true);
                    return;
                }
                return;
            default:
                w wVar = (w) obj;
                wVar.getClass();
                ArrayDeque arrayDeque = w.f20267d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(wVar);
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v3.c cVar) {
        super(500L);
        this.f19144e = cVar;
    }
}
