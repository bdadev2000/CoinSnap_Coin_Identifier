package d4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class q implements Map, Serializable {
    public transient G b;

    /* renamed from: c, reason: collision with root package name */
    public transient H f19880c;

    /* renamed from: d, reason: collision with root package name */
    public transient I f19881d;

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u entrySet() {
        G g9 = this.b;
        if (g9 == null) {
            J j7 = (J) this;
            G g10 = new G(j7, j7.f19840g, j7.f19841h);
            this.b = g10;
            return g10;
        }
        return g9;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        I i9 = this.f19881d;
        if (i9 == null) {
            J j7 = (J) this;
            I i10 = new I(j7.f19840g, 1, j7.f19841h);
            this.f19881d = i10;
            i9 = i10;
        }
        return i9.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i9;
        Iterator it = ((G) entrySet()).iterator();
        int i10 = 0;
        while (true) {
            C2182j c2182j = (C2182j) it;
            if (c2182j.hasNext()) {
                Object next = c2182j.next();
                if (next != null) {
                    i9 = next.hashCode();
                } else {
                    i9 = 0;
                }
                i10 = ~(~(i10 + i9));
            } else {
                return i10;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((J) this).size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        H h6 = this.f19880c;
        if (h6 == null) {
            J j7 = (J) this;
            H h9 = new H(j7, new I(j7.f19840g, 0, j7.f19841h));
            this.f19880c = h9;
            return h9;
        }
        return h6;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i9 = ((J) this).f19841h;
        z2.i.c(i9, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i9 * 8, 1073741824L));
        sb.append('{');
        boolean z8 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z8) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z8 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        I i9 = this.f19881d;
        if (i9 == null) {
            J j7 = (J) this;
            I i10 = new I(j7.f19840g, 1, j7.f19841h);
            this.f19881d = i10;
            return i10;
        }
        return i9;
    }

    public Object writeReplace() {
        return new p(this);
    }
}
