package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.g;
import java.util.Collection;
import java.util.Set;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentOrderedMap<K, V> extends g implements PersistentMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14244a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14245b;

    /* renamed from: c, reason: collision with root package name */
    public final PersistentHashMap f14246c;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        PersistentHashMap persistentHashMap = PersistentHashMap.f14194c;
        PersistentHashMap persistentHashMap2 = PersistentHashMap.f14194c;
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.f14244a = obj;
        this.f14245b = obj2;
        this.f14246c = persistentHashMap;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final PersistentMap.Builder builder() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override // e0.g
    public final Set c() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f14246c.containsKey(obj);
    }

    @Override // e0.g
    public final Set d() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override // e0.g
    public final int e() {
        return this.f14246c.size();
    }

    @Override // e0.g
    public final Collection f() {
        return new PersistentOrderedMapValues(this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.f14246c.get(obj);
        if (linkedValue != null) {
            return linkedValue.f14240a;
        }
        return null;
    }
}
