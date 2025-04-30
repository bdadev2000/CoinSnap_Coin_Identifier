package h5;

import j2.j;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: h5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2326g {

    /* renamed from: a, reason: collision with root package name */
    public final long f20607a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f20608c;

    public C2326g(long j7) {
        this.f20608c = new LinkedHashMap(100, 0.75f, true);
        this.f20607a = j7;
    }

    public synchronized Object a(Object obj) {
        Object obj2;
        j jVar = (j) ((LinkedHashMap) this.f20608c).get(obj);
        if (jVar != null) {
            obj2 = jVar.f21021a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int b(Object obj) {
        return 1;
    }

    public synchronized Object d(Object obj, Object obj2) {
        j jVar;
        int b = b(obj2);
        long j7 = b;
        Object obj3 = null;
        if (j7 >= this.f20607a) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j7;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f20608c;
        if (obj2 == null) {
            jVar = null;
        } else {
            jVar = new j(obj2, b);
        }
        j jVar2 = (j) linkedHashMap.put(obj, jVar);
        if (jVar2 != null) {
            this.b -= jVar2.b;
            if (!jVar2.f21021a.equals(obj2)) {
                c(obj, jVar2.f21021a);
            }
        }
        e(this.f20607a);
        if (jVar2 != null) {
            obj3 = jVar2.f21021a;
        }
        return obj3;
    }

    public synchronized void e(long j7) {
        while (this.b > j7) {
            Iterator it = ((LinkedHashMap) this.f20608c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            j jVar = (j) entry.getValue();
            this.b -= jVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, jVar.f21021a);
        }
    }

    public C2326g(long j7, long j9, TimeUnit timeUnit) {
        this.f20607a = j7;
        this.b = j9;
        this.f20608c = timeUnit;
    }

    public void c(Object obj, Object obj2) {
    }
}
