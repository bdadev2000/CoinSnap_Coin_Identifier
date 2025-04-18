package x;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f27276m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof j) {
            this.f27268e = 2;
        } else {
            this.f27268e = 3;
        }
    }

    @Override // x.f
    public final void d(int i10) {
        if (this.f27273j) {
            return;
        }
        this.f27273j = true;
        this.f27270g = i10;
        Iterator it = this.f27274k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
