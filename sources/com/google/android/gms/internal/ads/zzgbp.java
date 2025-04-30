package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzgbp extends AbstractList implements RandomAccess, Serializable {
    final List zza;
    final zzfxu zzb;

    public zzgbp(List list, zzfxu zzfxuVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfxuVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return this.zzb.apply(this.zza.get(i9));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new zzgbo(this, this.zza.listIterator(i9));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        return this.zzb.apply(this.zza.remove(i9));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        this.zza.subList(i9, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
