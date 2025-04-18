package le;

import he.a0;
import he.q;
import he.s;
import he.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class g extends ie.d {

    /* renamed from: k, reason: collision with root package name */
    public static final fe.c f21370k = new fe.c(g.class.getSimpleName());

    /* renamed from: f, reason: collision with root package name */
    public List f21371f;

    /* renamed from: g, reason: collision with root package name */
    public q f21372g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.viewpager2.adapter.c f21373h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f21374i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21375j;

    public g(a0 a0Var, androidx.viewpager2.adapter.c cVar, boolean z10) {
        super(0);
        this.f21373h = cVar;
        this.f21374i = a0Var;
        this.f21375j = z10;
    }

    @Override // ie.d, ie.e
    public final void i(ie.b bVar) {
        fe.c cVar = f21370k;
        cVar.a(2, "onStart:", "initializing.");
        List arrayList = new ArrayList();
        androidx.viewpager2.adapter.c cVar2 = this.f21373h;
        if (cVar2 != null) {
            a0 a0Var = this.f21374i;
            v vVar = (v) a0Var;
            ne.a aVar = vVar.C;
            ye.b bVar2 = vVar.f19086f;
            ze.b bVar3 = new ze.b(bVar2.f28178d, bVar2.f28179e);
            ze.b e2 = a0Var.e(3);
            boolean z10 = ((v) a0Var).f19086f.f28177c;
            s sVar = (s) bVar;
            me.b bVar4 = new me.b(aVar, bVar3, e2, z10, sVar.X, sVar.Z);
            arrayList = cVar2.e(bVar4).d(Integer.MAX_VALUE, bVar4);
        }
        boolean z11 = this.f21375j;
        c cVar3 = new c(arrayList, z11);
        e eVar = new e(arrayList, z11);
        h hVar = new h(arrayList, z11);
        this.f21371f = Arrays.asList(cVar3, eVar, hVar);
        this.f21372g = new q(Arrays.asList(cVar3, eVar, hVar));
        cVar.a(2, "onStart:", "initialized.");
        super.i(bVar);
    }

    @Override // ie.d
    public final ie.e o() {
        return this.f21372g;
    }
}
