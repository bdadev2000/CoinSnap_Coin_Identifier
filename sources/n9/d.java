package n9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f22524b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22525c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Set f22526d = Collections.emptySet();

    /* renamed from: f, reason: collision with root package name */
    public List f22527f = Collections.emptyList();

    public final int a(Object obj) {
        int i10;
        synchronized (this.f22524b) {
            if (this.f22525c.containsKey(obj)) {
                i10 = ((Integer) this.f22525c.get(obj)).intValue();
            } else {
                i10 = 0;
            }
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f22524b) {
            it = this.f22527f.iterator();
        }
        return it;
    }
}
