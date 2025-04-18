package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfxy extends zzfyb implements NavigableMap {
    final /* synthetic */ zzfyh zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxy(zzfyh zzfyhVar, NavigableMap navigableMap) {
        super(zzfyhVar, navigableMap);
        this.zzc = zzfyhVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zza(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzfxy(this.zzc, ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zza(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zza(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zza(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb, com.google.android.gms.internal.ads.zzfxu, com.google.android.gms.internal.ads.zzgak, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zza(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zza(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfyb, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection zza = this.zzc.zza();
        zza.addAll((Collection) entry.getValue());
        it.remove();
        return new zzfzk(entry.getKey(), this.zzc.zzb(zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final NavigableSet zze() {
        return new zzfxz(this.zzc, (NavigableMap) ((SortedMap) ((zzfxu) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final /* synthetic */ SortedMap zzf() {
        return (NavigableMap) ((SortedMap) ((zzfxu) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    /* renamed from: zzh */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new zzfxy(this.zzc, ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new zzfxy(this.zzc, ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new zzfxy(this.zzc, ((NavigableMap) ((SortedMap) ((zzfxu) this).zza)).tailMap(obj, z10));
    }
}
