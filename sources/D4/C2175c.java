package d4;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.g0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: d4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2175c extends AbstractSet {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f19856c;

    public /* synthetic */ C2175c(AbstractMap abstractMap, int i9) {
        this.b = i9;
        this.f19856c = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.b) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((c0) this.f19856c).f((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.b) {
            case 0:
                ((C2178f) this.f19856c).clear();
                return;
            case 1:
                ((C2178f) this.f19856c).clear();
                return;
            default:
                ((c0) this.f19856c).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                C2178f c2178f = (C2178f) this.f19856c;
                Map b = c2178f.b();
                if (b != null) {
                    return b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d2 = c2178f.d(entry.getKey());
                    if (d2 != -1 && z2.i.h(c2178f.k()[d2], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((C2178f) this.f19856c).containsKey(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((c0) this.f19856c).get(entry2.getKey());
                Object value = entry2.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.b) {
            case 0:
                C2178f c2178f = (C2178f) this.f19856c;
                Map b = c2178f.b();
                if (b != null) {
                    return b.entrySet().iterator();
                }
                return new C2174b(c2178f, 1);
            case 1:
                C2178f c2178f2 = (C2178f) this.f19856c;
                Map b8 = c2178f2.b();
                if (b8 != null) {
                    return b8.keySet().iterator();
                }
                return new C2174b(c2178f2, 0);
            default:
                return new g0((c0) this.f19856c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.b) {
            case 0:
                C2178f c2178f = (C2178f) this.f19856c;
                Map b = c2178f.b();
                if (b != null) {
                    return b.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c2178f.f()) {
                        int c9 = c2178f.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c2178f.b;
                        Objects.requireNonNull(obj2);
                        int v6 = C2.m.v(key, value, c9, obj2, c2178f.h(), c2178f.i(), c2178f.k());
                        if (v6 != -1) {
                            c2178f.e(v6, c9);
                            c2178f.f19863h--;
                            c2178f.f19862g += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                C2178f c2178f2 = (C2178f) this.f19856c;
                Map b8 = c2178f2.b();
                if (b8 != null) {
                    return b8.keySet().remove(obj);
                }
                if (c2178f2.g(obj) != C2178f.l) {
                    return true;
                }
                return false;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((c0) this.f19856c).remove(entry2.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.b) {
            case 0:
                return ((C2178f) this.f19856c).size();
            case 1:
                return ((C2178f) this.f19856c).size();
            default:
                return ((c0) this.f19856c).size();
        }
    }
}
