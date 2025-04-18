package f;

import b1.d0;
import b1.j0;
import b1.o0;
import d0.b0;
import g1.u;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes.dex */
public final class k extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30393a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q.j f30395c;
    public final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, q.j jVar, h0.g gVar) {
        super(2, gVar);
        this.f30395c = jVar;
        this.d = oVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        k kVar = new k(this.d, this.f30395c, gVar);
        kVar.f30394b = obj;
        return kVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30393a;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f30394b;
            h1.d dVar = o0.f22355a;
            c1.e eVar = ((c1.e) u.f30639a).f22411g;
            o oVar = this.d;
            q.j jVar = this.f30395c;
            j0 f2 = kotlin.jvm.internal.e.f(d0Var, eVar, new j(oVar, jVar, null), 2);
            s.a aVar2 = jVar.f31293c;
            this.f30393a = 1;
            obj = f2.t(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
