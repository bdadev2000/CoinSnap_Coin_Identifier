package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
final class zzgbm extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfxq zzb;

    public zzgbm(List list, zzfxq zzfxqVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfxqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new zzgbl(this, this.zza.listIterator(i2));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        this.zza.subList(i2, i3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
