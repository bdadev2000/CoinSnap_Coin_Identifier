package db;

/* loaded from: classes3.dex */
public final class q implements cc.c, cc.b {

    /* renamed from: c, reason: collision with root package name */
    public static final n0.h f16964c = new n0.h(19);

    /* renamed from: d, reason: collision with root package name */
    public static final f f16965d = new f(1);
    public cc.a a;

    /* renamed from: b, reason: collision with root package name */
    public volatile cc.c f16966b;

    public q(n0.h hVar, cc.c cVar) {
        this.a = hVar;
        this.f16966b = cVar;
    }

    public final void a(cc.a aVar) {
        cc.c cVar;
        cc.c cVar2;
        cc.c cVar3 = this.f16966b;
        f fVar = f16965d;
        if (cVar3 != fVar) {
            aVar.h(cVar3);
            return;
        }
        synchronized (this) {
            cVar = this.f16966b;
            if (cVar != fVar) {
                cVar2 = cVar;
            } else {
                this.a = new androidx.fragment.app.e(23, this.a, aVar);
                cVar2 = null;
            }
        }
        if (cVar2 != null) {
            aVar.h(cVar);
        }
    }

    @Override // cc.c
    public final Object get() {
        return this.f16966b.get();
    }
}
