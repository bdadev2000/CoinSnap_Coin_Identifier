package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // androidx.work.k
    public final h a(ArrayList arrayList) {
        g gVar = new g();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((h) it.next()).a));
        }
        gVar.c(hashMap);
        return gVar.b();
    }
}
