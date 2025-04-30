package Y7;

import F7.l;
import G7.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.y;

/* loaded from: classes3.dex */
public final class b extends k implements l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f3823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f3824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i9) {
        super(1);
        this.b = i9;
        this.f3823c = dVar;
        this.f3824d = cVar;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.f3823c.e(this.f3824d.f3825c);
                return y.f23029a;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f3827h;
                c cVar = this.f3824d;
                Object obj2 = cVar.f3825c;
                d dVar = this.f3823c;
                atomicReferenceFieldUpdater.set(dVar, obj2);
                dVar.e(cVar.f3825c);
                return y.f23029a;
        }
    }
}
