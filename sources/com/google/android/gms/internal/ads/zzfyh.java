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
public abstract class zzfyh extends zzfyk implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfyh(Map map) {
        zzfwq.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfyh zzfyhVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfyhVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfyhVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Collection zzf() {
        return new zzfyj(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Iterator zzg() {
        return new zzfxr(this);
    }

    public final List zzh(Object obj, List list, zzfye zzfyeVar) {
        if (list instanceof RandomAccess) {
            return new zzfya(this, obj, list, zzfyeVar);
        }
        return new zzfyg(this, obj, list, zzfyeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfxy(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfyb(this, (SortedMap) map);
        }
        return new zzfxu(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfxz(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfyc(this, (SortedMap) map);
        }
        return new zzfxx(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, com.google.android.gms.internal.ads.zzgam
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
