package f2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends u {
    public final /* synthetic */ Object a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17606c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17607d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f17610g;

    public l(n nVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f17610g = nVar;
        this.a = obj;
        this.f17605b = arrayList;
        this.f17608e = obj2;
        this.f17609f = arrayList2;
    }

    @Override // f2.u, f2.r
    public final void e(t tVar) {
        n nVar = this.f17610g;
        Object obj = this.a;
        if (obj != null) {
            nVar.s(obj, this.f17605b, null);
        }
        Object obj2 = this.f17606c;
        if (obj2 != null) {
            nVar.s(obj2, this.f17607d, null);
        }
        Object obj3 = this.f17608e;
        if (obj3 != null) {
            nVar.s(obj3, this.f17609f, null);
        }
    }

    @Override // f2.r
    public final void f(t tVar) {
        tVar.z(this);
    }
}
