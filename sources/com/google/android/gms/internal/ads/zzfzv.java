package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzfzv extends zzfzy implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfzv(Map map) {
        zzfyg.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfzv zzfzvVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfzvVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfzvVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final Collection zzf() {
        return new zzfzx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final Iterator zzg() {
        return new zzfzf(this);
    }

    public final List zzh(Object obj, List list, zzfzs zzfzsVar) {
        if (list instanceof RandomAccess) {
            return new zzfzo(this, obj, list, zzfzsVar);
        }
        return new zzfzu(this, obj, list, zzfzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfzm(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfzp(this, (SortedMap) map);
        }
        return new zzfzi(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfzn(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfzq(this, (SortedMap) map);
        }
        return new zzfzl(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy, com.google.android.gms.internal.ads.zzgca
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.zzb++;
            return true;
        }
        return false;
    }
}
