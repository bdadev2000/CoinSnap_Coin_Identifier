package M0;

import java.util.ArrayList;

/* renamed from: M0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221l extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1887a;
    public final /* synthetic */ ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1888c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1889d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0223n f1892g;

    public C0221l(C0223n c0223n, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1892g = c0223n;
        this.f1887a = obj;
        this.b = arrayList;
        this.f1890e = obj2;
        this.f1891f = arrayList2;
    }

    @Override // M0.x, M0.u
    public final void c(w wVar) {
        wVar.A(this);
    }

    @Override // M0.x, M0.u
    public final void d(w wVar) {
        C0223n c0223n = this.f1892g;
        Object obj = this.f1887a;
        if (obj != null) {
            c0223n.z(obj, this.b, null);
        }
        Object obj2 = this.f1888c;
        if (obj2 != null) {
            c0223n.z(obj2, this.f1889d, null);
        }
        Object obj3 = this.f1890e;
        if (obj3 != null) {
            c0223n.z(obj3, this.f1891f, null);
        }
    }
}
