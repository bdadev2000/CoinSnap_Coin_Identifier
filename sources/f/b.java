package f;

import e0.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f30377a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30378b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f30379c;
    public final ArrayList d;
    public final ArrayList e;

    public b(c cVar) {
        this.f30377a = u.b1(cVar.f30380a);
        this.f30378b = u.b1(cVar.f30381b);
        this.f30379c = u.b1(cVar.f30382c);
        this.d = u.b1(cVar.d);
        this.e = u.b1(cVar.e);
    }

    public final void a(k.f fVar, Class cls) {
        this.d.add(new d0.k(fVar, cls));
    }

    public final void b(n.a aVar, Class cls) {
        this.f30378b.add(new d0.k(aVar, cls));
    }
}
