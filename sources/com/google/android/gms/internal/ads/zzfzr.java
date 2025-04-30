package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class zzfzr implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfzs zzc;

    public zzfzr(zzfzs zzfzsVar, Iterator it) {
        this.zzc = zzfzsVar;
        this.zzb = zzfzsVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i9;
        this.zza.remove();
        zzfzv zzfzvVar = this.zzc.zze;
        i9 = zzfzvVar.zzb;
        zzfzvVar.zzb = i9 - 1;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public zzfzr(zzfzs zzfzsVar) {
        Iterator it;
        this.zzc = zzfzsVar;
        Collection collection = zzfzsVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }
}
