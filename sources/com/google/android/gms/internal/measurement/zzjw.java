package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzjw<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzjx> zza;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzkt) {
            return this.zza.getValue().zza((zzkt) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzjx zza() {
        return this.zza.getValue();
    }

    private zzjw(Map.Entry<K, zzjx> entry) {
        this.zza = entry;
    }
}
