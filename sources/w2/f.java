package w2;

/* loaded from: classes.dex */
public final class f extends va.b {
    public f() {
        super(null);
    }

    @Override // va.b
    public final boolean g(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            if (hVar.f26689c == cVar) {
                hVar.f26689c = cVar2;
                return true;
            }
            return false;
        }
    }

    @Override // va.b
    public final boolean h(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            if (hVar.f26688b == obj) {
                hVar.f26688b = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // va.b
    public final boolean i(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            if (hVar.f26690d == gVar) {
                hVar.f26690d = gVar2;
                return true;
            }
            return false;
        }
    }

    @Override // va.b
    public final void q(g gVar, g gVar2) {
        gVar.f26683b = gVar2;
    }

    @Override // va.b
    public final void r(g gVar, Thread thread) {
        gVar.a = thread;
    }
}
