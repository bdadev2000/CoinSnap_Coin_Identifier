package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import java.util.Map;
import r0.d;

/* loaded from: classes4.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, d {

    /* renamed from: c, reason: collision with root package name */
    public final Map f14243c;
    public LinkedValue d;

    public MutableMapEntry(PersistentHashMapBuilder persistentHashMapBuilder, Object obj, LinkedValue linkedValue) {
        super(obj, linkedValue.f14240a);
        this.f14243c = persistentHashMapBuilder;
        this.d = linkedValue;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object getValue() {
        return this.d.f14240a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        LinkedValue linkedValue = this.d;
        Object obj2 = linkedValue.f14240a;
        LinkedValue linkedValue2 = new LinkedValue(obj, linkedValue.f14241b, linkedValue.f14242c);
        this.d = linkedValue2;
        this.f14243c.put(this.f14191a, linkedValue2);
        return obj2;
    }
}
