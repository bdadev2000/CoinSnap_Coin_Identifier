package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // androidx.work.j
    public final g a(ArrayList arrayList) {
        f fVar = new f();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((g) it.next()).f5214a));
        }
        fVar.a(hashMap);
        g gVar = new g(fVar.f5212a);
        g.c(gVar);
        return gVar;
    }
}
