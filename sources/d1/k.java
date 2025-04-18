package d1;

import b1.d0;
import d0.b0;

/* loaded from: classes.dex */
public final class k extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30183a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f30185c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object obj, h0.g gVar) {
        super(2, gVar);
        this.f30185c = sVar;
        this.d = obj;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        k kVar = new k(this.f30185c, this.d, gVar);
        kVar.f30184b = obj;
        return kVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object d;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30183a;
        Object obj2 = b0.f30125a;
        try {
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                s sVar = this.f30185c;
                Object obj3 = this.d;
                this.f30183a = 1;
                if (sVar.j(obj3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.q.m(obj);
            }
            d = obj2;
        } catch (Throwable th) {
            d = kotlin.jvm.internal.q.d(th);
        }
        if (!(!(d instanceof d0.m))) {
            obj2 = new g(d0.n.a(d));
        }
        return new i(obj2);
    }
}
