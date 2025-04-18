package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class zzfyd implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfye zzc;

    public zzfyd(zzfye zzfyeVar, Iterator it) {
        this.zzc = zzfyeVar;
        this.zzb = zzfyeVar.zzb;
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
        int i10;
        this.zza.remove();
        zzfyh zzfyhVar = this.zzc.zze;
        i10 = zzfyhVar.zzb;
        zzfyhVar.zzb = i10 - 1;
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public zzfyd(zzfye zzfyeVar) {
        Iterator it;
        this.zzc = zzfyeVar;
        Collection collection = zzfyeVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }
}
