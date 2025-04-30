package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzgbr extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfxu zzb;

    public zzgbr(List list, zzfxu zzfxuVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfxuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new zzgbq(this, this.zza.listIterator(i9));
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
