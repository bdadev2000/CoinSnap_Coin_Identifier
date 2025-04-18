package l;

import b1.d0;
import d0.b0;
import k.n;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes4.dex */
public final class d extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f30962c;
    public final /* synthetic */ f0 d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.j f30963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f30964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f30965h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f.e f30966i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, f0 f0Var, f0 f0Var2, q.j jVar, Object obj, f0 f0Var3, f.e eVar, h0.g gVar) {
        super(2, gVar);
        this.f30961b = iVar;
        this.f30962c = f0Var;
        this.d = f0Var2;
        this.f30963f = jVar;
        this.f30964g = obj;
        this.f30965h = f0Var3;
        this.f30966i = eVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new d(this.f30961b, this.f30962c, this.d, this.f30963f, this.f30964g, this.f30965h, this.f30966i, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30960a;
        if (i2 == 0) {
            q.m(obj);
            i iVar = this.f30961b;
            n nVar = (n) this.f30962c.f30930a;
            f.c cVar = (f.c) this.d.f30930a;
            q.j jVar = this.f30963f;
            Object obj2 = this.f30964g;
            q.n nVar2 = (q.n) this.f30965h.f30930a;
            f.e eVar = this.f30966i;
            this.f30960a = 1;
            obj = i.a(iVar, nVar, cVar, jVar, obj2, nVar2, eVar, this);
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
