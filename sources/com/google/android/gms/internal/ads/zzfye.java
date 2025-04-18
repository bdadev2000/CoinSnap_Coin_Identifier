package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfye extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfye zzc;
    final Collection zzd;
    final /* synthetic */ zzfyh zze;

    public zzfye(zzfyh zzfyhVar, Object obj, Collection collection, zzfye zzfyeVar) {
        this.zze = zzfyhVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfyeVar;
        this.zzd = zzfyeVar == null ? null : zzfyeVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfyh zzfyhVar = this.zze;
            i10 = zzfyhVar.zzb;
            zzfyhVar.zzb = i10 + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfyh zzfyhVar = this.zze;
            i10 = zzfyhVar.zzb;
            zzfyhVar.zzb = i10 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfyh zzfyhVar = this.zze;
        i10 = zzfyhVar.zzb;
        zzfyhVar.zzb = i10 - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfyd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfyh zzfyhVar = this.zze;
            i10 = zzfyhVar.zzb;
            zzfyhVar.zzb = i10 - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfyh zzfyhVar = this.zze;
            int i11 = size2 - size;
            i10 = zzfyhVar.zzb;
            zzfyhVar.zzb = i10 + i11;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfyh zzfyhVar = this.zze;
            int i11 = size2 - size;
            i10 = zzfyhVar.zzb;
            zzfyhVar.zzb = i10 + i11;
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Map map;
        zzfye zzfyeVar = this.zzc;
        if (zzfyeVar != null) {
            zzfyeVar.zza();
            return;
        }
        zzfyh zzfyhVar = this.zze;
        Object obj = this.zza;
        map = zzfyhVar.zza;
        map.put(obj, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        zzfye zzfyeVar = this.zzc;
        if (zzfyeVar != null) {
            zzfyeVar.zzb();
            zzfye zzfyeVar2 = this.zzc;
            if (zzfyeVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzfyh zzfyhVar = this.zze;
            Object obj = this.zza;
            map = zzfyhVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        Map map;
        zzfye zzfyeVar = this.zzc;
        if (zzfyeVar != null) {
            zzfyeVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfyh zzfyhVar = this.zze;
            Object obj = this.zza;
            map = zzfyhVar.zza;
            map.remove(obj);
        }
    }
}
