package e1;

/* loaded from: classes.dex */
public final class h0 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f30273a;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.i, h0.g, e1.h0] */
    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        ?? iVar = new j0.i(2, gVar);
        iVar.f30273a = ((Number) obj).intValue();
        return iVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create(Integer.valueOf(((Number) obj).intValue()), (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        kotlin.jvm.internal.q.m(obj);
        return Boolean.valueOf(this.f30273a > 0);
    }
}
