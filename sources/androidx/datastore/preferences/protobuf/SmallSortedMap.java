package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f19349i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19350a;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public volatile EntrySet f19353f;

    /* renamed from: h, reason: collision with root package name */
    public volatile DescendingEntrySet f19355h;

    /* renamed from: b, reason: collision with root package name */
    public List f19351b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map f19352c = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public Map f19354g = Collections.emptyMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
        public final void g() {
            if (!this.d) {
                for (int i2 = 0; i2 < this.f19351b.size(); i2++) {
                    ((FieldSet.FieldDescriptorLite) d(i2).getKey()).I();
                }
                Iterator it = e().iterator();
                while (it.hasNext()) {
                    ((FieldSet.FieldDescriptorLite) ((Map.Entry) it.next()).getKey()).I();
                }
            }
            super.g();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f19356a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f19357b;

        public DescendingEntryIterator() {
            this.f19356a = SmallSortedMap.this.f19351b.size();
        }

        public final Iterator a() {
            if (this.f19357b == null) {
                this.f19357b = SmallSortedMap.this.f19354g.entrySet().iterator();
            }
            return this.f19357b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i2 = this.f19356a;
            return (i2 > 0 && i2 <= SmallSortedMap.this.f19351b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = SmallSortedMap.this.f19351b;
            int i2 = this.f19356a - 1;
            this.f19356a = i2;
            return (Map.Entry) list.get(i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    /* loaded from: classes.dex */
    public static class EmptySet {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f19360a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f19361b = new Object();

        /* renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$EmptySet$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static class AnonymousClass1 implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$EmptySet$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static class AnonymousClass2 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return EmptySet.f19360a;
            }
        }
    }

    /* loaded from: classes.dex */
    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* renamed from: a, reason: collision with root package name */
        public final Comparable f19362a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19363b;

        public Entry(Comparable comparable, Object obj) {
            this.f19362a = comparable;
            this.f19363b = obj;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f19362a.compareTo(((Entry) obj).f19362a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Comparable comparable = this.f19362a;
            if (comparable != null ? comparable.equals(key) : key == null) {
                Object obj2 = this.f19363b;
                Object value = entry.getValue();
                if (obj2 == null) {
                    if (value == null) {
                        return true;
                    }
                } else if (obj2.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f19362a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f19363b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.f19362a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f19363b;
            return (obj != null ? obj.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i2 = SmallSortedMap.f19349i;
            SmallSortedMap.this.c();
            Object obj2 = this.f19363b;
            this.f19363b = obj;
            return obj2;
        }

        public final String toString() {
            return this.f19362a + ImpressionLog.R + this.f19363b;
        }
    }

    /* loaded from: classes.dex */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f19365a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19366b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f19367c;

        public EntryIterator() {
        }

        public final Iterator a() {
            if (this.f19367c == null) {
                this.f19367c = SmallSortedMap.this.f19352c.entrySet().iterator();
            }
            return this.f19367c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i2 = this.f19365a + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            if (i2 >= smallSortedMap.f19351b.size()) {
                return !smallSortedMap.f19352c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f19366b = true;
            int i2 = this.f19365a + 1;
            this.f19365a = i2;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i2 < smallSortedMap.f19351b.size() ? (Map.Entry) smallSortedMap.f19351b.get(this.f19365a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f19366b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f19366b = false;
            int i2 = SmallSortedMap.f19349i;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.c();
            if (this.f19365a >= smallSortedMap.f19351b.size()) {
                a().remove();
                return;
            }
            int i3 = this.f19365a;
            this.f19365a = i3 - 1;
            smallSortedMap.j(i3);
        }
    }

    /* loaded from: classes.dex */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return SmallSortedMap.this.size();
        }
    }

    public SmallSortedMap(int i2) {
        this.f19350a = i2;
    }

    public final int b(Comparable comparable) {
        int i2;
        int size = this.f19351b.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((Entry) this.f19351b.get(i3)).f19362a);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = comparable.compareTo(((Entry) this.f19351b.get(i5)).f19362a);
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        i2 = i4 + 1;
        return -i2;
    }

    public final void c() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f19351b.isEmpty()) {
            this.f19351b.clear();
        }
        if (this.f19352c.isEmpty()) {
            return;
        }
        this.f19352c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f19352c.containsKey(comparable);
    }

    public final Map.Entry d(int i2) {
        return (Map.Entry) this.f19351b.get(i2);
    }

    public final Iterable e() {
        return this.f19352c.isEmpty() ? EmptySet.f19361b : this.f19352c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19353f == null) {
            this.f19353f = new EntrySet();
        }
        return this.f19353f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int size2 = this.f19351b.size();
        if (size2 != smallSortedMap.f19351b.size()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!d(i2).equals(smallSortedMap.d(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f19352c.equals(smallSortedMap.f19352c);
        }
        return true;
    }

    public final SortedMap f() {
        c();
        if (this.f19352c.isEmpty() && !(this.f19352c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19352c = treeMap;
            this.f19354g = treeMap.descendingMap();
        }
        return (SortedMap) this.f19352c;
    }

    public void g() {
        if (this.d) {
            return;
        }
        this.f19352c = this.f19352c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f19352c);
        this.f19354g = this.f19354g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f19354g);
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        return b2 >= 0 ? ((Entry) this.f19351b.get(b2)).getValue() : this.f19352c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f19351b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((Entry) this.f19351b.get(i3)).hashCode();
        }
        return this.f19352c.size() > 0 ? i2 + this.f19352c.hashCode() : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int b2 = b(comparable);
        if (b2 >= 0) {
            return ((Entry) this.f19351b.get(b2)).setValue(obj);
        }
        c();
        boolean isEmpty = this.f19351b.isEmpty();
        int i2 = this.f19350a;
        if (isEmpty && !(this.f19351b instanceof ArrayList)) {
            this.f19351b = new ArrayList(i2);
        }
        int i3 = -(b2 + 1);
        if (i3 >= i2) {
            return f().put(comparable, obj);
        }
        if (this.f19351b.size() == i2) {
            Entry entry = (Entry) this.f19351b.remove(i2 - 1);
            f().put(entry.f19362a, entry.getValue());
        }
        this.f19351b.add(i3, new Entry(comparable, obj));
        return null;
    }

    public final Object j(int i2) {
        c();
        Object value = ((Entry) this.f19351b.remove(i2)).getValue();
        if (!this.f19352c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f19351b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return j(b2);
        }
        if (this.f19352c.isEmpty()) {
            return null;
        }
        return this.f19352c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19352c.size() + this.f19351b.size();
    }
}
