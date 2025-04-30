package K2;

import G7.j;
import c8.g;
import g8.k;
import g8.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f1645a;

    public b(int i9) {
        switch (i9) {
            case 1:
                this.f1645a = new ConcurrentHashMap(1);
                return;
            default:
                this.f1645a = new ConcurrentHashMap();
                return;
        }
    }

    public Object a(g gVar) {
        Object obj;
        l lVar = k.f20506a;
        j.e(gVar, "descriptor");
        Map map = (Map) this.f1645a.get(gVar);
        if (map != null) {
            obj = map.get(lVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
