package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes2.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public Entry f1310a;

    /* renamed from: b, reason: collision with root package name */
    public Entry f1311b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f1312c = new WeakHashMap();
    public int d = 0;

    /* loaded from: classes2.dex */
    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.d;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.f1315c;
        }
    }

    /* loaded from: classes2.dex */
    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.f1315c;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.d;
        }
    }

    /* loaded from: classes2.dex */
    public static class Entry<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f1313a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f1314b;

        /* renamed from: c, reason: collision with root package name */
        public Entry f1315c;
        public Entry d;

        public Entry(Object obj, Object obj2) {
            this.f1313a = obj;
            this.f1314b = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f1313a.equals(entry.f1313a) && this.f1314b.equals(entry.f1314b);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f1313a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f1314b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f1313a.hashCode() ^ this.f1314b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f1313a + ImpressionLog.R + this.f1314b;
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public Entry f1316a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1317b = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entry2 = this.f1316a;
            if (entry == entry2) {
                Entry entry3 = entry2.d;
                this.f1316a = entry3;
                this.f1317b = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f1317b) {
                return SafeIterableMap.this.f1310a != null;
            }
            Entry entry = this.f1316a;
            return (entry == null || entry.f1315c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f1317b) {
                this.f1317b = false;
                this.f1316a = SafeIterableMap.this.f1310a;
            } else {
                Entry entry = this.f1316a;
                this.f1316a = entry != null ? entry.f1315c : null;
            }
            return this.f1316a;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public Entry f1319a;

        /* renamed from: b, reason: collision with root package name */
        public Entry f1320b;

        public ListIterator(Entry entry, Entry entry2) {
            this.f1319a = entry2;
            this.f1320b = entry;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entry2 = null;
            if (this.f1319a == entry && entry == this.f1320b) {
                this.f1320b = null;
                this.f1319a = null;
            }
            Entry entry3 = this.f1319a;
            if (entry3 == entry) {
                this.f1319a = b(entry3);
            }
            Entry entry4 = this.f1320b;
            if (entry4 == entry) {
                Entry entry5 = this.f1319a;
                if (entry4 != entry5 && entry5 != null) {
                    entry2 = c(entry4);
                }
                this.f1320b = entry2;
            }
        }

        public abstract Entry b(Entry entry);

        public abstract Entry c(Entry entry);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1320b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Entry entry = this.f1320b;
            Entry entry2 = this.f1319a;
            this.f1320b = (entry == entry2 || entry2 == null) ? null : c(entry);
            return entry;
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static abstract class SupportRemove<K, V> {
        public abstract void a(Entry entry);
    }

    public Entry a(Object obj) {
        Entry entry = this.f1310a;
        while (entry != null && !entry.f1313a.equals(obj)) {
            entry = entry.f1315c;
        }
        return entry;
    }

    public Object b(Object obj, Object obj2) {
        Entry a2 = a(obj);
        if (a2 != null) {
            return a2.f1314b;
        }
        Entry entry = new Entry(obj, obj2);
        this.d++;
        Entry entry2 = this.f1311b;
        if (entry2 == null) {
            this.f1310a = entry;
            this.f1311b = entry;
            return null;
        }
        entry2.f1315c = entry;
        entry.d = entry2;
        this.f1311b = entry;
        return null;
    }

    public Object c(Object obj) {
        Entry a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f1312c;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SupportRemove) it.next()).a(a2);
            }
        }
        Entry entry = a2.d;
        if (entry != null) {
            entry.f1315c = a2.f1315c;
        } else {
            this.f1310a = a2.f1315c;
        }
        Entry entry2 = a2.f1315c;
        if (entry2 != null) {
            entry2.d = entry;
        } else {
            this.f1311b = entry;
        }
        a2.f1315c = null;
        a2.d = null;
        return a2.f1314b;
    }

    public final Iterator descendingIterator() {
        ListIterator listIterator = new ListIterator(this.f1311b, this.f1310a);
        this.f1312c.put(listIterator, Boolean.FALSE);
        return listIterator;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (this.d != safeIterableMap.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Map.Entry) it.next()).hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ListIterator listIterator = new ListIterator(this.f1310a, this.f1311b);
        this.f1312c.put(listIterator, Boolean.FALSE);
        return listIterator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
