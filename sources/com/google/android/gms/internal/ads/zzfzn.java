package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfzn extends zzfzq implements NavigableSet {
    final /* synthetic */ zzfzv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzn(zzfzv zzfzvVar, NavigableMap navigableMap) {
        super(zzfzvVar, navigableMap);
        this.zzb = zzfzvVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new zzfzn(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return zzgbm.zza(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return zzgbm.zza(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final /* synthetic */ SortedMap zza() {
        return (NavigableMap) ((SortedMap) this.zzd);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z8) {
        return new zzfzn(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).headMap(obj, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        return new zzfzn(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).subMap(obj, z8, obj2, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z8) {
        return new zzfzn(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).tailMap(obj, z8));
    }
}
