package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfzg extends zzgbr {
    final /* synthetic */ zzfzq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzg(zzfzq zzfzqVar, Map map) {
        super(map);
        this.zza = zzfzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzgbh.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgbr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfzf(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgbr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i2;
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzfzq zzfzqVar = this.zza;
        i2 = zzfzqVar.zzb;
        zzfzqVar.zzb = i2 - size;
        return size > 0;
    }
}
