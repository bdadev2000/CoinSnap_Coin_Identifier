package g1;

/* loaded from: classes2.dex */
public class y extends b1.a implements j0.d {
    public final h0.g d;

    public y(h0.g gVar, h0.l lVar) {
        super(lVar, true);
        this.d = gVar;
    }

    @Override // b1.r1
    public final boolean X() {
        return true;
    }

    @Override // j0.d
    public final j0.d getCallerFrame() {
        h0.g gVar = this.d;
        if (gVar instanceof j0.d) {
            return (j0.d) gVar;
        }
        return null;
    }

    @Override // b1.r1
    public void p(Object obj) {
        a.c(b1.f0.r(this.d), kotlin.jvm.internal.e.x(obj), null);
    }

    @Override // b1.r1
    public void r(Object obj) {
        this.d.resumeWith(kotlin.jvm.internal.e.x(obj));
    }
}
