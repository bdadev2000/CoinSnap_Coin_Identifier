package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.NoSuchElementException;
import r0.d;

/* loaded from: classes4.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, d {

    /* renamed from: c, reason: collision with root package name */
    public final PersistentHashMapBuilderEntriesIterator f14193c;
    public Object d;

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator, Object obj, Object obj2) {
        super(obj, obj2);
        this.f14193c = persistentHashMapBuilderEntriesIterator;
        this.d = obj2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object getValue() {
        return this.d;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.d;
        this.d = obj;
        PersistentHashMapBuilderBaseIterator persistentHashMapBuilderBaseIterator = this.f14193c.f14209a;
        PersistentHashMapBuilder persistentHashMapBuilder = persistentHashMapBuilderBaseIterator.d;
        Object obj3 = this.f14191a;
        if (persistentHashMapBuilder.containsKey(obj3)) {
            if (!persistentHashMapBuilderBaseIterator.f14199c) {
                persistentHashMapBuilder.put(obj3, obj);
            } else {
                if (!persistentHashMapBuilderBaseIterator.hasNext()) {
                    throw new NoSuchElementException();
                }
                TrieNodeBaseIterator trieNodeBaseIterator = persistentHashMapBuilderBaseIterator.f14197a[persistentHashMapBuilderBaseIterator.f14198b];
                Object obj4 = trieNodeBaseIterator.f14220a[trieNodeBaseIterator.f14222c];
                persistentHashMapBuilder.put(obj3, obj);
                persistentHashMapBuilderBaseIterator.d(obj4 != null ? obj4.hashCode() : 0, persistentHashMapBuilder.f14202c, obj4, 0);
            }
            persistentHashMapBuilderBaseIterator.f14207h = persistentHashMapBuilder.f14203f;
        }
        return obj2;
    }
}
