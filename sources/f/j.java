package f;

import b1.d0;
import d0.b0;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes.dex */
public final class j extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q.j f30392c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, q.j jVar, h0.g gVar) {
        super(2, gVar);
        this.f30391b = oVar;
        this.f30392c = jVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new j(this.f30391b, this.f30392c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30390a;
        if (i2 == 0) {
            q.m(obj);
            this.f30390a = 1;
            obj = o.a(this.f30391b, this.f30392c, 1, this);
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
