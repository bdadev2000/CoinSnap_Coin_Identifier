package ie;

import he.q;
import java.util.List;

/* loaded from: classes4.dex */
public final class c implements a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19602b;

    public /* synthetic */ c(e eVar, int i10) {
        this.a = i10;
        this.f19602b = eVar;
    }

    @Override // ie.a
    public final void a(e eVar, int i10) {
        int i11 = this.a;
        e eVar2 = this.f19602b;
        switch (i11) {
            case 0:
                ((d) eVar2).k(i10);
                if (i10 == Integer.MAX_VALUE) {
                    eVar.a.remove(this);
                    return;
                }
                return;
            case 1:
                if (i10 == Integer.MAX_VALUE) {
                    eVar.a.remove(this);
                    ((h) eVar2).m();
                    return;
                }
                return;
            default:
                if (i10 == Integer.MAX_VALUE) {
                    ((List) ((q) eVar2).f19067g).remove(eVar);
                }
                q qVar = (q) eVar2;
                if (((List) qVar.f19067g).isEmpty()) {
                    qVar.k(Integer.MAX_VALUE);
                    return;
                }
                return;
        }
    }
}
