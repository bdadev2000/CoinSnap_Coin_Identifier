package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class LazyField extends LazyFieldLite {

    /* loaded from: classes2.dex */
    public static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry f19267a;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f19267a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField lazyField = (LazyField) this.f19267a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField lazyField = (LazyField) this.f19267a.getValue();
            MessageLite messageLite = lazyField.f19269a;
            lazyField.f19270b = null;
            lazyField.f19269a = (MessageLite) obj;
            return messageLite;
        }
    }

    /* loaded from: classes2.dex */
    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f19268a;

        public LazyIterator(Iterator it) {
            this.f19268a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19268a.hasNext();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.datastore.preferences.protobuf.LazyField$LazyEntry, java.lang.Object] */
        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.f19268a.next();
            if (!(entry.getValue() instanceof LazyField)) {
                return entry;
            }
            ?? obj = new Object();
            obj.f19267a = entry;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f19268a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
