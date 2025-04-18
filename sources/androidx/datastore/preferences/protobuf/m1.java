package androidx.datastore.preferences.protobuf;

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
public final class m1 extends AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f1434i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f1435b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1438f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.google.common.collect.y f1439g;

    /* renamed from: c, reason: collision with root package name */
    public List f1436c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map f1437d = Collections.emptyMap();

    /* renamed from: h, reason: collision with root package name */
    public Map f1440h = Collections.emptyMap();

    public m1(int i10) {
        this.f1435b = i10;
    }

    public final int a(Comparable comparable) {
        int size = this.f1436c.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((p1) this.f1436c.get(size)).f1449b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((p1) this.f1436c.get(i11)).f1449b);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public final void b() {
        if (!this.f1438f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.f1436c.isEmpty()) {
            this.f1436c.clear();
        }
        if (!this.f1437d.isEmpty()) {
            this.f1437d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f1437d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.f1439g == null) {
            this.f1439g = new com.google.common.collect.y(this);
        }
        return this.f1439g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return super.equals(obj);
        }
        m1 m1Var = (m1) obj;
        int size = size();
        if (size != m1Var.size()) {
            return false;
        }
        int i10 = i();
        if (i10 != m1Var.i()) {
            return entrySet().equals(m1Var.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!h(i11).equals(m1Var.h(i11))) {
                return false;
            }
        }
        if (i10 == size) {
            return true;
        }
        return this.f1437d.equals(m1Var.f1437d);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((p1) this.f1436c.get(a)).f1450c;
        }
        return this.f1437d.get(comparable);
    }

    public final Map.Entry h(int i10) {
        return (Map.Entry) this.f1436c.get(i10);
    }

    public final int i() {
        return this.f1436c.size();
    }

    public final Iterable j() {
        if (this.f1437d.isEmpty()) {
            return com.bumptech.glide.e.f9643j;
        }
        return this.f1437d.entrySet();
    }

    public final SortedMap k() {
        b();
        if (this.f1437d.isEmpty() && !(this.f1437d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1437d = treeMap;
            this.f1440h = treeMap.descendingMap();
        }
        return (SortedMap) this.f1437d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i10 = i();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += ((p1) this.f1436c.get(i12)).hashCode();
        }
        if (this.f1437d.size() > 0) {
            return i11 + this.f1437d.hashCode();
        }
        return i11;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((p1) this.f1436c.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f1436c.isEmpty();
        int i10 = this.f1435b;
        if (isEmpty && !(this.f1436c instanceof ArrayList)) {
            this.f1436c = new ArrayList(i10);
        }
        int i11 = -(a + 1);
        if (i11 >= i10) {
            return k().put(comparable, obj);
        }
        if (this.f1436c.size() == i10) {
            p1 p1Var = (p1) this.f1436c.remove(i10 - 1);
            k().put(p1Var.f1449b, p1Var.f1450c);
        }
        this.f1436c.add(i11, new p1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return p(a);
        }
        if (this.f1437d.isEmpty()) {
            return null;
        }
        return this.f1437d.remove(comparable);
    }

    public final Object p(int i10) {
        b();
        Object obj = ((p1) this.f1436c.remove(i10)).f1450c;
        if (!this.f1437d.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            List list = this.f1436c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new p1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f1437d.size() + this.f1436c.size();
    }
}
