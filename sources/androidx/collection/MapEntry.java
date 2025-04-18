package androidx.collection;

import java.util.Map;
import r0.a;

/* loaded from: classes4.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1470a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1471b;

    public MapEntry(Object obj, Object obj2) {
        this.f1470a = obj;
        this.f1471b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1470a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1471b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
