package o3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements d, p3.a {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23125b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f23126c;

    /* renamed from: d, reason: collision with root package name */
    public final p3.h f23127d;

    /* renamed from: e, reason: collision with root package name */
    public final p3.h f23128e;

    /* renamed from: f, reason: collision with root package name */
    public final p3.h f23129f;

    public u(u3.b bVar, t3.p pVar) {
        pVar.getClass();
        this.a = pVar.f25258e;
        this.f23126c = pVar.a;
        p3.d a = pVar.f25255b.a();
        this.f23127d = (p3.h) a;
        p3.d a10 = pVar.f25256c.a();
        this.f23128e = (p3.h) a10;
        p3.d a11 = pVar.f25257d.a();
        this.f23129f = (p3.h) a11;
        bVar.f(a);
        bVar.f(a10);
        bVar.f(a11);
        a.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // p3.a
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23125b;
            if (i10 < arrayList.size()) {
                ((p3.a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // o3.d
    public final void b(List list, List list2) {
    }

    public final void c(p3.a aVar) {
        this.f23125b.add(aVar);
    }
}
