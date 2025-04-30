package androidx.datastore.preferences.protobuf;

import d4.C2175c;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class c0 extends AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f4549i = 0;
    public final int b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4552f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C2175c f4553g;

    /* renamed from: c, reason: collision with root package name */
    public List f4550c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map f4551d = Collections.emptyMap();

    /* renamed from: h, reason: collision with root package name */
    public Map f4554h = Collections.emptyMap();

    public c0(int i9) {
        this.b = i9;
    }

    public final int a(Comparable comparable) {
        int i9;
        int size = this.f4550c.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((f0) this.f4550c.get(i10)).b);
            if (compareTo > 0) {
                i9 = size + 1;
                return -i9;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((f0) this.f4550c.get(i12)).b);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        i9 = i11 + 1;
        return -i9;
    }

    public final void b() {
        if (!this.f4552f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i9) {
        return (Map.Entry) this.f4550c.get(i9);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4550c.isEmpty()) {
            this.f4550c.clear();
        }
        if (!this.f4551d.isEmpty()) {
            this.f4551d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f4551d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.f4551d.isEmpty()) {
            return P.b;
        }
        return this.f4551d.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4551d.isEmpty() && !(this.f4551d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4551d = treeMap;
            this.f4554h = treeMap.descendingMap();
        }
        return (SortedMap) this.f4551d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4553g == null) {
            this.f4553g = new C2175c(this, 2);
        }
        return this.f4553g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        int size = size();
        if (size != c0Var.size()) {
            return false;
        }
        int size2 = this.f4550c.size();
        if (size2 != c0Var.f4550c.size()) {
            return entrySet().equals(c0Var.entrySet());
        }
        for (int i9 = 0; i9 < size2; i9++) {
            if (!c(i9).equals(c0Var.c(i9))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f4551d.equals(c0Var.f4551d);
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int a6 = a(comparable);
        if (a6 >= 0) {
            return ((f0) this.f4550c.get(a6)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f4550c.isEmpty();
        int i9 = this.b;
        if (isEmpty && !(this.f4550c instanceof ArrayList)) {
            this.f4550c = new ArrayList(i9);
        }
        int i10 = -(a6 + 1);
        if (i10 >= i9) {
            return e().put(comparable, obj);
        }
        if (this.f4550c.size() == i9) {
            f0 f0Var = (f0) this.f4550c.remove(i9 - 1);
            e().put(f0Var.b, f0Var.f4558c);
        }
        this.f4550c.add(i10, new f0(this, comparable, obj));
        return null;
    }

    public final Object g(int i9) {
        b();
        Object obj = ((f0) this.f4550c.remove(i9)).f4558c;
        if (!this.f4551d.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f4550c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a6 = a(comparable);
        if (a6 >= 0) {
            return ((f0) this.f4550c.get(a6)).f4558c;
        }
        return this.f4551d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4550c.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += ((f0) this.f4550c.get(i10)).hashCode();
        }
        if (this.f4551d.size() > 0) {
            return i9 + this.f4551d.hashCode();
        }
        return i9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        com.mbridge.msdk.foundation.entity.o.v(obj);
        return f(null, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a6 = a(comparable);
        if (a6 >= 0) {
            return g(a6);
        }
        if (this.f4551d.isEmpty()) {
            return null;
        }
        return this.f4551d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4551d.size() + this.f4550c.size();
    }
}
