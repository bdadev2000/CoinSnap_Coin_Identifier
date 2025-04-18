package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class d1 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).clear();
        }
        linkedHashMap.clear();
    }
}
