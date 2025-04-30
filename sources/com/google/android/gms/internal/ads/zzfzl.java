package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfzl extends zzgbw {
    final /* synthetic */ zzfzv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzl(zzfzv zzfzvVar, Map map) {
        super(map);
        this.zza = zzfzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzgbm.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.zzd.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgbw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfzk(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i9;
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfzv zzfzvVar = this.zza;
            i9 = zzfzvVar.zzb;
            zzfzvVar.zzb = i9 - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
