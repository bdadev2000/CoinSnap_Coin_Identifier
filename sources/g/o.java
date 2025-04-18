package g;

import androidx.compose.runtime.SnapshotStateKt;

/* loaded from: classes3.dex */
public final class o extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f30554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, h0.g gVar) {
        super(2, gVar);
        this.f30554b = tVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new o(this.f30554b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((b1.d0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30553a;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            t tVar = this.f30554b;
            e1.j l2 = SnapshotStateKt.l(new b(tVar, i3));
            m mVar = new m(tVar, null);
            int i4 = e1.b0.f30235a;
            f1.n nVar = new f1.n(new e1.a0(mVar, null), l2, h0.m.f30726a, -2, 1);
            n nVar2 = new n(tVar);
            this.f30553a = 1;
            if (nVar.collect(nVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return d0.b0.f30125a;
    }
}
