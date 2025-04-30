package U7;

import Q7.AbstractC0255x;
import t7.C2722k;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2954c;
import y7.InterfaceC2955d;

/* loaded from: classes3.dex */
public final class r extends AbstractC2954c implements T7.c {

    /* renamed from: f, reason: collision with root package name */
    public final T7.c f3379f;

    /* renamed from: g, reason: collision with root package name */
    public final w7.k f3380g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3381h;

    /* renamed from: i, reason: collision with root package name */
    public w7.k f3382i;

    /* renamed from: j, reason: collision with root package name */
    public w7.f f3383j;

    public r(T7.c cVar, w7.k kVar) {
        super(n.b, w7.l.b);
        this.f3379f = cVar;
        this.f3380g = kVar;
        this.f3381h = ((Number) kVar.b(0, q.b)).intValue();
    }

    @Override // T7.c
    public final Object a(Object obj, w7.f fVar) {
        try {
            Object k6 = k(fVar, obj);
            if (k6 == EnumC2928a.b) {
                return k6;
            }
            return y.f23029a;
        } catch (Throwable th) {
            this.f3382i = new m(th, fVar.getContext());
            throw th;
        }
    }

    @Override // y7.AbstractC2952a, y7.InterfaceC2955d
    public final InterfaceC2955d d() {
        w7.f fVar = this.f3383j;
        if (fVar instanceof InterfaceC2955d) {
            return (InterfaceC2955d) fVar;
        }
        return null;
    }

    @Override // y7.AbstractC2954c, w7.f
    public final w7.k getContext() {
        w7.k kVar = this.f3382i;
        if (kVar == null) {
            return w7.l.b;
        }
        return kVar;
    }

    @Override // y7.AbstractC2952a
    public final StackTraceElement h() {
        return null;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        Throwable a6 = C2722k.a(obj);
        if (a6 != null) {
            this.f3382i = new m(a6, getContext());
        }
        w7.f fVar = this.f3383j;
        if (fVar != null) {
            fVar.e(obj);
        }
        return EnumC2928a.b;
    }

    public final Object k(w7.f fVar, Object obj) {
        w7.k context = fVar.getContext();
        AbstractC0255x.e(context);
        w7.k kVar = this.f3382i;
        if (kVar != context) {
            if (!(kVar instanceof m)) {
                if (((Number) context.b(0, new u(this, 0))).intValue() == this.f3381h) {
                    this.f3382i = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3380g + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(O7.h.s("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((m) kVar).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f3383j = fVar;
        F7.q qVar = t.f3385a;
        T7.c cVar = this.f3379f;
        G7.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b = qVar.b(cVar, obj, this);
        if (!G7.j.a(b, EnumC2928a.b)) {
            this.f3383j = null;
        }
        return b;
    }
}
