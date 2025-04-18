package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfzn extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfzn zzc;
    final Collection zzd;
    final /* synthetic */ zzfzq zze;

    public zzfzn(zzfzq zzfzqVar, Object obj, Collection collection, zzfzn zzfznVar) {
        this.zze = zzfzqVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfznVar;
        this.zzd = zzfznVar == null ? null : zzfznVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfzq zzfzqVar = this.zze;
            i2 = zzfzqVar.zzb;
            zzfzqVar.zzb = i2 + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzfzq zzfzqVar = this.zze;
        i2 = zzfzqVar.zzb;
        zzfzqVar.zzb = i2 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i2;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfzq zzfzqVar = this.zze;
        i2 = zzfzqVar.zzb;
        zzfzqVar.zzb = i2 - size;
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
        return new zzfzm(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i2;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfzq zzfzqVar = this.zze;
            i2 = zzfzqVar.zzb;
            zzfzqVar.zzb = i2 - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfzq zzfzqVar = this.zze;
            int i3 = size2 - size;
            i2 = zzfzqVar.zzb;
            zzfzqVar.zzb = i2 + i3;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i2;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfzq zzfzqVar = this.zze;
            int i3 = size2 - size;
            i2 = zzfzqVar.zzb;
            zzfzqVar.zzb = i2 + i3;
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
        zzfzn zzfznVar = this.zzc;
        if (zzfznVar != null) {
            zzfznVar.zza();
            return;
        }
        zzfzq zzfzqVar = this.zze;
        Object obj = this.zza;
        map = zzfzqVar.zza;
        map.put(obj, this.zzb);
    }

    public final void zzb() {
        Map map;
        zzfzn zzfznVar = this.zzc;
        if (zzfznVar != null) {
            zzfznVar.zzb();
            zzfzn zzfznVar2 = this.zzc;
            if (zzfznVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzfzq zzfzqVar = this.zze;
            Object obj = this.zza;
            map = zzfzqVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzc() {
        Map map;
        zzfzn zzfznVar = this.zzc;
        if (zzfznVar != null) {
            zzfznVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfzq zzfzqVar = this.zze;
            Object obj = this.zza;
            map = zzfzqVar.zza;
            map.remove(obj);
        }
    }
}
