package g4;

/* loaded from: classes.dex */
public final class k {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18102b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18103c;

    public k() {
    }

    public k(e4.c cVar, Object obj, e4.m mVar) {
        this.a = cVar;
        this.f18102b = obj;
        this.f18103c = mVar;
    }

    public final void a(q qVar, e4.m mVar) {
        try {
            qVar.a().j((e4.j) this.a, new k((e4.p) this.f18102b, (f0) this.f18103c, mVar));
        } finally {
            ((f0) this.f18103c).d();
        }
    }

    public k(r rVar, s4.g gVar, v vVar) {
        this.f18103c = rVar;
        this.f18102b = gVar;
        this.a = vVar;
    }
}
