package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfzk extends zzfzd implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfzq zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzk(zzfzq zzfzqVar, SortedMap sortedMap) {
        super(zzfzqVar, sortedMap);
        this.zze = zzfzqVar;
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
        return new zzfzk(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfzk(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfzk(this.zze, zzf().tailMap(obj));
    }

    public SortedMap zzf() {
        return (SortedMap) ((zzfzd) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public SortedSet zzg() {
        return new zzfzl(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfzd, com.google.android.gms.internal.ads.zzgbt, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzg = zzg();
        this.zzd = zzg;
        return zzg;
    }
}
