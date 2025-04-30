package f;

import java.util.ListIterator;
import u7.C2814e;

/* loaded from: classes.dex */
public final class p extends G7.k implements F7.l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f20228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i9) {
        super(1);
        this.b = i9;
        this.f20228c = xVar;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                b bVar = (b) obj;
                G7.j.e(bVar, "backEvent");
                x xVar = this.f20228c;
                C2814e c2814e = xVar.b;
                ListIterator listIterator = c2814e.listIterator(c2814e.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((o) obj2).f20226a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                o oVar = (o) obj2;
                if (xVar.f20241c != null) {
                    xVar.c();
                }
                xVar.f20241c = oVar;
                if (oVar != null) {
                    oVar.d(bVar);
                }
                return t7.y.f23029a;
            default:
                b bVar2 = (b) obj;
                G7.j.e(bVar2, "backEvent");
                x xVar2 = this.f20228c;
                o oVar2 = xVar2.f20241c;
                if (oVar2 == null) {
                    C2814e c2814e2 = xVar2.b;
                    ListIterator listIterator2 = c2814e2.listIterator(c2814e2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((o) obj3).f20226a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    oVar2 = (o) obj3;
                }
                if (oVar2 != null) {
                    oVar2.c(bVar2);
                }
                return t7.y.f23029a;
        }
    }
}
