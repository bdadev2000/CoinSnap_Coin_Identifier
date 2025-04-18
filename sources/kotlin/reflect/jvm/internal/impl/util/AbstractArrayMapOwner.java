package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;

/* loaded from: classes4.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    /* loaded from: classes4.dex */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* renamed from: id, reason: collision with root package name */
        private final int f21067id;
        private final KClass<? extends K> key;

        public AbstractArrayMapAccessor(KClass<? extends K> key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.f21067id = i10;
        }

        public final T extractValue(AbstractArrayMapOwner<K, V> thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.getArrayMap().get(this.f21067id);
        }
    }

    public abstract ArrayMap<V> getArrayMap();

    public abstract TypeRegistry<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    public abstract void registerComponent(KClass<? extends K> kClass, V v10);
}
