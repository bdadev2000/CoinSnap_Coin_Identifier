package com.google.common.collect;

import com.applovin.impl.adview.t;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public V setValue(@ParametricNullness V v2) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return t.j(valueOf2.length() + valueOf.length() + 1, valueOf, ImpressionLog.R, valueOf2);
    }
}
