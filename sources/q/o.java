package q;

import e0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements Iterable, r0.a {

    /* renamed from: b, reason: collision with root package name */
    public static final o f31327b = new o(x.f30219a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f31328a;

    public o(Map map) {
        this.f31328a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            if (p0.a.g(this.f31328a, ((o) obj).f31328a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31328a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f31328a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            android.support.v4.media.d.C(entry.getValue());
            arrayList.add(new d0.k(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f31328a + ')';
    }
}
