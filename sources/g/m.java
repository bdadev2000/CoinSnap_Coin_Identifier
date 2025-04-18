package g;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes3.dex */
public final class m extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30549a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f30551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, h0.g gVar) {
        super(2, gVar);
        this.f30551c = tVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        m mVar = new m(this.f30551c, gVar);
        mVar.f30550b = obj;
        return mVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((q.j) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        t tVar;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30549a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            q.j jVar = (q.j) this.f30550b;
            t tVar2 = this.f30551c;
            f.i iVar = (f.i) tVar2.f30577p.getValue();
            q.h a2 = q.j.a(jVar);
            a2.d = new p(tVar2);
            a2.M = null;
            a2.N = null;
            a2.O = null;
            q.d dVar = jVar.L;
            if (dVar.f31252b == null) {
                a2.K = new p(tVar2);
                a2.M = null;
                a2.N = null;
                a2.O = null;
            }
            if (dVar.f31253c == null) {
                ContentScale contentScale = tVar2.f30572k;
                r.e eVar = j0.f30546b;
                a2.L = (p0.a.g(contentScale, ContentScale.Companion.f15721b) || p0.a.g(contentScale, ContentScale.Companion.e)) ? r.f.f31347b : r.f.f31346a;
            }
            if (dVar.f31257i != r.d.f31342a) {
                a2.f31276j = r.d.f31343b;
            }
            q.j a3 = a2.a();
            this.f30550b = tVar2;
            this.f30549a = 1;
            f.o oVar = (f.o) iVar;
            oVar.getClass();
            obj = p0.a.J(new f.k(oVar, a3, null), this);
            if (obj == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (t) this.f30550b;
            kotlin.jvm.internal.q.m(obj);
        }
        q.k kVar = (q.k) obj;
        tVar.getClass();
        if (kVar instanceof q.r) {
            q.r rVar = (q.r) kVar;
            return new k(tVar.a(rVar.f31332a), rVar);
        }
        if (!(kVar instanceof q.e)) {
            throw new RuntimeException();
        }
        Drawable a4 = kVar.a();
        return new i(a4 != null ? tVar.a(a4) : null, (q.e) kVar);
    }
}
