package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class zzfzr implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzfxw.zza(getKey(), entry.getKey()) && zzfxw.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.k(String.valueOf(getKey()), ImpressionLog.R, String.valueOf(getValue()));
    }
}
