package Q;

import java.util.ArrayList;
import x.l;

/* loaded from: classes.dex */
public final class d implements S.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2456a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i9) {
        this.f2456a = i9;
        this.b = obj;
    }

    @Override // S.a
    public final void accept(Object obj) {
        switch (this.f2456a) {
            case 0:
                e eVar = (e) obj;
                if (eVar == null) {
                    eVar = new e(-3);
                }
                ((a7.b) this.b).y(eVar);
                return;
            default:
                e eVar2 = (e) obj;
                synchronized (f.f2459c) {
                    try {
                        l lVar = f.f2460d;
                        ArrayList arrayList = (ArrayList) lVar.getOrDefault((String) this.b, null);
                        if (arrayList != null) {
                            lVar.remove((String) this.b);
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                ((S.a) arrayList.get(i9)).accept(eVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
