package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import java.util.Map;

/* renamed from: com.applovin.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0697g implements Map.Entry {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Objects.equal(getKey(), entry.getKey()) || !Objects.equal(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i9 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i9 = value.hashCode();
        }
        return hashCode ^ i9;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
