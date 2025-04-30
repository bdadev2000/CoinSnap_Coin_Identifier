package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzhcy extends LinkedHashMap {
    private static final zzhcy zza;
    private boolean zzb;

    static {
        zzhcy zzhcyVar = new zzhcy();
        zza = zzhcyVar;
        zzhcyVar.zzb = false;
    }

    private zzhcy() {
        this.zzb = true;
    }

    public static zzhcy zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zzhcb.zzd;
            int length = bArr.length;
            int zzb = zzhcb.zzb(length, bArr, 0, length);
            if (zzb == 0) {
                return 1;
            }
            return zzb;
        }
        if (!(obj instanceof zzhbs)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (this.zzb) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i9 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i9;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        byte[] bArr = zzhcb.zzd;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            byte[] bArr = zzhcb.zzd;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzhcy zzb() {
        if (isEmpty()) {
            return new zzhcy();
        }
        return new zzhcy(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzhcy zzhcyVar) {
        zzg();
        if (!zzhcyVar.isEmpty()) {
            putAll(zzhcyVar);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzhcy(Map map) {
        super(map);
        this.zzb = true;
    }
}
