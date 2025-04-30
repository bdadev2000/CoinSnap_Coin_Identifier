package V7;

import Q7.AbstractC0255x;

/* loaded from: classes3.dex */
public final class p extends G7.k implements F7.l {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F7.l f3534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3535d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(F7.l lVar, Object obj, w7.k kVar) {
        super(1);
        this.f3534c = lVar;
        this.f3535d = obj;
        this.f3536f = kVar;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        t7.y yVar;
        t7.y yVar2;
        switch (this.b) {
            case 0:
                G1.a a6 = a.a(this.f3534c, this.f3535d, null);
                if (a6 != null) {
                    AbstractC0255x.i(a6, (w7.k) this.f3536f);
                }
                return t7.y.f23029a;
            default:
                Throwable th = (Throwable) obj;
                this.f3534c.invoke(th);
                U4.y yVar3 = (U4.y) this.f3535d;
                ((S7.c) yVar3.f3335c).f(false, th);
                do {
                    Object A8 = ((S7.c) yVar3.f3335c).A();
                    yVar = null;
                    if (A8 instanceof S7.i) {
                        A8 = null;
                    }
                    yVar2 = t7.y.f23029a;
                    if (A8 != null) {
                        ((F7.p) this.f3536f).g(A8, th);
                        yVar = yVar2;
                    }
                } while (yVar != null);
                return yVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(G7.w wVar, U4.y yVar) {
        super(1);
        e0.q qVar = e0.q.b;
        this.f3534c = wVar;
        this.f3535d = yVar;
        this.f3536f = qVar;
    }
}
