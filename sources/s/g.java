package s;

/* loaded from: classes.dex */
public final class g extends a {
    public g() {
        super(0);
    }

    @Override // s.a
    public final boolean e(i iVar, e eVar, e eVar2) {
        synchronized (iVar) {
            if (iVar.f24144c == eVar) {
                iVar.f24144c = eVar2;
                return true;
            }
            return false;
        }
    }

    @Override // s.a
    public final boolean f(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            if (iVar.f24143b == obj) {
                iVar.f24143b = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // s.a
    public final boolean g(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            if (iVar.f24145d == hVar) {
                iVar.f24145d = hVar2;
                return true;
            }
            return false;
        }
    }

    @Override // s.a
    public final void p(h hVar, h hVar2) {
        hVar.f24138b = hVar2;
    }

    @Override // s.a
    public final void q(h hVar, Thread thread) {
        hVar.a = thread;
    }
}
