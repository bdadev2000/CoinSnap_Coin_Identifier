package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentCompositionLocalHashMap extends PersistentHashMap<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap {
    public static final PersistentCompositionLocalHashMap d = new PersistentHashMap(TrieNode.e, 0);

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap.Builder {

        /* renamed from: h, reason: collision with root package name */
        public PersistentCompositionLocalHashMap f14484h;

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof CompositionLocal) {
                return super.containsKey((CompositionLocal) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof ValueHolder) {
                return super.containsValue((ValueHolder) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof CompositionLocal) {
                return (ValueHolder) super.get((CompositionLocal) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof CompositionLocal) ? obj2 : (ValueHolder) super.getOrDefault((CompositionLocal) obj, (ValueHolder) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final PersistentCompositionLocalHashMap build() {
            TrieNode trieNode = this.f14202c;
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = this.f14484h;
            TrieNode trieNode2 = persistentCompositionLocalHashMap.f14195a;
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap2 = persistentCompositionLocalHashMap;
            if (trieNode != trieNode2) {
                this.f14201b = new Object();
                persistentCompositionLocalHashMap2 = new PersistentHashMap(this.f14202c, d());
            }
            this.f14484h = persistentCompositionLocalHashMap2;
            return persistentCompositionLocalHashMap2;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof CompositionLocal) {
                return (ValueHolder) super.remove((CompositionLocal) obj);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public final Object b(ProvidableCompositionLocal providableCompositionLocal) {
        return CompositionLocalMapKt.a(this, providableCompositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof CompositionLocal) {
            return super.containsKey((CompositionLocal) obj);
        }
        return false;
    }

    @Override // e0.g, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof ValueHolder) {
            return super.containsValue((ValueHolder) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof CompositionLocal) {
            return (ValueHolder) super.get((CompositionLocal) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CompositionLocal) ? obj2 : (ValueHolder) super.getOrDefault((CompositionLocal) obj, (ValueHolder) obj2);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.internal.PersistentCompositionLocalHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    public final PersistentCompositionLocalHashMap h(CompositionLocal compositionLocal, ValueHolder valueHolder) {
        TrieNode.ModificationResult u2 = this.f14195a.u(compositionLocal.hashCode(), compositionLocal, valueHolder, 0);
        if (u2 == null) {
            return this;
        }
        return new PersistentHashMap(u2.f14218a, this.f14196b + u2.f14219b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.internal.PersistentCompositionLocalHashMap$Builder] */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Builder builder() {
        ?? persistentHashMapBuilder = new PersistentHashMapBuilder(this);
        persistentHashMapBuilder.f14484h = this;
        return persistentHashMapBuilder;
    }
}
