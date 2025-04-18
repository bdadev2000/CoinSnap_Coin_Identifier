package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzhfn implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhfo zzb;

    public zzhfn(zzhfo zzhfoVar) {
        this.zzb = zzhfoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhfo zzhfoVar = this.zzb;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return zzhfoVar.zza.get(i10);
        }
        zzhfo zzhfoVar2 = this.zzb;
        zzhfoVar2.zza.add(zzhfoVar2.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
