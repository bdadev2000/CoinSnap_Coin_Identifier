package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfzj implements Iterator {
    final Iterator zza;
    Object zzb;
    Collection zzc;
    Iterator zzd;
    final /* synthetic */ zzfzv zze;

    public zzfzj(zzfzv zzfzvVar) {
        Map map;
        this.zze = zzfzvVar;
        map = zzfzvVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgbk.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.zza.hasNext() && !this.zzd.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i9;
        this.zzd.remove();
        Collection collection = this.zzc;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfzv zzfzvVar = this.zze;
        i9 = zzfzvVar.zzb;
        zzfzvVar.zzb = i9 - 1;
    }
}
