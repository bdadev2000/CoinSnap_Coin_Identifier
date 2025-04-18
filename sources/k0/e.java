package k0;

import java.util.ArrayList;
import r.k;

/* loaded from: classes.dex */
public final class e implements m0.a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20199b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.f20199b = obj;
    }

    public final void a(f fVar) {
        switch (this.a) {
            case 0:
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((d3.g) this.f20199b).B(fVar);
                return;
            default:
                synchronized (g.f20202c) {
                    k kVar = g.f20203d;
                    ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f20199b, null);
                    if (arrayList != null) {
                        kVar.remove((String) this.f20199b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((m0.a) arrayList.get(i10)).accept(fVar);
                        }
                        return;
                    }
                    return;
                }
        }
    }

    @Override // m0.a
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                a((f) obj);
                return;
            default:
                a((f) obj);
                return;
        }
    }
}
