package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfxu extends zzgak {
    final transient Map zza;
    final /* synthetic */ zzfyh zzb;

    public zzfxu(zzfyh zzfyhVar, Map map) {
        this.zzb = zzfyhVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        zzfyh zzfyhVar = this.zzb;
        Map map2 = this.zza;
        map = zzfyhVar.zza;
        if (map2 == map) {
            zzfyhVar.zzp();
        } else {
            zzfzy.zzb(new zzfxt(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzgal.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzc(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgak, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzt();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.zzb.zza();
        zza.addAll(collection);
        zzfyh zzfyhVar = this.zzb;
        i10 = zzfyhVar.zzb;
        zzfyhVar.zzb = i10 - collection.size();
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    public final Map.Entry zza(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfzk(key, this.zzb.zzc(key, (Collection) entry.getValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final Set zzb() {
        return new zzfxs(this);
    }
}
