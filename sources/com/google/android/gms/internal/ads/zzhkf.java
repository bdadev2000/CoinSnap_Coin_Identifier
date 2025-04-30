package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzhkf implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhkg zzb;

    public zzhkf(zzhkg zzhkgVar) {
        this.zzb = zzhkgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza >= this.zzb.zza.size() && !this.zzb.zzb.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhkg zzhkgVar = this.zzb;
            int i9 = this.zza;
            this.zza = i9 + 1;
            return zzhkgVar.zza.get(i9);
        }
        zzhkg zzhkgVar2 = this.zzb;
        zzhkgVar2.zza.add(zzhkgVar2.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
