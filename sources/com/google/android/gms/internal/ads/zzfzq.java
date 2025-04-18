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
/* loaded from: classes3.dex */
public abstract class zzfzq extends zzfzt implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfzq(Map map) {
        zzfxz.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfzq zzfzqVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfzqVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfzqVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    public final Collection zzf() {
        return new zzfzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    public final Iterator zzg() {
        return new zzfza(this);
    }

    public final List zzh(Object obj, List list, zzfzn zzfznVar) {
        return list instanceof RandomAccess ? new zzfzj(this, obj, list, zzfznVar) : new zzfzp(this, obj, list, zzfznVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfzh(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfzk(this, (SortedMap) map) : new zzfzd(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfzi(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfzl(this, (SortedMap) map) : new zzfzg(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzgbv
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection zza = zza();
        if (!zza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, zza);
        return true;
    }
}
