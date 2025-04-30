package e0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t7.AbstractC2712a;
import y7.AbstractC2960i;

/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2206g extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public Iterator f19971g;

    /* renamed from: h, reason: collision with root package name */
    public Object f19972h;

    /* renamed from: i, reason: collision with root package name */
    public int f19973i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f19974j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f19975k;
    public final /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2206g(List list, ArrayList arrayList, w7.f fVar) {
        super(2, fVar);
        this.f19975k = list;
        this.l = arrayList;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        C2206g c2206g = new C2206g(this.f19975k, (ArrayList) this.l, fVar);
        c2206g.f19974j = obj;
        return c2206g;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2206g) c(obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        Iterator it;
        List list;
        int i9 = this.f19973i;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    it = this.f19971g;
                    list = (List) this.f19974j;
                    AbstractC2712a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f19972h;
                Iterator it2 = this.f19971g;
                List list2 = (List) this.f19974j;
                AbstractC2712a.f(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new AbstractC2960i(1, null));
                    this.f19974j = list2;
                    this.f19971g = it2;
                    this.f19972h = null;
                    this.f19973i = 2;
                    throw null;
                }
            }
        } else {
            AbstractC2712a.f(obj);
            obj = this.f19974j;
            it = this.f19975k.iterator();
            list = this.l;
        }
        if (!it.hasNext()) {
            return obj;
        }
        com.mbridge.msdk.foundation.entity.o.v(it.next());
        this.f19974j = list;
        this.f19971g = it;
        this.f19972h = obj;
        this.f19973i = 1;
        throw null;
    }
}
