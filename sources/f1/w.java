package f1;

/* loaded from: classes2.dex */
public final class w extends j0.c implements e1.i {

    /* renamed from: a, reason: collision with root package name */
    public final e1.i f30496a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.l f30497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30498c;
    public h0.l d;

    /* renamed from: f, reason: collision with root package name */
    public h0.g f30499f;

    public w(e1.i iVar, h0.l lVar) {
        super(t.f30493a, h0.m.f30726a);
        this.f30496a = iVar;
        this.f30497b = lVar;
        this.f30498c = ((Number) lVar.H(0, v.f30495a)).intValue();
    }

    public final Object c(h0.g gVar, Object obj) {
        h0.l context = gVar.getContext();
        kotlin.jvm.internal.e.l(context);
        h0.l lVar = this.d;
        if (lVar != context) {
            if (lVar instanceof r) {
                throw new IllegalStateException(p0.a.D0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((r) lVar).f30491a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.H(0, new z(this))).intValue() != this.f30498c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f30497b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.f30499f = gVar;
        q0.q qVar = y.f30501a;
        e1.i iVar = this.f30496a;
        p0.a.q(iVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = qVar.invoke(iVar, obj, this);
        if (!p0.a.g(invoke, i0.a.f30806a)) {
            this.f30499f = null;
        }
        return invoke;
    }

    @Override // e1.i
    public final Object emit(Object obj, h0.g gVar) {
        try {
            Object c2 = c(gVar, obj);
            return c2 == i0.a.f30806a ? c2 : d0.b0.f30125a;
        } catch (Throwable th) {
            this.d = new r(gVar.getContext(), th);
            throw th;
        }
    }

    @Override // j0.a, j0.d
    public final j0.d getCallerFrame() {
        h0.g gVar = this.f30499f;
        if (gVar instanceof j0.d) {
            return (j0.d) gVar;
        }
        return null;
    }

    @Override // j0.c, h0.g
    public final h0.l getContext() {
        h0.l lVar = this.d;
        return lVar == null ? h0.m.f30726a : lVar;
    }

    @Override // j0.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = d0.n.a(obj);
        if (a2 != null) {
            this.d = new r(getContext(), a2);
        }
        h0.g gVar = this.f30499f;
        if (gVar != null) {
            gVar.resumeWith(obj);
        }
        return i0.a.f30806a;
    }

    @Override // j0.c, j0.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
