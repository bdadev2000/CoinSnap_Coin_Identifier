package D0;

import android.content.Context;
import com.facebook.appevents.r;
import com.facebook.appevents.s;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.C1834c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f614a;

    public i(int i9) {
        switch (i9) {
            case 2:
                this.f614a = new HashMap();
                return;
            default:
                this.f614a = new HashMap();
                return;
        }
    }

    public synchronized void a(r rVar) {
        Set<Map.Entry> set = null;
        if (!O2.a.b(rVar)) {
            try {
                Set entrySet = rVar.b.entrySet();
                G7.j.d(entrySet, "events.entries");
                set = entrySet;
            } catch (Throwable th) {
                O2.a.a(rVar, th);
            }
        }
        for (Map.Entry entry : set) {
            s c9 = c((com.facebook.appevents.b) entry.getKey());
            if (c9 != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    c9.a((com.facebook.appevents.e) it.next());
                }
            }
        }
    }

    public synchronized int b() {
        int i9;
        int size;
        i9 = 0;
        for (s sVar : this.f614a.values()) {
            synchronized (sVar) {
                if (!O2.a.b(sVar)) {
                    try {
                        size = sVar.f13514c.size();
                    } catch (Throwable th) {
                        O2.a.a(sVar, th);
                    }
                }
                size = 0;
            }
            i9 += size;
        }
        return i9;
    }

    public synchronized s c(com.facebook.appevents.b bVar) {
        Context a6;
        C1834c b;
        s sVar = (s) this.f614a.get(bVar);
        if (sVar == null && (b = AbstractC1839h.b((a6 = com.facebook.r.a()))) != null) {
            sVar = new s(b, e1.f.j(a6));
        }
        if (sVar == null) {
            return null;
        }
        this.f614a.put(bVar, sVar);
        return sVar;
    }

    public synchronized Set d() {
        Set keySet;
        keySet = this.f614a.keySet();
        G7.j.d(keySet, "stateMap.keys");
        return keySet;
    }
}
