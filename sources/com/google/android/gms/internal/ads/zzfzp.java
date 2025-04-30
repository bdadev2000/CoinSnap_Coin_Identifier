package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfzp extends zzfzi implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzp(zzfzv zzfzvVar, SortedMap sortedMap) {
        super(zzfzvVar, sortedMap);
        this.zze = zzfzvVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfzp(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfzp(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfzp(this.zze, zzf().tailMap(obj));
    }

    public SortedMap zzf() {
        return (SortedMap) ((zzfzi) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public SortedSet zzg() {
        return new zzfzq(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfzi, com.google.android.gms.internal.ads.zzgby, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zzg = zzg();
            this.zzd = zzg;
            return zzg;
        }
        return sortedSet;
    }
}
