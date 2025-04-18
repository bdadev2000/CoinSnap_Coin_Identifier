package l;

import b1.d0;
import d0.b0;
import q.n;
import q0.p;

/* loaded from: classes4.dex */
public final class g extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q.j f30982c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f30983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f.e f30984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o.c f30985h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f30986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, q.j jVar, Object obj, n nVar, f.e eVar, o.c cVar, l lVar, h0.g gVar) {
        super(2, gVar);
        this.f30981b = iVar;
        this.f30982c = jVar;
        this.d = obj;
        this.f30983f = nVar;
        this.f30984g = eVar;
        this.f30985h = cVar;
        this.f30986i = lVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new g(this.f30981b, this.f30982c, this.d, this.f30983f, this.f30984g, this.f30985h, this.f30986i, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
