package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfyc extends zzfxx implements SortedSet {
    final /* synthetic */ zzfyh zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyc(zzfyh zzfyhVar, SortedMap sortedMap) {
        super(zzfyhVar, sortedMap);
        this.zzc = zzfyhVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfyc(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfyc(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfyc(this.zzc, zza().tailMap(obj));
    }

    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
