package b1;

/* loaded from: classes2.dex */
public final class r0 extends l1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22368f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22369g;

    public r0(Object obj, int i2) {
        this.f22368f = i2;
        this.f22369g = obj;
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        d0.b0 b0Var = d0.b0.f30125a;
        switch (this.f22368f) {
            case 0:
                y((Throwable) obj);
                return b0Var;
            case 1:
                y((Throwable) obj);
                return b0Var;
            case 2:
                y((Throwable) obj);
                return b0Var;
            default:
                y((Throwable) obj);
                return b0Var;
        }
    }

    @Override // b1.l1
    public final void y(Throwable th) {
        int i2 = this.f22368f;
        Object obj = this.f22369g;
        switch (i2) {
            case 0:
                ((q0) obj).dispose();
                return;
            case 1:
                ((q0.l) obj).invoke(th);
                return;
            case 2:
                Object T = x().T();
                if (T instanceof u) {
                    ((l) obj).resumeWith(kotlin.jvm.internal.q.d(((u) T).f22378a));
                    return;
                } else {
                    ((l) obj).resumeWith(f0.I(T));
                    return;
                }
            default:
                ((h0.g) obj).resumeWith(d0.b0.f30125a);
                return;
        }
    }
}
