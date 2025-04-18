package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzhhy implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhhz zzb;

    public zzhhy(zzhhz zzhhzVar) {
        this.zzb = zzhhzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhhz zzhhzVar = this.zzb;
            zzhhzVar.zza.add(zzhhzVar.zzb.next());
            return next();
        }
        zzhhz zzhhzVar2 = this.zzb;
        int i2 = this.zza;
        this.zza = i2 + 1;
        return zzhhzVar2.zza.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
