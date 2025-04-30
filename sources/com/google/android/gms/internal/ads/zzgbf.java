package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzgbf implements Map, Serializable {
    private transient zzgbh zza;
    private transient zzgbh zzb;
    private transient zzgax zzc;

    public static zzgbf zzc(Map map) {
        int i9;
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i9 = entrySet.size();
        } else {
            i9 = 4;
        }
        zzgbe zzgbeVar = new zzgbe(i9);
        zzgbeVar.zzb(entrySet);
        return zzgbeVar.zzc();
    }

    public static zzgbf zzd() {
        return zzgct.zza;
    }

    public static zzgbf zze(Object obj, Object obj2) {
        zzfzz.zzb("dialog_not_shown_reason", obj2);
        return zzgct.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgbz.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgde.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfzz.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z8 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z8) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z8 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzgax zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzgax values() {
        zzgax zzgaxVar = this.zzc;
        if (zzgaxVar == null) {
            zzgax zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzgaxVar;
    }

    public abstract zzgbh zzf();

    public abstract zzgbh zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgbh entrySet() {
        zzgbh zzgbhVar = this.zza;
        if (zzgbhVar == null) {
            zzgbh zzf = zzf();
            this.zza = zzf;
            return zzf;
        }
        return zzgbhVar;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzgbh keySet() {
        zzgbh zzgbhVar = this.zzb;
        if (zzgbhVar == null) {
            zzgbh zzg = zzg();
            this.zzb = zzg;
            return zzg;
        }
        return zzgbhVar;
    }
}
