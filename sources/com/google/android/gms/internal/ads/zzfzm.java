package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class zzfzm implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfzn zzc;

    public zzfzm(zzfzn zzfznVar, Iterator it) {
        this.zzc = zzfznVar;
        this.zzb = zzfznVar.zzb;
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
        int i2;
        this.zza.remove();
        zzfzq zzfzqVar = this.zzc.zze;
        i2 = zzfzqVar.zzb;
        zzfzqVar.zzb = i2 - 1;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzfzm(zzfzn zzfznVar) {
        Iterator it;
        this.zzc = zzfznVar;
        Collection collection = zzfznVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }
}
