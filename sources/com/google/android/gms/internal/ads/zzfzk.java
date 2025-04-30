package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfzk implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfzl zzc;

    public zzfzk(zzfzl zzfzlVar, Iterator it) {
        this.zzb = it;
        this.zzc = zzfzlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z8;
        int i9;
        if (this.zza != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzk(z8, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfzv zzfzvVar = this.zzc.zza;
        i9 = zzfzvVar.zzb;
        zzfzvVar.zzb = i9 - collection.size();
        collection.clear();
        this.zza = null;
    }
}
