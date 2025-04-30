package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfzs extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfzs zzc;
    final Collection zzd;
    final /* synthetic */ zzfzv zze;

    public zzfzs(zzfzv zzfzvVar, Object obj, Collection collection, zzfzs zzfzsVar) {
        Collection collection2;
        this.zze = zzfzvVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfzsVar;
        if (zzfzsVar == null) {
            collection2 = null;
        } else {
            collection2 = zzfzsVar.zzb;
        }
        this.zzd = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i9;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfzv zzfzvVar = this.zze;
            i9 = zzfzvVar.zzb;
            zzfzvVar.zzb = i9 + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i9;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfzv zzfzvVar = this.zze;
            i9 = zzfzvVar.zzb;
            zzfzvVar.zzb = i9 + (size2 - size);
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
        int i9;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfzv zzfzvVar = this.zze;
        i9 = zzfzvVar.zzb;
        zzfzvVar.zzb = i9 - size;
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
        return new zzfzr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i9;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfzv zzfzvVar = this.zze;
            i9 = zzfzvVar.zzb;
            zzfzvVar.zzb = i9 - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i9;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfzv zzfzvVar = this.zze;
            int i10 = size2 - size;
            i9 = zzfzvVar.zzb;
            zzfzvVar.zzb = i9 + i10;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i9;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfzv zzfzvVar = this.zze;
            int i10 = size2 - size;
            i9 = zzfzvVar.zzb;
            zzfzvVar.zzb = i9 + i10;
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

    public final void zza() {
        Map map;
        zzfzs zzfzsVar = this.zzc;
        if (zzfzsVar != null) {
            zzfzsVar.zza();
            return;
        }
        zzfzv zzfzvVar = this.zze;
        Object obj = this.zza;
        map = zzfzvVar.zza;
        map.put(obj, this.zzb);
    }

    public final void zzb() {
        Map map;
        zzfzs zzfzsVar = this.zzc;
        if (zzfzsVar != null) {
            zzfzsVar.zzb();
            zzfzs zzfzsVar2 = this.zzc;
            if (zzfzsVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzfzv zzfzvVar = this.zze;
            Object obj = this.zza;
            map = zzfzvVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzc() {
        Map map;
        zzfzs zzfzsVar = this.zzc;
        if (zzfzsVar != null) {
            zzfzsVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfzv zzfzvVar = this.zze;
            Object obj = this.zza;
            map = zzfzvVar.zza;
            map.remove(obj);
        }
    }
}
