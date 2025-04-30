package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4890a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f4890a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
