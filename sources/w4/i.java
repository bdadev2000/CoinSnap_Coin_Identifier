package w4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f26734b;

    /* renamed from: c, reason: collision with root package name */
    public long f26735c;

    public i(long j3) {
        this.f26734b = j3;
    }

    public final synchronized Object a(Object obj) {
        Object obj2;
        h hVar = (h) this.a.get(obj);
        if (hVar != null) {
            obj2 = hVar.a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public final synchronized Object d(Object obj, Object obj2) {
        h hVar;
        int b3 = b(obj2);
        long j3 = b3;
        Object obj3 = null;
        if (j3 >= this.f26734b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f26735c += j3;
        }
        LinkedHashMap linkedHashMap = this.a;
        if (obj2 == null) {
            hVar = null;
        } else {
            hVar = new h(obj2, b3);
        }
        h hVar2 = (h) linkedHashMap.put(obj, hVar);
        if (hVar2 != null) {
            this.f26735c -= hVar2.f26733b;
            if (!hVar2.a.equals(obj2)) {
                c(obj, hVar2.a);
            }
        }
        e(this.f26734b);
        if (hVar2 != null) {
            obj3 = hVar2.a;
        }
        return obj3;
    }

    public final synchronized void e(long j3) {
        while (this.f26735c > j3) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            h hVar = (h) entry.getValue();
            this.f26735c -= hVar.f26733b;
            Object key = entry.getKey();
            it.remove();
            c(key, hVar.a);
        }
    }
}
