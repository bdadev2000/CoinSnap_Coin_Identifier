package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfxx extends zzgai {
    final /* synthetic */ zzfyh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxx(zzfyh zzfyhVar, Map map) {
        super(map);
        this.zza = zzfyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgai, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzfzy.zzb(iterator());
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

    @Override // com.google.android.gms.internal.ads.zzgai, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfxw(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgai, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfyh zzfyhVar = this.zza;
            i10 = zzfyhVar.zzb;
            zzfyhVar.zzb = i10 - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
