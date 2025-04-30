package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zzhkg extends AbstractList {
    private static final zzhkh zzc = zzhkh.zzb(zzhkg.class);
    final List zza;
    final Iterator zzb;

    public zzhkg(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        if (this.zza.size() > i9) {
            return this.zza.get(i9);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhkf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzhkh zzhkhVar = zzc;
        zzhkhVar.zza("potentially expensive size() call");
        zzhkhVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
