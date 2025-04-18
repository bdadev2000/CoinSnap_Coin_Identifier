package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;
import r0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public class MapEntry<K, V> implements Map.Entry<K, V>, a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14191a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14192b;

    public MapEntry(Object obj, Object obj2) {
        this.f14191a = obj;
        this.f14192b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && p0.a.g(entry.getKey(), getKey()) && p0.a.g(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14191a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f14192b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(getValue());
        return sb.toString();
    }
}
